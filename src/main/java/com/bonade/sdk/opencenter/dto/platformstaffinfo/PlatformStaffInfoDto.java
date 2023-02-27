package com.bonade.sdk.opencenter.dto.platformstaffinfo;


import com.bonade.sdk.opencenter.dto.BaseExtendDto;




import java.io.Serializable;
import java.util.Date;


/**
 * 员工信息表
 *
 * @author fsw
 */
public class PlatformStaffInfoDto<T extends BaseExtendDto> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工Id
     */
    private String id;

    /**
     * 工号
     */
    private String jobNumber;

    /**
     * 用户Id
     */
    private String userId;

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 员工入职企业时间
     */
    private Date employmentDate;

    /**
     * 用户生日
     */
    private Date birthday;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 证件号码
     */
    private String certificateCard ;

    /**
     * 证件类型 1：身份证，2：护照、3：回乡证，4：台胞证，9：其他
     */
    private Integer certificateType;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户性别, 0：未知，1：男， 2：女
     */
    private Integer gender;

    /**
     * 企业Id
     */
    private String companyId;

    /**
     * 企业名称
     */
    private String companyName;

    /**
     * 部门Id
     */
    private String departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 岗位Id
     */
    private String positionId;

    /**
     * 岗位名称
     */
    private String positionName;


    /**
     * 用户密码
     */
    private String password;

    /**
     * 公钥
     */
    private String publicKey;


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

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public T getExtendStaff() {
        return extendStaff;
    }

    public void setExtendStaff(T extendStaff) {
        this.extendStaff = extendStaff;
    }
}
