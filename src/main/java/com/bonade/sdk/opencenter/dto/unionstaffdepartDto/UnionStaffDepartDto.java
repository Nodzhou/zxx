package com.bonade.sdk.opencenter.dto.unionstaffdepartDto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wumengxuan
 * <b>Description: 员工部门岗位中间表dto</b><br>
 * <b>ProjectName:open-center-sdk</b>
 * <br><b>PackageName:com.bonade.sdk.opencenter.dto</b>
 * <br><b>ClassName:unionStaffDepartDto</b>
 * <br><b>Date:2020/8/12 9:52</b>
 */
public class UnionStaffDepartDto implements Serializable {
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
