package com.bonade.sdk.opencenter.vo;


import com.alibaba.fastjson.annotation.JSONField;
import com.bonade.sdk.opencenter.dto.BaseExtendDto;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * @author: fsw
 * <b>Description:</b><br>
 * <b>ProjectName:</b> sdk
 * <br><b>PackageName:</b>com.bonade.sdk.opencenter.vo
 * <br><b>ClassName:</b> PlatformStaffInfoVo
 * <br><b>Date:</b> 2020/8/10 16:15
 */
public class PlatformStaffInfoVo<T extends BaseExtendDto> implements Serializable {

    /**
     * 员工ID
     */
    private String id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 企业ID
     */
    private String companyId;

    /**
     * 入职企业时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date employmentDate;

    /**
     * 员工状态
     */
    private Integer status;

    /**
     * 是否为主体企业（0：否，1：是）
     */
    private Integer isMainCompany;

    /**
     * 转正时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date conversionDate;

    /**
     * 离职时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date dateLeft;

    /**
     * 工号
     */
    private String jobNumber;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户手机号码
     */
    private String phoneNumber;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 性别（0：未知，1：男，2：女）
     */
    private Integer gender;

    /**
     * 用户生日
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;

    /**
     * 证件号码
     */
    private String certificateCard;

    /**
     * 证件类型（1、身份证，2、护照、3、回乡证，4、台胞证，9、其他 ）
     */
    private Integer certificateType;

    /**
     * 是否实名（0未实名，1已实名）
     */
    private Integer isCertificated;

    /**
     * 企业名称
     */
    private String companyName;

    /**
     * 顶级企业ID
     */
    private String rootCompanyId;

    /**
     * 部门ID
     */
    private String departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 部门类型（0：内部部门， 1：外部部门）
     */
    private Integer departmentType;

    /**
     * 岗位ID
     */
    private String positionId;

    /**
     * 岗位名称
     */
    private String positionName;

    /**
     * 每条业务线的扩展类
     */
    private T extendStaff;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsMainCompany() {
        return isMainCompany;
    }

    public void setIsMainCompany(Integer isMainCompany) {
        this.isMainCompany = isMainCompany;
    }

    public Date getConversionDate() {
        return conversionDate;
    }

    public void setConversionDate(Date conversionDate) {
        this.conversionDate = conversionDate;
    }

    public Date getDateLeft() {
        return dateLeft;
    }

    public void setDateLeft(Date dateLeft) {
        this.dateLeft = dateLeft;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCertificateCard() {
        return certificateCard;
    }

    public void setCertificateCard(String certificateCard) {
        this.certificateCard = certificateCard;
    }

    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    public Integer getIsCertificated() {
        return isCertificated;
    }

    public void setIsCertificated(Integer isCertificated) {
        this.isCertificated = isCertificated;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRootCompanyId() {
        return rootCompanyId;
    }

    public void setRootCompanyId(String rootCompanyId) {
        this.rootCompanyId = rootCompanyId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

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

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public T getExtendStaff() {
        return extendStaff;
    }

    public void setExtendStaff(T extendStaff) {
        this.extendStaff = extendStaff;
    }
}
