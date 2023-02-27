package com.bonade.sdk.opencenter.dto.user;

import com.bonade.sdk.opencenter.dto.BaseExtendDto;


import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息入参封装数据
 *
 * @author yw
 */
public class PlatformUserInfoDto<T extends BaseExtendDto> implements Serializable {
     private static final long serialVersionUID = 1L;

     /**
      * 用户id(新增不允许传id)
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
      * 头像(相对路径)
      */

     private String avatar;
     /**
      * 出生日期
      */
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
      * 创建人Id
      */

     private String createId;

     /**
      * 修改人Id
      */

     private String updateId;

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

    /**
     * 用户密码
     */
    private String password;

    /**
     * 	公钥
     */
    private String publicKey;

     public PlatformUserInfoDto() {
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


     public String getCreateId() {
          return createId;
     }


     public void setCreateId(String createId) {
          this.createId = createId;
     }

     public String getUpdateId() {
          return updateId;
     }


     public void setUpdateId(String updateId) {
          this.updateId = updateId;
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

    public String getPassword() {
        return password;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setExtendUser(T extendUser) {
          this.extendUser = extendUser;
     }

}
