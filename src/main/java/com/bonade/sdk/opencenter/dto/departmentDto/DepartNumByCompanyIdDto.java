package com.bonade.sdk.opencenter.dto.departmentDto;


import java.io.Serializable;
import java.util.List;

/**
 * @author wumengxuan
 * <b>Description:</b>DepartNumByCompanyId接口专用dto<br>
 * <b>ProjectName:bonade-platform-opencenter</b>
 * <br><b>PackageName:com.bonade.opencenter.pojo.dto</b>
 * <br><b>ClassName:DepartNumByCompanyIdDto</b>
 * <br><b>Date:2020/8/10 14:38</b>
 */
public class DepartNumByCompanyIdDto implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 部门id集合
     */
    List<String> departmentIds;
    /**
     * 企业id
     */
    String companyId;

    public DepartNumByCompanyIdDto() {
    }

    public DepartNumByCompanyIdDto(List<String> departmentIds, String companyId) {
        this.departmentIds = departmentIds;
        this.companyId = companyId;
    }

    public List<String> getDepartmentIds() {
        return departmentIds;
    }

    public void setDepartmentIds(List<String> departmentIds) {
        this.departmentIds = departmentIds;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
