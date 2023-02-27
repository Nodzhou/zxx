package com.bonade.sdk.opencenter.vo;


import com.bonade.sdk.opencenter.dto.BaseExtendDto;

import java.io.Serializable;

/**
 *  岗位基础信息表
 * @author chd
 */
public class JobPositionInfoVo<T extends BaseExtendDto> implements Serializable {

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
     * 岗位级别
     */
    private Byte level;

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
     * 岗位绑定的角色id(多个id逗号隔开)
     */
    private String roleIds;

    /**
     * 每条业务线的扩展表vo
     */
    private T extendJobPosition;

    public T getExtendJobPosition() {
        return extendJobPosition;
    }

    public void setExtendJobPosition(T extendJobPosition) {
        this.extendJobPosition = extendJobPosition;
    }

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

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
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
