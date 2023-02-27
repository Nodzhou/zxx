package com.bonade.sdk.opencenter.dto.jobposition;


import com.bonade.sdk.opencenter.dto.BaseExtendDto;

import java.io.Serializable;
import java.util.Date;

/**
 *  岗位基础信息表
 * @author lyx
 */
public class PlatformJobPositionDto<T extends BaseExtendDto> implements Serializable {

    /**
     * 岗位id
     */
    private String id;
    /**
     * 企业ID
     */
    private String companyId;

    /**
     * 岗位名称
     */
    private String positionName;

    /**
     * 上级岗位id
     */
    private String parentId;

    /**
     * 职责范围
     */
    private String jobScope;

    /**
     * 创建人Id
     */
    private String createId;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 岗位级别
     */
    private Integer level;

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
     * 岗位状态
      */
    private Integer status;

    /**
     * 岗位类别: 0:普通岗位, 1:管理岗位
     */
    private Integer positionType;

    /**
     * 岗位排序
     */
    private Integer positionSort;

    /**
     * 岗位人数
     */
    private Integer positionNumber;

    /**
     * 岗位编码
     */
    private String positionCode;

    /**
     * 岗位绑定的角色(多个id逗号隔开)
     */
    private String roleIds;

    private T extendJobPosition;

    public T getExtendJobPosition() {
        return extendJobPosition;
    }

    public void setExtendJobPosition(T extendJobPosition) {
        this.extendJobPosition = extendJobPosition;
    }

    public PlatformJobPositionDto(){}

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

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getJobScope() {
        return jobScope;
    }

    public void setJobScope(String jobScope) {
        this.jobScope = jobScope;
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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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

    public Integer getPositionType() {
        return positionType;
    }

    public void setPositionType(Integer positionType) {
        this.positionType = positionType;
    }

    public Integer getPositionSort() {
        return positionSort;
    }

    public void setPositionSort(Integer positionSort) {
        this.positionSort = positionSort;
    }

    public Integer getPositionNumber() {
        return positionNumber;
    }

    public void setPositionNumber(Integer positionNumber) {
        this.positionNumber = positionNumber;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }
}
