package com.bonade.sdk.opencenter.dto.departmentDto;

import com.bonade.sdk.opencenter.vo.PageInfo;

import java.io.Serializable;

/**
 * author: chd
 * date: 2020/6/29 18:25
 */
public class DepartmentPageDto extends PageInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 部门id
     */
    private String id;
    /**
     * 企业ID
     */
    private String companyId;
    /**
     * 部门名称
     */
    private String departmentName;
    /**
     * 部门状态
     */
    private Integer status;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


}
