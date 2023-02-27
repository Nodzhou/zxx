package com.bonade.sdk.opencenter.vo;

import java.io.Serializable;

/**
* <b>Description:图片上传VO</b><br> 
* @author Dell 
* @version 1.0
* <b>ProjectName:</b> open-center-sdk
* <br><b>PackageName:</b> com.bonade.sdk.opencenter.vo
* <br><b>ClassName:</b> ImgFileVo
* <br><b>Date:</b> 2020年7月21日 上午11:04:46
*/
public class ImgFileVo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/** 文件名称  */
	private String filename;
	/** 文件大小 */
	private String size;
	/** 宽 */
	private String width;
	/** 类型如 image/png  */
	private String mimeType;
	/** 路径 */
	private String url;
	/** 高 */
	private String height;
	
	/** 上传的类型   描述(类型)：  企业logo(compLog), 企业营业执照(credFile1), 授权委托书(credFile2), 法人身份证正面(credFile3),
	法人身份证反面(credFile4), 手持法人身份证照片(credFile5), 票据(billFile) */
	private String imgField;
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getMimeType() {
		return mimeType;
	}
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getImgField() {
		return imgField;
	}
	public void setImgField(String imgField) {
		this.imgField = imgField;
	}

}
