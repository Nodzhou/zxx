/**
　 * @author ShawnTang
  *
*/
package com.bonade.sdk.opencenter.client.service;

import java.util.List;

import com.bonade.sdk.opencenter.vo.BusinessSystemVo;

/**
 * 
 * <b>Description: 系统Service</b><br>
 * 
 * @author ShawnTang
 * @version 1.0 <b>ProjectName:</b> open-center-sdk <br>
 *          <b>PackageName:</b> com.bonade.sdk.opencenter.client.service <br>
 *          <b>ClassName:</b> ISystemService <br>
 *          <b>Date:</b> 2020年8月26日 下午6:05:37
 */
public interface ISystemService extends SdkService {

	/**
	 * 
	 * <b>Description: 根据企业ID查找应用系统</b><br>
	 * 
	 * @param companyId 企业ID
	 * @return BusinessSystemVo 业务系统列表<b>Author:</b> ShawnTang <br>
	 *         <b>Date:</b> 2020年8月25日 下午2:08:54 <br>
	 *         <b>Version:</b> 1.0
	 */
	List<BusinessSystemVo> findSystemByCompanyId(String companyId);
}
