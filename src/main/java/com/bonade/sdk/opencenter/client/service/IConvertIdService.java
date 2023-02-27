package com.bonade.sdk.opencenter.client.service;

import com.bonade.sdk.opencenter.dto.convertId.ConvertCompanyIdDto;
import com.bonade.sdk.opencenter.dto.convertId.ConvertStaffIdDto;
import com.bonade.sdk.opencenter.dto.convertId.ConvertStaffOpenIdDto;
import com.bonade.sdk.opencenter.dto.convertId.ConvertUserIdDto;

/**
 * 
* <b>Description:</b>转换id接口<br> 
* @author	lyx 
* @version 1.0
* <b>ProjectName:</b>	open-center-sdk
* <br><b>PackageName:</b>	com.bonade.sdk.opencenter.client.service
* <br><b>ClassName:</b>	IConvertIdService
* <br><b>Date:</b>	2020年8月18日	下午5:16:42
 */
public interface IConvertIdService extends SdkService {
	
	/**
	 * 
	* <b>Description:</b>通过staffOpenId转成bClient系统的staffId.如果查不到就为null<br> 
	* @param convertStaffIdDto	转换员工id参数类
	* @return	staffId
	* <b>Author:</b>	lyx
	* <br><b>Date:</b>	2020年8月18日	下午5:18:20
	* <br><b>Version:</b> 1.0
	 */
	String convertBclientStaffId(ConvertStaffIdDto convertStaffIdDto);
	
	/**
	 * 
	* <b>Description:</b>通过员工来源业务线和staffId转换staffOpenId<br> 
	* @param convertStaffOpenIdDto	转换staffOpenId参数类
	* @return	staffOpenId
	* <b>Author:</b>	lyx
	* <br><b>Date:</b>	2020年8月20日	上午8:58:44
	* <br><b>Version:</b> 1.0
	 */
	String convertStaffOpenId(ConvertStaffOpenIdDto convertStaffOpenIdDto);
	
	/**
	 * 
	* <b>Description:</b>通过companyOpenId转成bClient系统的companyId.如果查不到就为null<br> 
	* @param convertCompanyIdDto	转换企业id参数类
	* @return	companyId
	* <b>Author:</b>	lyx
	* <br><b>Date:</b>	2020年9月29日	下午14:59:20
	* <br><b>Version:</b> 1.0
	 */
	String convertBclientCompanyId(ConvertCompanyIdDto convertCompanyIdDto);
	
	/**
	 * 
	* <b>Description:</b>通过openId转成bClient系统的userId.如果查不到就为null<br> 
	* @param convertUserIdDto	转换用户id参数类
	* @return	companyId
	* <b>Author:</b>	lyx
	* <br><b>Date:</b>	2020年9月29日	下午14:59:20
	* <br><b>Version:</b> 1.0
	 */
	String convertBclientUserId(ConvertUserIdDto convertUserIdDto);

}
