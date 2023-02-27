package com.bonade.sdk.opencenter.client;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
/**
 * 基础凭证
 * @author jimmy
 *
 */
public class BasicCredentials implements Credentials {

	private String clientId;

	private String secret;


	public BasicCredentials(String clientId, String secret) {
		this.clientId = clientId;
		this.secret = secret;
	}
 
	@Override
	public String getClientId() {
		return clientId;
	}

	@Override
	public String getSecret() {
		return secret;
	}
	

	@Override
	public String getBasicAuth() {
		if (StringUtils.isNoneBlank(clientId, secret)) {
			return "Basic "+Base64.encodeBase64String((clientId + ":" + secret).getBytes());
		}
		return null;
	}


}
