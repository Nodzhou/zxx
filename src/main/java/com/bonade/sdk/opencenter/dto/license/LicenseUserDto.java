package com.bonade.sdk.opencenter.dto.license;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author: yw

 * <br><b>ClassName:</b> LicenseUserDto
 * <br><b>Date:</b> 2021/2/1 18:21
 */
public class LicenseUserDto {

    /**
     * 授权详情id
     */
    private Integer licenseDetailsId;

    /**
     * 用户id
     */
    private String openId;

    /**
     * 授权时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date licenseTime;



    public Integer getLicenseDetailsId() {
        return licenseDetailsId;
    }

    public void setLicenseDetailsId(Integer licenseDetailsId) {
        this.licenseDetailsId = licenseDetailsId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getLicenseTime() {
        return licenseTime;
    }

    public void setLicenseTime(Date licenseTime) {
        this.licenseTime = licenseTime;
    }

}
