package com.bonade.sdk.opencenter.client.service;

import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.vo.PageData;

import java.util.List;

/**
 * @author pengjie
 * <p>
 * 角色资源关联关系服务
 * </p>
 */
public interface IRoleResourceService<T> extends SdkService {
    /**
     * 角色资源关系新增
     *
     * @param roleResource 实体
     * @return int 影响行数
     * @throws Exception 异常
     */
    int add(T roleResource) throws Exception;

    /**
     * 员工角色关系编辑。
     * 说明：
     * 角色资源关联信息例子。
     * {
     * "roleOpenId": "234234234",
     * "resourceOpenIds":
     * [{"resourceOpenId":""}]
     * }
     * roleOpenId：平台角色Id
     * resourceOpenId：平台资源id
     *
     * @param jsonObject 实体
     * @return int 影响行数
     * @throws Exception 异常
     */
    int update(JSONObject jsonObject) throws Exception;

    /**
     * 角色资源删除，删除角色下的所有资源
     *
     * @param roleOpenId id
     * @return int 删除行数
     * @throws Exception 异常
     */
    int delete(String roleOpenId) throws Exception;

    /**
     * 角色资源详情获取
     *
     * @param roleOpenId 角色id
     * @return 角色资源关系列表
     * @throws Exception 异常
     */
    List<T> get(String roleOpenId) throws Exception;

    /**
     * 角色资源关系分页
     *
     * @param pageNum  页码
     * @param pageSize 页大小
     * @param keyword  关键字
     * @return 集合
     * @throws Exception 异常
     */
    PageData<List<T>> listByPage(int pageNum, int pageSize, String keyword) throws Exception;
}
