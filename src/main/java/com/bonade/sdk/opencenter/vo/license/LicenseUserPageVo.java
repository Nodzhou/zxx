package com.bonade.sdk.opencenter.vo.license;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: yw
 */

public class LicenseUserPageVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 授权详情id
     */
    private Integer licenseDetailsId;

    /**
     * 电话号码
     */
    private String phoneNumber;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 授权时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date licenseTime;


    public void setLicenseDetailsId(Integer licenseDetailsId) {
        this.licenseDetailsId = licenseDetailsId;
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

    public Date getLicenseTime() {
        return licenseTime;
    }

    public void setLicenseTime(Date licenseTime) {
        this.licenseTime = licenseTime;
    }
}
