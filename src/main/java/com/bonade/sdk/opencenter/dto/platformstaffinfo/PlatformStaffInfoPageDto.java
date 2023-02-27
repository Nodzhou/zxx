package com.bonade.sdk.opencenter.dto.platformstaffinfo;

import com.bonade.sdk.opencenter.vo.PageInfo;

import java.util.Date;

/**
 * @author: fsw
 * <b>Description:</b><br>
 * <b>ProjectName:</b> sdk
 * <br><b>PackageName:</b>com.bonade.sdk.opencenter.dto.platformstaffinfo
 * <br><b>ClassName:</b> PlatformStaffInfoPageDto
 * <br><b>Date:</b> 2020/8/10 11:31
 */
public class PlatformStaffInfoPageDto<T> extends PageInfo {


    /**
     * 企业Id
     */
    private String companyId;

    /**
     * 查询关键字
     */
    private String keyword;

    /**
     * 是否为主体企业, 0 否， 1 是
     */
    private Integer isMainCompany;

    /**
     * 是否实名，0 否， 1 是
     */
    private Integer isCertificated;

    /**
     * 是否在职， 0 否， 1 是
     */
    private Integer isNotLeft;

    /**
     * 员工状态，1：激活，2：禁用，-2：离职，-1：删除
     */
    private Integer status;

    /**
     * 入职时间下限
     */
    private Date dateJoinStart;

    /**
     * 入职时间上限
     */
    private Date dateJoinEnd;

    /**
     * 部门Id
     */
    private String departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 岗位Id
     */
    private String positionId;

    /**
     * 岗位名称
     */
    private String positionName;

    /**
     * 各业务线需求分页扩展
     */
    private T pageExtend;


    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getIsMainCompany() {
        return isMainCompany;
    }

    public void setIsMainCompany(Integer isMainCompany) {
        this.isMainCompany = isMainCompany;
    }

    public Integer getIsCertificated() {
        return isCertificated;
    }

    public void setIsCertificated(Integer isCertificated) {
        this.isCertificated = isCertificated;
    }

    public Integer getIsNotLeft() {
        return isNotLeft;
    }

    public void setIsNotLeft(Integer isNotLeft) {
        this.isNotLeft = isNotLeft;
    }

    public Date getDateJoinStart() {
        return dateJoinStart;
    }

    public void setDateJoinStart(Date dateJoinStart) {
        this.dateJoinStart = dateJoinStart;
    }

    public Date getDateJoinEnd() {
        return dateJoinEnd;
    }

    public void setDateJoinEnd(Date dateJoinEnd) {
        this.dateJoinEnd = dateJoinEnd;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public T getPageExtend() {
        return pageExtend;
    }

    public void setPageExtend(T pageExtend) {
        this.pageExtend = pageExtend;
    }
}
