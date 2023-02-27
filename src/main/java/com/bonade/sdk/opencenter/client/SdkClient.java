package com.bonade.sdk.opencenter.client;

import com.bonade.sdk.opencenter.token.IAccessTokenService;
import com.bonade.sdk.opencenter.token.impl.TokenServiceImpl;

/**
 * Token客户端工具类
 */
public class SdkClient extends SdkBasicConfig {

	private static SdkClient sdkClient = new SdkClient();

	private Credentials credentials;

	private Client client;

	private String host;

	private String clientId;

	/**
	 * token端
	 */
	private IAccessTokenService tokenClient;

	private SdkClient() {

	}

	/**
	 * 使用SDKClient必须先执行初始化init方法,在程序启动后，初始化 init方法
	 *
	 * @param host
	 *            环境地址
	 * @param clientId
	 *            业务线clientId
	 * @param secret
	 *            秘钥
	 */
	public void init(String host, String clientId, String secret) {
		sdkClient.host = host;
		sdkClient.clientId = clientId;
		sdkClient.credentials = new BasicCredentials(clientId, secret);
		sdkClient.client = new BasicClient(host, sdkClient.credentials);
		sdkClient.tokenClient = new TokenServiceImpl(host, clientId, secret);
	}

	public static String getClientId() {
		return sdkClient.clientId;
	}

	public static Client getClient() {
		return sdkClient.client;
	}

	public static String getHost() {
		return sdkClient.host;
	}

	public static Credentials getCredentials() {
		return sdkClient.credentials;
	}

	/**
	 * 获取sdk客户端
	 *
	 * @return SdkClient sdk
	 */
	public static SdkClient getSdkClient() {
		return sdkClient;
	}

	public static IAccessTokenService getTokenClient() {
		return sdkClient.tokenClient;
	}
	
	public void setTokenClient(IAccessTokenService service) {
		sdkClient.tokenClient = service;
	}
}
