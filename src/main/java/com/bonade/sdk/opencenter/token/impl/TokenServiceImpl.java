package com.bonade.sdk.opencenter.token.impl;

import com.bonade.sdk.opencenter.client.BasicCredentials;
import com.bonade.sdk.opencenter.client.Credentials;
import com.bonade.sdk.opencenter.client.TokenBasicClient;
import com.bonade.sdk.opencenter.common.ResultCodeConstant;
import com.bonade.sdk.opencenter.exception.ClientException;
import com.bonade.sdk.opencenter.token.IAccessTokenService;
import com.bonade.sdk.opencenter.vo.AccessTokenVo;
import com.bonade.sdk.opencenter.vo.TokenDataResult;

public class TokenServiceImpl implements IAccessTokenService {
	private String host;
	private Credentials credentials;
//	protected AccessTokenVo tokenVo;

	public TokenServiceImpl(String host, String clientId, String secret) {
		this.host = host;
		credentials = new BasicCredentials(clientId, secret);
	}

	@Override
	public AccessTokenVo accessToken() {
		TokenDataResult dataResult = TokenBasicClient.accessTocken(this.host, this.credentials);
		// 成功
		if (dataResult != null && ResultCodeConstant.SUCCESS == dataResult.getCode()) {
			return dataResult.getData();
		}
		throw new ClientException(ResultCodeConstant.CREATE_TOKEN_ERROR, "生成token失败");
	}

	/**
	 * 初始化access_token
	 */
//	public void doAccessToken() {
//		TokenDataResult dataResult = TokenBasicClient.accessTocken(this.host, this.credentials);
//		// 成功
//		if (dataResult != null && ResultCodeConstant.SUCCESS == dataResult.getCode()) {
//			tokenVo = dataResult.getData();
//		}
//		throw new ClientException(ResultCodeConstant.CREATE_TOKEN_ERROR, "生成token失败");
//	}

//	@Override
//	public AccessTokenVo refreshToken() {
//		if (tokenVo != null) {
//			TokenDataResult dataResult = TokenBasicClient.refreshToken(host, credentials, tokenVo);
//			if (dataResult != null && ResultCodeConstant.SUCCESS == dataResult.getCode()) {
//				// 刷新成功
//				tokenVo = dataResult.getData();
//			} else {
//				// 刷新失敗
//				tokenVo = null;
//				accessToken();
//			}
//		} else {
//			accessToken();
//		}
//		return tokenVo;
//	}

//	@Override
//	public AccessTokenVo accessTokenByCache() {
//		return tokenVo;
//	}

}
