package com.bonade.sdk.opencenter.dto.login;

/**
 * 
* <b>Description:</b>校验密码接口的参数类<br> 
* @author	lyx 
* @version 1.0
* <b>ProjectName:</b>	open-center-sdk
* <br><b>PackageName:</b>	com.bonade.sdk.opencenter.vo
* <br><b>ClassName:</b>	CheckPwdDto
* <br><b>Date:</b>	2020年8月5日	下午4:12:50
 */
public class CheckPwdDto {
	
	/**
	 * 	中台userId
	 */
    private String openId;
    
    /**
     * 	明文密码
     */
    private String password;
    
    /**
     * 	公钥
     */
    private String publicKey;

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}
    
    

}
