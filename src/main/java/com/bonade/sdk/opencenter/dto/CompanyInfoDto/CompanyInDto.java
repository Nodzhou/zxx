package com.bonade.sdk.opencenter.dto.CompanyInfoDto;

import com.bonade.sdk.opencenter.vo.BaseExtendVo;
import com.bonade.sdk.opencenter.vo.ImgFileVo;
import com.bonade.sdk.opencenter.vo.PageInfo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/*** 企业参数Dto 实体
 */
public class CompanyInDto<T extends BaseExtendVo> implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 
	 * 企业ID集合
	 */
	private List<String> companyIds;

	public List<String> getCompanyIds() {
		return companyIds;
	}

	public void setCompanyIds(List<String> companyIds) {
		this.companyIds = companyIds;
	}

}
