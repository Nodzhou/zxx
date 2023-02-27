package com.bonade.sdk.opencenter.dto.convertId;

/**
 * 
* <b>Description:</b>转换staffId参数类<br> 
* @author	lyx 
* @version 1.0
* <b>ProjectName:</b>	open-center-sdk
* <br><b>PackageName:</b>	com.bonade.sdk.opencenter.dto.convertId
* <br><b>ClassName:</b>	ConvertStaffIdDto
* <br><b>Date:</b>	2020年8月18日	下午5:10:55
 */
public class ConvertStaffIdDto {
	
	/**
	 * 员工openId
	 */
	private String staffOpenId;
	
	/**
	 * 需要转哪条业务线
	 */
	private String bClientId;

	public String getStaffOpenId() {
		return staffOpenId;
	}

	public void setStaffOpenId(String staffOpenId) {
		this.staffOpenId = staffOpenId;
	}

	public String getbClientId() {
		return bClientId;
	}

	public void setbClientId(String bClientId) {
		this.bClientId = bClientId;
	}

}
