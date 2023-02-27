package com.bonade.sdk.opencenter.dto.CompanyInfoDto;

import com.bonade.sdk.opencenter.vo.BaseExtendVo;
import com.bonade.sdk.opencenter.vo.ImgFileVo;
import com.bonade.sdk.opencenter.vo.PageInfo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/*** 企业参数Dto 实体
 */
public class CompanyLikeDto<T extends BaseExtendVo>  implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 企业名称 模糊查找
	 */
	private String companyName;
	/**
	 * 是否实名,0-未实名，1-已实名 该字段为空值的时候返回所有
	 */
	private Integer isCertificated;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Integer getIsCertificated() {
		return isCertificated;
	}
	public void setIsCertificated(Integer isCertificated) {
		this.isCertificated = isCertificated;
	}
	
}
