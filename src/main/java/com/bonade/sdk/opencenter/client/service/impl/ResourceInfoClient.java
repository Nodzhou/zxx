package com.bonade.sdk.opencenter.client.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.service.IResourceInfoService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.common.KeyConstant;
import com.bonade.sdk.opencenter.common.RoleResourceInfoConstant;
import com.bonade.sdk.opencenter.dto.resourceinfo.EosResourceInfoDto;
import com.bonade.sdk.opencenter.exception.ClientException;
import com.bonade.sdk.opencenter.utils.HttpClientUtils;
import com.bonade.sdk.opencenter.utils.ObjectMapperUtils;
import com.bonade.sdk.opencenter.vo.PageData;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <b>Description:与资源相关接口</b><br>
 *
 * @author pengjie
 * @version 1.0
 * <b>ProjectName:</b> open-center-sdk
 * <br><b>PackageName:</b> com.bonade.sdk.opencenter.client
 * <br><b>ClassName:</b> ResourceInfoClient
 * <br><b>Date:</b> 2020年7月24日 上午10:04:23
 */
public class ResourceInfoClient implements IResourceInfoService<EosResourceInfoDto> { 


    /**
     * 资源新增
     *
     * @param eosResourceInfo 实体
     * @return String 资源id
     * @throws Exception 异常
     */
    @Override
    public String add(EosResourceInfoDto eosResourceInfo) throws Exception {
        if (null == eosResourceInfo) {
            throw new ClientException("参数为空，请检查！");
        }
        // client_id是从token获取，这里需要注意
//        if (StringUtils.isBlank(eosResourceInfo.getClientId())) {
//            throw new ClientException("业务线id为空，请检查！");
//        }
        return addOrEdit(eosResourceInfo, ApiPathConstant.ResourceInfo.RESOURCE_INFO_ADD, "新增");
    }

    /**
     * 资源更新
     *
     * @param eosResourceInfo 实体
     * @return int 影响行数
     * @throws Exception 异常
     */
    @Override
    public int update(EosResourceInfoDto eosResourceInfo) throws Exception {
        if (null == eosResourceInfo) {
            throw new ClientException("参数为空，请检查！");
        }
        if (StringUtils.isBlank(eosResourceInfo.getResourceOpenId())) {
            throw new ClientException("资源id为空，请检查！");
        }
        String resourceOpenId = addOrEdit(eosResourceInfo, ApiPathConstant.ResourceInfo.RESOURCE_INFO_EDIT, "更新");
        return StringUtils.isBlank(resourceOpenId) ? 0 : 1;
    }

    private String addOrEdit(EosResourceInfoDto eosResourceInfo, String path, String message) throws Exception {
        Map<String, Object> map = ObjectMapperUtils.transObject2Map(eosResourceInfo);
        JSONObject retJson = getClient().executePost(path, HttpClientUtils.CONTENT_TYPE_JSON, map);
        if (null == retJson) {
            throwClientException("资源" + message);
        }
        return retJson.getString(RoleResourceInfoConstant.RESOURCE_OPEN_ID);
    }

    /**
     * 资源删除
     *
     * @param resourceOpenId 资源id
     * @return int 影响行数
     * @throws Exception 异常
     */
    @Override
    public int delete(String resourceOpenId) throws Exception {
        if (StringUtils.isBlank(resourceOpenId)) {
            throw new ClientException("资源id为空，请检查！");
        }
        Map<String, Object> map = new HashMap<>(1);
        map.put("resourceIds", resourceOpenId);
        JSONObject jsonObject = getClient().executeDelete(ApiPathConstant.ResourceInfo.RESOURCE_INFO_DELETE, map);
        if (null == jsonObject) {
            throwClientException("删除资源");
        }
        return jsonObject.getIntValue(RoleResourceInfoConstant.AFFECT_ROWS);
    }

    /**
     * 获取资源详情
     *
     * @param resourceOpenId 资源id
     * @return EosResourceInfo 资源对象
     * @throws Exception 异常
     */
    @Override
    public EosResourceInfoDto get(String resourceOpenId) throws Exception {
        if (StringUtils.isBlank(resourceOpenId)) {
            throw new ClientException("资源id为空，请检查！");
        }
        Map<String, Object> map = new HashMap<>(1);
        map.put("resourceId", resourceOpenId);

        JSONObject jsonObject = getClient().executeGet(ApiPathConstant.ResourceInfo.RESOURCE_INFO_GET, map);
        if (null == jsonObject) {
            throwClientException("获取资源详情");
        }
        return JSON.toJavaObject(jsonObject, EosResourceInfoDto.class);
    }


    /**
     * 资源分页列表
     *
     * @param pageNum       页码
     * @param pageSize      页数
     * @param keyword       关键字
     * @param companyOpenId 企业id
     * @return 分页列表
     * @throws Exception 异常
     */
    @Override
    public PageData<List<EosResourceInfoDto>> listByPage(int pageNum, int pageSize, String companyOpenId, String keyword) throws Exception {

        Map<String, Object> map = new HashMap<>(6);
        map.put("pageNum", pageNum);
        map.put("pageSize", pageSize);
        map.put("companyOpenId", companyOpenId);
        map.put("keyword", keyword);
        JSONObject object = getClient().executeGet(ApiPathConstant.ResourceInfo.RESOURCE_INFO_PAGE, map);
        if (null == object) {
            throwClientException("资源分页列表");
        }

        List<EosResourceInfoDto> resourceInfos = JSONObject.parseArray(object.getString(KeyConstant.DATA), EosResourceInfoDto.class);
        Long b = Long.parseLong(object.getString("total"));

        return new PageData<>(resourceInfos, b);
    }

    private void throwClientException(String message) throws Exception {
        throw new ClientException("SDK调用" + message + "无返回，请检查！");
    }
}
