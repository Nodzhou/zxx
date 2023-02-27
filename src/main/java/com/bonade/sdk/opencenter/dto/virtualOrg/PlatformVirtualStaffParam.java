package com.bonade.sdk.opencenter.dto.virtualOrg;

import java.util.List;

/**
 * @author zhangbeiping
 * <b>Description:中台—虚拟组织成员（新增和删除操作参数）</b><br>
 * <b>ProjectName:bonade-platform-structure</b>
 * <br><b>PackageName:com.bonade.structure.pojo.vo</b>
 * <br><b>ClassName:PlatformVirtualStaffParam</b>
 * <br><b>Date:2020/9/4 10:54</b>
 */
public class PlatformVirtualStaffParam {

    /**
     * 虚拟组织ID(作用于新增)
     */
    private String virtualOrgId;

    /**
     * 员工id(作用于新增)
     */
    private List<String> staffOpenIds;

    /**
     * 虚拟组织成员表ID（作用于删除）
     */
    private List<String> ids;

    public String getVirtualOrgId() {
        return virtualOrgId;
    }

    public void setVirtualOrgId(String virtualOrgId) {
        this.virtualOrgId = virtualOrgId;
    }

    public List<String> getStaffOpenIds() {
        return staffOpenIds;
    }

    public void setStaffOpenIds(List<String> staffOpenIds) {
        this.staffOpenIds = staffOpenIds;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }
}
