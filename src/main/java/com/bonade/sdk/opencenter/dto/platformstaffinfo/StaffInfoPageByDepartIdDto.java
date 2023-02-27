package com.bonade.sdk.opencenter.dto.platformstaffinfo;


import com.bonade.sdk.opencenter.dto.BaseExtendDto;




import java.io.Serializable;
import java.util.Date;


/**
 * 	根据部门id分页获取该部门下在职员工信息
 *
 */
public class StaffInfoPageByDepartIdDto<T extends BaseExtendDto> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部门id
     */
    private String departmentId;

    /**
     * 查询第几页
     */
    private Integer pageNow;

    /**
     * 每页查询多少条数据
     */
    private Integer pageSize;

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
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
