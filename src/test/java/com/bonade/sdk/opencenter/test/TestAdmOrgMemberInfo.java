package com.bonade.sdk.opencenter.test;

import java.util.List;

import org.junit.Test;

import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.vo.AdmOrgMemberInfoVo;

public class TestAdmOrgMemberInfo {
	
	private static String host = "http://zttest.bndxqc.com/";
	private static String clientId = "a686023f70a711e9b9fd7cd30a5a3208";
	private static String secret = "563a81b870b211e9b9fd7cd30a5a3208";
	
	{
		SdkClient.getSdkClient().init(host, clientId, secret);
	}
	
	@Test
	public void testFindMemberInfoByOpenId() {
		List<AdmOrgMemberInfoVo> findMemberInfoByOpenId = SdkClient.getSdkClient().getAdmOrgMemberInfoService().findMemberInfoByOpenId("00ptbnd9905171271600998705708160");
		System.out.println(findMemberInfoByOpenId);
	}
	
}
