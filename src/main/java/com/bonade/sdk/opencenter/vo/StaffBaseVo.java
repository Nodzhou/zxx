package com.bonade.sdk.opencenter.vo;

/**
 * ;
 * import lombok.Data;
 * <p>
 * /**
 *
 * @author wumengxuan
 * <b>Description: 员工表基础信息展示</b><br>
 * <b>ProjectName:bonade-platform-opencenter</b>
 * <br><b>PackageName:com.bonade.opencenter.pojo.vo</b>
 * <br><b>ClassName:StaffBaseVo</b>
 * <br><b>Date:2020/9/26 15:20</b>
 */

public class StaffBaseVo {

    /**
     * 平台员工ID
     */
    private String staffOpenId;

    /**
     * 用户ID
     */
    private String openId;

    /**
     * 企业ID
     */
    private String companyId;

    /**
     * 员工来源
     */
    private String staffFrom;

    /**
     * 员工状态，1：激活，2：禁用，-2：离职，-1：删除
     */
    private Integer status;

    /**
     * 工号
     */
    private String jobNumber;

    /**
     * 是否兼职 0-否 1是
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

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getStaffFrom() {
        return staffFrom;
    }

    public void setStaffFrom(String staffFrom) {
        this.staffFrom = staffFrom;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
