package com.bonade.sdk.opencenter.dto.virtualOrg;

import com.bonade.sdk.opencenter.vo.PageInfo;

import java.util.List;

/**
 * @author zhangbeiping
 * <b>Description:获取企业或者部门人员实体</b><br>
 * <b>ProjectName:bonade-platform-structure</b>
 * <br><b>PackageName:com.bonade.structure.pojo.vo</b>
 * <br><b>ClassName:CompanyDepartmentStaffParam</b>
 * <br><b>Date:2020/9/8 14:26</b>
 */
public class CompanyDepartmentStaffParam extends PageInfo {

    /**
     * 关键字模糊查询（姓名，工号，手机号）
     */
    private String keyword;

    /**
     * 企业ID
     */
    private String companyId;

    /**
     * 部门ID
     */
    private String departmentId;

    /**
     * 部门集合ID（当前部门以及下级部门（后端使用））
     */
    private List<String> departmentIds;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public List<String> getDepartmentIds() {
        return departmentIds;
    }

    public void setDepartmentIds(List<String> departmentIds) {
        this.departmentIds = departmentIds;
    }
}
