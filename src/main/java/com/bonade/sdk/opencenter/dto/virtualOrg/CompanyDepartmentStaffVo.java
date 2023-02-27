package com.bonade.sdk.opencenter.dto.virtualOrg;

/**
 * @author zhangbeiping
 * <b>Description:企业与部门人员虚拟类</b><br>
 * <b>ProjectName:bonade-platform-structure</b>
 * <br><b>PackageName:com.bonade.structure.pojo.vo</b>
 * <br><b>ClassName:CompanyDepartmentStaffVo</b>
 * <br><b>Date:2020/9/8 15:04</b>
 */
public class CompanyDepartmentStaffVo {

    /**
     * 人员ID
     */
    private String staffOpenId;

    /**
     * 工号
     */
    private String jobNumber;

    /**
     * 姓名
     */
    private String staffOpenName;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 公司ID
     */
    private String companyId;

    /**
     * 企业名称
     */
    private String companyName;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 部门链路（后端使用）
     */
    private String departmentPath;

    /**
     * 岗位名称
     */
    private String postName;

    public String getStaffOpenId() {
        return staffOpenId;
    }

    public void setStaffOpenId(String staffOpenId) {
        this.staffOpenId = staffOpenId;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getStaffOpenName() {
        return staffOpenName;
    }

    public void setStaffOpenName(String staffOpenName) {
        this.staffOpenName = staffOpenName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentPath() {
        return departmentPath;
    }

    public void setDepartmentPath(String departmentPath) {
        this.departmentPath = departmentPath;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }
}
