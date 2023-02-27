package com.bonade.sdk.opencenter.test;

import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.dto.user.PlatformUserInfoDto;
import com.bonade.sdk.opencenter.dto.user.UserInfoPageDto;
import com.bonade.sdk.opencenter.vo.PageData;
import com.bonade.sdk.opencenter.vo.PlatformUserInfoVo;
import com.bonade.sdk.opencenter.vo.UserInfoVo;

/**
 * @author yw
 * @date 2020/6/30
 */
public class TestUserInfo {
	private static SdkClient client = SdkClient.getSdkClient();
	private static String host = "http://192.168.14.214/";
	private static String clientId = "00ptbnd7877146261592211220014159";
	private static String secret = "00ptbnd1736481859159221122001415";

	public TestUserInfo() {
	}

//    public static void main(String[] str) {
	// testAdd();
	// getById();
	// getById();
	// testDelete();
//         testPage();
	// getUserInfo();
//    }

	static {
		client.init(host, clientId, secret);
	}

	@Test
	public void getById() {
		PlatformUserInfoVo userInfo = client.getUserInfoService().getUser("00ptbnd1717266531159054303183015");
		System.out.println(JSON.toJSON(userInfo));
	}

	@Test
	public void testAdd() {
		PlatformUserInfoDto platformUserInfoDto = new PlatformUserInfoDto();
		platformUserInfoDto.setUsername("SDK测试3");
		platformUserInfoDto.setPhoneNumber("17671049013");
		platformUserInfoDto.setCertificateType(1);
		platformUserInfoDto.setCertificateCard("610427197611084029");
		String id = client.getUserInfoService().addUser(platformUserInfoDto);
		System.out.println("id:" + id);
	}

	@Test
	public void testEdit() {
		PlatformUserInfoDto platformUserInfoDto = new PlatformUserInfoDto();
		platformUserInfoDto.setId("00ptbnd1797175273159358277075515");
		platformUserInfoDto.setUsername("SDK测试3");
		platformUserInfoDto.setPhoneNumber("17671049003");
		platformUserInfoDto.setCertificateType(1);
		platformUserInfoDto.setCertificateCard("610427197611084029");
		int edit = client.getUserInfoService().editUser(platformUserInfoDto);
		System.out.println("修改行数:" + edit);
	}

	@Test
	public void testDelete() {
		int delete = client.getUserInfoService().deleteUser("00ptbnd4268479261595298265146159");
		System.out.println("删除行数:" + delete);
	}

	@Test
	public void testPage() {
		UserInfoPageDto pageDataDto = new UserInfoPageDto();
		pageDataDto.setKeyword("测试");
		pageDataDto.setStatus(1);
		pageDataDto.setPageNum(1);
		pageDataDto.setPageSize(5);
		PageData<List<PlatformUserInfoVo>> page = client.getUserInfoService().findUserByPage(pageDataDto);
		System.out.println(JSON.toJSON(page));

	}
    @Test
	public void getUserInfo() {
		UserInfoVo userInfo = client.getUserInfoService().getUserInfo("00ptbnd1717266531159054303183015");
		System.out.println(JSON.toJSON(userInfo));
	}
 //   @Test
//    public void findUserInfoByPhoneNumer() {
//        UserInfoVo userInfo = client.getUserInfoService().findUserInfoByPhoneNumer("17671049519");
//        System.out.println(JSON.toJSON(userInfo));
//    }

}
