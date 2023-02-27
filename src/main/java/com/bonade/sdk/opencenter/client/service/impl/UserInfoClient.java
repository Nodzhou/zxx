package com.bonade.sdk.opencenter.client.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.service.IUserInfoService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.dto.BaseExtendDto;
import com.bonade.sdk.opencenter.dto.user.UserInfoPageDto;
import com.bonade.sdk.opencenter.exception.ClientException;
import com.bonade.sdk.opencenter.dto.user.PlatformUserInfoDto;
import com.bonade.sdk.opencenter.vo.PageData;
import com.bonade.sdk.opencenter.vo.PlatformUserInfoVo;
import com.bonade.sdk.opencenter.vo.UserInfoSimpVo;
import com.bonade.sdk.opencenter.vo.UserInfoVo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yw
 */
public class UserInfoClient implements IUserInfoService<BaseExtendDto> {

    /**
     * 新增用户
     *
     * @param platformUserInfoDto 用户入参对象
     * @author: yw
     * @return: <b>Description:</b><br>
     * <br><b>Date:</b> 2020/8/10 10:43
     * <br><b>Version:</b> 1.0
     */
    @Override
    public String addUser(PlatformUserInfoDto platformUserInfoDto) {
        JSONObject jsonObject = getClient().postByJson(ApiPathConstant.UserInfoUrl.USERINFO_ADD, (JSONObject) JSONObject.toJSON(platformUserInfoDto));
        if (jsonObject == null) {
            throw new ClientException("SDK调用添加用户没有返回信息");
        }
        return jsonObject.getString("id");
    }

    /**
     * 编辑用户
     *
     * @param platformUserInfoDto 用户入参对象
     * @author: yw
     * @return: count 返回编辑用户影响行数
     * <b>Description:</b><br>
     * <br><b>Date:</b> 2020/8/10 10:43
     * <br><b>Version:</b> 1.0
     */
    @Override
    public int editUser(PlatformUserInfoDto platformUserInfoDto) {
        JSONObject jsonObject = getClient().postByJson(ApiPathConstant.UserInfoUrl.USERINFO_EDIT, (JSONObject) JSONObject.toJSON(platformUserInfoDto));
        if (jsonObject == null) {
            throw new ClientException("SDK调用编辑用户没有返回信息");
        }
        return jsonObject.getIntValue("count");
    }

    /**
     * 删除用户
     *
     * @param id 用户id
     * @author: yw
     * @return: count 返回删除用户影响行数
     * <b>Description:</b><br>
     * <br><b>Date:</b> 2020/8/10 10:44
     * <br><b>Version:</b> 1.0
     */
    @Override
    public int deleteUser(String id) {
        Map<String, Object> params = new HashMap();
        params.put("id", id);
        JSONObject jsonObject = getClient().executeDelete(ApiPathConstant.UserInfoUrl.USERINFO_DELETE, params);
        if (jsonObject == null) {
            throw new ClientException("SDK调用删除用户没有返回信息");
        }
        return jsonObject.getIntValue("count");
    }

    /**
     * 查询用户
     *
     * @param id 用户id
     * @author: yw
     * @return: PlatformUserInfoVo 用户信息
     * <b>Description:</b><br>
     * <br><b>Date:</b> 2020/8/10 10:44
     * <br><b>Version:</b> 1.0
     */
    @Override
    public PlatformUserInfoVo getUser(String id) {
        Map<String, Object> params = new HashMap();
        params.put("id", id);
        JSONObject jsonObject = getClient().executeGet(ApiPathConstant.UserInfoUrl.USERINFO_GET, params);
        if (jsonObject == null) {
            throw new ClientException("SDK调用查询用户没有返回信息");
        }
        return JSON.toJavaObject(jsonObject, PlatformUserInfoVo.class);
    }


    /**
     * 分页查询用户信息
     *
     * @param userInfoPageDto 分页入参对象
     * @author: yw
     * @return: 返回分页用户列表信息
     * <b>Description:</b><br>
     * <br><b>Date:</b> 2020/8/10 10:45
     * <br><b>Version:</b> 1.0
     */
    @Override
    public PageData<List<PlatformUserInfoVo<BaseExtendDto>>> findUserByPage(UserInfoPageDto userInfoPageDto) {
        JSONObject retJson = getClient().postByJson(ApiPathConstant.UserInfoUrl.USERINFO_PAGE, (JSONObject) JSONObject.toJSON(userInfoPageDto));
        if (retJson == null) {
            return new PageData<List<PlatformUserInfoVo<BaseExtendDto>>>(new ArrayList<PlatformUserInfoVo<BaseExtendDto>>(), 0);
        }
        List<PlatformUserInfoVo> platformUserInfos = JSONObject.parseArray(retJson.getString("data"), PlatformUserInfoVo.class);
        Long b = Long.parseLong(retJson.getString("total"));
        return new PageData(platformUserInfos, b);
    }
    /**
     * 查询用户所在企业的员工信息
     *
     * @param id 用户id
     * @author: yw
     * @return: UserInfoVo 返回包含员工信息列表的用户信息
     * <b>Description:</b><br>
     * <br><b>Date:</b> 2020/8/10 10:44
     * <br><b>Version:</b> 1.0
     */
    @Override
    public UserInfoVo getUserInfo(String id) {
        Map<String, Object> params = new HashMap();
        params.put("id", id);
        JSONObject jsonObject = getClient().executeGet(ApiPathConstant.UserInfoUrl.USERINFO_GET_USERINFO, params);
        if (jsonObject == null) {
            throw new ClientException("SDK调用查询用户没有返回信息");
        }
        return JSON.toJavaObject(jsonObject, UserInfoVo.class);
    }

    @Override
    public UserInfoSimpVo findUserInfoByPhoneNumer(String phoneNumber) {
        Map<String, Object> params = new HashMap();
        params.put("phoneNumber", phoneNumber);
        JSONObject jsonObject = getClient().executeGet(ApiPathConstant.UserInfoUrl.FIND_USERINFO_BY_PHONENUMBER, params);
        if (jsonObject == null) {
            throw new ClientException("SDK调用查询用户没有返回信息");
        }
        return JSON.toJavaObject(jsonObject, UserInfoSimpVo.class);
    }

}
