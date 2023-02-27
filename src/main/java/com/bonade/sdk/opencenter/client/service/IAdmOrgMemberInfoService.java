package com.bonade.sdk.opencenter.client.service;


import java.util.List;

import com.bonade.sdk.opencenter.pojo.AdmOrgMemberInfo;
import com.bonade.sdk.opencenter.vo.AdmOrgMemberInfoVo;

/**
 * <b>Description:行政组织成员服务类</b><br>
 * 
 * @author ShawnTang
 * @version 1.0 <b>ProjectName:</b> bonade-platform-simp-opencenter <br>
 *          <b>PackageName:</b> com.bonade.simp.opencenter.service <br>
 *          <b>ClassName:</b> IAdmOrgMemberInfoService <br>
 *          <b>Date:</b> 2020年12月19日
 */
public interface IAdmOrgMemberInfoService extends SdkService {

//	List<AdmOrgMemberInfo> findMemberInfoByStaffOpenIdAndCompanyOpenId(String staffOpenId, String companyOpenId);

	List<AdmOrgMemberInfoVo> findMemberInfoByOpenId(String openId);
}
