/**
　 * @author ShawnTang
  *
*/
package com.bonade.sdk.opencenter.test;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.vo.BusinessSystemVo;

public class TestSystem {

	private static SdkClient client = SdkClient.getSdkClient();
	private static String host = "http://192.168.14.214/";
	private static String clientId = "00ptbnd1832618826159617825019115";
	private static String secret = "00ptbnd1445952968159617825019115";

	public TestSystem() {
	}

	static {
		client.init(host, clientId, secret);
	}

	public static void main(String[] args) {
		findBusinessByCompanyId();
	}

	public static void findBusinessByCompanyId() {
		String companyId = "00f7b5ae148942dea906e9213c14fa66";
		List<BusinessSystemVo> businessSystemVos = client.getSystemService().findSystemByCompanyId(companyId);
		System.out.println(JSON.toJSON(businessSystemVos));
	}
}
