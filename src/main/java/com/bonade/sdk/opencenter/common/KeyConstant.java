package com.bonade.sdk.opencenter.common;

/**
 * 键值常量
 * @author jimmy
 *
 */
public class KeyConstant {
	
	public static final String CODE = "code";
	
	public static final String DATA = "data";
	
	public static final String MESSAGE = "message";
	
	public static final String TIMESTAMP  = "timestamp";
	
	public static final String ISSUCCESS = "isSuccess";
	
	public static final String ACCESS_TOKEN = "access_token";
	
	public static final String REFRESH_TOKEN = "refresh_token";
	
	public static final String TOKEN_TYPE = "token_type";
	
	public static final String BEARER = "Bearer ";
	
	public static final String BASIC = "Basic ";
	
	public static final String GRANT_TYPE = "grant_type";
	
	public static final String CLIENT_CREDENTIALS = "client_credentials";

	public static final String AUTHORIZATION = "Authorization";

	//platform的刷新token有效期
	public static final String TOKEN_EXPIRES_IN = "exp";

	//刷新应用token最多20次
	public static final int ZT_REFRESH_PLATFORM_COUNT_MAX = 20;

	//access_token还差6分钟过期就去刷新token
	public static final int REFRESH_HOW_TIME = 60*10;

	//刷新线程多久循环刷新一次。60秒
	public static final int PEROID = 60;


	public static final int ZERO = 0;
	
	
	

}
