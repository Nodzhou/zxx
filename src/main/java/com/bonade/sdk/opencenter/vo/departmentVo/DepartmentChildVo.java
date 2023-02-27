package com.bonade.sdk.opencenter.vo.departmentVo;

import java.util.List;

/**
 * @author wumengxuan
 * <b>Description:保存子类集合的对象</b><br>
 * <b>ProjectName:bonade-platform-opencenter</b>
 * <br><b>PackageName:com.bonade.opencenter.pojo.vo</b>
 * <br><b>ClassName:DepartmentChildVo</b>
 * <br><b>Date:2020/8/6 9:58</b>
 */
public class DepartmentChildVo {
    /**
     * 部门id
     */
    private String id;
    /**
     * 部门名称
     */
    private String departmentName;
    /**
     * 部门类型 0内部部门 1外部部门
     */
    private String departmentType;
    /**
     * 部门人数
     */
    private Integer departmentNumber;
    /**
     * 负责人集合
     */
    private List<DepartmentLeaderVo> leaderList;
    /**
     * 父类id
     */
    private String parentId;
    /**
     * 部门描述
     */
    private String departmentDesc;

    /**
     * 部门编码
     */
    private String departmentCode;

    /**
     * 部门排序
     */
    private String departmentSort;
    /**
     * 子部门集合
     */
    private List<DepartmentChildVo> child;

    public DepartmentChildVo() {
    }



    public DepartmentChildVo(String id, String departmentName, String departmentType, Integer departmentNumber, List<DepartmentLeaderVo> leaderList, String parentId, List<DepartmentChildVo> child) {
        this.id = id;
        this.departmentName = departmentName;
        this.departmentType = departmentType;
        this.departmentNumber = departmentNumber;
        this.leaderList = leaderList;
        this.parentId = parentId;
        this.child = child;
    }

    public String getDepartmentDesc() {
        return departmentDesc;
    }

    public void setDepartmentDesc(String departmentDesc) {
        this.departmentDesc = departmentDesc;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentSort() {
        return departmentSort;
    }

    public void setDepartmentSort(String departmentSort) {
        this.departmentSort = departmentSort;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType;
    }

    public Integer getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(Integer departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public List<DepartmentLeaderVo> getLeaderList() {
        return leaderList;
    }

    public void setLeaderList(List<DepartmentLeaderVo> leaderList) {
        this.leaderList = leaderList;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<DepartmentChildVo> getChild() {
        return child;
    }

    public void setChild(List<DepartmentChildVo> child) {
        this.child = child;
    }
}
