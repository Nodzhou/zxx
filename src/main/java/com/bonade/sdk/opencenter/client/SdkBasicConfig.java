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
 * <b>Description:?????????????????????</b>
 *
 * @author LYY
 */
public class SdkBasicConfig {

	protected IPictureTokenService pictureTokenService;

	/**
	 * ????????????
	 */
	protected IOauthService loginService;

	protected IReceive iReceive;

	/**
	 * ????????????
	 */
	protected IMonitorService monitorService;

	protected ICompanyInfoService companyService;

	/**
	 * ????????????
	 */
	protected IUserInfoService userInfoService;

	/**
	 * ????????????
	 */
	protected IStaffInfoService staffInfoService;

	/**
	 * ????????????
	 */
	protected IDepartmentService departmentService;

	/**
	 * ????????????
	 */
	protected IJobPositionService jobPositionService;

	/**
	 * ????????????
	 */
	protected IRoleInfoService roleInfoService;

	/**
	 * ????????????
	 */
	protected IResourceInfoService resourceInfoService;

	/**
	 * ??????????????????
	 */
	protected IRoleResourceService roleResourceService;
	/**
	 * ??????????????????
	 */
	protected IRoleStaffService roleStaffService;

	/**
	 * ??????????????????????????????
	 */
	protected IUnionStaffDepartService unionStaffDepartService;

	/**
	 * ??????????????????????????????
	 */
	protected IConvertIdService convertIdService;

	/**
	 * ??????????????????
	 */
	protected IOssFileService ossFileService;

	/**
	 * ??????????????????
	 */
	protected ISystemService systemService;

	/**
	 * ticket??????
	 */
	protected ITicketService ticketService;

	/**
	 * ????????????
	 */
	protected IAppServiceManageService appServiceManageService;

	/**
	 * ??????????????????
	 */
	protected IVirtualOrgService virtualOrgService;
	/**
	 * license????????????
	 */
	protected ILicenseService licenseService;
	/**
	 * ??????token??????
	 */
	protected IApplicationTokenService applicationTokenService;

	public IPictureTokenService getPictureTokenService() {
		if (pictureTokenService == null) {
			pictureTokenService = new PictureTokenServiceClient();
		}
		return pictureTokenService;
	}

	/**
	 * ?????????????????????,SDK???????????????????????????????????????
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
	 * ??????????????????????????????
	 *
	 * @return IUnionStaffDepartService ???????????????
	 */
	public IUnionStaffDepartService getUnionStaffDepartService() {
		if (unionStaffDepartService == null) {
			unionStaffDepartService = new UnionStaffDepartClient();
		}
		return unionStaffDepartService;
	}

	/**
	 * ????????????
	 * @return ??????????????????
	 */
	public IOauthService getLoginService() {
		if (loginService == null) {
			loginService = new OauthClient();
		}
		return loginService;
	}

	/**
	 * ??????????????????
	 *
	 * @return IJobPositionService ????????????
	 */
	public IJobPositionService getJobPositionService() {
		if (jobPositionService == null) {
			jobPositionService = new JobPositionClient();
		}
		return jobPositionService;
	}

	/**
	 * ??????????????????
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
	 * ??????????????????
	 *
	 * @return IUserInfoService ????????????
	 */
	public IUserInfoService getUserInfoService() {
		if (userInfoService == null) {
			userInfoService = new UserInfoClient();
		}
		return userInfoService;
	}

	/**
	 * ??????????????????
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
	 * ??????????????????
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
	 * ??????????????????
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
	 * ????????????
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
	 * ??????????????????????????????
	 *
	 * @return IRoleResourceService
	 */
	public IRoleResourceService getRoleResourceService() {
		return roleResourceService;
	}

	/**
	 * ??????????????????????????????
	 *
	 * @return IRoleStaffService
	 */
	public IRoleStaffService getRoleStaffService() {
		return roleStaffService;
	}

	/**
	 * ??????????????????????????????
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
	 * ??????oss??????
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
	 * ?????????????????????
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
	 * ??????license??????
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
	 * ??????ApplicationToken??????
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
	 * ticket??????
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
	 * ????????????
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
