package com.bonade.sdk.opencenter.client.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.service.IUnionStaffDepartService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.dto.unionstaffdepartDto.UnionStaffDepartDto;
import com.bonade.sdk.opencenter.exception.ClientException;
import com.bonade.sdk.opencenter.pojo.PlatformUnionStaffDepart;
import com.bonade.sdk.opencenter.utils.HttpClientUtils;
import com.bonade.sdk.opencenter.vo.unionstaffdepart.UnionStaffDepartVo;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wumengxuan
 * <b>Description: 员工部门岗位中间表接口</b><br>
 * <b>ProjectName:open-center-sdk</b>
 * <br><b>PackageName:com.bonade.sdk.opencenter.client</b>
 * <br><b>ClassName:UnionStaffDepartClient</b>
 * <br><b>Date:2020/8/12 9:43</b>
 */
public class UnionStaffDepartClient implements IUnionStaffDepartService {
 

    /**
     * 添加一个 员工与部门岗位关联的记录
     *
     * @param UnionStaffDepartDto 实体
     * @return 添加或者 修改id
     */
    @Override
    public String addAndEdit(UnionStaffDepartDto UnionStaffDepartDto) {
        JSONObject params = (JSONObject) JSONObject.toJSON(UnionStaffDepartDto);
        JSONObject jsonObject = getClient().executePost(ApiPathConstant.UnionStaffDepartUrl.STAFF_UNION_DEPART_ADD, HttpClientUtils.CONTENT_TYPE_JSON, params);
        if (jsonObject == null) {
            throw new ClientException("SDK调用添加员工关联部门岗位没有返回信息");
        }
        return jsonObject.getString("id");
    }


    /**
     *
     * @param unionStaffDepartDto 中间表对象dto。包含了 员工id 部门id 岗位id
     * @return 关联表vo集合
     */
    @Override
    public List<UnionStaffDepartVo> get(UnionStaffDepartDto unionStaffDepartDto) {
        JSONObject params = (JSONObject) JSONObject.toJSON(unionStaffDepartDto);
        JSONObject resultObj = getClient().executePost(ApiPathConstant.UnionStaffDepartUrl.STAFF_UNION_DEPART_GET, HttpClientUtils.CONTENT_TYPE_JSON, params);
        List<UnionStaffDepartVo> UnionStaffDepartVos = JSONObject.parseArray(resultObj.getString("data"), UnionStaffDepartVo.class);
        return UnionStaffDepartVos;
    }

}
