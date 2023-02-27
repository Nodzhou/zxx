package com.bonade.sdk.opencenter.test;

import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.dto.CompanyInfoDto.CompanyDto;
import com.bonade.sdk.opencenter.pojo.PlatformCompanyInfo;
import com.bonade.sdk.opencenter.vo.BaseExtendEntity;
import com.bonade.sdk.opencenter.vo.PageData;
import com.bonade.sdk.opencenter.vo.PageInfo;
import org.checkerframework.checker.units.qual.min;

import java.util.List;
import java.util.Map;

public class Test {
	private static SdkClient client = SdkClient.getSdkClient(); // 获取sdk实例
//	private static String host = "https://fat-api.bndxqc.com"; // 中台提供的个环境host
//	private static String clientId = "a686023f70a711e9b9fd7cd30a5a3208";
//	private static String secret = "563a81b870b211e9b9fd7cd30a5a3208";

	private static String host = "http://ztty.bndxqc.com"; // 中台提供的个环境host
	private static String clientId = "54a4f5de3f434a50a245b1174efb588f";
	private static String secret = "bc20f2c1ad224141b1c52f7d0e157f22";

//	private static String host = "https://fat-api.bndxqc.com";
//	private static String clientId = "a686023f70a711e9b9fd7cd30a5a3208";
//	private static String secret = "563a81b870b211e9b9fd7cd30a5a3208";

//	private static String host = "https://uat-api.bndxqc.com";
//	private static String clientId = "54a4f5de3f434a50a245b1174efb588f";
//	private static String secret = "bc20f2c1ad224141b1c52f7d0e157f22";

//	private static String host = "https://saas-api.bndxqc.com";
//	private static String clientId = "847ce78478a211e99c7e7cd30ad3a6a8";
//	private static String secret = "847ce79f78a211e99c7e7cd30ad3a6a8";

//	private static String host = "https://dev-api.bndxqc.com";  //开发环境
//	private static String clientId = "bonade";
//	private static String secret = "bonade";

//	private static String host = "http://ztdev-v2.bndxqc.com//";  //联调开发环境
//	private static String clientId = "24b468fe769b47479274fb0697b21244";  //crm
//	private static String secret = "6cd38d2e73854dfc89f9319e5bfd114a";//crm


//	private static String host = "http://ztdev-v2.bndxqc.com//";  //联调开发环境
//	private static String clientId = "24b468fe769b47479274fb0697b21244";  //crm
//	private static String secret = "6cd38d2e73854dfc89f9319e5bfd114a";//crm


//	private static String host = "http://ztdev.bndxqc.com/";  //开发环境
//	private static String clientId = "bonade";  //crm
//	private static String secret = "bonade";//crm


	static {
		client.init(host, clientId, secret); // 初始化
		
	}

	public static void main(String[] str) {
		System.out.println(client.getTokenClient().accessToken().toString());
		//testFindByPageSize();
		//testView();
		System.out.println("ddddddd");


	}

	public static void testFindByPageSize() {
		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageNum(1);
		pageInfo.setPageSize(20);
		CompanyDto companyInfo = new CompanyDto();
		companyInfo.setCompanyName("C2");
		companyInfo.setCompanyType(1);
		companyInfo.setId("00ptbnd1752818699159229337695715");
		PageData pageData = client.getCompanyService().findByPage(companyInfo);

		List<PlatformCompanyInfo<BaseExtendEntity>> p = (List<PlatformCompanyInfo<BaseExtendEntity>>) pageData
				.getData();
		System.out.println("接口一：企业列表查询");
		for (PlatformCompanyInfo aCompanyInfo : p) {
			System.out.println("企业名称:" + aCompanyInfo.getCompanyName());
			System.out.println("企业管理员账号:" + aCompanyInfo.getAdminAccount());
			// assertEquals(expected, actual);
		}
	}

	public  static void testView(){
		String url=client.getPictureTokenService().viewCompanyPic("https://zhongtaioss02.bndxqc.com/dev/file-dir/16029048652888.png");
		System.out.println("url="+url);
	}


}
