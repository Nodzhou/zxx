package com.bonade.sdk.opencenter.dto.departmentDto;

import com.bonade.sdk.opencenter.dto.BaseExtendDto;

import java.io.Serializable;
import java.util.List;

/**
 * @author wumengxuan
 * <b>Description: 部门标记修改vo</b><br>
 * <b>ProjectName:open-center-sdk</b>
 * <br><b>PackageName:com.bonade.sdk.opencenter.dto</b>
 * <br><b>ClassName:PlatformDepartmentInfoDto</b>
 * <br><b>Date:2020/8/7 19:07</b>
 */
public class DepartmentInfoDto<T extends BaseExtendDto> implements Serializable{
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
     * 联系电话
     */
    private String telephone;

    /**
     * 描述
     */
    private String departmentDesc;


    /**
     * 部门状态
     */
    private Integer status;

    /**
     * 部门编码
     */
    private String departmentCode;

    /**
     * 部门类型(0内部部门 1外部部门)
     */
    private Integer departmentType;

    /**
     * 部门编制人数
     */
    private Integer departmentNumber;

    /**
     * 部门排序
     */
    private Integer departmentSort;

    /**
     * 部门负责人
     */
    private List<String> leaders;

    /**
     * 每条业务线的扩展类
     */
    private T extendDepartment;

    public T getExtendDepartment() {
        return extendDepartment;
    }

    public void setExtendDepartment(T extendDepartment) {
        this.extendDepartment = extendDepartment;
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

    public List<String> getLeaders() {
        return leaders;
    }

    public void setLeaders(List<String> leaders) {
        this.leaders = leaders;
    }
}
