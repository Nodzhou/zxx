package com.bonade.sdk.opencenter.dto.CompanyInfoDto;

import com.bonade.sdk.opencenter.vo.BaseExtendVo;
import com.bonade.sdk.opencenter.vo.ImgFileVo;
import com.bonade.sdk.opencenter.vo.PageInfo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/*** 企业信息管理Dto 实体
 * <b>Description:</b><br>
 *
 * @author nod
 * <b>ProjectName:</b> bonade-platform-opencenter
 * <br><b>PackageName:</b> com.bonade.sdk.opencenter.dto.CompanyInfoDto
 * <br><b>ClassName:</b>  CompanyNodeDto
 * <br><b>Date:</b> 2020/8/26 20:30
 */
public class CompanyChildrenNodeDto<T extends BaseExtendVo> implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 
	 * 根级企业ID,只查询该企业以及该企业的下级企业
	 */
	private String rootCompanyId;
	/** 
	 * 模糊查询
	 */
	private String companyName;
	/** 
	 * 查询第几页
	 */
	private Integer pageNow;
	/** 
	 * 每页查询多少条数据
	 */
	private Integer pageSize;
	public String getRootCompanyId() {
		return rootCompanyId;
	}
	public void setRootCompanyId(String rootCompanyId) {
		this.rootCompanyId = rootCompanyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Integer getPageNow() {
		return pageNow;
	}
	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	

}
