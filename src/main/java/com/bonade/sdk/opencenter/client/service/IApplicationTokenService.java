package com.bonade.sdk.opencenter.client.service;

/**
 * 应用token相关服务
 */
public interface IApplicationTokenService extends SdkService {

	/**
	 * <b>Description:验证其他系统的access_token密文，业务线之间调用，可以向平台验证access_token是否有效</b><br>
	 * 
	 * @param clientId     调用者的clientId
	 * @param accessTicket 调用者的加密token
	 * @return 请求结果 <b>Author:</b> zzx <br>
	 *         <b>Date:</b> 2021年4月6日10:03:40 <br>
	 *         <b>Version:</b> 1.0
	 */
	boolean validAccessToken(String clientId, String accessTicket);

	/**
	 * <b>Description:获取应用 token验证密文</b><br>
	 * 
	 * @return 请求结果 <b>Author:</b> zzx <br>
	 *         <b>Date:</b> 2021年4月6日10:03:40 <br>
	 *         <b>Version:</b> 1.0
	 */
	String getAccessTokenValid();

}
