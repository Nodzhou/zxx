package com.bonade.sdk.opencenter.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * author: chd
 * date: 2020/7/6 14:32
 */
public class JobpositionTreeVo extends TreeBean{

    /**
     * 岗位名称
     */
    private String positionName;

    /**
     * 岗位描述
     */
    private String jobScope;

    /**
     * 岗位人数
     */
    private Integer total;

    /**
     * 子岗位属性
     */
    private List<JobpositionTreeVo> children = new ArrayList<>();

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<JobpositionTreeVo> getChildren() {
        return children;
    }

    public void setChildren(List<JobpositionTreeVo> children) {
        this.children = children;
    }

	public String getJobScope() {
		return jobScope;
	}

	public void setJobScope(String jobScope) {
		this.jobScope = jobScope;
	}
}
