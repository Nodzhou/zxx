package com.bonade.sdk.opencenter.pojo;

import com.bonade.sdk.opencenter.vo.BaseExtendEntity;

import java.io.Serializable;
import java.util.Date;

public class PlatformCompanyInfo<T extends BaseExtendEntity> implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 企业id */
	private String id;

	/** 经营范围 */
	private String companyBusinessScope;
	/** 业务线操作ID */
	private String clientId;
	/** 是否是个体工商户 */
	private Integer isBusiness;

	/**
	 * 企业名称
	 */
	private String companyName;
	/**
	 * 企业名称
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
	 */
	private String enterpriseNature;
	/**
	 * 是否一般纳税人
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
	 */
	private Integer status;

	/**
	 * 创建人Id
	 */
	private String createId;
	/**
	 * 创建人
	 */
	private String createUser;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改人Id
	 */
	private String updateId;
	/**
	 * 修改人
	 */
	private String updateUser;
	/**
	 * 修改时间
	 */
	private Date updateTime;

	/** 企业来源 */
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

	/** 是否实名,0-未实名，1-已实名 */
	private Integer isCertificated;

	/** 集团id */
	private String blocId;

	/** 上级id */
	private String parentId;

	/** 上级分支组织id */
	private String parentOrganizationId;

	/** 是否为集团，1集团、2事业群 */
	private Integer isGroup;

	/** 是否是分支组织 */
	private Integer isOrganization;

	private Date joinGroupTime;

	private Date joinOrganizationTime;
	
	/** 企业官网地址 */
	private String officialWebsite;
	
	/** 企业Logo */
	private String compLogo;
	/** 员工人数 */
	private Integer employeeCount;
	/** 企业规模 */
	private Integer enterpriseSize;


	
	/** 扩展类  */
	private T extendCompany;

	public  PlatformCompanyInfo(){};
	
	public String getCompLogo() {
		return compLogo;
	}

	public void setCompLogo(String compLogo) {
		this.compLogo = compLogo;
	}

	public T getExtendCompany() {
		return extendCompany;
	}

	public void setExtendCompany(T extendCompany) {
		this.extendCompany = extendCompany;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getEnterpriseNature() {
		return enterpriseNature;
	}

	public void setEnterpriseNature(String enterpriseNature) {
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

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateId() {
		return updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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
}
