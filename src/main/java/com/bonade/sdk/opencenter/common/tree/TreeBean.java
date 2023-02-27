package com.bonade.sdk.opencenter.common.tree;

/**
 * 
* <b>Description:</b>树结构的基类<br> 
* @author	lyx 
* @version 1.0
* <b>ProjectName:</b>	open-center-sdk
* <br><b>PackageName:</b>	com.bonade.sdk.opencenter.common.tree
* <br><b>ClassName:</b>	TreeBean
* <br><b>Date:</b>	2020年8月14日	上午11:16:59
 */
public class TreeBean {
	
	/**
	 * 当前节点Id
	 */
	private String nodeId;
	
	/**
	 * 父节点id
	 */
	private String parentNodeId;
	
	/**
	 * 是否选中(预留字段)
	 */
	private String checked;

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public void setParentNodeId(String parentNodeId) {
		this.parentNodeId = parentNodeId;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	public String getNodeId() {
		return this.nodeId;
	}

	public String getParentNodeId() {
		return this.parentNodeId;
	}

	public String getChecked() {
		return this.checked;
	}

}
