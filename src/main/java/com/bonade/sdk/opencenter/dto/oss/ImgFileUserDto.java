package com.bonade.sdk.opencenter.dto.oss;


import java.io.Serializable;

/**
 * 用户文件上传参数类
 *
 * @author: yw
 * <b>Description:</b><br>
 * <b>ProjectName:</b> open-center-sdk
 * <br><b>PackageName:</b>com.bonade.sdk.opencenter.dto.oss
 * <br><b>ClassName:</b> ImgFileUserDto
 * <br><b>Date:</b> 2020/8/18 17:49
 */
public class ImgFileUserDto implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 文件名字(必传)
     */
    private String fileName;
    /**
     * 用户id(必传)
     */
    private String userId;

    /**
     * 第三方系统的文件路径(必传)
     */
    private String url;
    /**
     * 文件类型(必传) 1:表示身份证正面，2：表示身份证反面，3：表示头像
     */
    private Integer type;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
