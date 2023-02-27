package com.bonade.sdk.opencenter.client;

import com.bonade.sdk.opencenter.business.IReceive;
import com.bonade.sdk.opencenter.client.service.IAdmOrgMemberInfoService;
import com.bonade.sdk.opencenter.client.service.IAppServiceManageService;
import com.bonade.sdk.opencenter.client.service.IApplicationTokenService;
import com.bonade.sdk.opencenter.client.service.IClientCurrentLoginInfoService;
import com.bonade.sdk.opencenter.client.service.ICompanyInfoService;
import com.bonade.sdk.opencenter.client.service.IConvertIdService;
import com.bonade.sdk.opencenter.client.service.IDepartmentService;
import com.bonade.sdk.opencenter.client.service.IJobPositionService;
import com.bonade.sdk.opencenter.client.service.ILicenseService;
import com.bonade.sdk.opencenter.client.service.IMonitorService;
import com.bonade.sdk.opencenter.client.service.IOauthService;
import com.bonade.sdk.opencenter.client.service.IOssFileService;
import com.bonade.sdk.opencenter.client.service.IPictureTokenService;
import com.bonade.sdk.opencenter.client.service.IResourceInfoService;
import com.bonade.sdk.opencenter.client.service.IRoleInfoService;
import com.bonade.sdk.opencenter.client.service.IRoleResourceService;
import com.bonade.sdk.opencenter.client.service.IRoleStaffService;
import com.bonade.sdk.opencenter.client.service.IStaffInfoService;
import com.bonade.sdk.opencenter.client.service.ISystemService;
import com.bonade.sdk.opencenter.client.service.ITicketService;
import com.bonade.sdk.opencenter.client.service.IUnionStaffDepartService;
import com.bonade.sdk.opencenter.client.service.IUserInfoService;
import com.bonade.sdk.opencenter.client.service.IVirtualOrgService;
import com.bonade.sdk.opencenter.client.service.impl.AdmOrgMemberInfoClient;
import com.bonade.sdk.opencenter.client.service.impl.AppServiceManageClient;
import com.bonade.sdk.opencenter.client.service.impl.ApplicationTokenClient;
import com.bonade.sdk.opencenter.client.service.impl.CompanyClient;
import com.bonade.sdk.opencenter.client.service.impl.ConvertIdClient;
import com.bonade.sdk.opencenter.client.service.impl.DepartmentClient;
import com.bonade.sdk.opencenter.client.service.impl.JobPositionClient;
import com.bonade.sdk.opencenter.client.service.impl.LicenseClient;
import com.bonade.sdk.opencenter.client.service.impl.MonitorClient;
import com.bonade.sdk.opencenter.client.service.impl.OauthClient;
import com.bonade.sdk.opencenter.client.service.impl.OssFileClient;
import com.bonade.sdk.opencenter.client.service.impl.PictureTokenServiceClient;
import com.bonade.sdk.opencenter.client.service.impl.ResourceInfoClient;
import com.bonade.sdk.opencenter.client.service.impl.RoleInfoClient;
import com.bonade.sdk.opencenter.client.service.impl.StaffClient;
import com.bonade.sdk.opencenter.client.service.impl.SystemClient;
import com.bonade.sdk.opencenter.client.service.impl.TicketClient;
import com.bonade.sdk.opencenter.client.service.impl.UnionStaffDepartClient;
import com.bonade.sdk.opencenter.client.service.impl.UserInfoClient;
import com.bonade.sdk.opencenter.client.service.impl.VirtualOrgClient;

/**
 * <b>Description:基础服务配置类</b>
 *
 * @author LYY
 */
public class SdkBasicConfig {

	protected IPictureTokenService pictureTokenService;

	/**
	 * 登录服务
	 */
	protected IOauthService loginService;

	protected IReceive iReceive;

	/**
	 * 监听服务
	 */
	protected IMonitorService monitorService;

	protected ICompanyInfoService companyService;

	/**
	 * 用户服务
	 */
	protected IUserInfoService userInfoService;

	/**
	 * 员工服务
	 */
	protected IStaffInfoService staffInfoService;

	/**
	 * 部门服务
	 */
	protected IDepartmentService departmentService;

	/**
	 * 岗位服务
	 */
	protected IJobPositionService jobPositionService;

	/**
	 * 角色服务
	 */
	protected IRoleInfoService roleInfoService;

	/**
	 * 资源服务
	 */
	protected IResourceInfoService resourceInfoService;

	/**
	 * 角色资源服务
	 */
	protected IRoleResourceService roleResourceService;
	/**
	 * 角色员工服务
	 */
	protected IRoleStaffService roleStaffService;

	/**
	 * 员工岗位部门关联服务
	 */
	protected IUnionStaffDepartService unionStaffDepartService;

	/**
	 * 员工岗位部门关联服务
	 */
	protected IConvertIdService convertIdService;

	/**
	 * 图片上传服务
	 */
	protected IOssFileService ossFileService;

	/**
	 * 业务系统服务
	 */
	protected ISystemService systemService;

	/**
	 * ticket跳转
	 */
	protected ITicketService ticketService;

	/**
	 * 服务超市
	 */
	protected IAppServiceManageService appServiceManageService;

	/**
	 * 虚拟组织服务
	 */
	protected IVirtualOrgService virtualOrgService;
	/**
	 * license授权服务
	 */
	protected ILicenseService licenseService;
	/**
	 * 应用token服务
	 */
	protected IApplicationTokenService applicationTokenService;

	public IPictureTokenService getPictureTokenService() {
		if (pictureTokenService == null) {
			pictureTokenService = new PictureTokenServiceClient();
		}
		return pictureTokenService;
	}

	/**
	 * 客户端自己实现,SDK用来获取创建人丶编辑人信息
	 */
	private IClientCurrentLoginInfoService clientCurrentLoginInfoService;

	protected IAdmOrgMemberInfoService admOrgMemberInfoService;

	public IReceive getIReceive() {
		return iReceive;
	}

	public IMonitorService getMonitorService() {
		if (monitorService == null) {
			monitorService = new MonitorClient();
		}
		return monitorService;
	}

	public void setIReceive(IReceive iReceive) {
		this.iReceive = iReceive;
	}

	/**
	 * 员工岗位部门关联服务
	 *
	 * @return IUnionStaffDepartService 中甲表服务
	 */
	public IUnionStaffDepartService getUnionStaffDepartService() {
		if (unionStaffDepartService == null) {
			unionStaffDepartService = new UnionStaffDepartClient();
		}
		return unionStaffDepartService;
	}

	/**
	 * 登录服务
	 * @return 返回登录服务
	 */
	public IOauthService getLoginService() {
		if (loginService == null) {
			loginService = new OauthClient();
		}
		return loginService;
	}

	/**
	 * 获取岗位服务
	 *
	 * @return IJobPositionService 岗位服务
	 */
	public IJobPositionService getJobPositionService() {
		if (jobPositionService == null) {
			jobPositionService = new JobPositionClient();
		}
		return jobPositionService;
	}

	/**
	 * 获取企业服务
	 *
	 * @return ICompanyService
	 */
	public ICompanyInfoService getCompanyService() {
		if (companyService == null) {
			companyService = new CompanyClient();
		}
		return companyService;
	}

	/**
	 * 获取用户服务
	 *
	 * @return IUserInfoService 用户服务
	 */
	public IUserInfoService getUserInfoService() {
		if (userInfoService == null) {
			userInfoService = new UserInfoClient();
		}
		return userInfoService;
	}

	/**
	 * 获取员工服务
	 *
	 * @return IStaffInfoService
	 */
	public IStaffInfoService getStaffInfoService() {
		if (staffInfoService == null) {
			staffInfoService = new StaffClient();
		}
		return staffInfoService;
	}

	/**
	 * 获取部门服务
	 *
	 * @return IDepartmentService
	 */
	public IDepartmentService getDepartmentService() {
		if (departmentService == null) {
			departmentService = new DepartmentClient();
		}
		return departmentService;
	}

	/**
	 * 获取角色服务
	 *
	 * @return IRoleInfoService
	 */
	public IRoleInfoService getRoleInfoService() {
		if (roleInfoService == null) {
			roleInfoService = new RoleInfoClient();
		}

		return roleInfoService;
	}

	/**
	 * 获取资源
	 *
	 * @return IResourceInfoService
	 */
	public IResourceInfoService getResourceInfoService() {
		if (resourceInfoService == null) {
			resourceInfoService = new ResourceInfoClient();
		}
		return resourceInfoService;
	}

	/**
	 * 获取角色资源关系服务
	 *
	 * @return IRoleResourceService
	 */
	public IRoleResourceService getRoleResourceService() {
		return roleResourceService;
	}

	/**
	 * 获取角色员工关系服务
	 *
	 * @return IRoleStaffService
	 */
	public IRoleStaffService getRoleStaffService() {
		return roleStaffService;
	}

	/**
	 * 获取角色员工关系服务
	 *
	 * @return IRoleStaffService
	 */
	public IConvertIdService getConvertIdService() {
		if (convertIdService == null) {
			convertIdService = new ConvertIdClient();
		}
		return convertIdService;
	}

	/**
	 * 获取oss服务
	 *
	 * @return IStaffInfoService
	 */
	public IOssFileService getOssFileService() {
		if (ossFileService == null) {
			ossFileService = new OssFileClient();
		}
		return ossFileService;
	}

	public IClientCurrentLoginInfoService getClientCurrentLoginInfoService() {
		return clientCurrentLoginInfoService;
	}

	public void setClientCurrentLoginInfoService(IClientCurrentLoginInfoService iClientCurrentLoginInfoService) {
		clientCurrentLoginInfoService = iClientCurrentLoginInfoService;
	}

	/**
	 * 获取业务线服务
	 *
	 * @return ICompanyService
	 */
	public ISystemService getSystemService() {
		if (systemService == null) {
			systemService = new SystemClient();
		}
		return systemService;
	}

	/**
	 * 获取license服务
	 *
	 * @return ILicenseService
	 */
	public ILicenseService getLicenseService() {
		if (licenseService == null) {
			licenseService = new LicenseClient();
		}
		return licenseService;
	}

	/**
	 * 获取ApplicationToken服务
	 *
	 * @return IApplicationTokenService
	 */
	public IApplicationTokenService getApplicationTokenService() {
		if (applicationTokenService == null) {
			applicationTokenService = new ApplicationTokenClient();
		}
		return applicationTokenService;
	}

	public void setApplicationTokenService(IApplicationTokenService applicationTokenService) {
		this.applicationTokenService = applicationTokenService;
	}

	public IVirtualOrgService getVirtualOrgService() {
		if (virtualOrgService == null) {
			virtualOrgService = new VirtualOrgClient();
		}
		return virtualOrgService;
	}

	/**
	 * ticket跳转
	 *
	 * @return ITicketService
	 */
	public ITicketService getTicketService() {
		if (ticketService == null) {
			ticketService = new TicketClient();
		}
		return ticketService;
	}

	/**
	 * 服务超市
	 *
	 * @return IAppServiceManageService
	 */
	public IAppServiceManageService getAppServiceManageService() {
		if (appServiceManageService == null) {
			appServiceManageService = new AppServiceManageClient();
		}
		return appServiceManageService;
	}

	public IAdmOrgMemberInfoService getAdmOrgMemberInfoService() {
		if (admOrgMemberInfoService == null) {
			admOrgMemberInfoService = new AdmOrgMemberInfoClient();
		}
		return admOrgMemberInfoService;
	}
}
