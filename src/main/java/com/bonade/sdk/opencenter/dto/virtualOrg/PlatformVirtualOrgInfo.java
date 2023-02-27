package com.bonade.sdk.opencenter.dto.virtualOrg;

import com.bonade.sdk.opencenter.dto.BaseExtendDto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhangbeiping
 * <b>Description:中台—虚拟组织信息表类</b><br>
 * <b>ProjectName:bonade-platform-structure</b>
 * <br><b>PackageName:com.bonade.structure.pojo.vo</b>
 * <br><b>ClassName:PlatformVirtualLeaderVO</b>
 * <br><b>Date:2020/9/3 16:45</b>
 */
public class PlatformVirtualOrgInfo<T extends BaseExtendDto> implements Serializable {

    /**
     * ID
     */
    private String id;

    /**
     * 企业ID
     */
    private String companyId;

    /**
     * 上级虚拟组织ID
     */
    private String parentId;

    /**
     * 虚拟组织名称
     */
    private String virtualOrgName;

    /**
     * 地区
     */
    private String region;

    /**
     * 描述
     */
    private String description;

    /**
     * 备注
     */
    private String remark;

    /**
     * 虚拟组织来源
     */
    private String virtualOrgFrom;

    /**
     * 部门code(自增长字段，用来组合部门path链路和快速查询)
     */
    private Integer code;

    /**
     * 部门链路（保存部门链路。用来进行快速查询，用 - 进行分割）
     */
    private String path;

    /**
     * 深度（部门层级。代表当前部门在整个部门关系中处于第几层级，用于快速查询）
     */
    private Integer level;

    /**
     * 操作资源ClientID
     */
    private String clientId;

    /**
     * 创建人Id
     */
    private String createId;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人Id
     */
    private String updateId;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 状态 1:正常, 2：禁用, -1:删除
     */
    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getVirtualOrgName() {
        return virtualOrgName;
    }

    public void setVirtualOrgName(String virtualOrgName) {
        this.virtualOrgName = virtualOrgName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getVirtualOrgFrom() {
        return virtualOrgFrom;
    }

    public void setVirtualOrgFrom(String virtualOrgFrom) {
        this.virtualOrgFrom = virtualOrgFrom;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
