package com.bonade.sdk.opencenter.dto.roleinfo;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>Description:</b><br>
 *
 * @author jdocer
 * @version 1.0
 * <b>ProjectName:</b>
 * <br><b>PackageName:</b>
 * <br><b>ClassName:</b>
 * <br><b>Date:</b>
 */

public class EosRoleInfoDto<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 中台角色id
     */
    private String roleOpenId;
    /**
     * 企业id
     */
    private String companyOpenId;

    /**
     * 中台角色父级id
     */
    private String parentRoleOpenId;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 角色描述
     */
    private String roleDesc;
    /**
     * 状态 1-激活，-1删除, 2-停用，3.申请中, 4.申请不通过, 5.申请撤回
     */
    private Integer status;

    /**
     * 角色编码
     */
    private String roleCode;

    /**
     * 角色类型：0-超级管理员，1-运营商，2-企业管理员,3-普通员工，10-通用角色
     */
    private Integer roleType;

    /**
     * 角色标签
     */
    private String roleTag;

    /**
     * 角色有效期止
     */
    private Date roleValidityPeriod;

    /**
     * 角色有效期起
     */
    private Date roleValidityStart;

    /**
     * 角色部分的扩展字段
     */
    private T extendRoleInfo;

    public String getRoleOpenId() {
        return roleOpenId;
    }

    public void setRoleOpenId(String roleOpenId) {
        this.roleOpenId = roleOpenId;
    }

    public String getCompanyOpenId() {
        return companyOpenId;
    }

    public void setCompanyOpenId(String companyOpenId) {
        this.companyOpenId = companyOpenId;
    }

    public String getParentRoleOpenId() {
        return parentRoleOpenId;
    }

    public void setParentRoleOpenId(String parentRoleOpenId) {
        this.parentRoleOpenId = parentRoleOpenId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    public String getRoleTag() {
        return roleTag;
    }

    public void setRoleTag(String roleTag) {
        this.roleTag = roleTag;
    }

    public Date getRoleValidityPeriod() {
        return roleValidityPeriod;
    }

    public void setRoleValidityPeriod(Date roleValidityPeriod) {
        this.roleValidityPeriod = roleValidityPeriod;
    }

    public Date getRoleValidityStart() {
        return roleValidityStart;
    }

    public void setRoleValidityStart(Date roleValidityStart) {
        this.roleValidityStart = roleValidityStart;
    }

    public T getExtendRoleInfo() {
        return extendRoleInfo;
    }

    public void setExtendRoleInfo(T extendRoleInfo) {
        this.extendRoleInfo = extendRoleInfo;
    }

    @Override
    public String toString() {
        return "EosRoleInfoDto{" +
                "roleOpenId='" + roleOpenId + '\'' +
                ", companyOpenId='" + companyOpenId + '\'' +
                ", parentRoleOpenId='" + parentRoleOpenId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", status=" + status +
                ", roleCode='" + roleCode + '\'' +
                ", roleType=" + roleType +
                ", roleTag='" + roleTag + '\'' +
                ", roleValidityPeriod=" + roleValidityPeriod +
                ", roleValidityStart=" + roleValidityStart +
                ", extendRoleInfo=" + extendRoleInfo +
                '}';
    }
}
