package com.bonade.sdk.opencenter.pojo;


import java.io.Serializable;
import java.util.Date;

/**
 * 角色模型
 *
 * @author pengjie
 */

public class EosRoleInfo<T> implements Serializable {

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
     * 创建时间，yyyy-mm-dd hh:mm:ss
     */
    private String createTime;
    /**
     * 创建人id，客户端传入
     */
    private String createId;
    /**
     * 创建人姓名，客户端传入
     */
    private String createName;
    /**
     * 创建人类型 1:中控  2:企业中心  3:业务线
     */
    private Integer createType;
    /**
     * 修改时间，yyyy-mm-dd hh:mi:ss
     */
    private String updateTime;
    /**
     * 修改人id，客户端传入
     */
    private String updateId;
    /**
     * 修改人姓名，客户端传入
     */
    private String updateName;
    /**
     * 修改人类型 1:中控  2:企业中心  3:业务线
     */
    private Integer updateType;

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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Integer getCreateType() {
        return createType;
    }

    public void setCreateType(Integer createType) {
        this.createType = createType;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public Integer getUpdateType() {
        return updateType;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
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
        return "EosRoleInfo{" +
                "roleOpenId='" + roleOpenId + '\'' +
                ", companyOpenId='" + companyOpenId + '\'' +
                ", parentRoleOpenId='" + parentRoleOpenId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", status=" + status +
                ", createTime='" + createTime + '\'' +
                ", createId='" + createId + '\'' +
                ", createName='" + createName + '\'' +
                ", createType=" + createType +
                ", updateTime='" + updateTime + '\'' +
                ", updateId='" + updateId + '\'' +
                ", updateName='" + updateName + '\'' +
                ", updateType=" + updateType +
                ", roleCode='" + roleCode + '\'' +
                ", roleType=" + roleType +
                ", roleTag='" + roleTag + '\'' +
                ", roleValidityPeriod=" + roleValidityPeriod +
                ", roleValidityStart=" + roleValidityStart +
                ", extendRoleInfo=" + extendRoleInfo +
                '}';
    }
}