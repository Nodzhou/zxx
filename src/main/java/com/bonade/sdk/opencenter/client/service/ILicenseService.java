package com.bonade.sdk.opencenter.client.service;

import com.bonade.sdk.opencenter.dto.license.*;
import com.bonade.sdk.opencenter.vo.PageData;
import com.bonade.sdk.opencenter.vo.license.LicenseDetailsVo;

import java.util.List;
import java.util.Map;

/**
 * @author zzx
 *         <p>
 *         License授权相关接口
 *         </p>
 */
public interface ILicenseService extends SdkService {

	/**
	 * 根据企业id查询License授权详情
	 *
	 * @param companyOpenId 企业id
	 * @return LicenseDetailsDto 授权详情dto
	 */
	List<LicenseDetailsDto> queryLicenseDetails(String companyOpenId);

	/**
	 * 根据企业id集合批量查询License授权详情，包括过期以及停用状态的
	 *
	 * @param companyOpenIds 企业id集合
	 * @return LicenseDetailsDto 授权详情dto
	 */
	Map<String, List<LicenseDetailsByCompanyOpenIdsDto>> queryLicenseDetailsByCompanyOpenIds(
			List<String> companyOpenIds);

	/**
	 * 根据企业id查询全部的License授权详情，包括过期以及停用状态的
	 *
	 * @param companyOpenId 企业id
	 * @return LicenseDetailsDto 授权详情dto
	 */
	List<LicenseDetailsAllDto> queryLicenseDetailsAll(String companyOpenId);

	/**
	 * 修改可授权数
	 *
	 * @param id           授权详情id
	 * @param mayAuthorize 可授权数
	 * @return 修改记录数
	 */
	Integer updateMayAuthorize(Integer id, Integer mayAuthorize);

	/**
	 * @param licenseUserDto 授权用户对象
	 * @author: yw
	 * @return: 返回新增的授权用户信息自增id <b>Description:新增授权用户</b><br>
	 *          <br>
	 *          <b>Date:</b> 2021/2/2 15:06 <br>
	 *          <b>Version:</b> 1.0
	 */
	Integer addlicenseUser(LicenseUserDto licenseUserDto);

	/**
	 * @param licenseUserDto 授权用户对象
	 * @author: yw
	 * @return: 操作影响行数 <b>Description:</b><br>
	 *          <br>
	 *          <b>Date:</b> 2021/2/2 15:06 <br>
	 *          <b>Version:删除授权用户</b> 1.0
	 */
	Integer deletelicenseUser(LicenseUserDto licenseUserDto);

   /**
   * @author: yw
   * @return: 返回分页查询系统列表
   * <b>Description:分页查询系统列表</b><br>
   * <br><b>Date:</b> 2021/5/17 14:20
   * <br><b>Version:</b> 1.0
    * @param queryLicenseDetailsDto 入参
   */
    PageData<List<LicenseDetailsVo>> queryLicenseDetailsByPage(QueryLicenseDetailsDto queryLicenseDetailsDto);

}
