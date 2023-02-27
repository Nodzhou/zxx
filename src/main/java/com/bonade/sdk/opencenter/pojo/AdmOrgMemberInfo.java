package com.bonade.sdk.opencenter.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * <b>Description: 行政组织成员实体类</b><br>
 * 
 * @author ShawnTang
 * @version 1.0 <b>ProjectName:</b> bonade-platform-simp-opencenter <br>
 *          <b>PackageName:</b> com.bonade.simp.opencenter.pojo <br>
 *          <b>ClassName:</b> AdmOrgMemberInfo <br>
 *          <b>Date:</b> 2020年12月19日
 */
public class AdmOrgMemberInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	private String id;

	/**
	 * 行政组织id
	 */
	private String virtualOrgId;

	/**
	 * 员工id
	 */
	private String staffOpenId;

	/**
	 * openId
	 */
	private String openId;

	/**
	 * 成员名称
	 */
	private String memberName;

	/**
	 * 手机号
	 */
	private String phoneNumber;

	/**
	 * 昵称
	 */
	private String nickname;

	/**
	 * 工号
	 */
	private String jobNumber;

	/**
	 * 头像
	 */
	private String avatar;

	/**
	 * 成员状态(1：激活，0：禁用)
	 */
	private Integer status;

	/**
	 * 员工属性(1:普通员工 2:顾问)
	 */
	private Integer type;

	/**
	 * 操作资源id
	 */
	private String clientId;

	private String createId;

	private String createUser;

	private Date createTime;

	private String updateId;

	private String updateUser;

	private Date updateTime;

	public AdmOrgMemberInfo(String id, String virtualOrgId, String staffOpenId, String openId, String memberName,
                            String phoneNumber, String nickname, String jobNumber, String avatar, Integer status, Integer type,
                            String clientId, String createId, String createUser, Date createTime, String updateId, String updateUser,
                            Date updateTime) {
		this.id = id;
		this.virtualOrgId = virtualOrgId;
		this.staffOpenId = staffOpenId;
		this.openId = openId;
		this.memberName = memberName;
		this.phoneNumber = phoneNumber;
		this.nickname = nickname;
		this.jobNumber = jobNumber;
		this.avatar = avatar;
		this.status = status;
		this.type = type;
		this.clientId = clientId;
		this.createId = createId;
		this.createUser = createUser;
		this.createTime = createTime;
		this.updateId = updateId;
		this.updateUser = updateUser;
		this.updateTime = updateTime;
	}

	public AdmOrgMemberInfo() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getVirtualOrgId() {
		return virtualOrgId;
	}

	public void setVirtualOrgId(String virtualOrgId) {
		this.virtualOrgId = virtualOrgId == null ? null : virtualOrgId.trim();
	}

	public String getStaffOpenId() {
		return staffOpenId;
	}

	public void setStaffOpenId(String staffOpenId) {
		this.staffOpenId = staffOpenId == null ? null : staffOpenId.trim();
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId == null ? null : openId.trim();
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName == null ? null : memberName.trim();
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname == null ? null : nickname.trim();
	}

	public String getJobNumber() {
		return jobNumber;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber == null ? null : jobNumber.trim();
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar == null ? null : avatar.trim();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId == null ? null : clientId.trim();
	}

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId == null ? null : createId.trim();
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser == null ? null : createUser.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateId() {
		return updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId == null ? null : updateId.trim();
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser == null ? null : updateUser.trim();
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "AdmOrgMemberInfo [id=" + id + ", virtualOrgId=" + virtualOrgId + ", staffOpenId=" + staffOpenId
				+ ", openId=" + openId + ", memberName=" + memberName + ", phoneNumber=" + phoneNumber + ", nickname="
				+ nickname + ", jobNumber=" + jobNumber + ", avatar=" + avatar + ", status=" + status + ", type=" + type
				+ ", clientId=" + clientId + ", createId=" + createId + ", createUser=" + createUser + ", createTime="
				+ createTime + ", updateId=" + updateId + ", updateUser=" + updateUser + ", updateTime=" + updateTime
				+ "]";
	}

}