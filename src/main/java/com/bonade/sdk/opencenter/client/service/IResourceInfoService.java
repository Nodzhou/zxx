package com.bonade.sdk.opencenter.client.service;

import com.bonade.sdk.opencenter.vo.PageData;

import java.util.List;

/**
 * @author pengjie
 *
 * <p>
 * 与资源相关的CRUD接口
 * </p>
 */
public interface IResourceInfoService<T> extends SdkService {
    /**
     * 资源新增
     *
     * @param eosResourceInfo 实体
     * @return String 资源id
     * @throws Exception 异常
     */
    String add(T eosResourceInfo) throws Exception;

    /**
     * 资源更新
     *
     * @param eosResourceInfo 实体
     * @return int 影响行数
     * @throws Exception 异常
     */
    int update(T eosResourceInfo) throws Exception;

    /**
     * 资源删除
     *
     * @param resourceOpenId ID
     * @return int 影响行数
     * @throws Exception 异常
     */
    int delete(String resourceOpenId) throws Exception;

    /**
     * 获取资源详情
     *
     * @param resourceOpenId 资源id
     * @return EosResourceInfo 资源对象
     * @throws Exception 异常
     */
    T get(String resourceOpenId) throws Exception;

    /**
     * 资源分页列表
     *
     * @param pageNum       页码
     * @param pageSize      页数
     * @param keyWord       关键字
     * @param companyOpenId 企业id
     * @return 分页列表
     * @throws Exception 异常
     */
    PageData<List<T>> listByPage(int pageNum, int pageSize, String companyOpenId, String keyWord) throws Exception;
}
