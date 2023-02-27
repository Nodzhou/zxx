package com.bonade.sdk.opencenter.client.service;

import com.bonade.sdk.opencenter.dto.login.CheckPwdDto;
import com.bonade.sdk.opencenter.dto.login.LoginDto;
import com.bonade.sdk.opencenter.dto.login.RegisterLoginPasswordDto;

/**
 * 登录和密码查询相关服务
 */
public interface IOauthService extends SdkService {

    /**
    * <b>Description:用户登录</b><br> 
    * @param loginDto 登录实体
    * @return 请求结果集
    * <b>Author:</b>  lyx
    * <br><b>Date:</b> 2020年7月24日 上午10:02:55
    * <br><b>Version:</b> 1.0
    */
    String login(LoginDto loginDto);

    /**
    * <b>Description:根据用户ID验证密码</b><br> 
    * @param obj 密码实体
    * @return boolean
    * <b>Author:</b>  lyx
    * <br><b>Date:</b> 2020年7月24日 上午10:03:19
    * <br><b>Version:</b> 1.0
    */
    boolean checkPwdByOpenId(CheckPwdDto obj);

    /**
    * <b>Description:更新密码</b><br> 
    * @param obj 密码实体
    * @return boolean
    * <b>Author:</b>  lyx
    * <br><b>Date:</b> 2020年7月24日 上午10:03:48
    * <br><b>Version:</b> 1.0
    */
    boolean updatePassword(RegisterLoginPasswordDto obj);

	/**
	* <b>Description:</b><br> 
	* @param loginDto 登录实体
	* @return 请求结果集
	* <b>Author:</b>  ShawnTang
	* <br><b>Date:</b> 2020年10月9日 上午10:18:31
	* <br><b>Version:</b> 1.0
	*/
	String loginByMd5(LoginDto loginDto);

	/**
	* <b>Description:</b><br> 
	* @param password MD5密码
	* @param publicKey 公钥(中台颁发的)
	* @return 返回加密的密码
	* <b>Author:</b>  ShawnTang
	* <br><b>Date:</b> 2020年10月9日 上午10:57:42
	* <br><b>Version:</b> 1.0
	*/
	String getRsaPassword(String password, String publicKey);

	/**
	* <b>Description:更新密码</b><br> 
	* @param registerLoginPasswordDto 密码实体
	* @return boolean
	* <b>Author:</b>  ShawnTang
	* <br><b>Date:</b> 2020年10月9日 下午3:43:47
	* <br><b>Version:</b> 1.0
	*/
	boolean updateMd5Password(RegisterLoginPasswordDto registerLoginPasswordDto);

}
