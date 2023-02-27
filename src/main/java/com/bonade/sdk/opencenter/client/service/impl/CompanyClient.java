package com.bonade.sdk.opencenter.client.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.service.ICompanyInfoService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.common.KeyConstant;
import com.bonade.sdk.opencenter.dto.CompanyInfoDto.*;
import com.bonade.sdk.opencenter.exception.ClientException;
import com.bonade.sdk.opencenter.utils.CompanyValueCheckUtils;
import com.bonade.sdk.opencenter.utils.HttpClientUtils;
import com.bonade.sdk.opencenter.vo.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 企业客户端
 * @author LYY
 *
 */
public class CompanyClient implements ICompanyInfoService<BaseExtendVo> {

	 


	@Override
	public PageData<List<PlatformCompanyInfoVo<BaseExtendVo>>> findByPage(CompanyDto<BaseExtendVo> ztSysCompanyInfo) {

		JSONObject resultObj = getClient().executePost(ApiPathConstant.CompanyUrl.COMPANY_FING_PAGE,HttpClientUtils.CONTENT_TYPE_JSON, (JSONObject)JSONObject.toJSON(ztSysCompanyInfo));
		if(resultObj == null) {
			return new PageData<List<PlatformCompanyInfoVo<BaseExtendVo>>>(new ArrayList<PlatformCompanyInfoVo<BaseExtendVo>>(), 0);
		}
		List<PlatformCompanyInfoVo> recordes = JSONObject.parseArray(resultObj.getString("data"), PlatformCompanyInfoVo.class);
		Long total = Long.parseLong(resultObj.getString("total"));
		PageData<List<PlatformCompanyInfoVo<BaseExtendVo>>> pageData = new PageData(recordes,total);

		return pageData;
	}

	@Override
	public PlatformCompanyInfoVo<BaseExtendVo> getById(String id) {
		JSONObject param=new JSONObject(1);
		param.put("id",id);
		JSONObject resultObj = getClient().executeGet(ApiPathConstant.CompanyUrl.COMPANY_GET_BY_ID, param);
		if(resultObj == null) {
			return null;
		}
		return JSON.toJavaObject(resultObj, PlatformCompanyInfoVo.class);
	}

	@Override
	public String insertCompanyInfo(CompanyDto<BaseExtendVo> ztSysCompanyInfo) {
		  CompanyValueCheckUtils.checkValueType(ztSysCompanyInfo);

			   JSONObject resultObj = getClient().executePost(ApiPathConstant.CompanyUrl.COMPANY_INSERT,
					   HttpClientUtils.CONTENT_TYPE_JSON, (JSONObject)JSONObject.toJSON(ztSysCompanyInfo));
			   return resultObj.getString("id");

	}

 

	@Override
	public int updateCompanyInfo(CompanyDto<BaseExtendVo> ztSysCompanyInfo) {
		 CompanyValueCheckUtils.checkValueType(ztSysCompanyInfo);

			JSONObject resultObj = getClient().executePost(ApiPathConstant.CompanyUrl.COMPANY_UPDATE,
					HttpClientUtils.CONTENT_TYPE_JSON, (JSONObject) JSONObject.toJSON(ztSysCompanyInfo));
			return resultObj.getIntValue("count");

	}

 

	@Override
	public PlatformCompanyInfoVo<BaseExtendVo> getCompanyBystaffId(String staffId) {
		return null;
	}

	/***
	 *  获取企业上下级 Treelist
	 * @author:  nod
	 * @param companyTreeDto 参数包括企业id，企业名称
	 * @return 返回结果
	 */
	@Override
	public JSONObject getTreeAll(CompanyTreeDto companyTreeDto) {
		JSONObject resultObj = getClient().executeGet(ApiPathConstant.CompanyUrl.GETTREE_ALL,
				 (JSONObject)JSONObject.toJSON(companyTreeDto));
     	return resultObj;
	}

	@Override
	public CompanyEqualsNameVo findCompanyInfoEqualsName(CompanyEqualsNameDto dto) {
		JSONObject jsonObject=  getClient().executePost(ApiPathConstant.CompanyUrl.COMPANY_INFO_EQUALS,HttpClientUtils.CONTENT_TYPE_JSON, (JSONObject)JSONObject.toJSON(dto));
		List<CompanyEqualsNameVo> list=JSON.parseArray(JSON.toJSONString(jsonObject.get("data")),CompanyEqualsNameVo.class);
		return (list!=null&&list.size()>0)?list.get(0):null;
	}
	@Override
	public CompanyEqualsCodeVo findCompanyInfoEqualsCode(CompanyEqualsCodeDto dto) {
		JSONObject jsonObject= getClient().executePost(ApiPathConstant.CompanyUrl.COMPANY_INFO_EQUALS,HttpClientUtils.CONTENT_TYPE_JSON,(JSONObject)JSONObject.toJSON(dto));
		List<CompanyEqualsCodeVo> list=JSON.parseArray(JSON.toJSONString(jsonObject.get("data")),CompanyEqualsCodeVo.class);
		return (list!=null&&list.size()>0)?list.get(0):null;
	}

	@Override
	public List<CompanyLikeVo> findCompanyInfoLike(CompanyLikeDto dto) {
		JSONObject jsonObject=  getClient().executePost(ApiPathConstant.CompanyUrl.COMPANY_INFO_LIKE,HttpClientUtils.CONTENT_TYPE_JSON,(JSONObject)JSONObject.toJSON(dto));
		return JSON.parseArray(JSON.toJSONString(jsonObject.get("data")),CompanyLikeVo.class);
	}

	@Override
	public List<CompanyInVo> findCompanyInfoIds(CompanyInDto dto) {
		JSONObject jsonObject=  getClient().executePost(ApiPathConstant.CompanyUrl.COMPANY_INFO_IDS,HttpClientUtils.CONTENT_TYPE_JSON,(JSONObject)JSONObject.toJSON(dto));
		return JSON.parseArray(JSON.toJSONString(jsonObject.get("data")),CompanyInVo.class);
	}

	@Override
	public PageData<List<CompanyChildrenNodeVo>> findCompanyInfoChildrenNode(CompanyChildrenNodeDto dto) {
		if (null == dto) {
            throw new ClientException("获取参数为空，请检查");
        }
        JSONObject params = (JSONObject) JSONObject.toJSON(dto);
        JSONObject resultObj = getClient().executePost(ApiPathConstant.CompanyUrl.COMPANY_INFO_CHILDREN_NODE,HttpClientUtils.CONTENT_TYPE_JSON,params);
        if (null == resultObj) {
            return new PageData<>(new ArrayList<>(), KeyConstant.ZERO);
        }
        List<CompanyChildrenNodeVo> list = JSONObject.parseArray(resultObj.getString("data"), CompanyChildrenNodeVo.class);
        Long total = resultObj.getLongValue("total");
        return new PageData(list, total);
	}

	/***
	 * 实名企业新增
	 * @author:  nod
	 * @param ztSysCompanyInfo  实名企业实体
	 * @return  返回ID
	*/
	@Override
	public String insertRealCompanyInfo(CompanyDto<BaseExtendVo> ztSysCompanyInfo) {

		   CompanyValueCheckUtils.checkValueType(ztSysCompanyInfo);
			JSONObject resultObj = getClient().executePost(ApiPathConstant.CompanyUrl.REAL_COMPANY_INSERT,
					HttpClientUtils.CONTENT_TYPE_JSON, (JSONObject)JSONObject.toJSON(ztSysCompanyInfo));
			return resultObj.getString("id");

	}

	@Override
	public Boolean verificateRealName(CompanyDto ztSysCompanyInfo) {

		JSONObject resultObj = getClient().executePost(ApiPathConstant.CompanyUrl.COMPANY_VERIFICATE,
				HttpClientUtils.CONTENT_TYPE_JSON, (JSONObject) JSONObject.toJSON(ztSysCompanyInfo));

		if ( resultObj!=null) {
			return true;
		}
		return false;
	}

}
