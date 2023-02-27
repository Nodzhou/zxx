package com.bonade.sdk.opencenter.client.service.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.bonade.sdk.opencenter.client.Client;
import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.client.service.IAdmOrgMemberInfoService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.common.KeyConstant;
import com.bonade.sdk.opencenter.vo.AdmOrgMemberInfoVo;

/**
 * <b>Description:行政组织成员服务类</b><br>
 * 
 * @author ShawnTang
 * @version 1.0 <b>ProjectName:</b> bonade-platform-simp-opencenter <br>
 *          <b>PackageName:</b> com.bonade.simp.opencenter.service <br>
 *          <b>ClassName:</b> IAdmOrgMemberInfoService <br>
 *          <b>Date:</b> 2020年12月19日
 */
public class AdmOrgMemberInfoClient implements IAdmOrgMemberInfoService {
	

	@Override
	public List<AdmOrgMemberInfoVo> findMemberInfoByOpenId(String openId) {
		if (StringUtils.isBlank(openId)) {
			return new ArrayList<>();
		}
		Map<String, Object> map = new HashMap();
		map.put("openId", openId);
		JSONObject executeGet = getClient().executeGet(ApiPathConstant.AdmOrgMemberInfo.FIND_MEMBERINFO_BY_OPENID, map);
		if (executeGet == null || StringUtils.isBlank(executeGet.getString(KeyConstant.DATA))) {
			return new ArrayList<>();
		}
		return JSON.parseObject(executeGet.getString(KeyConstant.DATA),
	            new TypeReference<List<AdmOrgMemberInfoVo>>() {
        });
	}
}
