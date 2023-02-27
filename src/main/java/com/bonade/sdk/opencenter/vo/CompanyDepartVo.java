package com.bonade.sdk.opencenter.vo;

import java.io.Serializable;

/**
 * <b>Description:</b> 企业下部门基本信息vo <br>
 * @author: biyizhuo
 * @version 1.0
 * <b>ProjectName:</b> open-center-sdk
 * <br><b>PackageName:</b> com.bonade.sdk.opencenter.vo
 * <br><b>ClassName:</b> com.bonade.sdk.opencenter.vo.CompanyDepartVo
 * <br><b>Date:</b> 2020/7/25
 */
public class CompanyDepartVo implements Serializable {

    /**
     * 部门Id
     */
    private String id;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 上级部门Id
     */
    private String parentId;

    /**
     * 部门人数
     */
    private Integer departmentNumber;

    /**
     * 部门负责人Id
     */
    private String leaderId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(Integer departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }
}
