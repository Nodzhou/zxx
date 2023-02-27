package com.bonade.sdk.opencenter.client.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.service.IRoleInfoService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.common.KeyConstant;
import com.bonade.sdk.opencenter.common.RoleResourceInfoConstant;
import com.bonade.sdk.opencenter.dto.roleinfo.EosRoleInfoDto;
import com.bonade.sdk.opencenter.exception.ClientException;
import com.bonade.sdk.opencenter.utils.HttpClientUtils;
import com.bonade.sdk.opencenter.utils.ObjectMapperUtils;
import com.bonade.sdk.opencenter.vo.PageData;
import com.bonade.sdk.opencenter.vo.RoleAccreditVo;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author pengjie
 * desc：与角色相关的接口
 */

public class RoleInfoClient implements IRoleInfoService<EosRoleInfoDto> { 

    /**
     * 新增角色
     *
     * @param eosRoleInfo 角色实体
     * @return String 角色id
     * @throws Exception 异常
     */
    @Override
    public String add(EosRoleInfoDto eosRoleInfo) throws Exception {
        if (null == eosRoleInfo) {
            throw new ClientException("参数为空，请检查");
        }
        return addOrEdit(eosRoleInfo, ApiPathConstant.RoleInfo.ROLE_INFO_ADD, "新增");
    }

    /**
     * 编辑角色
     *
     * @param eosRoleInfo 角色实体
     * @return int 影响行数 0-失败 1-成功
     * @throws Exception 异常
     */
    @Override
    public int update(EosRoleInfoDto eosRoleInfo) throws Exception {
        if (null == eosRoleInfo) {
            throw new ClientException("参数为空，请检查");
        }
        if (StringUtils.isBlank(eosRoleInfo.getRoleOpenId())) {
            throw new ClientException("角色id为空，请检查");
        }
        String roleOpenId = addOrEdit(eosRoleInfo, ApiPathConstant.RoleInfo.ROLE_INFO_EDIT, "更新");
        return StringUtils.isBlank(roleOpenId) ? 0 : 1;
    }

    private String addOrEdit(EosRoleInfoDto eosRoleInfo, String path, String message) throws Exception {
        Map<String, Object> retMap = ObjectMapperUtils.transObject2Map(eosRoleInfo);
        JSONObject retJson = getClient().executePost(path, HttpClientUtils.CONTENT_TYPE_JSON, retMap);
        if (null == retJson) {
            throwClientException("角色" + message);
        }
        // 只获取角色的id
        return retJson.getString(RoleResourceInfoConstant.ROLE_OPEN_ID);
    }

    /**
     * 删除角色
     *
     * @param roleOpenId 角色id
     * @return int 删除行数 0-失败
     * @throws Exception 异常
     */
    @Override
    public int delete(String roleOpenId) throws Exception {
        if (StringUtils.isBlank(roleOpenId)) {
            throw new ClientException("角色id参数为空，请检查！");
        }
        Map<String, Object> map = new HashMap<>(1);
        map.put("roleIds", roleOpenId);
        JSONObject jsonObject = getClient().executeDelete(ApiPathConstant.RoleInfo.ROLE_INFO_DELETE, map);
        return getAffectRow(jsonObject, "删除角色");
    }

    /**
     * 获取角色详情
     *
     * @param roleOpenId 角色id
     * @return EosRoleInfo 角色对象
     * @throws Exception 异常
     */
    @Override
    public EosRoleInfoDto get(String roleOpenId) throws Exception {
        if (StringUtils.isBlank(roleOpenId)) {
            throw new ClientException("角色id参数为空，请检查！");
        }
        Map<String, Object> mapParam = new HashMap<>(1);
        mapParam.put("roleOpenId", roleOpenId);
        JSONObject retJson = getClient().executeGet(ApiPathConstant.RoleInfo.ROLE_INFO_GET, mapParam);
        if (null == retJson) {
            throwClientException("获取角色详情");
        }
        return JSON.toJavaObject(retJson, EosRoleInfoDto.class);
    }


    /**
     * 角色分页接口
     *
     * @param pageNum       页码
     * @param pageSize      页大小
     * @param keyword       关键字
     * @param companyOpenId 平台企业id
     * @return PageData分页后列表
     * @throws Exception 异常
     */
    @Override
    public PageData<List<EosRoleInfoDto>> listByPage(int pageNum, int pageSize, String companyOpenId, String keyword) throws Exception {
        Map<String, Object> map = new HashMap<>(4);
        map.put("pageNum", pageNum);
        map.put("pageSize", pageSize);
        map.put("keyword", keyword);
        map.put("companyOpenId", companyOpenId);
        JSONObject retJson = getClient().executeGet(ApiPathConstant.RoleInfo.ROLE_INFO_LISTPAGE, map);
        if (null == retJson) {
            throwClientException("角色分页列表");
        }
        List<EosRoleInfoDto> eosRoleInfosList = JSONObject.parseArray(retJson.getString(KeyConstant.DATA), EosRoleInfoDto.class);
        Long b = Long.parseLong(retJson.getString("total"));
        return new PageData<List<EosRoleInfoDto>>(eosRoleInfosList, b);
    }

    /**
     * 新增角色成员接口
     *
     * @param roleId    角色id
     * @param staffIds  员工id，多个用逗号隔开
     * @param principal 是否为负责人
     * @return int 影响行数
     * @throws Exception 异常
     */
    @Override
    public int addStaffRole(String roleId, String staffIds, Integer principal) throws Exception {
        staffRoleCheck(roleId, staffIds);

        Map<String, Object> map = new HashMap<>(3);
        map.put("roleId", roleId);
        map.put("staffIds", staffIds);
        if (null != principal) {
            map.put("principal", principal);
        }
        JSONObject jsonObject = getClient().executePost(ApiPathConstant.RoleInfo.ROLE_INFO_ADD_STAFFROLE, HttpClientUtils.CONTENT_TYPE_URLENCODED, map);
        return getAffectRow(jsonObject, "关联员工角色");
    }


    /**
     * 删除角色成员接口
     *
     * @param roleId   角色id
     * @param staffIds 员工id,多个用逗号隔开
     * @return int 影响行数
     * @throws Exception 异常
     */
    @Override
    public int deleteStaffRole(String roleId, String staffIds) throws Exception {
        staffRoleCheck(roleId, staffIds);

        Map<String, Object> map = new HashMap<>(2);
        map.put("roleId", roleId);
        map.put("staffIds", staffIds);
        JSONObject retJson = getClient().executePost(ApiPathConstant.RoleInfo.ROLE_INFO_DELETE_STAFF_ROLE, HttpClientUtils.CONTENT_TYPE_URLENCODED, map);
        return getAffectRow(retJson, "删除员工角色");
    }

    private void staffRoleCheck(String roleId, String staffIds) throws Exception {
        if (StringUtils.isBlank(roleId)) {
            throw new ClientException("角色id为空，请检查！");
        }
        if (StringUtils.isBlank(staffIds) || staffIds.split(RoleResourceInfoConstant.SPLIT_STR).length <= 0) {
            throw new ClientException("员工id为空，请检查！");
        }
    }

    /**
     * 获取返回受影响行数
     */
    private int getAffectRow(JSONObject jsonObject, String message) throws Exception {
        if (null == jsonObject) {
            throwClientException(message);
        }
        return jsonObject.getIntValue(RoleResourceInfoConstant.AFFECT_ROWS);
    }


    /**
     * 功能授权：给角色分配功能权限（包含了新增和删除）：若原有角色和资源关联，但本次没传递该资源则会删除原有的角色资源关系。
     * menuId包含: 资源id、系统id
     * 说明：
     * 1、当menuId表示资源时，若孩子资源选中，则孩子及父级以上的资源必定选中；
     * 2、当选取了资源，则其所属的系统id也必定选中；
     * 3、传递menuId值时，须将孩子及以上的资源menuId传递至SDK。
     * <p>
     * 必传参数：
     * 1、clientId 业务线id
     * 2、roleId 角色id
     * 3、menuId
     *
     * @param roleAccreditVo 角色实体
     * @return boolean 成功-true 失败-false
     * @throws Exception 异常
     */
    @Override
    public boolean roleAccredit(RoleAccreditVo roleAccreditVo) throws Exception {
        if (StringUtils.isBlank(roleAccreditVo.getRoleId())) {
            throw new ClientException("角色id为空，请检查！");
        }
        if (StringUtils.isBlank(roleAccreditVo.getClientId())) {
            throw new ClientException("业务线id为空，请检查！");
        }
        Map<String, Object> map = ObjectMapperUtils.transObject2Map(roleAccreditVo);
        JSONObject ret = getClient().executePost(ApiPathConstant.RoleInfo.RESOURCE_INFO_ROLE_ACCREDIT, HttpClientUtils.CONTENT_TYPE_JSON, map);
        if (null == ret) {
            throwClientException("权限分配");
        }
        return ret.getBooleanValue(KeyConstant.ISSUCCESS);
    }

    private void throwClientException(String message) throws Exception {
        throw new ClientException("SDK调用" + message + "无返回，请检查！");
    }
}
