package com.bonade.sdk.opencenter.dto.login;

/**
 * 
* <b>Description:</b>登录接口参数类<br> 
* @author	lyx 
* @version 1.0
* <b>ProjectName:</b>	open-center-sdk
* <br><b>PackageName:</b>	com.bonade.sdk.opencenter.vo
* <br><b>ClassName:</b>	LoginDto
* <br><b>Date:</b>	2020年8月5日	下午3:20:29
 */
public class LoginDto {
	
	/**
	 * 	账号(目前是手机号)
	 */
    private String username;
    
    /**
     * 	明文密码
     */
    private String password;
    
    /**
     * 	公钥
     */
    private String publicKey;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
