package com.bonade.sdk.opencenter.test;

import java.util.UUID;

import org.junit.Test;

import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.client.service.IClientCurrentLoginInfoService;

public class TestClientCurrentLoginInfo {
	 
	private SdkClient sdkClient = SdkClient.getSdkClient();
	private static String host = "http://192.168.14.214/";
	private static String clientId = "00ptbnd7877146261592211220014159";
	private static String secret = "00ptbnd1736481859159221122001415";
	
	
	{
		sdkClient.init(host, clientId, secret);
		//以下为新增内容, sdk用于存储创建人丶更新人信息.如果不传无法记录
		sdkClient.setClientCurrentLoginInfoService(new IClientCurrentLoginInfoService() {
			@Override
			public String getClientCurrentOpenId() {
				// 去session或token中拿到当前登录用户的id
				System.out.println("客户端自己实现当前登录用户的openId!");
				return UUID.randomUUID().toString();
			}
		});
	}
	
	@Test
	public void getClientCurrentOpenId() {
		System.out.println(sdkClient.getClientCurrentLoginInfoService().getClientCurrentOpenId());
	}

}
