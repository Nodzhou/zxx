package com.bonade.sdk.opencenter.vo.unionstaffdepart;

import java.io.Serializable;

/**
 * @author wumengxuan
 * <b>Description:</b><br>
 * <b>ProjectName:open-center-sdk</b>
 * <br><b>PackageName:com.bonade.sdk.opencenter.vo.unionstaffdepart</b>
 * <br><b>ClassName:UnionStaffDepartVo</b>
 * <br><b>Date:2020/8/13 16:15</b>
 */
public class UnionStaffDepartVo implements Serializable {
    private static final long serialVersionUID = 1L;
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

    public UnionStaffDepartVo() {
    }

    public UnionStaffDepartVo(String id, String staffId, String departmentId, String positionId) {
        this.id = id;
        this.staffId = staffId;
        this.departmentId = departmentId;
        this.positionId = positionId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
