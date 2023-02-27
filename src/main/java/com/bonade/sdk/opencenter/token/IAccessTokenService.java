package com.bonade.sdk.opencenter.token;

import com.bonade.sdk.opencenter.vo.AccessTokenVo;

public interface IAccessTokenService {

	/**
	 * 
	* <b>Description: 初始化token,过期的情况下刷新token</b><br> 
	* @return
	* <b>Author:</b>  ShawnTang
	* <br><b>Date:</b> 2020年8月10日 上午10:54:33
	* <br><b>Version:</b> 1.0
	 */
	AccessTokenVo accessToken();
	
	/**
	 * 
	* <b>Description: 历史遗留问题，冗余代码</b><br> 
	* @return
	* <b>Author:</b>  ShawnTang
	* <br><b>Date:</b> 2020年8月10日 上午10:55:30
	* <br><b>Version:</b> 1.0
	 */
//	AccessTokenVo accessTokenByCache();

	/**
	 * 
	* <b>Description: 更新token</b><br> 
	* @return
	* <b>Author:</b>  ShawnTang
	* <br><b>Date:</b> 2020年8月10日 上午10:55:50
	* <br><b>Version:</b> 1.0
	 */
//	AccessTokenVo refreshToken();
}
