package com.bonade.sdk.opencenter.client.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.bonade.sdk.opencenter.client.service.ILicenseService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.common.KeyConstant;
import com.bonade.sdk.opencenter.dto.license.*;
import com.bonade.sdk.opencenter.exception.ClientException;
import com.bonade.sdk.opencenter.utils.HttpClientUtils;
import com.bonade.sdk.opencenter.vo.PageData;
import com.bonade.sdk.opencenter.vo.license.LicenseDetailsVo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: wmx <b>Description: 部门接口实现类</b><br>
 *          <br>
 *          <b>Date:2020/12/15 16:10</b> <br>
 *          <b>Version:1.0</b>
 */
public class LicenseClient implements ILicenseService {

	/**
	 * 根据企业id查询License授权详情
	 *
	 * @param companyOpenId 企业id
	 * @return LicenseDetailsDto 授权详情dto
	 */
	@Override
	public List<LicenseDetailsDto> queryLicenseDetails(String companyOpenId) {
		Map<String, Object> paramsMap = new HashMap<>(1);
		paramsMap.put("companyOpenId", companyOpenId);
		JSONObject resultObject = getClient().executeGet(ApiPathConstant.LicenseUrl.GET_LICENSE_DETAILS_LIST,
				paramsMap);
		if (resultObject == null) {
			throw new ClientException("SDK调用根据此企业id获取授权详情接口返回信息为空！");
		}
		return JSONObject.parseArray(resultObject.getString("list"), LicenseDetailsDto.class);
	}

	/**
	 * 根据企业id集合批量查询License授权详情，包括过期以及停用状态的
	 *
	 * @param companyOpenIds 企业id集合
	 * @return LicenseDetailsByCompanyOpenIdsDto 授权详情dto
	 */
	@Override
	public Map<String, List<LicenseDetailsByCompanyOpenIdsDto>> queryLicenseDetailsByCompanyOpenIds(
			List<String> companyOpenIds) {
		JSONObject paramsMap = new JSONObject();
		paramsMap.put("companyOpenIds", companyOpenIds);

		JSONObject resultObject = getClient().postByJson(ApiPathConstant.LicenseUrl.GET_BATCH_LICENSE_DETAILS_LIST,
				paramsMap);
		if (resultObject == null) {
			throw new ClientException("SDK调用根据此企业id获取授权详情接口返回信息为空！");
		}

		return JSON.parseObject(resultObject.toString(),
				new TypeReference<Map<String, List<LicenseDetailsByCompanyOpenIdsDto>>>() {
				});
	}

	/**
	 * 根据企业id查询全部的License授权详情，包括过期的以及停用的
	 *
	 * @param companyOpenId 企业id
	 * @return LicenseDetailsDto 授权详情dto
	 */
	@Override
	public List<LicenseDetailsAllDto> queryLicenseDetailsAll(String companyOpenId) {
		Map<String, Object> paramsMap = new HashMap<>(1);
		paramsMap.put("companyOpenId", companyOpenId);
		JSONObject resultObject = getClient().executeGet(ApiPathConstant.LicenseUrl.GET_LICENSE_DETAILS_LIST_ALL,
				paramsMap);
		if (resultObject == null) {
			throw new ClientException("SDK调用根据此企业id获取全部授权详情接口返回信息为空！");
		}
		return JSONObject.parseArray(resultObject.getString("list"), LicenseDetailsAllDto.class);
	}

	/**
	 * 修改可授权数
	 *
	 * @param id           授权详情id
	 * @param mayAuthorize 可授权数
	 * @return 修改记录数
	 */
	@Override
	public Integer updateMayAuthorize(Integer id, Integer mayAuthorize) {
		Map<String, Object> paramsMap = new HashMap<>(1);
		paramsMap.put("id", id);
		paramsMap.put("mayAuthorize", mayAuthorize);
		JSONObject resultObject = getClient().executePut(ApiPathConstant.LicenseUrl.UPDATE_MAY_AUTHORIZE,
				HttpClientUtils.CONTENT_TYPE_JSON, paramsMap);
		if (resultObject == null) {
			throw new ClientException("SDK调用修改可授权数接口返回信息为空！");
		}
		return resultObject.getIntValue("count");
	}

	/**
	 * @param licenseUserDto 授权用户对象
	 * @author: yw
	 * @return: 返回新增的授权用户信息自增id <b>Description:新增授权用户</b><br>
	 *          <br>
	 *          <b>Date:</b> 2021/2/2 15:06 <br>
	 *          <b>Version:</b> 1.0
	 */
	@Override
	public Integer addlicenseUser(LicenseUserDto licenseUserDto) {
		JSONObject resultObject = getClient().postByJson(ApiPathConstant.LicenseUrl.ADD_LICENSEUSER,
				(JSONObject) JSONObject.toJSON(licenseUserDto));
		if (resultObject == null) {
			throw new ClientException("SDK调用新增授权用户接口返回信息为空！");
		}
		return resultObject.getIntValue("id");
	}

	/**
	 * @param licenseUserDto 授权用户对象
	 * @author: yw
	 * @return: 操作影响行数 <b>Description:删除授权用户</b><br>
	 *          <br>
	 *          <b>Date:</b> 2021/2/2 15:06 <br>
	 *          <b>Version:</b> 1.0
	 */
	@Override
	public Integer deletelicenseUser(LicenseUserDto licenseUserDto) {
		JSONObject resultObject = getClient().postByJson(ApiPathConstant.LicenseUrl.DELETE_LICENSEUSER,
				(JSONObject) JSONObject.toJSON(licenseUserDto));
		if (resultObject == null) {
			throw new ClientException("SDK调用删除授权用户接口返回信息为空！");
		}
		return resultObject.getIntValue("count");
	}

    /**
     * @author: yw
     * @return: 返回分页查询系统列表
     * <b>Description:分页查询系统列表</b><br>
     * <br><b>Date:</b> 2021/5/17 14:20
     * <br><b>Version:</b> 1.0
     * @param queryLicenseDetailsDto 入参
     */
    @Override
    public PageData<List<LicenseDetailsVo>> queryLicenseDetailsByPage(QueryLicenseDetailsDto queryLicenseDetailsDto) {
        JSONObject params = (JSONObject) JSONObject.toJSON(queryLicenseDetailsDto);
        JSONObject resultObj = getClient().postByJson(ApiPathConstant.LicenseUrl.QUERY_LICENSEDETAILS,params);
        if (null == resultObj) {
            return new PageData<>(new ArrayList<>(), KeyConstant.ZERO);
        }
        List<LicenseDetailsVo> list = JSONObject.parseArray(resultObj.getString("data"), LicenseDetailsVo.class);
        Long total = resultObj.getLongValue("total");
        return new PageData(list, total);
    }
}
