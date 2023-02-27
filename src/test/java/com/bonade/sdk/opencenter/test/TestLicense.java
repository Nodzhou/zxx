package com.bonade.sdk.opencenter.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.bonade.sdk.opencenter.dto.license.QueryLicenseDetailsDto;
import com.bonade.sdk.opencenter.vo.PageData;
import com.bonade.sdk.opencenter.vo.license.LicenseDetailsVo;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.dto.license.LicenseDetailsAllDto;
import com.bonade.sdk.opencenter.dto.license.LicenseDetailsByCompanyOpenIdsDto;
import com.bonade.sdk.opencenter.dto.license.LicenseDetailsDto;
import com.bonade.sdk.opencenter.dto.license.LicenseUserDto;

/**
 * @author yw
 * @date 2020/6/30
 */
public class TestLicense {
	private static SdkClient client = SdkClient.getSdkClient();
	//private static String host = "http://192.168.14.214/";
    private static String host = "http://localhost:4310";
	private static String clientId = "00ptbnd7877146261592211220014159";
	private static String secret = "00ptbnd1736481859159221122001415";

	public TestLicense() {
	}

//    public static void main(String[] str) {
//    }

	static {
		client.init(host, clientId, secret);
	}

	@Test
	public void queryLicenseDetails() {
		List<LicenseDetailsDto> queryLicenseDetails = client.getLicenseService()
				.queryLicenseDetails("300b40909ccd4350befb5c3fc9c676c4");
		System.out.println(JSON.toJSON(queryLicenseDetails));
	}

	@Test
	public void queryLicenseDetailsByCompanyOpenIds() {
		List<String> companyOpenIds = new ArrayList<>();
		companyOpenIds.add("00ptbnd7797667981605237790292160");
		companyOpenIds.add("00ptbnd8451333881604458589580160");
		Map<String, List<LicenseDetailsByCompanyOpenIdsDto>> map = client.getLicenseService()
				.queryLicenseDetailsByCompanyOpenIds(companyOpenIds);
		List<LicenseDetailsByCompanyOpenIdsDto> list = map.get("00ptbnd7797667981605237790292160");
		System.out.println(JSON.toJSON(map));
	}

	@Test
	public void queryLicenseDetailsAll() {
		List<LicenseDetailsAllDto> queryLicenseDetails = client.getLicenseService()
				.queryLicenseDetailsAll("300b40909ccd4350befb5c3fc9c676c4");
		System.out.println(JSON.toJSON(queryLicenseDetails));
	}

	@Test
	public void updateMayAuthorize() {
		Integer i = client.getLicenseService().updateMayAuthorize(2, 50);
		System.out.println(i);
	}

	@Test
	public void addlicenseUser() {
		LicenseUserDto licenseUserDto = new LicenseUserDto();
		licenseUserDto.setLicenseTime(new Date());
		licenseUserDto.setOpenId("00ptbnd1910833771603781947082160");
		licenseUserDto.setLicenseDetailsId(8);
		Integer i = client.getLicenseService().addlicenseUser(licenseUserDto);
		System.out.println("新增授权用户详情id" + i);
	}

	@Test
	public void deletelicenseUser() {
		LicenseUserDto licenseUserDto = new LicenseUserDto();
		licenseUserDto.setOpenId("00ptbnd1910833771603781947082160");
		licenseUserDto.setLicenseDetailsId(6);
		Integer count = client.getLicenseService().deletelicenseUser(licenseUserDto);
		System.out.println(count);
	}

    @Test
    public void queryLicenseDetailsByPage() {
        QueryLicenseDetailsDto licenseUserDto = new QueryLicenseDetailsDto();
        licenseUserDto.setSystemName("人力");
        PageData<List<LicenseDetailsVo>> listPageData = client.getLicenseService().queryLicenseDetailsByPage(licenseUserDto);
        System.out.println(JSON.toJSON(listPageData));
    }
}
