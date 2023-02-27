package com.bonade.sdk.opencenter.client;

import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.service.IClientCurrentLoginInfoService;
import com.bonade.sdk.opencenter.common.KeyConstant;
import com.bonade.sdk.opencenter.common.ResultCodeConstant;
import com.bonade.sdk.opencenter.exception.ClientException;
import com.bonade.sdk.opencenter.utils.HttpClientUtils;
import com.bonade.sdk.opencenter.utils.HttpClientUtils.ContentTypeEnum;
import com.bonade.sdk.opencenter.vo.AccessTokenVo;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 基础客户端
 *
 * @author jimmy
 *
 */
public class BasicClient implements Client {

	private String host;

	private String token;

	private String refreshToken;

	private Credentials credentials;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public JSONObject executeDelete(String path, Map<String, Object> params) {
		return execute(path, HttpClientUtils.METHOD_DELETE, null, params);
	}

	@Override
	public JSONObject executePut(String path, String contentType, Map<String, Object> params) {
		return execute(path, HttpClientUtils.METHOD_PUT, contentType, params);
	}

	public BasicClient(String host, Credentials credentials) {
		this.host = host;
		this.credentials = credentials;
	}

	@Override
	public JSONObject executePost(String path, String contentType, Map<String, Object> params) {
		return execute(path, HttpClientUtils.METHOD_POST, contentType, params);
	}

	@Override
	public JSONObject executeGet(String path, Map<String, Object> params) {

		return execute(path, HttpClientUtils.METHOD_GET, null, params);

	}

	@Override
	public JSONObject postByJson(String path, Object jsonObject) {
		return postByParamJson(path, jsonObject);
	}

//	@Override
//	public void refresh() {
//		AccessTokenVo vo = SdkClient.getTokenClient().refreshToken();
//		token = vo.getAccessToken();
//		refreshToken = vo.getRefreshToken();
//	}

	private JSONObject executeMethod(String path, String authorization, String method, String contentType,
			Map<String, Object> params) {
		String url = host + path;
		Map<String, String> headers = new HashMap<>();
		headers.put("Authorization", authorization);
		IClientCurrentLoginInfoService clientCurrentLoginInfoService = SdkClient.getSdkClient()
				.getClientCurrentLoginInfoService();
		if (clientCurrentLoginInfoService != null) {
			// 可能没实现这个方法，所以非强制性报错
			String clientCurrentOpenId = clientCurrentLoginInfoService.getClientCurrentOpenId();
			if (StringUtils.isBlank(clientCurrentOpenId)) {
				headers.put("OpenId", "");
			} else {
				headers.put("OpenId", clientCurrentOpenId);
			}
		}
		ContentTypeEnum type = ContentTypeEnum.JSON;
		if(StringUtils.isNotBlank(contentType)) {
			type = ContentTypeEnum.getByValue(contentType);
		}
		byte[] data = HttpClientUtils.execute(url, method, type, headers, params); 
		if (data != null) {
			String result = new String(data);
			return JSONObject.parseObject(result);
		}
		return null;
	}

	private JSONObject postMethodByParamJson(String path, String authorization, Object jsonObject) {
		String url = host + path;
		Map<String, String> headers = new HashMap<>();
		headers.put("Authorization", authorization);
		IClientCurrentLoginInfoService clientCurrentLoginInfoService = SdkClient.getSdkClient()
				.getClientCurrentLoginInfoService();
		if (clientCurrentLoginInfoService != null) {
			// 可能没实现这个方法，所以非强制性报错
			String clientCurrentOpenId = clientCurrentLoginInfoService.getClientCurrentOpenId();
			if (StringUtils.isBlank(clientCurrentOpenId)) {
				headers.put("OpenId", "");
			} else {
				headers.put("OpenId", clientCurrentOpenId);
			}
		}
		String result = HttpClientUtils.postByJson(url, headers, jsonObject);

		if (StringUtils.isNotBlank(result)) {
			return JSONObject.parseObject(result);
		}
		return null;
	}

	/**
	 * 执行请求，token过期会刷新，刷新失败会重新获取，重新获取失败抛异常
	 *
	 * @param path
	 * @param method
	 * @param contentType
	 * @param params
	 * @return
	 */
	private JSONObject execute(String path, String method, String contentType, Map<String, Object> params) {

		JSONObject result = executeMethod(path, KeyConstant.BEARER + getToken(), method, contentType, params);
		if (result != null) {
			if (result.getIntValue(KeyConstant.CODE) == ResultCodeConstant.SUCCESS) {
				try {
					return result.getJSONObject(KeyConstant.DATA);
				} catch (Exception e) {
					return result;
				}
			} else if (result.getIntValue(KeyConstant.CODE) == ResultCodeConstant.TOKEN_ERROR) {
				// 刷新token
//				refresh();
				result = executeMethod(path, KeyConstant.BEARER + getToken(), method, contentType, params);
				if (result != null && result.getIntValue(KeyConstant.CODE) == ResultCodeConstant.SUCCESS) {
					try {
						return result.getJSONObject(KeyConstant.DATA);
					} catch (Exception e) {
						return result;
					}
				}
			}
			throw new ClientException(result.getIntValue(KeyConstant.CODE), result.getString(KeyConstant.MESSAGE),
					result.getJSONObject(KeyConstant.DATA));
		}
		return result;
	}

	private JSONObject postByParamJson(String path, Object jsonObj) {
		JSONObject result = postMethodByParamJson(path, KeyConstant.BEARER + getToken(), jsonObj);
		if (result != null) {
			if (result.getIntValue(KeyConstant.CODE) == ResultCodeConstant.SUCCESS) {
				try {
					return result.getJSONObject(KeyConstant.DATA);
				} catch (Exception e) {
					return result;
				}
			} else if (result.getIntValue(KeyConstant.CODE) == ResultCodeConstant.TOKEN_ERROR) {
				// 刷新token
//				refresh();
				result = postMethodByParamJson(path, KeyConstant.BEARER + getToken(), jsonObj);
				if (result != null && (result.getIntValue(KeyConstant.CODE) == ResultCodeConstant.SUCCESS)) {
					try {
						return result.getJSONObject(KeyConstant.DATA);
					} catch (Exception e) {
						return result;
					}
				}
			}
			throw new ClientException(result.getIntValue(KeyConstant.CODE), result.getString(KeyConstant.MESSAGE),
					result.getJSONObject(KeyConstant.DATA));
		}
		return result;
	}

	public String getToken() {
		AccessTokenVo tokenVo = SdkClient.getTokenClient().accessToken();
		return tokenVo.getAccessToken();
	}

	@Override
	public <T> T execute(String path, String method,Object params, Map<String, String> headers,
			ResultHandler<T> handler) {
		if(handler==null) {
			throw new ClientException("ResultHandler不能为空");
		} 
		byte[] result = executeMethod(path, KeyConstant.BEARER + getToken(), method, ContentTypeEnum.JSON, params,
				headers);
		if (result != null) {
			if (checkInvalidateToken(result)) {
//				refresh();
				result = executeMethod(path, KeyConstant.BEARER + getToken(), method, ContentTypeEnum.JSON, params,
						headers);
			}

		}
		
		return handler.getResult(result);
	}

	private byte[] executeMethod(String path, String authorization, String method, ContentTypeEnum contentType,
			Object params, Map<String, String> headers) {
		if(headers==null) {
			headers = new HashMap<>();
		}
		String url = host + path;
		headers.put("Authorization", authorization);
		IClientCurrentLoginInfoService clientCurrentLoginInfoService = SdkClient.getSdkClient()
				.getClientCurrentLoginInfoService();
		if (clientCurrentLoginInfoService != null) {
			// 可能没实现这个方法，所以非强制性报错
			String clientCurrentOpenId = clientCurrentLoginInfoService.getClientCurrentOpenId();
			if (StringUtils.isBlank(clientCurrentOpenId)) {
				headers.put("OpenId", "");
			} else {
				headers.put("OpenId", clientCurrentOpenId);
			}
		}
		byte[] result = HttpClientUtils.execute(url, method, contentType, headers, params);
		if (result != null) {
			return result;
		}
		return null;
	}
	
 

	private boolean checkInvalidateToken(byte[] result) {
		try {
			String dataStr = new String(result);
			JSONObject data = JSONObject.parseObject(dataStr);
			if (data != null && (data.getIntValue(KeyConstant.CODE) == ResultCodeConstant.TOKEN_ERROR
					|| data.getIntValue(KeyConstant.CODE) == ResultCodeConstant.NO_TOKEN)) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	 
}
