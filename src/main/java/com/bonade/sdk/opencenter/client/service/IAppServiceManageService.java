/**
　 * @author ShawnTang
  *
*/
package com.bonade.sdk.opencenter.client.service;

import java.util.List;

import com.bonade.sdk.opencenter.dto.AppServiceManageDto;
import com.bonade.sdk.opencenter.vo.AppServiceManageVo;

/**
 * <b>Description: 服务超市APP端</b><br>
 * 
 * @author ShawnTang
 * @version 1.0 <b>ProjectName:</b> open-center-sdk <br>
 *          <b>PackageName:</b> com.bonade.sdk.opencenter.client.service <br>
 *          <b>ClassName:</b> IAppServiceManageService <br>
 *          <b>Date:</b> 2020年10月4日
 */
public interface IAppServiceManageService extends SdkService {
	/**
	 * 
	 * <b>Description:</b> 获取超市服务应用列表<br>
	 * 
	 * @param record 服务超市查询条件VO
	 * @param openId openId
	 * @return AppServiceManageVo 服务超市VO<b>Author:</b> ShawnTang <br>
	 *         <b>Date:</b> 2020年9月22日 <br>
	 *         <b>Version:</b> 1.0
	 */
	List<AppServiceManageVo> getAppServiceManageListByOpenId(AppServiceManageDto record, String openId);
}
