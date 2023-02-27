package com.bonade.sdk.opencenter.dto.CompanyInfoDto;

/**
 * 
* <b>Description:</b>getTreeAll()参数类<br> 
* @author	lyx 
* @version 1.0
* <b>ProjectName:</b>	open-center-sdk
* <br><b>PackageName:</b>	com.bonade.sdk.opencenter.dto.CompanyInfoDto
* <br><b>ClassName:</b>	CompanyTreeAllDto
* <br><b>Date:</b>	2020年8月14日	下午3:18:00
 */
public class CompanyTreeDto {
	
	/**
	 * 企业id
	 */
	private String id;
	
	/**
	 * 企业名称
	 */
	private String companyName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
}
