package com.bonade.sdk.opencenter.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.exception.ClientException;

public class HttpClientUtils {
	/**
	 * 请使用枚举类型 ContentTypeEnum.JSON 代替
	 */
	@Deprecated
	public static final String CONTENT_TYPE_JSON = "application/json";
	/**
	 * 请使用枚举类型 ContentTypeEnum.URLENCODED 代替
	 */
	@Deprecated
	public static final String CONTENT_TYPE_URLENCODED = "application/x-www-form-urlencoded";

	public static final String CHARSET_UTF8 = "UTF-8";

	public static final String METHOD_POST = "POST";

	public static final String METHOD_GET = "GET";

	public static final String METHOD_PUT = "PUT";

	public static final String METHOD_DELETE = "DELETE";

	private static PoolingHttpClientConnectionManager cm;

	private static RequestConfig requestConfig;

	private static int connectTimeout = 10000;
	private static int connectionRequestTimeout = 10000;
	private static int socketTimeout = 30000;

	static {
		cm = new PoolingHttpClientConnectionManager();
		cm.setMaxTotal(10000);
		cm.setDefaultMaxPerRoute(500);
		requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(connectTimeout)
				.setConnectionRequestTimeout(connectionRequestTimeout).build();
	}

	public static byte[] post(String url, ContentTypeEnum contentType, Map<String, String> headers, Object params) {
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		HttpEntity entity = null;
		try {
			httpClient = HttpClients.custom().setConnectionManager(cm).setConnectionManagerShared(true).build();
			HttpPost httpPost = new HttpPost(url);
			httpPost.setConfig(requestConfig);
			addHeaders(httpPost, headers);
			if (params != null) {
				if (ContentTypeEnum.JSON.equals(contentType)) {
					ByteArrayEntity postEntity = new ByteArrayEntity(
							JSONObject.toJSONString(params).getBytes(CHARSET_UTF8));
					postEntity.setContentType(contentType.value);
					httpPost.setEntity(postEntity);
				} else if (ContentTypeEnum.URLENCODED.equals(contentType)) {
					if (params instanceof Map) {
						Map<String, Object> data = (Map<String, Object>) params;
						List<NameValuePair> nameValuePairList = new ArrayList<NameValuePair>();
						for (String key : data.keySet()) {
							nameValuePairList.add(new BasicNameValuePair(key, String.valueOf(data.get(key))));
						}
						StringEntity postEntity = new UrlEncodedFormEntity(nameValuePairList, CHARSET_UTF8);
						postEntity.setContentType(contentType.value);
						httpPost.setEntity(postEntity);
					} else {
						throw new ClientException("请求参数格式不支持：" + JSONObject.toJSONString(params));
					}
				} else if (ContentTypeEnum.MULTIPART.equals(contentType)) {
					if (params instanceof Map) {
						Map<String, Object> data = (Map<String, Object>) params;
						MultipartEntityBuilder builder = MultipartEntityBuilder.create();
						builder.setCharset(Charset.forName(CHARSET_UTF8));
						for (String key : data.keySet()) {
							Object value = data.get(key);
							if (value instanceof File) {
								builder.addBinaryBody(key, (File) value);
							} else {
								builder.addTextBody(key, JSONObject.toJSONString(value));
							}
						}
						httpPost.setEntity(builder.build());
					} else {
						throw new ClientException("请求参数格式不支持：" + JSONObject.toJSONString(params));
					}
				}
			}
			response = httpClient.execute(httpPost);
			entity = response.getEntity();
			if (entity != null) {
				return EntityUtils.toByteArray(entity);
			}
		} catch (Exception e) {
			throw new ClientException(e);
		} finally {
			// 关闭连接
			closeConnect(httpClient, response, entity);
		}
		return null;
	}

	public static byte[] post(String url, Map<String, String> headers, Object params) {
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		HttpEntity entity = null;
		try {
			httpClient = HttpClients.custom().setConnectionManager(cm).setConnectionManagerShared(true).build();
			HttpPost httpPost = new HttpPost(url);
			httpPost.setConfig(requestConfig);
			addHeaders(httpPost, headers);
			if (params != null) {

				ByteArrayEntity postEntity = new ByteArrayEntity(
						JSONObject.toJSONString(params).getBytes(CHARSET_UTF8));
				postEntity.setContentType(ContentTypeEnum.JSON.value);
				httpPost.setEntity(postEntity);
			}
			response = httpClient.execute(httpPost);
			entity = response.getEntity();
			if (entity != null) {
				return EntityUtils.toByteArray(entity);
			}
		} catch (Exception e) {
			throw new ClientException(e);
		} finally {
			// 关闭连接
			closeConnect(httpClient, response, entity);
		}
		return null;
	}

	public static String postByJson(String url, Map<String, String> headers, Object jsonObj) {
		byte[] data = post(url, headers, jsonObj);
		if (data != null) {
			return new String(data);
		}
		return null;
	}

	private static void closeConnect(CloseableHttpClient httpClient, CloseableHttpResponse response,
			HttpEntity entity) {
		if (entity != null) {
			EntityUtils.consumeQuietly(entity);
		}
		if (response != null) {
			try {
				response.close();
			} catch (IOException e) {
				// log.error("关闭HttpResponse出错，错误信息：", e);
			}
		}
		if (httpClient != null) {
			try {
				httpClient.close();
			} catch (IOException e) {
				// log.error("关闭HttpClient出错，错误信息：", e);
			}
		}
	}

	public static byte[] execute(String url, String method, ContentTypeEnum contentType, Map<String, String> headers,
			Object params) {
		if (METHOD_POST.equals(method)) {
			return post(url, contentType, headers, params);
		} else if (METHOD_GET.equals(method)) {
			return get(url, headers, params);
		} else if (METHOD_PUT.equals(method)) {
			return doPutHttpRequest(url, headers, params);
		} else if (METHOD_DELETE.equals(method)) {
			return delete(url, headers, params);
		}
		throw new ClientException("not support method:" + method);
	}

	public static byte[] execute(String url, String method, Map<String, String> headers, Object params) {
		if (METHOD_POST.equals(method)) {
			return post(url, headers, params);
		} else if (METHOD_GET.equals(method)) {
			return get(url, headers, params);
		} else if (METHOD_PUT.equals(method)) {
			return doPutHttpRequest(url, headers, params);
		} else if (METHOD_DELETE.equals(method)) {
			return delete(url, headers, params);
		}
		throw new ClientException("not support method:" + method);
	}

	public static byte[] get(String url, Map<String, String> headers, Map<String, Object> params) {
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		HttpEntity entity = null;
		try {
			httpClient = HttpClients.custom().setConnectionManager(cm).setConnectionManagerShared(true).build();
			url = checkParams(url, params);
			HttpGet httpGet = new HttpGet(url);
			httpGet.setConfig(requestConfig);
			addHeaders(httpGet, headers);
			response = httpClient.execute(httpGet);
			entity = response.getEntity();
			if (entity != null) {
				return EntityUtils.toByteArray(entity);
			}
		} catch (Exception e) {
			throw new ClientException("请求错误错误信息：" + e.getMessage());
		} finally {
			// 关闭连接
			closeConnect(httpClient, response, entity);
		}
		return null;
	}

	public static byte[] get(String url, Map<String, String> headers, Object params) {
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		HttpEntity entity = null;
		try {
			httpClient = HttpClients.custom().setConnectionManager(cm).setConnectionManagerShared(true).build();
			if (params != null && params instanceof Map) {
				url = checkParams(url, (Map<String, Object>) params);
			} else {
				throw new ClientException("请求参数格式不支持：" + JSONObject.toJSONString(params));
			}
			HttpGet httpGet = new HttpGet(url);
			httpGet.setConfig(requestConfig);
			addHeaders(httpGet, headers);
			response = httpClient.execute(httpGet);
			entity = response.getEntity();
			if (entity != null) {
				return EntityUtils.toByteArray(entity);
			}
		} catch (Exception e) {
			throw new ClientException("请求错误错误信息：" + e.getMessage());
		} finally {
			// 关闭连接
			closeConnect(httpClient, response, entity);
		}
		return null;
	}

	private static String checkParams(String url, Map<String, Object> params) {
		if (params != null && !params.isEmpty()) {
			String query = "";
			for (String key : params.keySet()) {
				String value = "";
				Object obj = params.get(key);
				if (obj != null) {
					value = String.valueOf(obj);
				}
				if (query.isEmpty()) {
					query = key + "=" + value;
				} else {
					query += "&" + key + "=" + value;
				}
			}
			if (StringUtils.isNotBlank(query)) {
				if (url.contains("?")) {
					url += url.endsWith("?") ? query : ("&" + query);
				} else {
					url += "?" + query;
				}
			}
		}
		return url;
	}

	public static byte[] doPutHttpRequest(String url, Map<String, String> headers, Object params) {
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response = null;
		HttpEntity httpEntity = null;
		try {
			httpClient = HttpClients.custom().setConnectionManager(cm).setConnectionManagerShared(true).build();
			HttpPut put = new HttpPut(url);
			addHeaders(put, headers);
			ByteArrayEntity postEntity = new ByteArrayEntity(JSONObject.toJSONString(params).getBytes(CHARSET_UTF8));
			postEntity.setContentType(ContentTypeEnum.JSON.value);
			put.setEntity(postEntity);
			response = httpClient.execute(put);
			// 获得响应的实体对象
			httpEntity = response.getEntity();
			if (httpEntity != null) {
				return EntityUtils.toByteArray(httpEntity);
			}
		} catch (Exception e) {
			throw new ClientException(e);
		} finally {
			// 关闭连接
			closeConnect(httpClient, response, httpEntity);
		}
		return null;
	}

	public static byte[] delete(String url, Map<String, String> headers, Object params) {
		CloseableHttpResponse httpResponse = null;
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpEntity entity = null;
		if (params != null && params instanceof Map) {
			url = checkParams(url, (Map<String, Object>) params);
		}
		HttpDeleteWithBody httpDelete = new HttpDeleteWithBody(url);
		try {
			httpClient = HttpClients.custom().setConnectionManager(cm).setConnectionManagerShared(true).build();
			addHeaders(httpDelete, headers);
			if (params != null) {
				ByteArrayEntity deleteEntity = new ByteArrayEntity(
						JSONObject.toJSONString(params).getBytes(CHARSET_UTF8));
				httpDelete.setEntity(deleteEntity);
			}
			httpResponse = httpClient.execute(httpDelete);
			entity = httpResponse.getEntity();
			if (entity != null) {
				return EntityUtils.toByteArray(entity);
			}

		} catch (Exception e) {
			throw new ClientException(e);
		} finally {
			// 关闭连接
			closeConnect(httpClient, httpResponse, entity);
		}
		return null;
	}

	private static void addHeaders(HttpRequestBase httpEntity, Map<String, String> headers) {
		if (headers != null && !headers.isEmpty()) {
			for (String key : headers.keySet()) {
				httpEntity.addHeader(key, headers.get(key));
			}
		}
	}

	public static void setRequestConfig(RequestConfig requestConfig) {
		HttpClientUtils.requestConfig = requestConfig;
	}

	public enum ContentTypeEnum {
		JSON("application/json"), URLENCODED("application/x-www-form-urlencoded"), MULTIPART("multipart/form-data");
		protected String value;

		private ContentTypeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public static ContentTypeEnum getByValue(String value) {
			for (ContentTypeEnum type : ContentTypeEnum.values()) {
				if (type.getValue().equals(value)) {
					return type;
				}
			}
			return null;
		}

	}

}
