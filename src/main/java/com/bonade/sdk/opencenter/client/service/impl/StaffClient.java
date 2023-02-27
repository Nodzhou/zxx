package com.bonade.sdk.opencenter.client.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.service.IStaffInfoService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.common.KeyConstant;
import com.bonade.sdk.opencenter.dto.BaseExtendDto;
import com.bonade.sdk.opencenter.dto.platformstaffinfo.PlatformStaffInfoPageDto;
import com.bonade.sdk.opencenter.dto.platformstaffinfo.StaffInfoPageByDepartIdDto;
import com.bonade.sdk.opencenter.exception.ClientException;
import com.bonade.sdk.opencenter.dto.platformstaffinfo.PlatformStaffInfoDto;
import com.bonade.sdk.opencenter.pojo.PlatformUnionStaffDepart;
import com.bonade.sdk.opencenter.pojo.PlatformUserInfo;
import com.bonade.sdk.opencenter.utils.BeanToMap;
import com.bonade.sdk.opencenter.utils.HttpClientUtils;
import com.bonade.sdk.opencenter.vo.*;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nod
 */
public class StaffClient implements IStaffInfoService<BaseExtendDto> { 


    /**
     * 添加一个员工
     *
     * @param platformStaffInfoDto 员工实体
     * @return 员工id
     */
    @Override
    public String addStaff(PlatformStaffInfoDto<BaseExtendDto> platformStaffInfoDto) {
        //校验token
        if (null == platformStaffInfoDto) {
            throw new ClientException("添加员工接口参数为空，请检查");
        }
        JSONObject params = (JSONObject) JSONObject.toJSON(platformStaffInfoDto);
        JSONObject resultObj = getClient().postByJson(ApiPathConstant.StaffUrl.STAFF_ADD_COMD, params);
        return resultObj.getString("id");
    }

    /**
     * 编辑修改员工
     *
     * @param platformStaffInfoDto 员工实体
     * @return int 影响行数 0-失败 1-成功
     */
    @Override
    public int editStaff(PlatformStaffInfoDto platformStaffInfoDto) {
        //校验token
        if (null == platformStaffInfoDto) {
            throw new ClientException("编辑员工接口参数为空，请检查");
        }
        JSONObject params = (JSONObject) JSONObject.toJSON(platformStaffInfoDto);
        JSONObject resultObj = getClient().executePost(ApiPathConstant.StaffUrl.STAFF_EIT_COMD, HttpClientUtils.CONTENT_TYPE_JSON, params);
        System.out.println(resultObj);
        return resultObj.getIntValue("count");

    }

    /**
     * 获取员工详情
     *
     * @param staffId   员工Id
     * @return PlatformStaffInfo 返回实体
     */
    @Override
    public PlatformStaffInfoVo getStaffById(String staffId) {

        if (StringUtils.isBlank(staffId)) {
            throw new ClientException("获取员工详情接口参数为空，请检查");
        }
        Map<String, Object> paramsMap = new HashMap<>();
        paramsMap.put("staffId", staffId);
        JSONObject resultObj = getClient().executeGet(ApiPathConstant.StaffUrl.STAFF_GET_QUER, paramsMap);
        return JSONObject.parseObject(resultObj.toJSONString(), PlatformStaffInfoVo.class);

    }


    /**
     * 批量删除员工
     *
     * @param ids 可批量，多个用逗号隔开
     * @return int 删除行数 0-失败
     */
    @Override
    public int deleteStaffByIds(List<String> ids) {
        JSONObject params = new JSONObject();
        params.put("ids", ids);
        JSONObject resultObj = getClient().executePost(ApiPathConstant.StaffUrl.STAFF_DELETE_CMD, HttpClientUtils.CONTENT_TYPE_JSON, params);
        return resultObj.getIntValue("count");
    }

    /**
     * 获取员工分页列表
     *
     * @param platformStaffInfoPageDto 条件查询实体
     * @return 分页后列表
     */
    @Override
    public PageData<List<PlatformStaffInfoVo<BaseExtendDto>>> findStaffByPage(PlatformStaffInfoPageDto platformStaffInfoPageDto) {
        if (null == platformStaffInfoPageDto) {
            throw new ClientException("获取员工列表参数为空，请检查");
        }
        JSONObject params = (JSONObject) JSONObject.toJSON(platformStaffInfoPageDto);
        JSONObject resultObj = getClient().executePost(ApiPathConstant.StaffUrl.STAFF_PAGE_QUER,HttpClientUtils.CONTENT_TYPE_JSON,params);
        if (null == resultObj) {
            return new PageData<>(new ArrayList<>(), KeyConstant.ZERO);
        }
        List<PlatformStaffInfoVo> platformStaffInfoVoList = JSONObject.parseArray(resultObj.getString("data"), PlatformStaffInfoVo.class);
        Long total = resultObj.getLongValue("total");
        return new PageData(platformStaffInfoVoList, total);
    }

    /**
     * 根据员工ID离职员工,多条记录用逗号分隔
     *
     * @param ids id 集合
     */
    @Override
    public int dimissStaffByIds(List<String> ids) {
        JSONObject params = new JSONObject();
        params.put("ids", ids);
        JSONObject resultObj = getClient().executePost(ApiPathConstant.StaffUrl.STAFF_DIMISS_CMD, HttpClientUtils.CONTENT_TYPE_JSON, params);
        return resultObj.getIntValue("count");
    }

	/**
	 * 根据部门id分页获取员工信息
	 */
	public PageData<List<StaffInfoPageByDepartVo<BaseExtendDto>>> pageByDepartmentId(StaffInfoPageByDepartIdDto dto) {
		if (null == dto) {
            throw new ClientException("获取部门id列表参数为空，请检查");
        }
        JSONObject params = (JSONObject) JSONObject.toJSON(dto);
        JSONObject resultObj = getClient().executePost(ApiPathConstant.StaffUrl.STAFF_PAGE_DEPARTID_QUERY,HttpClientUtils.CONTENT_TYPE_JSON,params);
        if (null == resultObj) {
            return new PageData<>(new ArrayList<>(), KeyConstant.ZERO);
        }
        List<StaffInfoPageByDepartVo> list = JSONObject.parseArray(resultObj.getString("data"), StaffInfoPageByDepartVo.class);
        Long total = resultObj.getLongValue("total");
        return new PageData(list, total);
	}



}
