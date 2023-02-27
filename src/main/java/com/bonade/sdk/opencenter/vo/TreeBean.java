package com.bonade.sdk.opencenter.vo;

/**
 * author: chd
 * date: 2020/7/6 14:25
 */
public class TreeBean {
    /**
     * 树节点id
     */
    private String nodeId;

    /**
     * 树父节点id
     */
    private String parentNodeId;

    /**
     * 预留字段（暂未使用）
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
