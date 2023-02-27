package com.bonade.sdk.opencenter.client;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.common.KeyConstant;
import com.bonade.sdk.opencenter.exception.ClientException;
import com.bonade.sdk.opencenter.utils.CommonUtils;
import com.bonade.sdk.opencenter.utils.HttpClientUtils;
import com.bonade.sdk.opencenter.utils.HttpClientUtils.ContentTypeEnum;
import com.bonade.sdk.opencenter.vo.AccessTokenVo;
import com.bonade.sdk.opencenter.vo.TokenDataResult;

public class TokenBasicClient {

	public static TokenDataResult accessTocken(String host, Credentials credentials) throws ClientException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("grant_type", KeyConstant.CLIENT_CREDENTIALS);
		String url = host + ApiPathConstant.OAUTH_ACCESS_TOKEN;
		Map<String, String> headers = new HashMap<>();
		headers.put("Authorization", credentials.getBasicAuth());
		byte[] resp = HttpClientUtils.post(url, ContentTypeEnum.URLENCODED, headers, params);
		// log.info("access_token 请求结果：" + resp);
		if (resp!=null) {
			TokenDataResult dataResult = JSONObject.parseObject(resp, TokenDataResult.class);
			return dataResult;
		}
		return null;
	}

	/**
	 * 业务系统自主注册的新用户同步到中台
	 *
	 * @param host
	 *            host
	 * @param credentials
	 *            第三方系統 接口凭证
	 * @param oldToken
	 *            旧tocken值
	 * @return TokenDataResult TokenDataResult
	 */
	public static TokenDataResult refreshToken(String host, Credentials credentials, AccessTokenVo oldToken)
			throws ClientException {
		if (oldToken == null) {
			return null;
		}
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("grant_type", KeyConstant.REFRESH_TOKEN);
		params.put("scope", CommonUtils.getScope(oldToken.getScope()));
		params.put("refresh_token", oldToken.getRefreshToken());
		String url = host + ApiPathConstant.OAUTH_REFRESH_TOKEN;
		Map<String, String> headers = new HashMap<>();
		headers.put("Authorization", credentials.getBasicAuth());
		byte[] resp = HttpClientUtils.post(url, ContentTypeEnum.URLENCODED, headers, params);
		if (resp!=null) {
			TokenDataResult dataResult = JSONObject.parseObject(resp, TokenDataResult.class);
			return dataResult;
		}
		return null;
	}

}
