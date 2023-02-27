package com.bonade.sdk.opencenter.common;

/**
 * 接口路径
 *
 * @author jimmy
 */
public class ApiPathConstant {

    /**
     * 获取应用层access_token
     */
    public static final String OAUTH_ACCESS_TOKEN = "/cgi-bin/oauth2-platform/access_token";

    /**
     * 刷新应用层refresh_token
     */
    public static final String OAUTH_REFRESH_TOKEN = "/cgi-bin/oauth2-platform/refresh_token";

    /**
     * 角色路径
     */
    public static class RoleInfo {

        /**
         * 角色新增
         */
        public static final String ROLE_INFO_ADD = "/cgi-bin/opencenter/openapi/biz/role/add";
        /**
         * 角色编辑
         */
        public static final String ROLE_INFO_EDIT = "/cgi-bin/opencenter/openapi/biz/role/edit";
        /**
         * 角色获取
         */
        public static final String ROLE_INFO_GET = "/cgi-bin/opencenter/openapi/biz/role/get";
        /**
         * 批量删除角色
         */
        public static final String ROLE_INFO_DELETE = "/cgi-bin/opencenter/openapi/biz/role/deleteByRoleIdBatch";
        /**
         * 角色分页
         */
        public static final String ROLE_INFO_LISTPAGE = "/cgi-bin/opencenter/openapi/biz/role/listRoleByPage";
        /**
         * 角色关联成员
         */
        public static final String ROLE_INFO_ADD_STAFFROLE = "/cgi-bin/opencenter/openapi/biz/role/addStaffRole";
        /**
         * 角色删除成员
         */
        public static final String ROLE_INFO_DELETE_STAFF_ROLE = "/cgi-bin/opencenter/openapi/biz/role/deleteStaffRole";
        /**
         * 角色分配功能权限
         */
        public static final String RESOURCE_INFO_ROLE_ACCREDIT = "/cgi-bin/opencenter/openapi/biz/resource/roleAccredit/v1_1";
    }

    /**
     * 资源路径
     */
    public static class ResourceInfo {
        /**
         * 资源新增
         */
        public static final String RESOURCE_INFO_ADD = "/cgi-bin/opencenter/openapi/biz/resource/addResource";
        /**
         * 资源编辑
         */
        public static final String RESOURCE_INFO_EDIT = "/cgi-bin/opencenter/openapi/biz/resource/editResource";
        /**
         * 资源删除
         */
        public static final String RESOURCE_INFO_DELETE = "/cgi-bin/opencenter/openapi/biz/resource/deleteResource";
        /**
         * 资源列表
         */
        public static final String RESOURCE_INFO_PAGE = "/cgi-bin/opencenter/openapi/biz/resource/listResourceByPage";
        /**
         * 资源获取
         */
        public static final String RESOURCE_INFO_GET = "/cgi-bin/opencenter/openapi/biz/resource/get";
    }

    public static class CompanyUrl {
        /**
         * 企业分页查询
         */
        public static final String COMPANY_FING_PAGE = "/cgi-bin/opencenter/openapi/company/findByPage";

        /**
         * 根据ID获取
         */
        public static final String COMPANY_GET_BY_ID = "/cgi-bin/opencenter/openapi/company/getById";

        /**
         * 企业新增
         */
        public static final String COMPANY_INSERT = "/cgi-bin/opencenter/openapi/company/insertCompanyInfo";

//        /**
//         * 企业新增 simp-opencenter
//         */
//        public static final String COMPANY_ADD = "/cgi-bin/simp-opencenter/openapi/platformCompanyInfo/insertCompanyInfo";

        /**
         * 企业修改
         */
        public static final String COMPANY_UPDATE = "/cgi-bin/opencenter/openapi/company/updateCompanyInfo";

//        /**
//         * 企业修改 simp-opencenter
//          */
//        public static final String COMPANY_EDIT = "/cgi-bin/simp-opencenter/openapi/platformCompanyInfo/updateCompanyInfo";

        /**
         * 企业修改
         */
        public static final String GETTREE_ALL = "/cgi-bin/opencenter/openapi/company/getTreeAll";

        /**
         * 企业名精确查找或根据企业信用代码查企业详情
         */
        public static final String COMPANY_INFO_EQUALS = "/cgi-bin/opencenter/openapi/company/findCompanyInfoEquals";
        /**
         * 企业名模糊查找
         */

        public static final String COMPANY_INFO_LIKE = "/cgi-bin/opencenter/openapi/company/findCompanyInfoLike";
        /**
         * 批量获取企业信息
         */
        public static final String COMPANY_INFO_IDS = "/cgi-bin/opencenter/openapi/company/findCompanyInfoIds";

        /**
         * 企业信息管理
         */
        public static final String COMPANY_INFO_CHILDREN_NODE = "/cgi-bin/opencenter/openapi/company/findCompanyInfoChildrenNode";
        /**
         * 实名企业新增
         */
        public static final String REAL_COMPANY_INSERT = "/cgi-bin/opencenter/openapi/company/insertRealCompanyInfo";

        public static final String COMPANY_VERIFICATE = "/cgi-bin/opencenter/openapi/company/verificateRealName";

    }

    public static class OauthUrl {
        public static final String LOGIN = "/cgi-bin/opencenter/openapi/oauth/login";
        public static final String CHKPWD = "/cgi-bin/opencenter/openapi/oauth/chkPwd";
        public static final String UPDATEPWD = "/cgi-bin/opencenter/openapi/oauth/updatePwd";

    }

    public static class DepartmentUrl {
        /**
         * 部门分页查询
         */
        public static final String DEPARTMENT_FIND_PAGE = "/cgi-bin/opencenter/openapi/ztSysDepartmentInfo/page";

        /**
         * 新增部门
         */
        public static final String DEPARTMENT_ADD = "/cgi-bin/opencenter/openapi/ztSysDepartmentInfo/add";
        /**
         * 编辑部门
         */
        public static final String DEPARTMENT_EDIT = "/cgi-bin/opencenter/openapi/ztSysDepartmentInfo/edit";
        /**
         * 删除部门
         */
        public static final String DEPARTMENT_DELETE = "/cgi-bin/opencenter/openapi/ztSysDepartmentInfo/delete";

        /**
         * 根据部门id查询单条记录
         */
        public static final String DEPARTMENT_GET = "/cgi-bin/opencenter/openapi/ztSysDepartmentInfo/get";

        /**
         * 查询部门信息，以树结构返回(查询企业的所有部门
         */
        public static final String DEPARTMENT_GETTREEALL = "/cgi-bin/opencenter/openapi/ztSysDepartmentInfo/getTreeAll";

        /**
         * 根据企业id和部门id查询部门下的部门id集合
         */
        public static final String DEPARTMENT_GETDEPARTMENTIDS = "/cgi-bin/opencenter/openapi/ztSysDepartmentInfo/getDepartmentIds";

        /**
         * 根据员工id查询部门信息
         */
        public static final String DEPARTMENT_GETDEPARTMENTBYSTAFFID = "/cgi-bin/opencenter/openapi/ztSysDepartmentInfo/getDepartmentByStaffId";

        /**
         * 根据企业id查询所有部门
         */
        public static final String DEPARTMENT_GETDEPARTBYCOMPANYID = "/cgi-bin/opencenter/openapi/ztSysDepartmentInfo/getDepartByCompanyId";

        /**
         * 根据企业ID查询每个部门下的人员数目
         */
        public static final String DEPARTMENT_GETDEPARTNUMBYCOMPANYID = "/cgi-bin/opencenter/openapi/ztSysDepartmentInfo/getDepartNumByCompanyId";

        /**
         * 根据企业ID查询每个部门下的人员数目
         */
        public static final String DEPARTMENT_GETDEPARTMENTCHILD = "/cgi-bin/opencenter/openapi/ztSysDepartmentInfo/getDepartmentChild";

        /**
         * 根据企业ID查询每个部门下的人员数目
         */
        public static final String DEPARTMENT_GETDEPARTMENTFATHER = "/cgi-bin/opencenter/openapi/ztSysDepartmentInfo/getDepartmentFather";

        /**
         * 根据企业ID查询子部门的id集合
         */
        public static final String DEPARTMENT_GETCHILDRENIDS = "/cgi-bin/opencenter/openapi/ztSysDepartmentInfo/getChildrenIds";

        /**
         * 根据企业ID查询 先不买树，详细信息
         */
        public static final String DEPARTMENT_GETTREEDETAILED = "/cgi-bin/opencenter/openapi/ztSysDepartmentInfo/getTreeDetailed";

        /**
         * 根据员工Ids和部门id批量插入部门负责人
         */
        public static final String DEPARTMENT_INSERTBATCHDEPARTMENTLEADER = "/cgi-bin/opencenter/openapi/ztSysDepartmentInfo/insertBatchDepartmentLeader";

        /**
         * 根据员工Ids和部门id批量删除部门负责人
         */
        public static final String DEPARTMENT_DELETEBATCHDEPARTMENTLEADER = "/cgi-bin/opencenter/openapi/ztSysDepartmentInfo/deleteBatchDepartmentLeader";
    }

    public static class JobPositionUrl {
        /**
         * 新增岗位
         */
        public static final String JOBPOSITION_ADD = "/cgi-bin/opencenter/openapi/ztSysJobPosition/addJobPosition";

        /**
         * 编辑岗位
         */
        public static final String JOBPOSITION_EDIT = "/cgi-bin/opencenter/openapi/ztSysJobPosition/editJobPosition";
        /**
         * 根据id查询岗位数据
         */
        public static final String JOBPOSITION_GET = "/cgi-bin/opencenter/openapi/ztSysJobPosition/getJobPositionById";
        /**
         * 根据岗位id删除(包含所有下级, 如果员工关联岗位会打回),多条记录用逗号分隔
         */
        public static final String JOBPOSITION_DELETE = "/cgi-bin/opencenter/openapi/ztSysJobPosition/delete";
        /**
         * 岗位分页查询列表
         */
        public static final String JOBPOSITION_FIND_PAGE = "/cgi-bin/opencenter/openapi/ztSysJobPosition/findJobPositionByPage";

        /**
         * 获取当前公司所有岗位--返回树结构
         */
        public static final String JOBPOSITION_GETALLJOBTOTREE = "/cgi-bin/opencenter/openapi/ztSysJobPosition/getAllJobToTree";
    }

    public static class StaffUrl {
        /**
         * 员工的新增
         */
        public static final String STAFF_ADD_COMD = "/cgi-bin/opencenter/openapi/platformStaffInfo/addStaff";
        /**
         * 员工的编辑
         */
        public static final String STAFF_EIT_COMD = "/cgi-bin/opencenter/openapi/platformStaffInfo/editStaff";
        /**
         * 获取一个员工
         */
        public static final String STAFF_GET_QUER = "/cgi-bin/opencenter/openapi/platformStaffInfo/getStaffById";
        /**
         * 删除员工(可批量）
         */
        public static final String STAFF_DELETE_CMD = "/cgi-bin/opencenter/openapi/platformStaffInfo/deleteStaffByIds";
        /**
         * 获取员工列表
         */
        public static final String STAFF_PAGE_QUER = "/cgi-bin/opencenter/openapi/platformStaffInfo/findStaffByPage";
        /**
         * 根据员工id 做离职处理
         */
        public static final String STAFF_DIMISS_CMD = "/cgi-bin/opencenter/openapi/platformStaffInfo/dimissionStaff";

        /**
         * 根据员工id 做离职处理
         */
        public static final String STAFF_PAGE_DEPARTID_QUERY = "/cgi-bin/opencenter/openapi/platformStaffInfo/pageByDepartmentId";

    }

    public static class UnionStaffDepartUrl {

        /**
         * 员工关联部门岗位添加
         */
        public static final String STAFF_UNION_DEPART_ADD = "/cgi-bin/opencenter/openapi/platformUnionStaffDepart/addAndEdit";

        /**
         * 员工关联部门岗位编辑
         */
        // public static final String STAFF_UNION_DEPART_EDIT =
        // "/cgi-bin/opencenter/openapi/platformUnionStaffDepart/edit";

        /**
         * 员工关联部门岗位删除
         */
        public static final String STAFF_UNION_DEPART_DELETE = "/cgi-bin/opencenter/openapi/platformUnionStaffDepart/delete";

        /**
         * 员工关联部门岗位查询
         */
        public static final String STAFF_UNION_DEPART_GET = "/cgi-bin/opencenter/openapi/platformUnionStaffDepart/getByUnionStaffDepart";

    }

    public static class UserInfoUrl {
        /**
         * 用户新增
         */
        public static final String USERINFO_ADD = "/cgi-bin/opencenter/openapi/platformUserInfo/addUser";
        /**
         * 用户编辑
         */
        public static final String USERINFO_EDIT = "/cgi-bin/opencenter/openapi/platformUserInfo/editUser";
        /**
         * 用户信息获取
         */
        public static final String USERINFO_GET = "/cgi-bin/opencenter/openapi/platformUserInfo/getUser";
        /**
         * 用户的删除
         */
        public static final String USERINFO_DELETE = "/cgi-bin/opencenter/openapi/platformUserInfo/deleteUser";

        /**
         * 用户的分页
         */
        public static final String USERINFO_PAGE = "/cgi-bin/opencenter/openapi/platformUserInfo/findUserByPage";

        /**
         * 用户所在公司的员工信息
         */
        public static final String USERINFO_GET_USERINFO = "/cgi-bin/opencenter/openapi/platformUserInfo/getUserInfo";

        /**
         * 用户所在公司的员工信息
         */
        public static final String FIND_USERINFO_BY_PHONENUMBER = "/cgi-bin/simp-opencenter/openapi/platformUserInfo/findUserInfoByPhoneNumber";

    }

    public static class OssFileUrl {
        /**
         * 用户文件上传
         */
        public static final String OSS_POST_UPLOAD_USER_FILE = "/cgi-bin/opencenter/openapi/oss/uploadUserFile";
        /**
         * 企业文件上传
         */
        public static final String OSS_POST_UPLOAD_COMPANY_FILE = "/cgi-bin/opencenter/openapi/oss/uploadCompanyFile";

    }

    public static class ConvertIdUrl {

        /**
         * 转换b系统staffId
         */
        public static final String CONVERT_BCLIENT_STAFFID = "/cgi-bin/opencenter/openapi/convertBclientStaffId";
        
        /**
         * a系统转换staffOpenId
         */
        public static final String CONVERT_STAFF_OPENID = "/cgi-bin/opencenter/openapi/convertStaffOpenId";
        
        /**
         * 转换b系统companyId
         */
        public static final String CONVERT_BCLIENT_COMPANYID = "/cgi-bin/opencenter/openapi/convertBclientCompanyId";
        
        /**
         * 转换b系统userId
         */
        public static final String CONVERT_BCLIENT_USERID = "/cgi-bin/opencenter/openapi/convertBclientUserId";

    }

    /***
     *  图片上传相关接口
     * @author: nod
     */
    public static class PicTokenUrl {
        /**
         * pc 端获取公共的token
         **/
        public static final String GET_PIC_TOKEN = "/cgi-bin/opencenter/openapi/upload/common/token";
        /**
         * 移动 端获取token
         **/
        public static final String GET_STS_TOKEN = "/cgi-bin/opencenter/openapi/upload/sts/token";

        public static final String VIEW_PIC = "/cgi-bin/opencenter/openapi/oss/getOssPath";

        /***
         *
         * pc 端获取私密的token
        */
        public static final String GET_PRI_TOKEN = "/cgi-bin/opencenter/openapi/upload/private/token";
    }

    /**
     * <b>Description: 系统应用URl</b><br>
     *
     * @author ShawnTang
     */
    public static class SystemUrl {
        public static final String FIND_SYSTEM_BY_COMPANYID = "/cgi-bin/opencenter/openapi/system/findSystemByCompanyId";
    }

    /**
     * <b>Description: ticket跳转URL</b><br>
     *
     * @author ShawnTang
     */
    public static class TicketUrl {
        public static final String CREATE_TICKET = "/cgi-bin/opencenter/openapi/ticket/createTicket";
        public static final String GET_USERID_BY_TICKET = "/cgi-bin/opencenter/openapi/ticket/getUserIdByTicket";
    }
    
    /**
     * <b>Description: 服务超市</b><br>
     *
     * @author ShawnTang
     */
    public static class AppServiceManageUrl {
        public static final String GET_BY_OPENID = "/cgi-bin/opencenter/openapi/integratedPortal/app/serviceManage/getByOpenId";
    }
    
    /**
     * 虚拟组织接口URL
     */
    public static class VirtualOrgUrl {
        /**
         * 获取当前虚拟组织树
         */
        public static final String POST_VIRTUAL_ORG_TREE = "/cgi-bin/opencenter/openapi/ztSysVirtualOrg/tree";

        /**
         * 查询当前虚拟组织信息
         */
        public static final String POST_VIRTUAL_ORG_LIST = "/cgi-bin/opencenter/openapi/ztSysVirtualOrg/list";

        /**
         * 根据ID查询信息
         */
        public static final String GET_VIRTUAL_ORG_GETBYID = "/cgi-bin/opencenter/openapi/ztSysVirtualOrg/getById";

        /**
         * 新增虚拟组织
         */
        public static final String POST_VIRTUAL_ORG_ADD = "/cgi-bin/opencenter/openapi/ztSysVirtualOrg/add";

        /**
         * 修改虚拟组织
         */
        public static final String POST_VIRTUAL_ORG_EDIT = "/cgi-bin/opencenter/openapi/ztSysVirtualOrg/edit";

        /**
         * 删除当前虚拟组织以及下级组织
         */
        public static final String POST_VIRTUAL_ORG_DELETECURRENTANDSON = "/cgi-bin/opencenter/openapi/ztSysVirtualOrg/deleteCurrentAndSon";

        /**
         * 获取新的企业ID
         */
        public static final String GET_VIRTUAL_ORG_ORGNEWID = "/cgi-bin/opencenter/openapi/ztSysVirtualOrg/orgNewId";

        /**
         * 获取当前企业部门树
         */
        public static final String GET_VIRTUAL_ORG_ORG_TREE = "/cgi-bin/opencenter/openapi/ztSysVirtualOrg/org/tree";

        /**
         * 获取企业ID或者部门ID获取成员
         */
        public static final String POST_VIRTUAL_ORG_ORG_ORGDEPT_STAFFPAGE = "/cgi-bin/opencenter/openapi/ztSysVirtualOrg/orgDept/staffPage";

        /**
         * 人员离职(删除)校验
         */
        public static final String POST_VIRTUAL_ORG_ORG_STAFF_DIMISSION = "/cgi-bin/opencenter/openapi/ztSysVirtualOrg/staff/dimission";

        /**
         * 获取虚拟组织负责人
         */
        public static final String GET_VIRTUAL_ORG_ORG_LEADER_LIST = "/cgi-bin/opencenter/openapi/ztSysVirtualLeader/list";

        /**
         * 新增虚拟组织负责人
         */
        public static final String POST_VIRTUAL_ORG_ORG_LEADER_ADD = "/cgi-bin/opencenter/openapi/ztSysVirtualLeader/add";

        /**
         * 删除当前虚拟组织负责人
         */
        public static final String DELETE_VIRTUAL_ORG_ORG_LEADER_DELETE = "/cgi-bin/opencenter/openapi/ztSysVirtualLeader/delete";

        /**
         * 查询当前虚拟组织成员信息
         */
        public static final String POST_VIRTUAL_ORG_ORG_STAFF_PAGE = "/cgi-bin/opencenter/openapi/ztSysVirtualStaff/page";

        /**
         * 新增虚拟组织成员
         */
        public static final String POST_VIRTUAL_ORG_ORG_STAFF_ADD = "/cgi-bin/opencenter/openapi/ztSysVirtualStaff/add";

        /**
         * 删除虚拟组织成员信息
         */
        public static final String POST_VIRTUAL_ORG_ORG_STAFF_DELETE = "/cgi-bin/opencenter/openapi/ztSysVirtualStaff/delete";
    }
    
	public static class LicenseUrl {
		/**
		 * 根据企业id查询License授权详情
		 */
		public static final String GET_LICENSE_DETAILS_LIST = "/cgi-bin/simp-opencenter/openapi/customization/license/queryLicenseDetails";
		/**
		 * 根据企业id集合批量查询License授权详情
		 */
		public static final String GET_BATCH_LICENSE_DETAILS_LIST = "/cgi-bin/simp-opencenter/openapi/customization/license/queryLicenseDetailsByCompanyOpenIds";
		/**
		 * 根据企业id查询全部的License授权详情
		 */
		public static final String GET_LICENSE_DETAILS_LIST_ALL = "/cgi-bin/simp-opencenter/openapi/customization/license/queryLicenseDetailsAll";
		/**
		 * 修改可授权数
		 */
		public static final String UPDATE_MAY_AUTHORIZE = "/cgi-bin/simp-opencenter/openapi/customization/license/updateMayAuthorize";

        /**
         * 修改可授权数
         */
        public static final String ADD_LICENSEUSER = "/cgi-bin/simp-opencenter/openapi/customization/licenseUser/addlicenseUser";

        /**
         * 修改可授权数
         */
        public static final String DELETE_LICENSEUSER = "/cgi-bin/simp-opencenter/openapi/customization/licenseUser/deletelicenseUser";

        /**
         * 修改可授权数
         */
        public static final String QUERY_LICENSEDETAILS = "/cgi-bin/simp-opencenter/openapi/customization/license/queryLicenseDetailsByPage";

    }

    /**
     *
     * <b>Description: 系统应用URl</b><br>
     *
     * @author ShawnTang
     */
    public static class SynQueueLog {
        		public static final String INSERT_LOG = "/cgi-bin/opencenter/openapi/kafkalog/addLog";
//        public static final String INSERT_LOG = "/openapi/kafkalog/addLog";
    }
    
    /**
     * 行政组织
    * <b>Description:</b><br> 
    * @author	liuyaoxi 
    * @version 1.0
    * <b>ProjectName:</b>	open-center-sdk
    * <br><b>PackageName:</b>	com.bonade.sdk.opencenter.common
    * <br><b>ClassName:</b>	AdmOrgMemberInfo
    * <br><b>Date:</b>	2020年12月22日	上午10:38:42
     */
    public static class AdmOrgMemberInfo {
		public static final String FIND_MEMBERINFO_BY_OPENID = "/cgi-bin/simp-opencenter/openapi/AdmOrgMemberInfo/findMemberInfoByOpenId";
    }

	/**
	 * 应用token <b>Description:应用token</b><br>
	 * 
	 * @author zzx
	 * @version 1.0 <b>ProjectName:</b> open-center-sdk <br>
	 *          <b>PackageName:</b> com.bonade.sdk.opencenter.common <br>
	 *          <b>ClassName:</b> ApplicationTokenUrl <br>
	 *          <b>Date:</b> 2021年4月6日17:07:37
	 */
	public static class ApplicationTokenUrl {
		public static final String VALID_ACCESS_TOKEN = "/cgi-bin/oauth2-platform/validAccessToken";
		public static final String GET_ACCESS_TOKEN_VALID = "/cgi-bin/oauth2-platform/getAccessTokenValid";
	}

}
