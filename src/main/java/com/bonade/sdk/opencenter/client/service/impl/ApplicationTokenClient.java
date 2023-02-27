package com.bonade.sdk.opencenter.client.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.service.IApplicationTokenService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.exception.ClientException;

public class ApplicationTokenClient implements IApplicationTokenService {

	/**
	 * <b>Description:验证其他系统的access_token，业务线之间调用，可以向平台验证access_token是否有效</b><br>
	 * 
	 * @param clientId     调用者的clientId
	 * @param accessTicket 调用者的加密token
	 * @return 验证结果 <b>Author:</b> zzx <br>
	 *         <b>Date:</b> 2021年4月6日10:03:40 <br>
	 *         <b>Version:</b> 1.0
	 */
	@Override
	public boolean validAccessToken(String clientId, String accessTicket) {
		JSONObject paramJsonObject = new JSONObject();
		paramJsonObject.put("clientId", clientId);
		paramJsonObject.put("accessTicket", accessTicket);
		try {
			getClient().postByJson(ApiPathConstant.ApplicationTokenUrl.VALID_ACCESS_TOKEN, paramJsonObject);
			return true;
		} catch (ClientException e) {
			if (11018 == e.getCode()) { // token验证失败编码11018
				return false;
			}
			throw e;
		}
	}

	@Override
	public String getAccessTokenValid() {
		JSONObject jsonObject = getClient().executeGet(ApiPathConstant.ApplicationTokenUrl.GET_ACCESS_TOKEN_VALID,
				null);
		return jsonObject.getString("accessTokenValid");
	}

}
