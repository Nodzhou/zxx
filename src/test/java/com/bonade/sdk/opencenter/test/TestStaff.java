package com.bonade.sdk.opencenter.test;

import com.alibaba.fastjson.JSON;
import com.bonade.sdk.opencenter.client.SdkBasicConfig;
import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.dto.BaseExtendDto;
import com.bonade.sdk.opencenter.dto.platformstaffinfo.PlatformStaffInfoDto;
import com.bonade.sdk.opencenter.dto.platformstaffinfo.PlatformStaffInfoPageDto;

import com.bonade.sdk.opencenter.pojo.PlatformUnionStaffDepart;
import com.bonade.sdk.opencenter.vo.PageData;
import com.bonade.sdk.opencenter.vo.PageInfo;
import com.bonade.sdk.opencenter.vo.PlatformStaffInfoVo;
import com.bonade.sdk.opencenter.vo.StaffQueryVo;

import java.util.List;

import org.junit.Test;

public class TestStaff {

	static String host = "http://192.168.14.214/";
	// String host = "http://192.168.14.214:4001/";

	// private static String clientId = "83d5eb250cb74bbeb1555d84614cc6db"; //crm
	private static String clientId = "00ptbnd7877146261592211220014159";
	private static String secret = "00ptbnd1736481859159221122001415";
	static SdkClient client = SdkClient.getSdkClient();

	static {

		client.init(host, clientId, secret);
	}

//    public static void main(String[] str) {
	// TestStaff.add();
	// TestStaff.edit();
	// TestStaff.get();
//         TestStaff.page();
	// TestStaff.dimiss();
	// TestStaff.delete();
	// saveUnionStaffDepart();
//
//        System.out.println("done.....");
//    }

	@Test
	public void add() {

		PlatformStaffInfoDto<BaseExtendDto> platformStaffInfo = new PlatformStaffInfoDto<>();
		platformStaffInfo.setCompanyId("00b2f2c34a8d4dd69b14560acf98c2c2");
		platformStaffInfo.setPhoneNumber("13122341221");
		platformStaffInfo.setUserName("my我的测试");

		/*
		 * platformStaffInfo.setPositionId("00ptbnd1782903107159194596132015");
		 * platformStaffInfo.setPositionName("positionName00");
		 * 
		 * platformStaffInfo.setDepartmentId("00ptbnd1162440715159098009382115");
		 * platformStaffInfo.setDepartmentName("departmentName00");
		 * 
		 * platformStaffInfo.setCertificateType("9");
		 * 
		 * platformStaffInfo.setCompanyName("companyName9");
		 * 
		 * platformStaffInfo.setEmail("weo811@qq.com"); platformStaffInfo.setGender(2);
		 * platformStaffInfo.setIdentityCard("321456789011234999");
		 * platformStaffInfo.setIsMainCompany(1); platformStaffInfo.setJobNumber("449");
		 */

		String addString = client.getStaffInfoService().addStaff(platformStaffInfo);
		System.out.println("addString=" + addString);
	}

	@Test
	public void edit() {
		PlatformStaffInfoDto<BaseExtendDto> platformStaffInfo = new PlatformStaffInfoDto<>();
		platformStaffInfo.setId("00ptbnd8250269751597038005180159");
		platformStaffInfo.setCompanyId("00b2f2c34a8d4dd69b14560acf98c2c2");
		platformStaffInfo.setPhoneNumber("13124444113");
		// platformStaffInfo.setIsMainCompany(1);
		platformStaffInfo.setUserName("userName9");
		platformStaffInfo.setCertificateType(2);

		platformStaffInfo.setCompanyName("companyName9");

		platformStaffInfo.setDepartmentId("00ptbnd1162440715159098009382115");
		platformStaffInfo.setDepartmentName("departmentName88");

		platformStaffInfo.setEmail("weo811@qq.com");
		platformStaffInfo.setGender(2);
		platformStaffInfo.setCertificateCard("321456789011234999");
		platformStaffInfo.setPositionId("2229");
		platformStaffInfo.setPositionName("positionName9");

		// staffInfoVo.setUserId("33212"); 新增..
		// staffInfoVo.setUserId("33212"); 修改
		platformStaffInfo.setJobNumber("449");

		int editString = client.getStaffInfoService().editStaff(platformStaffInfo);
		System.out.println("editString=" + editString);

	}

	@Test
	public void page() {

		PlatformStaffInfoPageDto pageDto = new PlatformStaffInfoPageDto();
		pageDto.setPageNum(1);
		pageDto.setPageSize(10);
		pageDto.setKeyword("测试");
		// pageDto.setCompanyId(""); //查询列表
		// pageDto.setDepartmentId("b5020d59c0514442984a9c6a51326cdc");
		// pageDto.setPositionId("2228");
		// pageDto.setIsCertificated(1);
		// pageDto.setIsMainCompany(1);
		// pageDto.setIsNotLeft(0);
		PageData<List<PlatformStaffInfoVo<BaseExtendDto>>> page = client.getStaffInfoService().findStaffByPage(pageDto);
		System.out.println("page list=" + page.getData().get(0).getDepartmentName());

	}

	@Test
	public void get() {
		PlatformStaffInfoVo platformStaffInfoDto = client.getStaffInfoService()
				.getStaffById("00ptbnd1808978394159471090966215");
		System.out.println(JSON.toJSON(platformStaffInfoDto));
	}

	@Test
	public void delete() {

	}

	@Test
	public void dimiss() {

	}

//    public static void saveUnionStaffDepart() {
//        PlatformUnionStaffDepart staffDepart = new PlatformUnionStaffDepart();
//        staffDepart.setStaffId("1111111");
//        staffDepart.setDepartmentId("222222222");
//        String s = SdkBasicConfig.getStaffInfoService().saveUnionStaffDepart(staffDepart);
//        System.out.println(s);
//    }

	public void editUnionStaffDepartById() {

	}

	public void deleteUnionStaffDepartById() {

	}

	public void findRecordsByCondition() {

	}
}
