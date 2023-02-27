package com.bonade.sdk.opencenter.vo;

import com.alibaba.fastjson.annotation.JSONField;


import java.io.Serializable;
import java.util.Date;

/**
 * 员工数据出参
 *
 * @author yw
 */
public class StaffInfoVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工ID
     */
    private String staffId;

    /**
     * 企业ID
     */
    private String companyId;

    /**
     * 企业名称
     */
    private String companyName;

    /**
     * 部门id
     */
    private String departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 岗位id
     */
    private String positionId;

    /**
     * 岗位名称
     */
    private String positionName;

    /**
     * 所属顶级集团企业id
     */
    private String blocId;

    /**
     * 集团企业体系父企业id
     */
    private String parentId;

    /**
     * 是否是集团,0-否，1-是"
     */
    private Integer isGroup;

    /**
     * 所属集团企业名称
     */
    private String blocName;

    /**
     * 员工来源
     */
    private String staffFrom;

    /**
     * 入职企业时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date employmentDate;

    /**
     * 员工状态，1：激活，2：禁用，-2：离职，-1：删除
     */
    private Integer status;

    /**
     * 是否为主体企业0-否，1-是
     */
    private Integer isMainCompany;

    /**
     * 转正时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date conversionDate;

    /**
     * 离职时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date dateLeft;

    /**
     * 工作地点
     */
    private String workPlace;

    /**
     * 工号
     */
    private String jobNumber;

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getBlocId() {
        return blocId;
    }

    public void setBlocId(String blocId) {
        this.blocId = blocId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(Integer isGroup) {
        this.isGroup = isGroup;
    }

    public String getBlocName() {
        return blocName;
    }

    public void setBlocName(String blocName) {
        this.blocName = blocName;
    }

    public String getStaffFrom() {
        return staffFrom;
    }

    public void setStaffFrom(String staffFrom) {
        this.staffFrom = staffFrom;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsMainCompany() {
        return isMainCompany;
    }

    public void setIsMainCompany(Integer isMainCompany) {
        this.isMainCompany = isMainCompany;
    }

    public Date getConversionDate() {
        return conversionDate;
    }

    public void setConversionDate(Date conversionDate) {
        this.conversionDate = conversionDate;
    }

    public Date getDateLeft() {
        return dateLeft;
    }

    public void setDateLeft(Date dateLeft) {
        this.dateLeft = dateLeft;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }
}
