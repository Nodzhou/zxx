package com.bonade.sdk.opencenter.test;

import org.junit.Test;

import com.bonade.sdk.opencenter.client.SdkClient;

public class TestToken {

//	新孵化
	private static String host = "http://ztdev.bndxqc.com/";
//	private static String clientId = "00ptbnd1746501515159591886894915";
//	private static String secret = "00ptbnd2807065381595918868949159";

//	新访客
	private static String clientId = "9ea8f53e07b54fb49c37fca3e4d8a6d1";
	private static String secret = "fc83d401669440dca6f4a4b0ccceedf6";

	private static SdkClient client = SdkClient.getSdkClient(); // 获取sdk实例

	static {
		client.init(host, clientId, secret);
	}

	@Test
	public void validAccessToken() {
		boolean flag = SdkClient.getSdkClient().getApplicationTokenService()
				.validAccessToken("9ea8f53e07b54fb49c37fca3e4d8a6d1", "ce4cf7100fb8ad04aaf8f5d5f48f899a");
		System.out.println(flag);
	}

	@Test
	public void getAccessTokenValid() {
		String accessTokenValid = SdkClient.getSdkClient().getApplicationTokenService().getAccessTokenValid();
		System.out.println(accessTokenValid);
	}
}
