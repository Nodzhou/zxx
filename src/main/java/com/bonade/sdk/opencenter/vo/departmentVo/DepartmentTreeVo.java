package com.bonade.sdk.opencenter.vo.departmentVo;

import com.bonade.sdk.opencenter.vo.TreeBean;

import java.util.ArrayList;
import java.util.List;

/**
 * 部门树实体
 * author: chd
 * date: 2020/7/6 14:26
 */
public class DepartmentTreeVo extends TreeBean {

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 部门类型(0内部部门 1外部部门)
     */
    private Integer departmentType;

    /**
     * 子部门属性
     */
    private List<DepartmentTreeVo> children = new ArrayList<>();

    /**
     * 部门总人数
     */
    private Integer total;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(Integer departmentType) {
        this.departmentType = departmentType;
    }

    public List<DepartmentTreeVo> getChildren() {
        return children;
    }

    public void setChildren(List<DepartmentTreeVo> children) {
        this.children = children;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
