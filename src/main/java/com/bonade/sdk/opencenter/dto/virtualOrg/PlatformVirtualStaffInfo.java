package com.bonade.sdk.opencenter.dto.virtualOrg;

import java.util.Date;

/**
 * @author zhangbeiping
 * <b>Description:中台—虚拟组织成员信息表</b><br>
 * <b>ProjectName:bonade-platform-structure</b>
 * <br><b>PackageName:com.bonade.structure.pojo</b>
 * <br><b>ClassName:PlatformVirtualStaffInfo</b>
 * <br><b>Date:2020/9/4 10:05</b>
 */
public class PlatformVirtualStaffInfo {

    /**
     * ID
     */
    private String id;

    /**
     * 虚拟组织ID
     */
    private String virtualOrgId;

    /**
     * 企业ID
     */
    private String companyId;

    /**
     * 员工id
     */
    private String staffOpenId;

    /**
     * 创建时间
     */
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVirtualOrgId() {
        return virtualOrgId;
    }

    public void setVirtualOrgId(String virtualOrgId) {
        this.virtualOrgId = virtualOrgId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getStaffOpenId() {
        return staffOpenId;
    }

    public void setStaffOpenId(String staffOpenId) {
        this.staffOpenId = staffOpenId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
