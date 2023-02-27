package com.bonade.sdk.opencenter.client.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.service.IVirtualOrgService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.dto.BaseExtendDto;
import com.bonade.sdk.opencenter.dto.virtualOrg.*;
import com.bonade.sdk.opencenter.exception.ClientException;
import com.bonade.sdk.opencenter.utils.HttpClientUtils;
import com.bonade.sdk.opencenter.vo.PageData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangbeiping
 * <b>Description:</b><br>
 * <b>ProjectName:open-center-sdk</b>
 * <br><b>PackageName:com.bonade.sdk.opencenter.client</b>
 * <br><b>ClassName:VirtualOrgClient</b>
 * <br><b>Date:2020/9/14 17:22</b>
 */
public class VirtualOrgClient implements IVirtualOrgService<BaseExtendDto> { 

    /**
     * 获取当前虚拟组织树
     *
     * @param platformVirtualOrgParam 虚拟组织查询参数虚拟类
     * @return 虚拟组织集合树
     */
    @Override
    public List<PlatformVirtualOrgVo> getPlatformVirtualOrgTreeNode(PlatformVirtualOrgParam platformVirtualOrgParam) {
        JSONObject jsonObject = getClient().postByJson(ApiPathConstant.VirtualOrgUrl.POST_VIRTUAL_ORG_TREE, (JSONObject) JSONObject.toJSON(platformVirtualOrgParam));
        if (jsonObject == null) {
            throw new ClientException("SDK调用虚拟组织树没有返回信息");
        }
        return jsonObject.getJSONArray("data").toJavaList(PlatformVirtualOrgVo.class);
    }

    /**
     * 查询当前虚拟组织信息
     *
     * @param platformVirtualOrgParam 虚拟组织查询参数虚拟类
     * @return 虚拟组织集合
     */
    @Override
    public List<PlatformVirtualOrgVo> getPlatformVirtualOrgList(PlatformVirtualOrgParam platformVirtualOrgParam) {
        JSONObject jsonObject = getClient().postByJson(ApiPathConstant.VirtualOrgUrl.POST_VIRTUAL_ORG_LIST, (JSONObject) JSONObject.toJSON(platformVirtualOrgParam));
        if (jsonObject == null) {
            throw new ClientException("SDK调用虚拟组织列表没有返回信息");
        }
        return jsonObject.getJSONArray("data").toJavaList(PlatformVirtualOrgVo.class);
    }

    /**
     * 新增虚拟组织
     *
     * @param platformVirtualOrgVo 虚拟组织新增参数
     * @return 虚拟组织ID
     */
    @Override
    public String addPlatformVirtualOrgInfo(PlatformVirtualOrgVo platformVirtualOrgVo) {
        JSONObject jsonObject = getClient().postByJson(ApiPathConstant.VirtualOrgUrl.POST_VIRTUAL_ORG_ADD, JSON.parseObject(JSONObject.toJSONString(platformVirtualOrgVo)));
        if (jsonObject == null) {
            throw new ClientException("SDK调用新增虚拟组织没有返回信息");
        }
        return jsonObject.getString("data");
    }

    /**
     * 根据ID查询信息
     *
     * @param id 虚拟组织ID
     * @return 虚拟组织详情
     */
    @Override
    public PlatformVirtualOrgVo getPlatformVirtualOrgInfo(String id, Integer type) {
        JSONObject param = new JSONObject(1);
        param.put("id", id);
        param.put("type", type);
        JSONObject jsonObject = getClient().executeGet(ApiPathConstant.VirtualOrgUrl.GET_VIRTUAL_ORG_GETBYID, param);
        if (jsonObject == null) {
            throw new ClientException("SDK调用获取单个虚拟组织没有返回信息");
        }
        return jsonObject.toJavaObject(PlatformVirtualOrgVo.class);
    }

    /**
     * 修改虚拟组织
     *
     * @param platformVirtualOrgVo 虚拟组织修改ID
     * @return 虚拟组织ID
     */
    @Override
    public String editPlatformVirtualOrgInfo(PlatformVirtualOrgVo platformVirtualOrgVo) {
        JSONObject jsonObject = getClient().postByJson(ApiPathConstant.VirtualOrgUrl.POST_VIRTUAL_ORG_EDIT, (JSONObject) JSONObject.toJSON(platformVirtualOrgVo));
        if (jsonObject == null) {
            throw new ClientException("SDK调用修改虚拟组织没有返回信息");
        }
        return jsonObject.getString("data");
    }

    /**
     * 删除当前虚拟组织以及下级组织
     *
     * @param id 虚拟组织ID
     * @return 删除数量
     */
    @Override
    public int deleteCurrentAndSon(String id) {
        JSONObject param = new JSONObject(1);
        param.put("id", id);
        JSONObject jsonObject = getClient().executePost(ApiPathConstant.VirtualOrgUrl.POST_VIRTUAL_ORG_DELETECURRENTANDSON, HttpClientUtils.CONTENT_TYPE_URLENCODED, param);
        if (jsonObject == null) {
            throw new ClientException("SDK调用删除当前虚拟组织以及下级组织没有返回信息");
        }
        return jsonObject.getIntValue("data");
    }

    /**
     * 获取新的企业ID
     *
     * @param thirdCompanyId 企业ID
     * @return 新的企业ID
     */
    @Override
    public String getPlatformExtendCompanyOpenId(String thirdCompanyId) {
        JSONObject param = new JSONObject(1);
        param.put("companyId", thirdCompanyId);
        JSONObject jsonObject = getClient().executeGet(ApiPathConstant.VirtualOrgUrl.GET_VIRTUAL_ORG_ORGNEWID, param);
        if (jsonObject == null) {
            throw new ClientException("SDK调用获取新的企业ID没有返回信息");
        }
        return jsonObject.getString("data");
    }

    /**
     * 获取当前企业部门树
     *
     * @param companyId 企业ID
     * @return 企业部门树
     */
    @Override
    public List<PlatformOrgTreeVo> getPlatformOrgTreeVoTree(String companyId) {
        JSONObject param = new JSONObject(1);
        param.put("companyId", companyId);
        JSONObject jsonObject = getClient().executeGet(ApiPathConstant.VirtualOrgUrl.GET_VIRTUAL_ORG_ORG_TREE, param);
        if (jsonObject == null) {
            throw new ClientException("SDK调用获取当前企业部门树没有返回信息");
        }
        return jsonObject.getJSONArray("data").toJavaList(PlatformOrgTreeVo.class);
    }

    /**
     * 获取企业ID或者部门ID获取成员
     *
     * @param companyDepartmentStaffParam 获取企业或者部门人员实体
     * @return 企业ID或者部门ID获取成员集合
     */
    @Override
    public PageData<List<CompanyDepartmentStaffVo>> getCompanyDepartmentStaffVoList(CompanyDepartmentStaffParam companyDepartmentStaffParam) {
        JSONObject jsonObject = getClient().postByJson(ApiPathConstant.VirtualOrgUrl.POST_VIRTUAL_ORG_ORG_ORGDEPT_STAFFPAGE, (JSONObject) JSONObject.toJSON(companyDepartmentStaffParam));
        if (jsonObject == null) {
            throw new ClientException("SDK调用获取当前企业部门成员列表时没有返回信息");
        }
        return new PageData(JSONObject.parseArray(jsonObject.getString("records"), CompanyDepartmentStaffVo.class), Long.parseLong(jsonObject.getString("total")));
    }

    /**
     * 人员离职校验
     *
     * @param staffOpenIds 人员ID
     * @return 删除数量
     */
    @Override
    public int dimissionDelete(List<String> staffOpenIds) {
        Map<String, Object> paramMap = new HashMap<>(6);
        paramMap.put("staffOpenIds", staffOpenIds);
        JSONObject jsonObject = getClient().postByJson(ApiPathConstant.VirtualOrgUrl.POST_VIRTUAL_ORG_ORG_STAFF_DIMISSION, (JSONObject) JSONObject.toJSON(paramMap));
        if (jsonObject == null) {
            throw new ClientException("SDK调用获取人员离职(删除)校验时没有返回信息");
        }
        return jsonObject.getIntValue("data");
    }

    /**
     * 获取虚拟组织部门负责人信息
     *
     * @param virtualOrgId 虚拟组织ID
     * @return 虚拟组织部门负责人信息
     */
    @Override
    public List<PlatformVirtualLeaderVo> getPlatformVirtualLeaderVOList(String virtualOrgId) {
        JSONObject param = new JSONObject(1);
        param.put("virtualOrgId", virtualOrgId);
        JSONObject jsonObject = getClient().executeGet(ApiPathConstant.VirtualOrgUrl.GET_VIRTUAL_ORG_ORG_LEADER_LIST, param);
        if (jsonObject == null) {
            throw new ClientException("SDK调用虚拟组织负责人列表没有返回信息");
        }
        return jsonObject.getJSONArray("data").toJavaList(PlatformVirtualLeaderVo.class);
    }

    /**
     * 新增虚拟组织负责人
     *
     * @param virtualOrgId 虚拟组织ID
     * @param staffOpenIds 负责人ID集合
     * @return 新增的返回数量
     */
    @Override
    public List<String> addPlatformVirtualLeaderVO(String virtualOrgId, List<String> staffOpenIds) {
        JSONObject param = new JSONObject(1);
        param.put("virtualOrgId", virtualOrgId);
        param.put("staffOpenIds", staffOpenIds);
        JSONObject jsonObject = getClient().executePost(ApiPathConstant.VirtualOrgUrl.POST_VIRTUAL_ORG_ORG_LEADER_ADD, HttpClientUtils.CONTENT_TYPE_URLENCODED, param);
        if (jsonObject == null) {
            throw new ClientException("SDK调用新增虚拟组织负责人没有返回信息");
        }
        return jsonObject.getJSONArray("data").toJavaList(String.class);
    }

    /**
     * 删除当前虚拟组织负责人
     *
     * @param virtualOrgId 虚拟组织ID
     * @param staffOpenIds 负责人ID集合
     * @return 删除的返回数量
     */
    @Override
    public int deletePlatformVirtualLeader(String virtualOrgId, List<String> staffOpenIds) {
        JSONObject param = new JSONObject(1);
        param.put("virtualOrgId", virtualOrgId);
        param.put("staffOpenIds", staffOpenIds);
        JSONObject jsonObject = getClient().executePost(ApiPathConstant.VirtualOrgUrl.DELETE_VIRTUAL_ORG_ORG_LEADER_DELETE, HttpClientUtils.CONTENT_TYPE_URLENCODED, param);
        if (jsonObject == null) {
            throw new ClientException("SDK调用删除当前虚拟组织负责人没有返回信息");
        }
        return jsonObject.getIntValue("data");
    }

    /**
     * 查询当前虚拟组织成员信息
     *
     * @param platformVirtualStaffPageParam 虚拟组织成员查询参数
     * @return 虚拟组织成员集合
     */
    @Override
    public PageData<List<PlatformVirtualStaffVo>> getPlatformVirtualStaffVoPage(PlatformVirtualStaffPageParam platformVirtualStaffPageParam) {
        JSONObject jsonObject = getClient().postByJson(ApiPathConstant.VirtualOrgUrl.POST_VIRTUAL_ORG_ORG_STAFF_PAGE, (JSONObject) JSONObject.toJSON(platformVirtualStaffPageParam));
        if (jsonObject == null) {
            throw new ClientException("SDK调用获取查询当前虚拟组织成员信息时没有返回信息");
        }
        return new PageData(JSONObject.parseArray(jsonObject.getString("records"), PlatformVirtualStaffVo.class), Long.parseLong(jsonObject.getString("total")));
    }

    /**
     * 新增虚拟组织成员
     *
     * @param platformVirtualStaffParam 虚拟组织成员（新增和删除操作参数）
     * @return 虚拟组织成员ID
     */
    @Override
    public List<String> addPlatformVirtualStaff(PlatformVirtualStaffParam platformVirtualStaffParam) {
        JSONObject jsonObject = getClient().postByJson(ApiPathConstant.VirtualOrgUrl.POST_VIRTUAL_ORG_ORG_STAFF_ADD, (JSONObject) JSONObject.toJSON(platformVirtualStaffParam));
        if (jsonObject == null) {
            throw new ClientException("SDK调用获取新增虚拟组织成员时没有返回信息");
        }
        return jsonObject.getJSONArray("data").toJavaList(String.class);
    }

    /**
     * 删除虚拟组织成员信息
     *
     * @param platformVirtualStaffParam 虚拟组织成员（新增和删除操作参数）
     * @return 删除数量
     */
    @Override
    public int deletePlatformVirtualStaff(PlatformVirtualStaffParam platformVirtualStaffParam) {
        JSONObject jsonObject = getClient().postByJson(ApiPathConstant.VirtualOrgUrl.POST_VIRTUAL_ORG_ORG_STAFF_DELETE, (JSONObject) JSONObject.toJSON(platformVirtualStaffParam));
        if (jsonObject == null) {
            throw new ClientException("SDK调用获取删除虚拟组织成员没有返回信息");
        }
        return jsonObject.getIntValue("data");
    }
}
