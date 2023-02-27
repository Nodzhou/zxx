package com.bonade.sdk.opencenter.client.service;


import com.bonade.sdk.opencenter.vo.PageData;

import java.util.List;

/**
 * @author pengjie
 * <p>
 * 角员工角色关系服务
 * </p>
 */
public interface IRoleStaffService<T> extends SdkService {
    /**
     * 员工角色关系新增
     *
     * @param roleStaff 实体
     * @return 成功行数
     * @throws Exception 异常
     */
    int add(T roleStaff) throws Exception;

    /**
     * 员工角色关系更新
     *
     * @param roleStaff 实体
     * @return 更新成功的行数
     * @throws Exception 异常
     */
    int update(T roleStaff) throws Exception;

    /**
     * 员工角色关系删除
     *
     * @param roleStaff 实体
     * @return int 受影响行数
     * @throws Exception 异常
     */
    int delete(T roleStaff) throws Exception;


    /**
     * 员工角色关系获取
     *
     * @param staffOpenId 员工id
     * @return 集合
     * @throws Exception 异常
     */
    List<T> get(String staffOpenId) throws Exception;

    /**
     * 员工角色关系分页
     *
     * @param pageNum  页码数
     * @param keyword  关键字
     * @param pageSize 页大小
     * @return 集合
     * @throws Exception 异常
     */
    PageData<List<T>> listByPage(int pageNum, int pageSize, String keyword) throws Exception;

}
