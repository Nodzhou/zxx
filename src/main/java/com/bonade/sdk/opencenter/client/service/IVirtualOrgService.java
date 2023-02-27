package com.bonade.sdk.opencenter.client.service;

import com.bonade.sdk.opencenter.dto.BaseExtendDto;
import com.bonade.sdk.opencenter.dto.virtualOrg.*;
import com.bonade.sdk.opencenter.vo.PageData;

import java.util.List;

/**
 * @author zhangbeiping
 * <b>Description:虚拟组织接口</b><br>
 * <b>ProjectName:open-center-sdk</b>
 * <br><b>PackageName:com.bonade.sdk.opencenter.client.service</b>
 * <br><b>ClassName:IVirtualOrgService</b>
 * <br><b>Date:2020/9/14 16:39</b>
 */
public interface IVirtualOrgService<T extends BaseExtendDto> extends SdkService {

    /**
     * 获取当前虚拟组织树
     *
     * @param platformVirtualOrgParam 虚拟组织查询参数虚拟类
     * @return 虚拟组织集合树
     */
    List<PlatformVirtualOrgVo> getPlatformVirtualOrgTreeNode(PlatformVirtualOrgParam platformVirtualOrgParam);

    /**
     * 查询当前虚拟组织信息
     *
     * @param platformVirtualOrgParam 虚拟组织查询参数虚拟类
     * @return 虚拟组织集合
     */
    List<PlatformVirtualOrgVo> getPlatformVirtualOrgList(PlatformVirtualOrgParam platformVirtualOrgParam);

    /**
     * <b>Description:根据ID查询信息虚拟组织详情</b>  <br>
     * @author: zbp
     * <br><b>Date:</b> 2021/10/25 14:26
     * <br><b>Version:</b> 1.0
     * @param id 虚拟组织ID
     * @param type type
     * @return : com.bonade.sdk.opencenter.dto.virtualOrg.PlatformVirtualOrgVo
     */
    PlatformVirtualOrgVo getPlatformVirtualOrgInfo(String id, Integer type);

    /**
     * 新增虚拟组织
     *
     * @param platformVirtualOrgVo 虚拟组织新增参数
     * @return 虚拟组织ID
     */
    String addPlatformVirtualOrgInfo(PlatformVirtualOrgVo platformVirtualOrgVo);

    /**
     * 修改虚拟组织
     *
     * @param platformVirtualOrgVo 虚拟组织修改ID
     * @return 虚拟组织ID
     */
    String editPlatformVirtualOrgInfo(PlatformVirtualOrgVo platformVirtualOrgVo);

    /**
     * 删除当前虚拟组织以及下级组织
     *
     * @param id 虚拟组织ID
     * @return 删除数量
     */
    int deleteCurrentAndSon(String id);

    /**
     * 获取新的企业ID
     *
     * @param thirdCompanyId 企业ID
     * @return 新的企业ID
     */
    String getPlatformExtendCompanyOpenId(String thirdCompanyId);

    /**
     * 获取当前企业部门树
     *
     * @param companyId 企业ID
     * @return 企业部门树
     */
    List<PlatformOrgTreeVo> getPlatformOrgTreeVoTree(String companyId);

    /**
     * 获取企业ID或者部门ID获取成员
     *
     * @param companyDepartmentStaffParam 获取企业或者部门人员实体
     * @return 企业ID或者部门ID获取成员集合
     */
    PageData<List<CompanyDepartmentStaffVo>> getCompanyDepartmentStaffVoList(CompanyDepartmentStaffParam companyDepartmentStaffParam);

    /**
     * 人员离职校验
     *
     * @param staffOpenIds 人员ID
     * @return 删除数量
     */
    int dimissionDelete(List<String> staffOpenIds);

    /**
     * 获取虚拟组织部门负责人信息
     *
     * @param virtualOrgId 虚拟组织ID
     * @return 虚拟组织部门负责人信息
     */
    List<PlatformVirtualLeaderVo> getPlatformVirtualLeaderVOList(String virtualOrgId);

    /**
     * 新增虚拟组织负责人
     *
     * @param virtualOrgId 虚拟组织ID
     * @param staffOpenIds 负责人ID集合
     * @return 返回新增的id
     */
    List<String> addPlatformVirtualLeaderVO(String virtualOrgId, List<String> staffOpenIds);

    /**
     * 删除当前虚拟组织负责人
     *
     * @param virtualOrgId 虚拟组织ID
     * @param staffOpenIds 负责人ID集合
     * @return 删除的返回数量
     */
    int deletePlatformVirtualLeader(String virtualOrgId, List<String> staffOpenIds);

    /**
     * 查询当前虚拟组织成员信息
     *
     * @param platformVirtualStaffPageParam 虚拟组织成员查询参数
     * @return 虚拟组织成员集合
     */
    PageData<List<PlatformVirtualStaffVo>> getPlatformVirtualStaffVoPage(PlatformVirtualStaffPageParam platformVirtualStaffPageParam);

    /**
     * 新增虚拟组织成员
     *
     * @param platformVirtualStaffParam 虚拟组织成员（新增和删除操作参数）
     * @return 虚拟组织成员ID
     */
    List<String> addPlatformVirtualStaff(PlatformVirtualStaffParam platformVirtualStaffParam);

    /**
     * 删除虚拟组织成员信息
     *
     * @param platformVirtualStaffParam 虚拟组织成员（新增和删除操作参数）
     * @return 删除数量
     */
    int deletePlatformVirtualStaff(PlatformVirtualStaffParam platformVirtualStaffParam);
}
