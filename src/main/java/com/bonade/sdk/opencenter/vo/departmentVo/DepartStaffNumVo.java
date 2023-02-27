package com.bonade.sdk.opencenter.vo.departmentVo;

import java.io.Serializable;

/**
 * <b>Description:</b> 企业下部门员工数量vo <br>
 * @author: biyizhuo
 * @version 1.0
 * <b>ProjectName:</b> open-center-sdk
 * <br><b>PackageName:</b> com.bonade.sdk.opencenter.vo
 * <br><b>ClassName:</b> com.bonade.sdk.opencenter.vo.DepartmentVo.DepartStaffNumVo
 * <br><b>Date:</b> 2020/7/25
 */
public class DepartStaffNumVo implements Serializable {

    /**
     * 员工数量
     */
    private Integer realMemberCount;

    /**
     * 部门Id
     */
    private String departmentId;

    public Integer getRealMemberCount() {
        return realMemberCount;
    }

    public void setRealMemberCount(Integer realMemberCount) {
        this.realMemberCount = realMemberCount;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
}
