package com.bonade.sdk.opencenter.client.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.service.IDepartmentService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.dto.BaseExtendDto;
import com.bonade.sdk.opencenter.dto.departmentDto.DepartNumByCompanyIdDto;
import com.bonade.sdk.opencenter.dto.departmentDto.DepartmentInfoDto;
import com.bonade.sdk.opencenter.dto.departmentDto.DepartmentPageDto;
import com.bonade.sdk.opencenter.dto.departmentDto.InsertOrDeleteDepartmentLeaderDto;
import com.bonade.sdk.opencenter.exception.ClientException;
import com.bonade.sdk.opencenter.utils.HttpClientUtils;
import com.bonade.sdk.opencenter.vo.PageData;
import com.bonade.sdk.opencenter.vo.departmentVo.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: wmx
 * <b>Description: 部门接口实现类</b><br>
 * <br><b>Date:2020/8/5 18:10</b>
 * <br><b>Version:1.0</b>
 */
public class DepartmentClient<T extends BaseExtendDto> implements IDepartmentService<BaseExtendDto> {
 

    /**
     * 新增部门
     *
     * @param departmentInfoDto 部门实体
     * @return String 部门ID
     */
    @Override
    public String add(DepartmentInfoDto<BaseExtendDto> departmentInfoDto) {
        JSONObject resultObject = getClient().executePost(ApiPathConstant.DepartmentUrl.DEPARTMENT_ADD,
                HttpClientUtils.CONTENT_TYPE_JSON, (JSONObject) JSONObject.toJSON(departmentInfoDto));
        if (resultObject == null) {
            throw new ClientException("SDK调用添加部门接口返回信息为空！");
        }
        return resultObject.getString("id");
    }

    /**
     * 编辑部门
     *
     * @param departmentInfoDto 部门实体
     * @return int 受影响行数
     */
    @Override
    public int edit(DepartmentInfoDto departmentInfoDto) {
        JSONObject resultObject = getClient().executePost(ApiPathConstant.DepartmentUrl.DEPARTMENT_EDIT,
                HttpClientUtils.CONTENT_TYPE_JSON, (JSONObject) JSONObject.toJSON(departmentInfoDto));
        if (resultObject == null) {
            throw new ClientException("SDK调用添加部门接口返回信息为空！");
        }
        return resultObject.getIntValue("count");
    }


    /**
     * 根据ID删除信息,多条记录用逗号分隔
     *
     * @param ids 部门ID集合串
     * @return int 受影响行数
     */
    @Override
    public int delete(String ids) {
        Map<String, Object> paramsMap = new HashMap<>(2);
        paramsMap.put("ids", ids);
        JSONObject resultObject = getClient().executePost(ApiPathConstant.DepartmentUrl.DEPARTMENT_DELETE, HttpClientUtils.CONTENT_TYPE_URLENCODED, paramsMap);
        if (resultObject == null) {
            throw new ClientException("SDK调用获取部门详情接口返回信息为空！");
        }
        return resultObject.getIntValue("count");
    }


    /**
     * 部门分页查询
     *
     * @param departmentPageDto 部门参数
     * @return 部门集合
     */
    @Override
    public PageData<List<DepartmentInfoPageVo>> page(DepartmentPageDto departmentPageDto) {
        JSONObject resultObj = getClient().executePost(ApiPathConstant.DepartmentUrl.DEPARTMENT_FIND_PAGE, HttpClientUtils.CONTENT_TYPE_JSON, (JSONObject) JSONObject.toJSON(departmentPageDto));
        if (resultObj == null) {
            return new PageData<>(new ArrayList<DepartmentInfoPageVo>(), 0);
        }
        List<DepartmentInfoPageVo> platformDepartmentInfoList = JSONObject.parseArray(resultObj.getString("data"),
                DepartmentInfoPageVo.class);
        long total = Long.parseLong(resultObj.getString("total"));
        return new PageData<>(platformDepartmentInfoList, total);
    }

    /**
     * 根据部门id查询对应数据
     *
     * @param id 部门ID
     * @return PlatformDepartmentInfo 部门实体
     */
    @Override
    public DepartmentInfoVo get(String id) {
        Map<String, Object> paramsMap = new HashMap<>(2);
        paramsMap.put("id", id);
        JSONObject resultObject = getClient().executeGet(ApiPathConstant.DepartmentUrl.DEPARTMENT_GET, paramsMap);
        if (resultObject == null) {
            throw new ClientException("SDK调用根据此部门id获取部门详情接口返回信息为空！");
        }
        return JSON.toJavaObject(resultObject, DepartmentInfoVo.class);
    }


    /**
     * 查询部门信息，以树结构返回(查询企业的所有部门
     *
     * @param companyId      公司ID
     * @param departmentName 部门名称
     * @return 部门树形结构
     */
    @Override
    public List<DepartmentTreeVo> getTreeAll(String companyId, String departmentName, String status) {
        Map<String, Object> paramsMap = new HashMap<>(3);
        paramsMap.put("companyId", companyId);
        paramsMap.put("departmentName", departmentName);
        paramsMap.put("status", status);
        JSONObject resultObject = getClient().executeGet(ApiPathConstant.DepartmentUrl.DEPARTMENT_GETTREEALL, paramsMap);
        if (resultObject == null) {
            throw new ClientException("SDK调用获取部门树接口返回信息为空！");
        }
        return JSONObject.parseArray(resultObject.getString("dataTree"), DepartmentTreeVo.class);
    }

    /**
     * 根据企业id和部门id查询部门下的部门id集合
     *
     * @param companyId    公司ID
     * @param departmentId 部门id
     * @return id集合
     */
    @Override
    public List<String> getDepartmentIds(String companyId, String departmentId) {
        Map<String, Object> paramsMap = new HashMap<>(3);
        paramsMap.put("companyId", companyId);
        paramsMap.put("departmentId", departmentId);
        JSONObject resultObject = getClient().executeGet(ApiPathConstant.DepartmentUrl.DEPARTMENT_GETDEPARTMENTIDS,
                paramsMap);
        if (resultObject == null) {
            throw new ClientException("SDK调用根据此企业id获取其部门的子部门ID集合接口返回信息为空！");
        }
        return JSONObject.parseArray(resultObject.getString("data"), String.class);
    }

    /**
     * <b>Description:</b> 根据员工id查询部门信息接口 <br>
     *
     * @param staffId 员工id
     * @author: biyizhuo <br>
     * <b>Date:</b> 2020/7/25 <br>
     * <b>Version:</b> 1.0
     * @return: 返回该员工所在部门信息
     */
    @Override
    public DepartmentInfoVo getDepartmentByStaffId(String staffId) {
        Map<String, Object> paramsMap = new HashMap<>(2);
        paramsMap.put("staffId", staffId);
        JSONObject resultObject = getClient().executeGet(ApiPathConstant.DepartmentUrl.DEPARTMENT_GETDEPARTMENTBYSTAFFID,
                paramsMap);
        if (resultObject == null) {
            throw new ClientException("SDK调用根据此员工id获取部门信息接口返回信息为空！");
        }
        return JSON.toJavaObject(resultObject, DepartmentInfoVo.class);
    }

    /**
     * <b>Description:</b> 根据企业id、部门名、关键字查询所有部门 <br>
     *
     * @param companyId      企业id
     * @param departmentName 部门名
     * @param keyword        部门名关键字
     * @author: biyizhuo <br>
     * <b>Date:</b> 2020/7/25 <br>
     * <b>Version:</b> 1.0
     * @return: 返回企业下的所有部门，或者具体部门信息
     */
    @Override
    public List<DepartmentInfoVo> getDepartByCompanyId(String companyId, String departmentName, String keyword) {
        Map<String, Object> paramsMap = new HashMap<>(3);
        paramsMap.put("companyId", companyId);
        paramsMap.put("departmentName", departmentName);
        paramsMap.put("keyword", keyword);
        JSONObject resultObject = getClient().executeGet(ApiPathConstant.DepartmentUrl.DEPARTMENT_GETDEPARTBYCOMPANYID,
                paramsMap);
        if (resultObject == null) {
            throw new ClientException("SDK调用根据此企业id查询所有部门接口返回信息为空！");
        }
        return JSONObject.parseArray(resultObject.getString("data"), DepartmentInfoVo.class);
    }

    /**
     * <b>Description:</b> 根据企业ID查询每个部门下的人员数目接口 <br>
     *
     * @param departNumByCompanyIdDto 企业id和部门id集合
     * @author: biyizhuo <br>
     * <b>Date:</b> 2020/7/25 <br>
     * <b>Version:</b> 1.0
     * @return: 返回企业下的所有部门，或者具体部门信息
     */
    @Override
    public List<DepartStaffNumVo> getDepartNumByCompanyId(DepartNumByCompanyIdDto departNumByCompanyIdDto) {

        JSONObject resultObject = getClient().executePost(ApiPathConstant.DepartmentUrl.DEPARTMENT_GETDEPARTNUMBYCOMPANYID,
                HttpClientUtils.CONTENT_TYPE_JSON, (JSONObject) JSONObject.toJSON(departNumByCompanyIdDto));
        if (resultObject == null) {
            throw new ClientException("SDK调用根据此企业ID查询部门下的员工数量接口返回信息为空！");
        }
        return JSONObject.parseArray(resultObject.getString("data"), DepartStaffNumVo.class);
    }

    /**
     * @param departmentId 部门Id
     * @author: wumengxuan
     * @return: 返回集合vo类
     * <b>Description: 根据部门id。返回子部门集合</b><br>
     * <br><b>Date:2020/8/6 15:53</b>
     * <br><b>Version:1.0</b>
     */
    @Override
    public DepartmentChildVo getChildList(String departmentId) {
        Map<String, Object> paramsMap = new HashMap<>(1);
        paramsMap.put("departmentId", departmentId);
        JSONObject resultObject = getClient().executeGet(ApiPathConstant.DepartmentUrl.DEPARTMENT_GETDEPARTMENTCHILD, paramsMap);
        if (resultObject == null) {
            return null;
        }
        return JSONObject.toJavaObject(resultObject, DepartmentChildVo.class);
    }

    @Override
    public DepartmentChildVo getFatherList(String departmentId) {
        Map<String, Object> paramsMap = new HashMap<>(1);
        paramsMap.put("departmentId", departmentId);
        JSONObject resultObject = getClient().executeGet(ApiPathConstant.DepartmentUrl.DEPARTMENT_GETDEPARTMENTFATHER, paramsMap);
        if (resultObject == null) {
            return null;
        }
        return JSONObject.toJavaObject(resultObject, DepartmentChildVo.class);
    }


    /**
     * @param departmentId 部门Id
     * @author: wumengxuan
     * @return: 返回集合vo类
     * <b>Description: 根据部门id。返回子部门id集合</b><br>
     * <br><b>Date:2020/8/6 15:53</b>
     * <br><b>Version:1.0</b>
     */
    @Override
    public List<String> getChildrenIds(String departmentId) {
        Map<String, Object> paramsMap = new HashMap<>(1);
        paramsMap.put("departmentId", departmentId);
        JSONObject resultObject = getClient().executeGet(ApiPathConstant.DepartmentUrl.DEPARTMENT_GETCHILDRENIDS, paramsMap);
        if (resultObject == null) {
            return null;
        }
        return JSONObject.parseArray(resultObject.getString("data"), String.class);
    }


    @Override
    public String insertBatchDepartmentLeader(InsertOrDeleteDepartmentLeaderDto insertOrDeleteDepartmentLeaderDto) {
        JSONObject resultObject = getClient().postByJson(ApiPathConstant.DepartmentUrl.DEPARTMENT_INSERTBATCHDEPARTMENTLEADER,
                (JSONObject) JSONObject.toJSON(insertOrDeleteDepartmentLeaderDto));
        if (resultObject == null) {
            throw new ClientException("SDK调用根据员工Ids和部门id批量插入部门负责人接口返回的信息为空");
        }
        return resultObject.getString("id");
    }

    @Override
    public int deleteBatchDepartmentLeader(InsertOrDeleteDepartmentLeaderDto insertOrDeleteDepartmentLeaderDto) {
        JSONObject resultObject = getClient().postByJson(ApiPathConstant.DepartmentUrl.DEPARTMENT_DELETEBATCHDEPARTMENTLEADER,
                (JSONObject) JSONObject.toJSON(insertOrDeleteDepartmentLeaderDto));
        if (resultObject == null) {
            throw new ClientException("SDK调用根据员工Ids和部门id批量删除部门负责人接口返回的信息为空");
        }
        return Integer.parseInt(resultObject.getString("count"));
    }

    @Override
    public List<DepartmentChildVo> getTreeDetailed(String companyId, String status) {
        Map<String, Object> paramsMap = new HashMap<>(2);
        paramsMap.put("companyId", companyId);
        paramsMap.put("status", status);
        JSONObject resultObject = getClient().executeGet(ApiPathConstant.DepartmentUrl.DEPARTMENT_GETTREEDETAILED, paramsMap);
        if (resultObject == null) {
            return null;
        }
        return JSONObject.parseArray(resultObject.getString("data"), DepartmentChildVo.class);
    }
}
