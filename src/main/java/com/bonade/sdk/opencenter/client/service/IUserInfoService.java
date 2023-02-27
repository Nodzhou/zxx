package com.bonade.sdk.opencenter.client.service;

import com.bonade.sdk.opencenter.dto.BaseExtendDto;
import com.bonade.sdk.opencenter.dto.user.PlatformUserInfoDto;
import com.bonade.sdk.opencenter.dto.user.UserInfoPageDto;
import com.bonade.sdk.opencenter.vo.*;

import java.util.List;

/**
 * @author yw
 */
public interface IUserInfoService<T extends BaseExtendDto> extends SdkService {

    /**
     * 新增用户
     *
     * @param platformUserInfoDto 用户入参对象
     * @author: yw
     * @return: <b>Description:</b><br>
     * <br><b>Date:</b> 2020/8/10 10:43
     * <br><b>Version:</b> 1.0
     */
    String addUser(PlatformUserInfoDto<T> platformUserInfoDto);


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
    int editUser(PlatformUserInfoDto<T> platformUserInfoDto);

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
    int deleteUser(String id);

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
    PlatformUserInfoVo<T> getUser(String id);

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

    PageData<List<PlatformUserInfoVo<T>>> findUserByPage(UserInfoPageDto userInfoPageDto);

    /**
     * 查询用户所在企业的员工信息
     *
     * @param id 用户id
     * @author: yw
     * @return: UserInfoVo 返回员工信息列表
     * <b>Description:</b><br>
     * <br><b>Date:</b> 2020/8/10 10:44
     * <br><b>Version:</b> 1.0
     */
    UserInfoVo getUserInfo(String id);

    /**
     * <b>Description:</b> 根据手机号查询用户信息 <br>
     * @author: biyizhuo
     * <br><b>Date:</b> 2020/11/10 18:31
     * <br><b>Version:</b> 1.0
     * @param phoneNumber 手机号
     * @return: 返回用户信息
     */
    UserInfoSimpVo findUserInfoByPhoneNumer(String phoneNumber);
}
