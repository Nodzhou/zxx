/**
　 * @author ShawnTang
  *
*/
package com.bonade.sdk.opencenter.client.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.service.IAppServiceManageService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.dto.AppServiceManageDto;
import com.bonade.sdk.opencenter.exception.ClientException;
import com.bonade.sdk.opencenter.vo.AppServiceManageVo;

/**
 * <b>Description:</b><br>
 * 
 * @author ShawnTang
 * @version 1.0 <b>ProjectName:</b> open-center-sdk <br>
 *          <b>PackageName:</b> com.bonade.sdk.opencenter.client <br>
 *          <b>ClassName:</b> AppServiceManageClient <br>
 *          <b>Date:</b> 2020年10月4日
 */
public class AppServiceManageClient implements IAppServiceManageService {
 

	/**
	 * 
	 * <b>Description:</b> 获取超市服务应用列表<br>
	 * 
	 * @param record 服务超市查询条件VO
	 * @param openId openId
	 * @return AppServiceManageVo 服务超市VO<b>Author:</b> ShawnTang <br>
	 *         <b>Date:</b> 2020年9月22日 <br>
	 *         <b>Version:</b> 1.0
	 */
	@Override
	public List<AppServiceManageVo> getAppServiceManageListByOpenId(AppServiceManageDto record, String openId) {
		if (StringUtils.isBlank(openId)) {
			throw new ClientException("openId为空，请检查参数是否正确");
		}
		Map<String, Object> paramsMap = new HashMap<>();
		if (StringUtils.isNoneBlank(record.getName())) {
			paramsMap.put("name", record.getName());
		}
		if (StringUtils.isNoneBlank(record.getCode())) {
			paramsMap.put("code", record.getCode());
		}
		if (StringUtils.isNoneBlank(record.getTypeName())) {
			paramsMap.put("typeName", record.getTypeName());
		}
		if (StringUtils.isNoneBlank(record.getVersionId())) {
			paramsMap.put("versionId", record.getVersionId());
		}
		if (StringUtils.isNoneBlank(record.getVersionType())) {
			paramsMap.put("versionType", record.getVersionType());
		}
		paramsMap.put("openId", openId);
		JSONObject jsonObject = getClient().executeGet(ApiPathConstant.AppServiceManageUrl.GET_BY_OPENID, paramsMap);
		if (null == jsonObject) {
			return null;
		}
		String AppServiceManageString = JSONObject.toJSONString(jsonObject.get("data"));
		if (StringUtils.isBlank(AppServiceManageString)) {
			throw new ClientException(JSONObject.toJSONString(jsonObject.get("message")));
		}
		List<AppServiceManageVo> appServiceManageVos = JSONArray.parseArray(AppServiceManageString,
				AppServiceManageVo.class);
		return appServiceManageVos;
	}

}
