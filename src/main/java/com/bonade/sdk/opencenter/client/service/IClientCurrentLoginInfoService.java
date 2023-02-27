package com.bonade.sdk.opencenter.client.service;

/**
 * 
* <b>Description:</b>sdk用于存储创建人丶更新人信息<br> 
* @author	lyx 
* @version 1.0
* <b>ProjectName:</b>	open-center-sdk
* <br><b>PackageName:</b>	com.bonade.sdk.opencenter.client.service
* <br><b>ClassName:</b>	IClientCurrentLoginInfoService
* <br><b>Date:</b>	2020年8月21日	上午11:48:48
 */
public interface IClientCurrentLoginInfoService extends SdkService {
	
	/**
	 * 
	* <b>Description:</b>获取客户端当前登录账号的openId<br> 
	* @return
	* <b>Author:</b>	lyx
	* <br><b>Date:</b>	2020年8月21日	上午11:49:19
	* <br><b>Version:</b> 1.0
	 */
	String getClientCurrentOpenId();

}
