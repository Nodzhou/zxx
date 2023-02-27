package com.bonade.sdk.opencenter.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.dto.convertId.ConvertCompanyIdDto;
import com.bonade.sdk.opencenter.dto.convertId.ConvertStaffIdDto;
import com.bonade.sdk.opencenter.dto.convertId.ConvertStaffOpenIdDto;
import com.bonade.sdk.opencenter.dto.convertId.ConvertUserIdDto;

public class TestConvertId {
	
	private static String host = "http://192.168.14.214/";
	private static String clientId = "00ptbnd7877146261592211220014159";
	private static String secret = "00ptbnd1736481859159221122001415";
	
	static {
		SdkClient.getSdkClient().init(host, clientId, secret);
	}
	
	@Test
	public void convertBclientStaffId() {
		ConvertStaffIdDto convertStaffIdDto  = new ConvertStaffIdDto();
		convertStaffIdDto.setStaffOpenId("00006e3f67fa11e989b18cec4b6d151c");
		convertStaffIdDto.setbClientId("bonade");
		String staffId = SdkClient.getSdkClient().getConvertIdService().convertBclientStaffId(convertStaffIdDto);
		System.out.println("staffId: " + staffId);
	}
	
	@Test
	public void convertStaffOpenId() {
		ConvertStaffOpenIdDto convertStaffOpenIdDto = new ConvertStaffOpenIdDto();
		convertStaffOpenIdDto.setStaffId("3524d987764111e99c7e7cd30ad3a6a8");
		convertStaffOpenIdDto.setaClientId("bonade");
		String staffOpenId = SdkClient.getSdkClient().getConvertIdService().convertStaffOpenId(convertStaffOpenIdDto);
		System.out.println("staffOpenId: " + staffOpenId);
	}
	
	@Test
	public void convertBclientCompanyId() {
		ConvertCompanyIdDto convertCompanyIdDto  = new ConvertCompanyIdDto();
		convertCompanyIdDto.setCompanyOpenId("00ptbnd1756124872159895921085715");
		convertCompanyIdDto.setbClientId("bonade");
		String companyId = SdkClient.getSdkClient().getConvertIdService().convertBclientCompanyId(convertCompanyIdDto);
		System.out.println("companyId: " + companyId);
	}
	
	@Test
	public void convertBclientUserId() {
		ConvertUserIdDto convertUserIdDto  = new ConvertUserIdDto();
		convertUserIdDto.setOpenId("00ptbnd1004356151159825615635915");
		convertUserIdDto.setbClientId("bonade");
		String userId = SdkClient.getSdkClient().getConvertIdService().convertBclientUserId(convertUserIdDto);
		System.out.println("userId: " + userId);
	}
	
	public static void main(String[] args) {
		if (StringUtils.isNotBlank(" ")) {
			System.out.println(123);
		}
	}

}
