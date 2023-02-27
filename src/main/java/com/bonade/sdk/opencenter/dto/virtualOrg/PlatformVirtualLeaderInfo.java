package com.bonade.sdk.opencenter.dto.virtualOrg;

import com.bonade.sdk.opencenter.dto.BaseExtendDto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhangbeiping
 * <b>Description:中台—虚拟组织负责人信息表</b><br>
 * <b>ProjectName:bonade-platform-structure</b>
 * <br><b>PackageName:com.bonade.structure.pojo</b>
 * <br><b>ClassName:PlatformVirtualLeaderInfo</b>
 * <br><b>Date:2020/9/3 16:36</b>
 */
public class PlatformVirtualLeaderInfo<T extends BaseExtendDto> implements Serializable {

    /**
     * ID
     */
    private String id;

    /**
     * 虚拟组织id
     */
    private String virtualOrgId;

    /**
     * 负责人ID
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
