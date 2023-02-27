package com.bonade.sdk.opencenter.vo;

import com.alibaba.fastjson.annotation.JSONField;



import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * 用户信息vo
 *
 * @author yw
 */

public class UserInfoVo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /***
     * 用户id
     */
    private String id;

    /**
     * 用户名
     */
    private String username;
    /**
     * 用户头像
     */
    private String avatar;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 手机号码
     */
    private String phoneNumber;
    /**
     * 身份证号码
     */
    private String certificateCard;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 出生日期
     */
    @JSONField(format = "yyyy-MM-dd")
    private Date birthday;

    /**
     * 是否实名,0-未实名，1-已实名"
     */
    private Integer isCertificated;

    /**
     * 证件类型 1、身份证，2、护照、3、回乡证，4、台胞证，9、其他
     */
    private Integer certificateType;
    /**
     * 民族
     */
    private String nation;
    /**
     * 籍贯
     */
    private String ancestral;

    /**
     * 公司列表
     */
    private List<StaffInfoVo> companys;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getIsCertificated() {
        return isCertificated;
    }

    public void setIsCertificated(Integer isCertificated) {
        this.isCertificated = isCertificated;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    public String getAncestral() {
        return ancestral;
    }

    public void setAncestral(String ancestral) {
        this.ancestral = ancestral;
    }

    public List<StaffInfoVo> getCompanys() {
        return companys;
    }

    public void setCompanys(List<StaffInfoVo> companys) {
        this.companys = companys;
    }
}
