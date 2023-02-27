package com.bonade.sdk.opencenter.vo;

import java.io.Serializable;

/**
 * <b>Description:</b><br>
 * 
 * @author ShawnTang
 * @version 1.0 <b>ProjectName:</b> bonade-platform-simp-opencenter <br>
 *          <b>PackageName:</b> com.bonade.simp.opencenter.model.vo <br>
 *          <b>ClassName:</b> AdmOrgMemberInfoVo <br>
 *          <b>Date:</b> 2020年12月21日
 */
public class AdmOrgMemberInfoVo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键id,成员
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
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the virtualOrgId
	 */
	public String getVirtualOrgId() {
		return virtualOrgId;
	}

	/**
	 * @param virtualOrgId the virtualOrgId to set
	 */
	public void setVirtualOrgId(String virtualOrgId) {
		this.virtualOrgId = virtualOrgId;
	}

	/**
	 * @return the staffOpenId
	 */
	public String getStaffOpenId() {
		return staffOpenId;
	}

	/**
	 * @param staffOpenId the staffOpenId to set
	 */
	public void setStaffOpenId(String staffOpenId) {
		this.staffOpenId = staffOpenId;
	}

	/**
	 * @return the openId
	 */
	public String getOpenId() {
		return openId;
	}

	/**
	 * @param openId the openId to set
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * @param memberName the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the jobNumber
	 */
	public String getJobNumber() {
		return jobNumber;
	}

	/**
	 * @param jobNumber the jobNumber to set
	 */
	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}

	/**
	 * @return the avatar
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * @param avatar the avatar to set
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * <b>Description:</b><br>
	 * 
	 * @return <b>Author:</b> ShawnTang <br>
	 *         <b>Date:</b> 2020年12月21日 下午3:44:40 <br>
	 *         <b>Version:</b> 1.0
	 */
	@Override
	public String toString() {
		return "AdmOrgMemberInfoVo [id=" + id + ", virtualOrgId=" + virtualOrgId + ", staffOpenId=" + staffOpenId
				+ ", openId=" + openId + ", memberName=" + memberName + ", phoneNumber=" + phoneNumber + ", nickname="
				+ nickname + ", jobNumber=" + jobNumber + ", avatar=" + avatar + "]";
	}

}
