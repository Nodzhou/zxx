package com.bonade.sdk.opencenter.dto.convertId;

/**
 * 
* <b>Description:</b>转换userId参数类<br> 
* @author	liuyaoxi 
* @version 1.0
* <b>ProjectName:</b>	open-center-sdk
* <br><b>PackageName:</b>	com.bonade.sdk.opencenter.dto.convertId
* <br><b>ClassName:</b>	ConvertCompanyIdDto
* <br><b>Date:</b>	2020年9月29日	下午2:54:24
 */
public class ConvertUserIdDto {
	
	/**
	 * 用户openId
	 */
	private String openId;
	
	/**
	 * 需要转哪条业务线
	 */
	private String bClientId;

	public String getbClientId() {
		return bClientId;
	}

	public void setbClientId(String bClientId) {
		this.bClientId = bClientId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

}
