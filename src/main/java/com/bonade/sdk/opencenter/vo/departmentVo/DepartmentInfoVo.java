package com.bonade.sdk.opencenter.vo.departmentVo;

import com.bonade.sdk.opencenter.dto.BaseExtendDto;

import java.io.Serializable;
import java.util.List;

/**
 * <b>Description:</b> 部门vo <br>
 *
 * @author: biyizhuo
 * <b>ProjectName:</b> open-center-sdk
 * <br><b>PackageName:</b>com.bonade.sdk.opencenter.vo.DepartmentVo
 * <br><b>ClassName:</b> DepartmentInfoVo
 * <br><b>Date:</b> 2020/8/10 17:20
 */
public class DepartmentInfoVo<T extends BaseExtendDto> implements Serializable {

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
     * 上级部门Id
     */
    private String parentId;
    /**
     * 上级部门名称
     */
    private String parentName;
    /**
     * 联系电话
     */
    private String telephone;

    /**
     * 描述
     */
    private String departmentDesc;

    /**
     * 状态 1正常 2：禁用 -1:删除
     */
    private Integer status;

    /**
     * 部门编码
     */
    private String departmentCode;

    /**
     * 0内部部门 1外部部门
     */
    private Integer departmentType;

    /**
     * 部门人数
     */
    private Integer departmentNumber;

    /**
     * 部门排序
     */
    private Integer departmentSort;

    /**
     * 部门负责人集合
     */
    private List<com.bonade.sdk.opencenter.vo.departmentVo.DepartmentLeaderVo> leaderList;

    /**
     * 每个业务线扩展对象
     */
    private T extendDepartment;

    public T getExtendDepartment() {
        return extendDepartment;
    }

    public void setExtendDepartment(T extendDepartment) {
        this.extendDepartment = extendDepartment;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public List<com.bonade.sdk.opencenter.vo.departmentVo.DepartmentLeaderVo> getLeaderList() {
        return leaderList;
    }

    public void setLeaderList(List<com.bonade.sdk.opencenter.vo.departmentVo.DepartmentLeaderVo> leaderList) {
        this.leaderList = leaderList;
    }

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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDepartmentDesc() {
        return departmentDesc;
    }

    public void setDepartmentDesc(String departmentDesc) {
        this.departmentDesc = departmentDesc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public Integer getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(Integer departmentType) {
        this.departmentType = departmentType;
    }

    public Integer getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(Integer departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public Integer getDepartmentSort() {
        return departmentSort;
    }

    public void setDepartmentSort(Integer departmentSort) {
        this.departmentSort = departmentSort;
    }
}
