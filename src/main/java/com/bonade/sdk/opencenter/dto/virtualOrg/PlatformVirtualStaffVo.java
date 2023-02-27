package com.bonade.sdk.opencenter.dto.virtualOrg;

/**
 * @author zhangbeiping
 * <b>Description:中台—虚拟组织成员扩展虚拟类</b><br>
 * <b>ProjectName:bonade-platform-structure</b>
 * <br><b>PackageName:com.bonade.structure.pojo.vo</b>
 * <br><b>ClassName:PlatformVirtualStaffVo</b>
 * <br><b>Date:2020/9/4 11:19</b>
 */
public class PlatformVirtualStaffVo extends PlatformVirtualStaffInfo {

    /**
     * 工号
     */
    private String jobNumber;

    /**
     * 姓名
     */
    private String staffOpenName;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 用户id
     */
    private String openId;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 公司名称
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

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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

    @Override
    public String toString() {
        return "PlatformVirtualStaffVo{" +
                "jobNumber='" + jobNumber + '\'' +
                ", staffOpenName='" + staffOpenName + '\'' +
                ", avatar='" + avatar + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", companyName='" + companyName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", departmentPath='" + departmentPath + '\'' +
                ", postName='" + postName + '\'' +
                '}';
    }
}
