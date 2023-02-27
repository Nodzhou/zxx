package com.bonade.sdk.opencenter.dto.jobposition;


import com.bonade.sdk.opencenter.vo.PageInfo;

/**
 * @author wumengxuan
 * <b>Description: 根据岗位id分页查询员工信息</b><br>
 * <b>ProjectName:bonade-platform-opencenter</b>
 * <br><b>PackageName:com.bonade.opencenter.pojo.dto</b>
 * <br><b>ClassName:PositionStaffPage</b>
 * <br><b>Date:2020/9/23 11:44</b>
 */
public class PositionStaffPageDto extends PageInfo {
    /**
     * 岗位id
     */
    private String positionId;
    /**
     * 员工姓名
     */
    private String userName;
    /**
     * 手机号
     */
    private String phoneNumber;
    /**
     * 证件号码
     */
    private String certificateCard;
    /**
     * 员工状态
     */
    private String status;

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
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

    public String getCertificateCard() {
        return certificateCard;
    }

    public void setCertificateCard(String certificateCard) {
        this.certificateCard = certificateCard;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
