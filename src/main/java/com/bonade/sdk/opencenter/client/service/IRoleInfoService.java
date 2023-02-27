package com.bonade.sdk.opencenter.client.service;

import com.bonade.sdk.opencenter.vo.PageData;
import com.bonade.sdk.opencenter.vo.RoleAccreditVo;

import java.util.List;

/**
 * @author pengjie
 * <p>
 * 与角色相关的CRUD接口
 * </p>
 */
public interface IRoleInfoService<T> extends SdkService {

    /**
     * 新增角色
     *
     * @param eosRoleInfo 角色实体
     * @return String 角色id
     * @throws Exception 异常
     */
    String add(T eosRoleInfo) throws Exception;

    /**
     * 编辑角色
     *
     * @param eosRoleInfo 角色实体
     * @return int 影响行数 0-失败 1-成功
     * @throws Exception 异常
     */
    int update(T eosRoleInfo) throws Exception;


    /**
     * 删除角色
     *
     * @param roleOpenId 角色id
     * @return int 删除行数 0-失败
     * @throws Exception 异常
     */
    int delete(String roleOpenId) throws Exception;

    /**
     * 获取角色详情
     *
     * @param roleOpenId 角色id
     * @return EosRoleInfo 角色对象
     * @throws Exception 异常
     */
    T get(String roleOpenId) throws Exception;

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
    PageData<List<T>> listByPage(int pageNum, int pageSize, String companyOpenId, String keyword) throws Exception;


    /**
     * 新增角色成员接口
     *
     * @param roleId    角色id
     * @param staffIds  员工id，多个用逗号隔开
     * @param principal 是否为负责人
     * @return int 影响行数
     * @throws Exception 异常
     */
    int addStaffRole(String roleId, String staffIds, Integer principal) throws Exception;

    /**
     * 删除角色成员接口
     *
     * @param roleId   角色id
     * @param staffIds 员工id,多个用逗号隔开
     * @return int 影响行数
     * @throws Exception 异常
     */
    int deleteStaffRole(String roleId, String staffIds) throws Exception;

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
    boolean roleAccredit(RoleAccreditVo roleAccreditVo) throws Exception;


}
