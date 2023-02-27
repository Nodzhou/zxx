package com.bonade.sdk.opencenter.vo;

import com.bonade.sdk.opencenter.vo.BaseExtendVo;
import com.bonade.sdk.opencenter.vo.ImgFileVo;
import com.bonade.sdk.opencenter.vo.PageInfo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <b>Description:</b> 根据企业信用代码查企业详情vo <br>
 * @author: mlcai
 * @version 1.0
 * <b>ProjectName:</b> open-center-sdk
 * <br><b>PackageName:</b> com.bonade.sdk.opencenter.vo
 * <br><b>ClassName:</b> com.bonade.sdk.opencenter.vo.CompanyEqualsCodeVo
 * <br><b>Date:</b> 2020/8/25
 */
public class CompanyEqualsCodeVo<T extends BaseExtendVo> implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 企业logo
	 */
	private String logoUrl;
	/**
	 * 	法定代表人
	 */
	private String legalRepresentative;
	/**
	 * 法人身份证号
	 */
	private String legalPersoncertNo;
	/**
	 * 企业类型
	 */
	private String companyType;
	/**
	 * 	企业简称
	 */
	private String companyShortName;
	/**
	 * 企业名称
	 */
	private String companyName;
	 
	 /**
	 * 统一社会信用代码
	 */
	 private String businessLicenseCode;
	 /**
	 * 企业ID
	 */
	 private String companyId;
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
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
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getCompanyShortName() {
		return companyShortName;
	}
	public void setCompanyShortName(String companyShortName) {
		this.companyShortName = companyShortName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getBusinessLicenseCode() {
		return businessLicenseCode;
	}
	public void setBusinessLicenseCode(String businessLicenseCode) {
		this.businessLicenseCode = businessLicenseCode;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	 

}
