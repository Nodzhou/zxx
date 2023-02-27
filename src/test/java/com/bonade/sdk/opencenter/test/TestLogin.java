package com.bonade.sdk.opencenter.test;

import org.junit.Test;

import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.common.LoginConstant;
import com.bonade.sdk.opencenter.dto.login.CheckPwdDto;
import com.bonade.sdk.opencenter.dto.login.LoginDto;
import com.bonade.sdk.opencenter.dto.login.RegisterLoginPasswordDto;
import com.bonade.sdk.opencenter.utils.MD5Utils;

public class TestLogin {
	
	private static String host = "http://192.168.14.214/";
	private static String clientId = "00ptbnd7877146261592211220014159";
	private static String secret = "00ptbnd1736481859159221122001415";
	
	public static final String SALT = "xqc1254548787244";
	public static final String PUBLICKEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCUoHGYCV0xrvQacKnd81bR5jY5"
											+ "ph50bGa8ixpl6siyfdL8GDStVUaatqFrfaExzg0Gi0i399ZG9xSVn5iIsdrUq4HD"
											+ "QHZXqfmC+Ss3GBTPkYickTUpmnPzod9AMyEDnddVD1vyfuePw1JaeEpqhEtyRs6b" 
											+ "ra8q4LtVQIdYtBmJdwIDAQAB";
	

	static {
		SdkClient.getSdkClient().init(host, clientId, secret);
	}

	@Test
	public void loginTest() {
		LoginDto loginDto = new LoginDto();
		loginDto.setUsername("13246476644");
		loginDto.setPassword("123456");
		loginDto.setPublicKey(PUBLICKEY);
		String openId = SdkClient.getSdkClient().getLoginService().login(loginDto);
		System.out.println("openId:" + openId);
	}

	@Test
	public void checkPwdByOpenId() {
		CheckPwdDto checkPwdDto = new CheckPwdDto();
		checkPwdDto.setOpenId("00041c34e299427e8c2fb636b2891721");
		checkPwdDto.setPassword("1234561");
		checkPwdDto.setPublicKey(PUBLICKEY);
		boolean result = SdkClient.getSdkClient().getLoginService().checkPwdByOpenId(checkPwdDto);
		System.out.println("检查密码结果:" + result);
	}

	@Test
	public void updatePassword() {
		RegisterLoginPasswordDto registerLoginPasswordDto = new RegisterLoginPasswordDto();
		registerLoginPasswordDto.setOpenId("2bc8cc99b1c14e04a21435243e4136c8");
		registerLoginPasswordDto.setPassword("123456");
		registerLoginPasswordDto.setPublicKey(PUBLICKEY);
		boolean result = SdkClient.getSdkClient().getLoginService().updatePassword(registerLoginPasswordDto);
		System.out.println("同步更新密码结果:" + result);
	}

	@Test
	public void testLoginMd5() {
		LoginDto loginDto = new LoginDto();
		loginDto.setUsername("13246476644");
		String password = MD5Utils.MD5("123456" + LoginConstant.SALT);
		loginDto.setPassword(password);
		loginDto.setPublicKey(PUBLICKEY);
		String openId = SdkClient.getSdkClient().getLoginService().loginByMd5(loginDto);
		System.out.println("openId:" + openId);
	}
	
	@Test
	public void testGetRsaPassword() {
		String password = MD5Utils.MD5("123456" + LoginConstant.SALT);
		String rsaPassword = SdkClient.getSdkClient().getLoginService().getRsaPassword(password, PUBLICKEY);
		System.out.println(rsaPassword);
	}
	
	@Test
	public void testUpdateMd5Password() {
		String password = MD5Utils.MD5("123456" + LoginConstant.SALT);
		RegisterLoginPasswordDto registerLoginPasswordDto = new RegisterLoginPasswordDto();
		registerLoginPasswordDto.setPassword(password);
		registerLoginPasswordDto.setPublicKey(PUBLICKEY);
		registerLoginPasswordDto.setOpenId("2bc8cc99b1c14e04a21435243e4136c8");
		boolean isSucceed = SdkClient.getSdkClient().getLoginService().updateMd5Password(registerLoginPasswordDto);
		System.out.println(isSucceed);
	}
}
