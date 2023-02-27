package com.bonade.sdk.opencenter.common.tree;

/**
 * 
* <b>Description:</b>企业树结构出参<br> 
* @author	lyx 
* @version 1.0
* <b>ProjectName:</b>	open-center-sdk
* <br><b>PackageName:</b>	com.bonade.sdk.opencenter.common.tree
* <br><b>ClassName:</b>	CompanyTreeNode
* <br><b>Date:</b>	2020年8月14日	上午11:15:48
 */
public class CompanyTreeNode extends TreeBean {

	/**
	 * 企业名称
	 */
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
