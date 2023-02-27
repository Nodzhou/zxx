package com.bonade.sdk.opencenter.dto.departmentDto;

import java.io.Serializable;
import java.util.List;

/**
 * <b>Description:</b> 批量添加或删除部门领导人dto <br>
 *
 * @author: biyizhuo
 * <b>ProjectName:</b> open-center-sdk
 * <br><b>PackageName:</b>com.bonade.sdk.opencenter.dto.departmentDto
 * <br><b>ClassName:</b> InsertOrDeleteDepartmentLeaderDto
 * <br><b>Date:</b> 2020/8/19 17:43
 */
public class InsertOrDeleteDepartmentLeaderDto implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 员工ids
     */
    private List<String> staffIds;

    /**
     * 部门id
     */
    private String departmentId;

    public List<String> getStaffIds() {
        return staffIds;
    }

    public void setStaffIds(List<String> staffIds) {
        this.staffIds = staffIds;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
}
