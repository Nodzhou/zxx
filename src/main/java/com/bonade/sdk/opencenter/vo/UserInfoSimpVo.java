package com.bonade.sdk.opencenter.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;


public class UserInfoSimpVo {

    private static final long serialVersionUID = 1L;

    /**
     * 第三方系统用户在平台的唯一ID
     */
    private String openId;

    /**
     * 用户姓名
     */
    private String username;

    /**
     * (1:男,2:女,0:未知)
     */
    private Integer gender;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 证件类型 1、身份证，2、护照、3、回乡证，4、台胞证，9、其他
     */
    private Integer certificateType;

    /**
     * 证件号码
     */
    private String certificateCard;

    /**
     * 邮件
     */
    private String email;

    /**
     * 用户来源
     */
    private String userFrom;

    /**
     * 用户状态 1-激活，-1删除, 2-停用
     */
    private Integer status;

    /**
     * 注册时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date registerTime;

    /**
     * 是否已实名,0未实名，1已实名
     */
    private Integer isCertificated;

    /**
     * 实名来源
     */
    private String realNameFrom;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 出生日期
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;

    /**
     * 注册IP地址
     */
    private String registerIpaddress;

    /**
     * 民族
     */
    private String nation;

    /**
     * 身份证地址
     */
    private String certificateCardAddress;

    /**
     * 籍贯
     */
    private String ancestral;

    /**
     * 用户昵称
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private String nickName;

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
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String areaName;

    /**
     * 城市编码
     */
    private String areas;

    /**
     * 人脸图片
     */
    private String userPhotoAddress;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateCard() {
        return certificateCard;
    }

    public void setCertificateCard(String certificateCard) {
        this.certificateCard = certificateCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Integer getIsCertificated() {
        return isCertificated;
    }

    public void setIsCertificated(Integer isCertificated) {
        this.isCertificated = isCertificated;
    }

    public String getRealNameFrom() {
        return realNameFrom;
    }

    public void setRealNameFrom(String realNameFrom) {
        this.realNameFrom = realNameFrom;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getRegisterIpaddress() {
        return registerIpaddress;
    }

    public void setRegisterIpaddress(String registerIpaddress) {
        this.registerIpaddress = registerIpaddress;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getCertificateCardAddress() {
        return certificateCardAddress;
    }

    public void setCertificateCardAddress(String certificateCardAddress) {
        this.certificateCardAddress = certificateCardAddress;
    }

    public String getAncestral() {
        return ancestral;
    }

    public void setAncestral(String ancestral) {
        this.ancestral = ancestral;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas;
    }

    public String getUserPhotoAddress() {
        return userPhotoAddress;
    }

    public void setUserPhotoAddress(String userPhotoAddress) {
        this.userPhotoAddress = userPhotoAddress;
    }
}
