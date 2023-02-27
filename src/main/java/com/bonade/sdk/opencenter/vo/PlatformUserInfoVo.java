package com.bonade.sdk.opencenter.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.bonade.sdk.opencenter.dto.BaseExtendDto;


import java.io.Serializable;
import java.util.Date;

/**
 * 用户出参对象
 *
 * @author yw
 */
public class PlatformUserInfoVo<T extends BaseExtendDto> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private String id;

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 用户性别 0:未知,1:男,2:女'
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
     * 邮箱
     */

    private String email;
    /**
     * 用户来源
     */
    private String userFrom;

    /**
     * "状态：1-激活，-1删除, 2-停用
     */

    private Integer status;

    /**
     * 是否实名,0-未实名，1-已实名
     */

    private Integer isCertificated;

    /**
     * 实名来源
     */

    private String realNameFrom;

    /**
     * 头像(相对路径)
     */

    private String avatar;
    /**
     * 出生日期
     */
    @JSONField(format = "yyyy-MM-dd")
    private Date birthday;

    /**
     * 身份证地址
     */

    private String certificateCardAddress;

    /**
     * 注册IP地址
     */

    private String registerIpaddress;

    /**
     * 民族
     */

    private String nation;
    /**
     * 籍贯
     */

    private String ancestral;


    /**
     * 用户扩展信息
     */
    private T extendUser;

    public PlatformUserInfoVo() {
    }


    public String getId() {
        return this.id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getUsername() {
        return this.username;
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
        return this.phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Integer getCertificateType() {
        return this.certificateType;
    }


    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }


    public String getCertificateCard() {
        return this.certificateCard;
    }


    public void setCertificateCard(String certificateCard) {
        this.certificateCard = certificateCard;
    }

    public String getEmail() {
        return this.email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getUserFrom() {
        return this.userFrom;
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


    public Integer getIsCertificated() {
        return this.isCertificated;
    }


    public void setIsCertificated(Integer isCertificated) {
        this.isCertificated = isCertificated;
    }


    public String getRealNameFrom() {
        return this.realNameFrom;
    }


    public void setRealNameFrom(String realNameFrom) {
        this.realNameFrom = realNameFrom;
    }


    public String getAvatar() {
        return this.avatar;
    }


    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getBirthday() {
        return this.birthday;
    }


    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    public String getCertificateCardAddress() {
        return this.certificateCardAddress;
    }


    public void setCertificateCardAddress(String certificateCardAddress) {
        this.certificateCardAddress = certificateCardAddress;
    }


    public String getRegisterIpaddress() {
        return this.registerIpaddress;
    }


    public void setRegisterIpaddress(String registerIpaddress) {
        this.registerIpaddress = registerIpaddress;
    }

    public String getNation() {
        return this.nation;
    }


    public void setNation(String nation) {
        this.nation = nation;
    }


    public String getAncestral() {
        return this.ancestral;
    }


    public void setAncestral(String ancestral) {
        this.ancestral = ancestral;
    }


    public T getExtendUser() {
        return extendUser;
    }


    public void setExtendUser(T extendUser) {
        this.extendUser = extendUser;
    }

}
