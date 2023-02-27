/**
　 * @author ShawnTang
  *
*/
package com.bonade.sdk.opencenter.test;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.dto.AppServiceManageDto;
import com.bonade.sdk.opencenter.vo.AppServiceManageVo;

/**
 * <b>Description:</b><br>
 * 
 * @author ShawnTang
 * @version 1.0 <b>ProjectName:</b> open-center-sdk <br>
 *          <b>PackageName:</b> com.bonade.sdk.opencenter.test <br>
 *          <b>ClassName:</b> TestAppServiceManageClient <br>
 *          <b>Date:</b> 2020年10月4日 下午5:19:33
 */
public class TestAppServiceManageClient {
	private static SdkClient client = SdkClient.getSdkClient();
	private static String host = "http://192.168.14.214/";
	private static String clientId = "00ptbnd1746501515159591886894915";
	private static String secret = "00ptbnd2807065381595918868949159";

	public TestAppServiceManageClient() {
	}

	static {
		client.init(host, clientId, secret);
	}

	public static void main(String[] args) {
		getAppServiceManageListByOpenId();
	}

	public static void getAppServiceManageListByOpenId() {
		AppServiceManageDto record = new AppServiceManageDto();
		String openId = "00000045f44c481698bfbd5accff4cf8";
		List<AppServiceManageVo> appServiceManageVos = client.getAppServiceManageService()
				.getAppServiceManageListByOpenId(record, openId);
		System.out.println(JSONObject.toJSON(appServiceManageVos));
	}
}
