package com.bonade.sdk.opencenter.client.service;

import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.dto.CompanyInfoDto.*;
import com.bonade.sdk.opencenter.vo.*;

import java.util.List;

/**
 * 企业
 * 
 * @author LYY
 *
 * @param <T> 各业务线扩展类
 */
public interface ICompanyInfoService<T extends BaseExtendVo> extends SdkService {

	/**
	 * 分页查询企业
	 * 
	 * @param ztSysCompanyInfo 企业实体
	 * @return 返回分页数据
	 */
	PageData<List<PlatformCompanyInfoVo<T>>> findByPage(CompanyDto<T> ztSysCompanyInfo);

	/**
	 * 获取企业详情
	 * 
	 * @param id 主键ID
	 * @return 返回一个企业实体
	 */
	PlatformCompanyInfoVo<T> getById(String id);

	/**
	 * 新增企业信息
	 * 
	 * @param ztSysCompanyInfo 企业实体
	 * @return 返回Id
	 */
	String insertCompanyInfo(CompanyDto<T> ztSysCompanyInfo);

//	/**
//	 * 新增企业信息 使用 simp-opencenter 方法
//	 *
//	 * @param ztSysCompanyInfo 企业实体
//	 * @return 返回Id
//	 */
//	String insertCompanyInfoFromSimp(PlatformCompanyInfoDto ztSysCompanyInfo);

	/**
	 * 修改企业信息
	 * 
	 * @param ztSysCompanyInfo 企业实体
	 * @return 返回受影响行数
	 */
	int updateCompanyInfo(CompanyDto<T> ztSysCompanyInfo);

//	/**
//	 * 修改企业信息 使用 simp-opencenter 方法
//	 *
//	 * @param platformCompanyInfoDto 企业实体
//	 * @return 返回受影响行数
//	 */
//	int updateCompanyInfoFromSimp(PlatformCompanyInfoDto platformCompanyInfoDto);

	/**
	 * <b>Description:</b>根据企业id查询所有的子公司并返回树结构,传入companyName会匹配树结构下的子公司名称,匹配到后再查父节点<br>
	 * @param companyTreeDto	getTreeAll()参数类
	 * @return 企业树结构
	 * <b>Author:</b> lyx <br>
	 * <b>Date:</b> 2020年8月14日 下午3:59:00 <br>
	 * <b>Version:</b> 1.0
	 */
	JSONObject getTreeAll(CompanyTreeDto companyTreeDto);

	PlatformCompanyInfoVo<T> getCompanyBystaffId(String staffId);
	
	
	/**
     * 企业名精确查找
	 * @param dto 企业参数
	 * @return 返回企业实体
     */
	CompanyEqualsNameVo findCompanyInfoEqualsName(CompanyEqualsNameDto dto);
	/**
     * 根据企业信用代码查企业详情
	 * @param dto 企业参数
	 * @return 返回企业实体
     */
	CompanyEqualsCodeVo findCompanyInfoEqualsCode(CompanyEqualsCodeDto dto);
	 /**
     * 企业名模糊查找
	  * @param dto 企业参数
	  * @return 企业实体集合
     */
	
	List<CompanyLikeVo> findCompanyInfoLike(CompanyLikeDto dto);
	/**
     * 批量获取企业信息
	 * @param dto 企业参数
	 * @return 企业实体集合
     */
	List<CompanyInVo> findCompanyInfoIds(CompanyInDto dto);
	
	/**
     * 企业信息管理
	 * @param dto 企业参数
	 * @return 返回分页企业实体
     */
	PageData<List<CompanyChildrenNodeVo>> findCompanyInfoChildrenNode(CompanyChildrenNodeDto dto);

	/**
	 * 新增 实名企业信息
	 *
	 * @param ztSysCompanyInfo 企业实体
	 * @return 返回Id
	 */
	String insertRealCompanyInfo(CompanyDto<T> ztSysCompanyInfo);


	/**
	 * 新增 实名企业信息
	 *
	 * @param ztSysCompanyInfo 企业实体
	 * @return 返回  true 校验成功
	 */
	Boolean verificateRealName(CompanyDto ztSysCompanyInfo );
	
}
