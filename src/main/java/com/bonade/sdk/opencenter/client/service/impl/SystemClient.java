/**
　 * @author ShawnTang
  *
*/
package com.bonade.sdk.opencenter.client.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.service.ISystemService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.exception.ClientException;
import com.bonade.sdk.opencenter.vo.BusinessSystemVo;

/**
 * 
 * <b>Description: 系统应用相关SDK</b><br>
 * 
 * @author ShawnTang
 * @version 1.0 <b>ProjectName:</b> open-center-sdk <br>
 *          <b>PackageName:</b> com.bonade.sdk.opencenter.client <br>
 *          <b>ClassName:</b> SystemClient <br>
 *          <b>Date:</b> 2020年8月26日 下午6:04:57
 */
public class SystemClient implements ISystemService { 

	/**
	 * 
	 * <b>Description: 根据企业ID查询系统应用</b><br>
	 * 
	 * @param companyId 企业ID
	 * @return BusinessSystemVo 业务线VOList<br>
	 *         <b>Author:</b> ShawnTang <br>
	 *         <b>Date:</b> 2020年8月25日 下午2:08:54 <br>
	 *         <b>Version:</b> 1.0
	 */
	public List<BusinessSystemVo> findSystemByCompanyId(String companyId) {
		if (StringUtils.isBlank(companyId)) {
			throw new ClientException("companyId参数为空，请检查参数是否正确");
		}
		Map<String, Object> paramsMap = new HashMap<>();
		paramsMap.put("companyId", companyId);
		JSONObject resultObj = getClient().executeGet(ApiPathConstant.SystemUrl.FIND_SYSTEM_BY_COMPANYID, paramsMap);
		if (null == resultObj) {
			throw new ClientException("查询失败返回null，请检查参数是否正确");
		}
		String BusinessSystemStr = JSONObject.toJSONString(resultObj.get("data"));
		List<BusinessSystemVo> businessSystemVos = JSONObject.parseArray(BusinessSystemStr, BusinessSystemVo.class);
		return businessSystemVos;
	}

}
