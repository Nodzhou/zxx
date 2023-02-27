package com.bonade.sdk.opencenter.dto.oss;


import java.io.Serializable;

/**
 * 企业文件上传参数类
 *
 * @author: yw
 * <b>Description:</b><br>
 * <b>ProjectName:</b> open-center-sdk
 * <br><b>PackageName:</b>com.bonade.sdk.opencenter.dto.oss
 * <br><b>ClassName:</b> ImgFileCompanyDto
 * <br><b>Date:</b> 2020/8/18 17:49
 */
public class ImgFileCompanyDto implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 文件名字(必传)
     */
    private String fileName;
    /**
     * 企业id(必传)
     */
    private String companyId;
    /**
     * 第三方系统的文件路径(必传)
     */
    private String url;
    /**
     * 文件类型(必传)   1 :企业logo   2：企业营业执照,3:授权委托书,4:法人身份证正面,5:法人身份证反面 ,6:手持法人身份证照片 ,7:票据
     */
    private String type;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
