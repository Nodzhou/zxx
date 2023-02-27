package com.bonade.sdk.opencenter.vo.departmentVo;


/**
 * @author wumengxuan
 * <b>Description:crm部门负责人信息表</b><br>
 * <b>ProjectName:bonade-platform-opencenter</b>
 * <br><b>PackageName:com.bonade.opencenter.pojo.crm.vo</b>
 * <br><b>ClassName:CRMDepartmentLeaderVo</b>
 * <br><b>Date:2020/8/6 11:29</b>
 */
public class DepartmentLeaderVo {
    /***
     *  员工id
     */
    String staffId;
    /**
     * 员工姓名
     */
    String staffName;
    /**
     * 用户id
     */
    String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
}
