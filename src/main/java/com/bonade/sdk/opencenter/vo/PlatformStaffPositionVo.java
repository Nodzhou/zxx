package com.bonade.sdk.opencenter.vo;



/**
 * @author wumengxuan
 * <b>Description: 根据岗位id分页擦好像员工信息</b><br>
 * <b>ProjectName:bonade-platform-opencenter</b>
 * <br><b>PackageName:com.bonade.opencenter.pojo.vo</b>
 * <br><b>ClassName:PlatformStaffPositionVo</b>
 * <br><b>Date:2020/9/23 11:26</b>
 */
public class PlatformStaffPositionVo {
    /**
     * 员工id
     */
    private String staffOpenId;
    /**
     * 用户id
     */
    private String openId;
    /**
     * 员工姓名
     */
    private String username;
    /**
     * 性别
     */
    private String gender;
    /**
     * 手机号
     */
    private String phoneNumber;
    /**
     * 部门id
     */
    private String departmentId;
    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 证件类型
     */
    private String certificateType;

    /**
     * 证件号码
     */
    private String certificateCard;

    /**
     * 员工来源
     */
    private String staffFrom;
    /**
     * 工号
     */
    private String jobNumber;
    /**
     * 是否兼职, 0 否，1 是
     */
    private String isPartTimeJob;

    public String getStaffOpenId() {
        return staffOpenId;
    }

    public void setStaffOpenId(String staffOpenId) {
        this.staffOpenId = staffOpenId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateCard() {
        return certificateCard;
    }

    public void setCertificateCard(String certificateCard) {
        this.certificateCard = certificateCard;
    }

    public String getStaffFrom() {
        return staffFrom;
    }

    public void setStaffFrom(String staffFrom) {
        this.staffFrom = staffFrom;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getIsPartTimeJob() {
        return isPartTimeJob;
    }

    public void setIsPartTimeJob(String isPartTimeJob) {
        this.isPartTimeJob = isPartTimeJob;
    }
}
