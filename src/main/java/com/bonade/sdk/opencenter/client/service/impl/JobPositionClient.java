package com.bonade.sdk.opencenter.client.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.service.IJobPositionService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.dto.jobposition.PlatformJobPositionDto;
import com.bonade.sdk.opencenter.dto.jobposition.PlatformJobPositionPageDto;
import com.bonade.sdk.opencenter.utils.HttpClientUtils;
import com.bonade.sdk.opencenter.vo.JobPositionInfoVo;
import com.bonade.sdk.opencenter.vo.JobpositionTreeVo;
import com.bonade.sdk.opencenter.vo.PageData;

/**
 * author: chd
 * date: 2020/6/29 17:44
 */
public class JobPositionClient implements IJobPositionService {

    /**
     * 新增岗位
     *
     * @param platformJobPositionDto 岗位基础信息
     * @return java.lang.String 岗位id
     */
    @Override
    public String addJobPosition(PlatformJobPositionDto platformJobPositionDto) {
        JSONObject resultObject = getClient().executePost(ApiPathConstant.JobPositionUrl.JOBPOSITION_ADD, HttpClientUtils.CONTENT_TYPE_JSON, (JSONObject) JSONObject.toJSON(platformJobPositionDto));
        if (resultObject == null) {
            return null;
        }
        return resultObject.getString("id");
    }

    /**
     * 编辑岗位
     *
     * @param platformJobPositionDto 岗位基础信息
     * @return int 受影响行数
     */
    @Override
    public int editJobPosition(PlatformJobPositionDto platformJobPositionDto) {
        JSONObject resultObject = getClient().executePost(ApiPathConstant.JobPositionUrl.JOBPOSITION_EDIT, HttpClientUtils.CONTENT_TYPE_JSON, (JSONObject) JSONObject.toJSON(platformJobPositionDto));
        if (resultObject == null) {
            return 0;
        }
        return resultObject.getIntValue("count");
    }

    /**
     * 岗位分页查询
     *
     * @param platformJobPositionPageDto 岗位信息入参
     * @return 岗位分页列表信息
     */
    @Override
    public PageData<List<JobPositionInfoVo>> findJobPositionByPage(PlatformJobPositionPageDto platformJobPositionPageDto) {

        JSONObject resultObj = getClient().executePost(ApiPathConstant.JobPositionUrl.JOBPOSITION_FIND_PAGE, HttpClientUtils.CONTENT_TYPE_JSON, (JSONObject) JSONObject.toJSON(platformJobPositionPageDto));
        if (resultObj == null) {
            return new PageData<>(new ArrayList<>(), 0);
        }
        List<JobPositionInfoVo> jobPositionInfoVos = JSONObject.parseArray(resultObj.getString("data"), JobPositionInfoVo.class);
        long total = Long.parseLong(resultObj.getString("total"));
        return new PageData<>(jobPositionInfoVos, total);
    }

    /**
     * 根据岗位id删除(包含所有下级, 如果员工关联岗位会打回),多条记录用逗号分隔
     *
     * @param ids 岗位id,可逗号隔开传多条记录
     * @return int 受影响行数
     */
    @Override
    public int delete(String ids) {
        Map<String, Object> paramsMap = new HashMap<>(2);
        paramsMap.put("ids", ids);
        JSONObject resultObject = getClient().executeGet(ApiPathConstant.JobPositionUrl.JOBPOSITION_DELETE, paramsMap);
        if (resultObject == null) {
            return 0;
        }
        return resultObject.getIntValue("data");
    }

    /**
     * 根据岗位id查询对应岗位数据
     *
     * @param id 岗位id
     * @return PlatformJobPositionInfo 岗位信息
     */
    @Override
    public JobPositionInfoVo getJobPositionById(String id) {
        Map<String, Object> paramsMap = new HashMap<>(2);
        paramsMap.put("id", id);
        JSONObject resultObject = getClient().executeGet(ApiPathConstant.JobPositionUrl.JOBPOSITION_GET, paramsMap);
        if (resultObject == null) {
            return null;
        }
        return JSON.toJavaObject(resultObject, JobPositionInfoVo.class);
    }

    /**
     * 获取当前公司所有岗位--返回树结构
     *
     * @param companyId    企业id
     * @param positionName 岗位名称
     * @return 岗位树实体集合
     */
    @Override
    public List<JobpositionTreeVo> getAllJobToTree(String companyId, String positionName) {
        Map<String, Object> paramsMap = new HashMap<>(3);
        paramsMap.put("companyId", companyId);
        paramsMap.put("positionName", positionName);
        JSONObject resultObject = getClient().executeGet(ApiPathConstant.JobPositionUrl.JOBPOSITION_GETALLJOBTOTREE, paramsMap);
        if (resultObject == null) {
            return null;
        }
        return JSONObject.parseArray(resultObject.getString("dataTree"), JobpositionTreeVo.class);
    }




}
