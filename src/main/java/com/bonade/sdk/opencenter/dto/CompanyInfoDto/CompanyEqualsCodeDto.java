package com.bonade.sdk.opencenter.dto.CompanyInfoDto;

import com.bonade.sdk.opencenter.vo.BaseExtendVo;
import com.bonade.sdk.opencenter.vo.ImgFileVo;
import com.bonade.sdk.opencenter.vo.PageInfo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/*** 企业参数Dto 实体
 */
public class CompanyEqualsCodeDto<T extends BaseExtendVo> implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 	企业信用代码
	  */
	private String businessLicenseCode;

	public String getBusinessLicenseCode() {
		return businessLicenseCode;
	}

	public void setBusinessLicenseCode(String businessLicenseCode) {
		this.businessLicenseCode = businessLicenseCode;
	}
}
