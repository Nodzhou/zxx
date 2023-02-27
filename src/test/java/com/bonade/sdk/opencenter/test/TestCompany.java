package com.bonade.sdk.opencenter.test;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.dto.BaseExtendDto;
import com.bonade.sdk.opencenter.dto.CompanyInfoDto.CompanyChildrenNodeDto;
import com.bonade.sdk.opencenter.dto.CompanyInfoDto.CompanyDto;
import com.bonade.sdk.opencenter.dto.CompanyInfoDto.CompanyEqualsCodeDto;
import com.bonade.sdk.opencenter.dto.CompanyInfoDto.CompanyEqualsNameDto;
import com.bonade.sdk.opencenter.dto.CompanyInfoDto.CompanyInDto;
import com.bonade.sdk.opencenter.dto.CompanyInfoDto.CompanyLikeDto;
import com.bonade.sdk.opencenter.dto.CompanyInfoDto.CompanyTreeDto;
import com.bonade.sdk.opencenter.token.IAccessTokenService;
import com.bonade.sdk.opencenter.token.impl.TokenServiceImpl;
import com.bonade.sdk.opencenter.vo.CompanyChildrenNodeVo;
import com.bonade.sdk.opencenter.vo.CompanyEqualsCodeVo;
import com.bonade.sdk.opencenter.vo.CompanyEqualsNameVo;
import com.bonade.sdk.opencenter.vo.CompanyInVo;
import com.bonade.sdk.opencenter.vo.CompanyLikeVo;
import com.bonade.sdk.opencenter.vo.PageData;
import com.bonade.sdk.opencenter.vo.PlatformCompanyInfoVo;
import com.bonade.sdk.opencenter.vo.StaffInfoVo;
import com.google.common.collect.Lists;

public class TestCompany {
 

//	private static SDKClient client = SDKClient.getSdkClient();
//
//	private static String host = "http://192.168.14.214/";
//	private static String clientId = "00ptbnd7877146261592211220014159";
//	private static String secret = "00ptbnd1736481859159221122001415";

	private static SdkClient client = SdkClient.getSdkClient(); // 获取sdk实例

//	 private static String host = "http://192.168.14.214/"; // 中台提供的个环境host
	 private static String host = "http://localhost:4310"; // 中台提供的个环境host
	 private static String clientId = "bonade";
	 private static String secret = "bonade";

	static {
		client.init(host, clientId, secret);
		IAccessTokenService tokenClient = new TokenServiceImpl(host, clientId, secret);
	}

	public static void main(String[] str) throws ParseException {
//		TestCompany.findByPage();
//		System.out.println(client.getTokenClient().accessToken().getAccess_token());
//        TestCompany.testInsertCompanyInfo();
//        System.out.println(client.getSdkClient().getTokenClient().accessToken().getAccess_token());
// 	TestCompany.updateCompanyInfo();
//         getById();
//		getTreeAll();
//		testFindCompanyInfoEqualsName();
//		testFindCompanyInfoEqualsCode();
//		testFindCompanyInfoLike();
//		testFindCompanyInfoIds();
//		page2();

		TestCompany.ex_stream();
	}

	/**
	 * 分页请求
	 */
	@Test
	public void findByPage() {
		CompanyDto aaa = new CompanyDto();
		aaa.setCompanyName("我的");
//		aaa.setPageNum(1);
//		aaa.setPageSize(10);
		PageData<List<PlatformCompanyInfoVo>> companyList = client.getCompanyService().findByPage(aaa);
		System.out.println(companyList.getData().size());
	}

	/**
	 * 根据id查询
	 */
	private static void getById() {
		PlatformCompanyInfoVo platformCompanyInfo = client.getCompanyService()
				.getById("00ptbnd1494049788159661541855315");
		System.out.println(platformCompanyInfo.toString());
	}


	@Test
	public void updateCompanyInfo() {
		CompanyDto pc = new CompanyDto();
		pc.setId("00ptbnd3260660371592363384566159");
		pc.setCompanyName("哈哈哈哈哈哈");
		pc.setOfficialWebsite("http://baidu.com");
		pc.setAdminName("uuuu");
		int responseStr = client.getCompanyService().updateCompanyInfo(pc);
		System.out.println(responseStr);
	}

//
//	 public static void testUpdateCompanyInfo() {
//		  PlatformCompanyInfo ztSysCompanyInfo = new PlatformCompanyInfo();
//		  ztSysCompanyInfo.setId("00ptbnd3260660371592363384566159");
//		  ztSysCompanyInfo.setCompanyName("测试sdk企业A11111");
//		  ztSysCompanyInfo.setCompanyIntroduction("测试sdk企业简介21111水电费的辅导辅导辅导11");
//		  int compId = client.getCompanyService().updateCompanyInfo(ztSysCompanyInfo,null);
//		  System.out.println("接口四：修改企业");
//		  System.out.println("企业id:"+compId);
//
//		 }

//	@Test
//	public void updateCompanyInfoTestSimp() {
//		PlatformCompanyInfoDto pc = new PlatformCompanyInfoDto();
//		pc.setAdminAccount("15815802845");
//		pc.setAdminName("毕毅焯");
//		pc.setCompanyOpenId("00d64325290e42298c42e6b074178465");
//		pc.setCompanyName("sdk测试企业crm01");
//		pc.setBusinessLicenseCode("410122194306057455");
////		pc.setLegalRepresentative("测试人");
////		pc.setLegalPersoncertNo("230128197604158244");
//		pc.setOfficialWebsite("http://baidu.com");
////		pc.setAdminName("测试smip服务企业编辑管理员");
//		int responseStr = client.getCompanyService().updateCompanyInfoFromSimp(pc);
//		System.out.println(responseStr);
//	}

//
//	 public static void testUpdateCompanyInfo() {
//		  PlatformCompanyInfo ztSysCompanyInfo = new PlatformCompanyInfo();
//		  ztSysCompanyInfo.setId("00ptbnd3260660371592363384566159");
//		  ztSysCompanyInfo.setCompanyName("测试sdk企业A11111");
//		  ztSysCompanyInfo.setCompanyIntroduction("测试sdk企业简介21111水电费的辅导辅导辅导11");
//		  int compId = client.getCompanyService().updateCompanyInfo(ztSysCompanyInfo,null);
//		  System.out.println("接口四：修改企业");
//		  System.out.println("企业id:"+compId);
//
//		 }


	@Test
	public void testInsertCompanyInfo() {
		CompanyDto ztSysCompanyInfo = new CompanyDto();
		ztSysCompanyInfo.setCompanyName("测试sdk企业H");
		ztSysCompanyInfo.setAdminAccount("17728085574");
		ztSysCompanyInfo.setBusinessLicenseCode("440126192712896461");
		ztSysCompanyInfo.setAdminName("我的管理员");
		ztSysCompanyInfo.setAdminAccount("13897062157");
		String compId = client.getCompanyService().insertCompanyInfo(ztSysCompanyInfo);
		System.out.println("接口三：新增企业");
		System.out.println("企业id:" + compId);
	}

//	@Test
//	public void testInsertCompanyInfoTestSimp() {
//		PlatformCompanyInfoDto ztSysCompanyInfo = new PlatformCompanyInfoDto();
//		ztSysCompanyInfo.setCompanyName("sdk2324442");
//		ztSysCompanyInfo.setAdminAccount("13881379166");	//管理员账号
//		ztSysCompanyInfo.setCompanyType(1);	//企业类型
//		ztSysCompanyInfo.setBusinessLicenseCode("429154593394064138");	//社会信用代码
//		ztSysCompanyInfo.setEnterpriseNature(1);	//企业性质
//		ztSysCompanyInfo.setIsTaxPayer(1);	//是否一般纳税人
//		ztSysCompanyInfo.setCompanyAddress("广东省广州市测试地址");	//公司地址
//		ztSysCompanyInfo.setTaxpayerIdentificationNumber("412122193304064138");	//纳税人识别号
//		ztSysCompanyInfo.setLegalRepresentative("测试人");	//法定代表人
//		ztSysCompanyInfo.setLegalPersoncertNo("230128197604158244");	//法人身份证号
//		ztSysCompanyInfo.setCompanyShortName("SDK测试的");	//企业简称
//		ztSysCompanyInfo.setAdminPhoneNumber("13881379166");	//管理员联系方式
//		ztSysCompanyInfo.setAdminName("张宁");	//管理员姓名
//		ztSysCompanyInfo.setCompanyIntroduction("测测试企业测测测");	//企业简介
//		ztSysCompanyInfo.setRegisteredCapital("1000000");	//注册资本
//		//ztSysCompanyInfo.setParentId("00d64325290e42298c42e6b074178465");	//上级id
//		ztSysCompanyInfo.setIsGroup(0);	//是否为集团
//		// ztSysCompanyInfo.setParentOrganizationId("00ptbnd1342580988159737557657015");	//上级分支组织id
//		ztSysCompanyInfo.setIsOrganization(0);	//是否是分支组织
//		ztSysCompanyInfo.setOfficialWebsite("https://www.baidu.com/");	//企业官网地址
//		ztSysCompanyInfo.setEmployeeCount(1000);	//员工人数
//		ztSysCompanyInfo.setEnterpriseSize(1);	//企业规模
//		String compId = client.getCompanyService().insertCompanyInfoFromSimp(ztSysCompanyInfo);
//		System.out.println("接口三：新增企业");
//		System.out.println("企业id:"+compId);

//		PlatformCompanyInfoDto ztSysCompanyInfo = new PlatformCompanyInfoDto();
//		ztSysCompanyInfo.setCompanyName("测试simp-opencenter新增企业3");
//		ztSysCompanyInfo.setAdminAccount("15562123122");
//		ztSysCompanyInfo.setBusinessLicenseCode("4401261927128DACAB");
//		ztSysCompanyInfo.setAdminName("测试simpopencenter新增企业管理员");
//		String compId = client.getCompanyService().insertCompanyInfoFromSimp(ztSysCompanyInfo);
//		System.out.println("接口三：新增企业");
//		System.out.println("企业id:" + compId);
//	}

	@Test
	public void getTreeAll() {
		CompanyTreeDto companyTreeDto = new CompanyTreeDto();
		companyTreeDto.setId("3123f7f8a2824c13a7ff94f0752925e1");
//		companyTreeDto.setCompanyName("安徽伯仲信息科技有限公司");
		JSONObject jSONObject = SdkClient.getSdkClient().getCompanyService().getTreeAll(companyTreeDto);
		System.out.println(jSONObject);
	}
	@Test
	public void testFindCompanyInfoEqualsName(){
		CompanyEqualsNameDto dto=new CompanyEqualsNameDto();
		dto.setCompanyName("wqewq");
		CompanyEqualsNameVo jb = SdkClient.getSdkClient().getCompanyService().findCompanyInfoEqualsName(dto);
		System.out.println(JSONObject.toJSON(jb));
	}
	@Test
	public void testFindCompanyInfoEqualsCode(){
		CompanyEqualsCodeDto dto=new CompanyEqualsCodeDto();
		dto.setBusinessLicenseCode("信用代码");
		CompanyEqualsCodeVo jb = SdkClient.getSdkClient().getCompanyService().findCompanyInfoEqualsCode(dto);
		System.out.println(jb);
	}
	@Test
	public void testFindCompanyInfoLike(){
		CompanyLikeDto dto=new CompanyLikeDto();
		dto.setCompanyName("wqewq");
		List<CompanyLikeVo> jb = SdkClient.getSdkClient().getCompanyService().findCompanyInfoLike(dto);
		System.out.println(JSONObject.toJSON(jb));
		
	}
	@Test
	public void testFindCompanyInfoIds(){
		List<String> list=Arrays.asList("00f7b5ae148942dea906e9213c14fa66","0235c6040cac4765af84206659fad1cb");
		JSONObject json=new JSONObject();
		CompanyInDto dto=new CompanyInDto();
		dto.setCompanyIds(list);
		List<CompanyInVo> jb = SdkClient.getSdkClient().getCompanyService().findCompanyInfoIds(dto);
		System.out.println(jb);    
	}
	
	private static void page2() {
		CompanyChildrenNodeDto pageDto = new CompanyChildrenNodeDto();
    	pageDto.setRootCompanyId("0042da5269634dd6bbb2c732a11a937d");
        pageDto.setPageNow(1);
        pageDto.setPageSize(10);
        pageDto.setCompanyName("伯纳");
        PageData<List<CompanyChildrenNodeVo<BaseExtendDto>>> page = client.getCompanyService().findCompanyInfoChildrenNode(pageDto);
        System.out.println("getData=====>" + JSON.toJSON(page.getData()));
        System.out.println("getTotal=====>" + JSON.toJSON(page.getTotal()));


    }

	@Test
	public static void ex_stream() throws ParseException {
        List<StaffInfoVo>  listP= Lists.newArrayList();

        for(int j=1;j<=30;j++) {
			StaffInfoVo ztSysCompanyInfo = new StaffInfoVo();
			ztSysCompanyInfo.setStaffId(String.valueOf(j));
			ztSysCompanyInfo.setCompanyName("测试sdk企业H"+j);
			ztSysCompanyInfo.setIsMainCompany(j);
			ztSysCompanyInfo.setStatus(j%5);
			if(j%3==0) {
				String p=j>9?String.valueOf(j):"0"+String.valueOf(j);
				ztSysCompanyInfo.setConversionDate(DateUtils.parseDate("1999-05-05 13:"+p+":00","yyyy-MM-dd HH:mm:SS"));
			}
            listP.add(ztSysCompanyInfo);
		}

		StaffInfoVo bigS=listP.stream().max(Comparator.comparing(StaffInfoVo::getIsMainCompany)).get();
        Integer gi=listP.stream().mapToInt(g->g.getIsMainCompany()).max().getAsInt();


		   Map<Integer,List<StaffInfoVo>> typeMap=listP.stream().collect(Collectors.groupingBy(StaffInfoVo::getStatus));

//            for(Map.Entry<Integer,List<StaffInfoVo>> en: typeMap.entrySet()){
//				System.out.println(en.getKey()+"=="+en.getValue());
//			}

		listP.forEach(i-> System.out.println("iii="+i.getStaffId()));

//
		StaffInfoVo mixId=listP.stream().sorted(
				Comparator.comparing(StaffInfoVo::getStaffId).reversed()).findFirst().get();


     	System.out.println("dff="+mixId.getStaffId());


	}
	
}
