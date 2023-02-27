package com.bonade.sdk.opencenter.pojo;



import com.alibaba.fastjson.annotation.JSONField;
import com.bonade.sdk.opencenter.vo.BaseExtendEntity;
import com.bonade.sdk.opencenter.vo.RoleVo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 员工信息表
 * @author fsw
 */
public class PlatformStaffInfo<T extends BaseExtendEntity> implements Serializable {

    private static final long serialVersionUID = 1L;

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
     * 企业名称
     */
    private String companyName;

    /**
     * 企业logo
     */
    private String companyLogo;

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
     *  岗位名称
     */
    private String positionName;

    /**
     *  手机号码
     */
    private String phoneNumber;

    /**
     * 登陆者名字
     */
    private String loginName;

    /**
     * 证件号码
     */
    private String identityCard;

    /**
     * 证件类型 1：身份证，2：护照、3：回乡证，4：台胞证，9：其他
     */
    private String certificateType;

    /**
     * 证件类型名称
     */
    private String certificateTypeName;

    /**
     * 是否在职，0-否，1-是
     */
    private String isNotLeft;

    /**
     * 入职日期下限
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date dateJoinStart;

    /**
     * 入职日期上限
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date dateJoinEnd;

    /**
     * 用户生日
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;

    /**
     * 角色数组
     */
    private List<RoleVo> roles;

    /**
     * 所属顶级集团企业id
     */
    private String blocId;

    /**
     * 集团企业体系父企业id
     */
    private String parentId;

    /**
     * 所属集团企业名称
     */
    private String blocName;

    /**
     * 顶级企业id
     */
    private String rootCompanyId;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户性别, 0：未知，1：男， 2：女
     */
    private Integer gender;

    /**
     * 角色id
     */
    private String roleId;

    /**
     * 用户来源
     */
    private String userFrom;

    /**
     * 是否新建员工 0：离职恢复在职，1：新建员工数据
     */
    private Integer isNewStaff;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 是否实名,0：未实名，1：已实名
     */
    private Integer isCertificated;

    /**
     * 部门类型，0：内部部门，1：外部部门
     */
    private Integer departmentType;

    /**
     * 员工来源
     */
    private String staffFrom;


    /**
     * 注册时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date registerTime;

    /**
     * 创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 更新时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * 员工在企业的入职日期
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date employmentDate;

    /**
     * 员工状态，1：激活，2：禁用，-2：离职，-1：删除
     */
    private Integer status;

    /**
     * 是否是主体企业, 0：否，1：是
     */
    private Integer isMainCompany;

    /**
     * 转正时间
     */
    private Date conversionDate;

    /**
     * 离职时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date dateLeft;

    /**
     * 创建人Id
     */
    private String createId;

    /**
     * 更新用户姓名
     */
    private String updateUser;

    /**
     * 创建用户姓名
     */
    private String createUser;

    /**
     * 修改人Id
     */
    private String updateId;

    /**
     * 工作地点
     */
    private String workPlace;

    /**
     * 工号
     */
    private String jobNumber;

    /**
     * 操作资源ClientID
     */
    private String clientId;

    /**
     * 标记
     */
    private String remark;

    /**
     * 每条业务线的扩展类
     */
    private T extendStaff;

    /**
     * HRM用户类型：1：普通用户，2：平台用户，3：企业用户，4：平台超管
     */
    private Integer type;

    /**
     * XFH平台类型 0：为平台 1：为企业
     */
    private Integer platform;


    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateTypeName() {
        return certificateTypeName;
    }

    public void setCertificateTypeName(String certificateTypeName) {
        this.certificateTypeName = certificateTypeName;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getIsNotLeft() {
        return isNotLeft;
    }

    public void setIsNotLeft(String isNotLeft) {
        this.isNotLeft = isNotLeft;
    }

    public Date getDateJoinStart() {
        return dateJoinStart;
    }

    public void setDateJoinStart(Date dateJoinStart) {
        this.dateJoinStart = dateJoinStart;
    }

    public Date getDateJoinEnd() {
        return dateJoinEnd;
    }

    public void setDateJoinEnd(Date dateJoinEnd) {
        this.dateJoinEnd = dateJoinEnd;
    }

    public List<RoleVo> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleVo> roles) {
        this.roles = roles;
    }

    public String getBlocId() {
        return blocId;
    }

    public void setBlocId(String blocId) {
        this.blocId = blocId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getBlocName() {
        return blocName;
    }

    public void setBlocName(String blocName) {
        this.blocName = blocName;
    }

    public String getRootCompanyId() {
        return rootCompanyId;
    }

    public void setRootCompanyId(String rootCompanyId) {
        this.rootCompanyId = rootCompanyId;
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

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom;
    }

    public Integer getIsNewStaff() {
        return isNewStaff;
    }

    public void setIsNewStaff(Integer isNewStaff) {
        this.isNewStaff = isNewStaff;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getIsCertificated() {
        return isCertificated;
    }

    public void setIsCertificated(Integer isCertificated) {
        this.isCertificated = isCertificated;
    }

    public Integer getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(Integer departmentType) {
        this.departmentType = departmentType;
    }


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


    public String getStaffFrom() {
        return staffFrom;
    }

    public void setStaffFrom(String staffFrom) {
        this.staffFrom = staffFrom;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public T getExtendStaff() {
        return extendStaff;
    }

    public void setExtendStaff(T extendStaff) {
        this.extendStaff = extendStaff;
    }


}
