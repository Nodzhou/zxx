package com.bonade.sdk.opencenter.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: nod
 */
public class PlatformUnionStaffDepart implements Serializable {
    /**
     * 关联ID的主键
     */
    private String id;

    /**
     * 员工ID
     */
    private String staffId;

    /**
     * 部门ID
     */
    private String departmentId;

    /**
     * 岗位ID
     */
    private String positionId;

    /**
     * client ID
     */
    private String clientId;
    /**
     * 创建时间
     */
    Date createTime;
    /**
     * 修改时间
     */
    Date updateTime;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }
}
