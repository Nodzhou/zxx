package com.bonade.sdk.opencenter.dto.virtualOrg;

/**
 * @author zhangbeiping
 * <b>Description:中台—虚拟组织负责人扩展信息虚拟类</b><br>
 * <b>ProjectName:bonade-platform-structure</b>
 * <br><b>PackageName:com.bonade.structure.pojo.vo</b>
 * <br><b>ClassName:PlatformVirtualLeaderVO</b>
 * <br><b>Date:2020/9/3 16:45</b>
 */
public class PlatformVirtualLeaderVo extends PlatformVirtualLeaderInfo {

    /**
     * 工号
     */
    private String jobNumber;

    /**
     * 负责人名称
     */
    private String staffOpenName;

    /**
     * 负责人公司ID
     */
    private String companyId;

    /**
     * 负责人公司名称
     */
    private String companyName;

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
}
