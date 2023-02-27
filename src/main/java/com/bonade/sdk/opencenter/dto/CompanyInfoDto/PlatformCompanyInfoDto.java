package com.bonade.sdk.opencenter.dto.CompanyInfoDto;

import com.bonade.sdk.opencenter.vo.PageInfo;

import java.io.Serializable;
import java.util.Date;

/*** 企业参数Dto 实体
 * <b>Description:</b><br>
 *
 * @author nod
 * <b>ProjectName:</b> bonade-platform-opencenter
 * <br><b>PackageName:</b> com.bonade.sdk.opencenter.dto.CompanyInfoDto
 * <br><b>ClassName:</b>  companyDto
 * <br><b>Date:</b> 2020/8/7 20:30
 */
public class PlatformCompanyInfoDto extends PageInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 企业id 新增时id不设置 */
	private String companyOpenId;

	/** 经营范围 */
	private String companyBusinessScope;
	/** 业务线操作ID */
	private String clientId;
	/** 是否是个体工商户 1 是 0否 */
	private Integer isBusiness;
	/**
	 * 企业名称
	 */
	private String companyName;
	/**
	 * 企业类型
	 * 	1	客户企业
	 * 2	运营企业
	 * 3	合作企业
	 * 4	管理员企业
	 * 5	客户运营企业
	 * 6	个体户
	 * 7	小微企业
	 */
	private Integer companyType;

	/**
	 * 企业简称
	 */
	private String companyShortName;

	/** 实名来源 */
	private String realNameFrom;

	/**
	 * 注册资本
	 */
	private String registeredCapital;
	/**
	 * 企业性质
	 * 1	国有企业
	 * 2	集体所有制
	 * 3	私营企业
	 * 4	外商投资企业
	 * 5	个人独资企业
	 * 6	股份制企业
	 * 7	有限合伙企业
	 * 8	联营企业
	 * 9	港澳台企业
	 * 10	股份合作企业
	 * 11	其他
	 */
	private Integer enterpriseNature;
	/**
	 * 是否一般纳税人 1是 0否
	 */
	private Integer isTaxPayer;

	/**
	 * 公司地址
	 */
	private String companyAddress;

	/**
	 * 纳税人识别号
	 */
	private String taxpayerIdentificationNumber;

	/**
	 * 统一社会信用代码
	 */
	private String businessLicenseCode;

	/**
	 * 法定代表人
	 */
	private String legalRepresentative;
	/**
	 * 法人身份证号
	 */
	private String legalPersoncertNo;

	/**
	 * 企业状态
	 * -1	删除
	 * 1	激活
	 * 2	停用
	 */
	private Integer status;


	/** 企业来源
	 * 	1	企业自己注册
	 * 2	集团企业自己添加
	 * 3	平台添加
	 * 4	运营企业添加
	 * 5	业务线导入
	 * 6	其他
	 * */
	private String companyFrom;

	/** 管理员账号 */
	private String adminAccount;

	/** 管理员联系方式 */
	private String adminPhoneNumber;

	/** 管理员姓名 */
	private String adminName;

	/**
	 * 企业简介
	 */
	private String companyIntroduction;

	/**
	 *
	 * isCertificated 这个字段用作查询使用，新增编辑isCertificated字段值无效
	 * 是否实名,0-未实名，1-已实名
	 * */
	private Integer isCertificated;

	/** 集团id */
	private String blocId;

	/** 上级id */
	private String parentId;

//	/** 上级分支组织id  */
	private String parentOrganizationId;

	/** 是否为集团，0 ：不是集团, 1集团、2事业群 */
	private Integer isGroup;

	/** 是否是分支组织  1 是 0否*/
	private Integer isOrganization;

	private Date joinGroupTime;

	private Date joinOrganizationTime;

	/** 企业官网地址 */
	private String officialWebsite;

	/** 企业Logo */
	private String compLogo;
	/** 员工人数 */
	private Integer employeeCount;
	/** 企业规模
	 * 	1	大型企业
	 * 2	中型企业
	 * 3	小型企业
	 * 4	微型企业
	 * */
	private Integer enterpriseSize;



	/** 银行开户行 */
	private String bankName;

	/** 银行开户账号 */
	private String bankAccount;

	/** 银行开户名 */
	private String bankAccountHolder;

	/**
	 * 票据路径
	 */
	private String billFile;

	/**
	 * 营业执照图片
	 */
	private String businessLicenseUrl;

	/**
	 * 法人证件反面图片地址
	 */
	private String legalPersonOppositePicurl;

	/*
	 *
	 * 法人证件正面图片地址
	 */
	private String legalPersonPicurl;

	/*
	 *
	 * 授权委托书
	 */
	private String companyAuthUrl;


	/**
	 * 法人手持证件图片地址
	 */
	private String legalPersonHandPicurl;

	public PlatformCompanyInfoDto(){};

	public String getCompanyOpenId() {
		return companyOpenId;
	}

	public void setCompanyOpenId(String companyOpenId) {
		this.companyOpenId = companyOpenId;
	}

	public String getCompLogo() {
		return compLogo;
	}

	public void setCompLogo(String compLogo) {
		this.compLogo = compLogo;
	}

	public String getCompanyBusinessScope() {
		return companyBusinessScope;
	}

	public void setCompanyBusinessScope(String companyBusinessScope) {
		this.companyBusinessScope = companyBusinessScope;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public Integer getIsBusiness() {
		return isBusiness;
	}

	public void setIsBusiness(Integer isBusiness) {
		this.isBusiness = isBusiness;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getCompanyType() {
		return companyType;
	}

	public void setCompanyType(Integer companyType) {
		this.companyType = companyType;
	}

	public String getCompanyShortName() {
		return companyShortName;
	}

	public void setCompanyShortName(String companyShortName) {
		this.companyShortName = companyShortName;
	}

	public String getRealNameFrom() {
		return realNameFrom;
	}

	public void setRealNameFrom(String realNameFrom) {
		this.realNameFrom = realNameFrom;
	}

	public String getRegisteredCapital() {
		return registeredCapital;
	}

	public void setRegisteredCapital(String registeredCapital) {
		this.registeredCapital = registeredCapital;
	}

	public Integer getEnterpriseNature() {
		return enterpriseNature;
	}

	public void setEnterpriseNature(Integer enterpriseNature) {
		this.enterpriseNature = enterpriseNature;
	}

	public Integer getIsTaxPayer() {
		return isTaxPayer;
	}

	public void setIsTaxPayer(Integer isTaxPayer) {
		this.isTaxPayer = isTaxPayer;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getTaxpayerIdentificationNumber() {
		return taxpayerIdentificationNumber;
	}

	public void setTaxpayerIdentificationNumber(String taxpayerIdentificationNumber) {
		this.taxpayerIdentificationNumber = taxpayerIdentificationNumber;
	}

	public String getBusinessLicenseCode() {
		return businessLicenseCode;
	}

	public void setBusinessLicenseCode(String businessLicenseCode) {
		this.businessLicenseCode = businessLicenseCode;
	}

	public String getLegalRepresentative() {
		return legalRepresentative;
	}

	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public String getLegalPersoncertNo() {
		return legalPersoncertNo;
	}

	public void setLegalPersoncertNo(String legalPersoncertNo) {
		this.legalPersoncertNo = legalPersoncertNo;
	}

	public Integer getStatus() { 
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getBillFile() {
		return billFile;
	}

	public void setBillFile(String billFile) {
		this.billFile = billFile;
	}

	public String getBusinessLicenseUrl() {
		return businessLicenseUrl;
	}

	public void setBusinessLicenseUrl(String businessLicenseUrl) {
		this.businessLicenseUrl = businessLicenseUrl;
	}

	public String getLegalPersonOppositePicurl() {
		return legalPersonOppositePicurl;
	}

	public void setLegalPersonOppositePicurl(String legalPersonOppositePicurl) {
		this.legalPersonOppositePicurl = legalPersonOppositePicurl;
	}

	public String getLegalPersonPicurl() {
		return legalPersonPicurl;
	}

	public void setLegalPersonPicurl(String legalPersonPicurl) {
		this.legalPersonPicurl = legalPersonPicurl;
	}

	public String getCompanyAuthUrl() {
		return companyAuthUrl;
	}

	public void setCompanyAuthUrl(String companyAuthUrl) {
		this.companyAuthUrl = companyAuthUrl;
	}

	public String getLegalPersonHandPicurl() {
		return legalPersonHandPicurl;
	}

	public void setLegalPersonHandPicurl(String legalPersonHandPicurl) {
		this.legalPersonHandPicurl = legalPersonHandPicurl;
	}

	public String getCompanyFrom() {
		return companyFrom;
	}

	public void setCompanyFrom(String companyFrom) {
		this.companyFrom = companyFrom;
	}

	public String getAdminAccount() {
		return adminAccount;
	}

	public void setAdminAccount(String adminAccount) {
		this.adminAccount = adminAccount;
	}

	public String getAdminPhoneNumber() {
		return adminPhoneNumber;
	}

	public void setAdminPhoneNumber(String adminPhoneNumber) {
		this.adminPhoneNumber = adminPhoneNumber;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getCompanyIntroduction() {
		return companyIntroduction;
	}

	public void setCompanyIntroduction(String companyIntroduction) {
		this.companyIntroduction = companyIntroduction;
	}

	public Integer getIsCertificated() {
		return isCertificated;
	}

	public void setIsCertificated(Integer isCertificated) {
		this.isCertificated = isCertificated;
	}

	public String getBlocId() {
		return blocId;
	}

	public void setBlocId(String blocId) {
		this.blocId = blocId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getParentOrganizationId() {
		return parentOrganizationId;
	}

	public void setParentOrganizationId(String parentOrganizationId) {
		this.parentOrganizationId = parentOrganizationId;
	}

	public Integer getIsGroup() {
		return isGroup;
	}

	public void setIsGroup(Integer isGroup) {
		this.isGroup = isGroup;
	}

	public Integer getIsOrganization() {
		return isOrganization;
	}

	public void setIsOrganization(Integer isOrganization) {
		this.isOrganization = isOrganization;
	}

	public Date getJoinGroupTime() {
		return joinGroupTime;
	}

	public void setJoinGroupTime(Date joinGroupTime) {
		this.joinGroupTime = joinGroupTime;
	}

	public Date getJoinOrganizationTime() {
		return joinOrganizationTime;
	}

	public void setJoinOrganizationTime(Date joinOrganizationTime) {
		this.joinOrganizationTime = joinOrganizationTime;
	}

	public String getOfficialWebsite() {
		return officialWebsite;
	}

	public void setOfficialWebsite(String officialWebsite) {
		this.officialWebsite = officialWebsite;
	}

	public Integer getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(Integer employeeCount) {
		this.employeeCount = employeeCount;
	}

	public Integer getEnterpriseSize() {
		return enterpriseSize;
	}

	public void setEnterpriseSize(Integer enterpriseSize) {
		this.enterpriseSize = enterpriseSize;
	}


	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getBankAccountHolder() {
		return bankAccountHolder;
	}

	public void setBankAccountHolder(String bankAccountHolder) {
		this.bankAccountHolder = bankAccountHolder;
	}

}
