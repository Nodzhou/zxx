package com.bonade.sdk.opencenter.dto.virtualOrg;

import java.util.List;

/**
 * @author zhangbeiping
 * <b>Description:企业部门树</b><br>
 * <b>ProjectName:bonade-platform-structure</b>
 * <br><b>PackageName:com.bonade.structure.pojo.vo</b>
 * <br><b>ClassName:PlatformOrgTreeVo</b>
 * <br><b>Date:2020/9/7 18:58</b>
 */
public class PlatformOrgTreeVo {

    /**
     * ID
     */
    private String id;

    /**
     * 企业或者部门名称
     */
    private String name;

    /**
     * 0 ：不是集团，1 是集团,2:事业群
     */
    private Integer isGroup;

    /**
     * 0：企业，1：部门
     */
    private Integer dataType;

    /**
     * 上级ID
     */
    private String parentId;

    /**
     * 上级名称
     */
    private String parentName;

    /**
     * 人数
     */
    private Integer total;

    /**
     * 所属企业Id
     */
    private String companyId;

    /**
     * 0内部部门 1外部部门
     */
    private Integer departmentType;

    /**
     * 孩子树
     */
    private List<PlatformOrgTreeVo> children;

    //后端自己使用，前段不用管
    /**
     * 链路
     */
    private String path;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(Integer isGroup) {
        this.isGroup = isGroup;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Integer getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(Integer departmentType) {
        this.departmentType = departmentType;
    }

    public List<PlatformOrgTreeVo> getChildren() {
        return children;
    }

    public void setChildren(List<PlatformOrgTreeVo> children) {
        this.children = children;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
