package com.bonade.sdk.opencenter.client.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.service.IConvertIdService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.dto.convertId.ConvertCompanyIdDto;
import com.bonade.sdk.opencenter.dto.convertId.ConvertStaffIdDto;
import com.bonade.sdk.opencenter.dto.convertId.ConvertStaffOpenIdDto;
import com.bonade.sdk.opencenter.dto.convertId.ConvertUserIdDto;

/**
 * 
* <b>Description:</b>实现id转换<br> 
* @author	lyx 
* @version 1.0
* <b>ProjectName:</b>	open-center-sdk
* <br><b>PackageName:</b>	com.bonade.sdk.opencenter.client
* <br><b>ClassName:</b>	ConvertIdClient
* <br><b>Date:</b>	2020年8月18日	下午5:21:52
 */
public class ConvertIdClient implements IConvertIdService { 

	@Override
	public String convertBclientStaffId(ConvertStaffIdDto convertStaffIdDto) {
		JSONObject jsonObject = getClient().executeGet(ApiPathConstant.ConvertIdUrl.CONVERT_BCLIENT_STAFFID, (JSONObject)JSONObject.toJSON(convertStaffIdDto));
		if (jsonObject == null) {
			return null;
		}
		return jsonObject.getString("staffId");
	}

	@Override
	public String convertStaffOpenId(ConvertStaffOpenIdDto convertStaffOpenIdDto) {
		JSONObject jsonObject = getClient().executeGet(ApiPathConstant.ConvertIdUrl.CONVERT_STAFF_OPENID, (JSONObject)JSONObject.toJSON(convertStaffOpenIdDto));
		if (jsonObject == null) {
			return null;
		}
		return jsonObject.getString("staffOpenId");
	}

	@Override
	public String convertBclientCompanyId(ConvertCompanyIdDto convertCompanyIdDto) {
		JSONObject jsonObject = getClient().executeGet(ApiPathConstant.ConvertIdUrl.CONVERT_BCLIENT_COMPANYID, (JSONObject)JSONObject.toJSON(convertCompanyIdDto));
		if (jsonObject == null) {
			return null;
		}
		return jsonObject.getString("companyId");
	}

	@Override
	public String convertBclientUserId(ConvertUserIdDto convertUserIdDto) {
		JSONObject jsonObject = getClient().executeGet(ApiPathConstant.ConvertIdUrl.CONVERT_BCLIENT_USERID, (JSONObject)JSONObject.toJSON(convertUserIdDto));
		if (jsonObject == null) {
			return null;
		}
		return jsonObject.getString("userId");
	}

}
