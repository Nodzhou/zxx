package com.bonade.sdk.opencenter.dto.convertId;

/**
 * 
* <b>Description:</b>转换staffOpenId参数类<br> 
* @author	lyx 
* @version 1.0
* <b>ProjectName:</b>	open-center-sdk
* <br><b>PackageName:</b>	com.bonade.sdk.opencenter.dto.convertId
* <br><b>ClassName:</b>	ConvertStaffOpenIdDto
* <br><b>Date:</b>	2020年8月20日	上午8:56:23
 */
public class ConvertStaffOpenIdDto {
	
	/**
	 * staffId
	 */
	private String staffId;
	
	/**
	 * id来源于哪条业务线
	 */
	private String aClientId;

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getaClientId() {
		return aClientId;
	}

	public void setaClientId(String aClientId) {
		this.aClientId = aClientId;
	}
	
}
