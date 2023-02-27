package com.bonade.sdk.opencenter.client.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.service.IOauthService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.common.LoginConstant;
import com.bonade.sdk.opencenter.dto.login.CheckPwdDto;
import com.bonade.sdk.opencenter.dto.login.LoginDto;
import com.bonade.sdk.opencenter.dto.login.RegisterLoginPasswordDto;
import com.bonade.sdk.opencenter.utils.MD5Utils;
import com.bonade.sdk.opencenter.utils.RsaHelper;

public class OauthClient implements IOauthService {  
    
    @Override
    public String login(LoginDto loginDto) {
        loginDto.setPassword(rsaPassword(loginDto.getPassword(), loginDto.getPublicKey()));
        return getOpenId(loginDto);
    }

    @Override
    public boolean checkPwdByOpenId(CheckPwdDto checkPwdDto) {
        checkPwdDto.setPassword(rsaPassword(checkPwdDto.getPassword(), checkPwdDto.getPublicKey()));
        getClient().postByJson(ApiPathConstant.OauthUrl.CHKPWD, (JSONObject) JSONObject.toJSON(checkPwdDto));
        return true;
    }
 
    @Override
    public boolean updatePassword(RegisterLoginPasswordDto registerLoginPasswordDto) {
        registerLoginPasswordDto.setPassword(rsaPassword(registerLoginPasswordDto.getPassword(), registerLoginPasswordDto.getPublicKey()));
        getClient().postByJson(ApiPathConstant.OauthUrl.UPDATEPWD, (JSONObject) JSONObject.toJSON(registerLoginPasswordDto));
        return true;	
    }
    
	@Override
	public String loginByMd5(LoginDto loginDto) {
		loginDto.setPassword(rsaPasswordByMd5(loginDto.getPassword(), loginDto.getPublicKey()));
		return getOpenId(loginDto);
	}
    
	@Override
	public String getRsaPassword(String password, String publicKey) {
		return rsaPasswordByMd5(password, publicKey);
	}
	
    @Override
    public boolean updateMd5Password(RegisterLoginPasswordDto registerLoginPasswordDto) {
        registerLoginPasswordDto.setPassword(rsaPasswordByMd5(registerLoginPasswordDto.getPassword(), registerLoginPasswordDto.getPublicKey()));
        getClient().postByJson(ApiPathConstant.OauthUrl.UPDATEPWD, (JSONObject) JSONObject.toJSON(registerLoginPasswordDto));
        return true;
    }
    
    /**
     * 权限修饰符不能更改 public
    * <b>Description:</b>将明文密码根据公钥和盐值进行加密<br> 
    * @param password	明文密码
    * @param publicKey	公钥(中台颁发的)
    * @return
    * <b>Author:</b>	lyx
    * <br><b>Date:</b>	2020年8月5日	下午4:16:23
    * <br><b>Version:</b> 1.0
     */
    public String rsaPassword(String password, String publicKey) {
    	 /*md5加密,后面的参数是常量值*/
        String firstMd5Password = MD5Utils.MD5(password + LoginConstant.SALT);
        /*RSA密码*/
        return RsaHelper.encryptWithBase64(firstMd5Password, RsaHelper.loadPublicKey(publicKey));
    }

	/**
	 * 权限修饰符不能更改 public
	* <b>Description:</b> 将MD5密码根据公钥进行加密<br> 
	* @param password MD5密码
	* @param publicKey 公钥(中台颁发的)
	* @return
	* <b>Author:</b>  ShawnTang
	* <br><b>Date:</b> 2020年10月9日 上午10:20:41
	* <br><b>Version:</b> 1.0
	 */
    public static String rsaPasswordByMd5(String password, String publicKey) {
		/* RSA密码 */
		return RsaHelper.encryptWithBase64(password, RsaHelper.loadPublicKey(publicKey));
	}
    
    private String getOpenId(LoginDto loginDto) {
    	JSONObject obj = getClient().postByJson(ApiPathConstant.OauthUrl.LOGIN, (JSONObject) JSONObject.toJSON(loginDto));
        if (obj == null) {
        	return null;
        }
        return obj.getString("openId");
    }

}
