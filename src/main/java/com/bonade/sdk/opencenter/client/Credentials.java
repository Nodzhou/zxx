package com.bonade.sdk.opencenter.client;
/**
 * 凭证接口
 * @author jimmy
 *
 */
public interface Credentials {
	
	/**
	* <b>Description:获取业务线id</b><br> 
	* @return 业务线ID
	* <b>Author:</b>  Dell
	* <br><b>Date:</b> 2020年7月24日 上午10:01:23
	* <br><b>Version:</b> 1.0
	*/
	public String getClientId();
	
	/**
	* <b>Description:获取秘钥</b><br> 
	* @return 秘钥
	* <b>Author:</b>  Dell
	* <br><b>Date:</b> 2020年7月24日 上午10:01:34
	* <br><b>Version:</b> 1.0
	*/
	public String getSecret();
	
	/**
	* <b>Description:获取basicAuth</b><br> 
	* @return basicAuth
	* <b>Author:</b>  Dell
	* <br><b>Date:</b> 2020年7月24日 上午10:02:13
	* <br><b>Version:</b> 1.0
	*/
	public String getBasicAuth();
}
