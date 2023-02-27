package com.bonade.sdk.opencenter.client.service;

import java.util.List;

import com.bonade.sdk.opencenter.dto.jobposition.PlatformJobPositionDto;
import com.bonade.sdk.opencenter.dto.jobposition.PlatformJobPositionPageDto;
import com.bonade.sdk.opencenter.dto.jobposition.PositionStaffPageDto;
import com.bonade.sdk.opencenter.param.PlatformJobPositionParam;
import com.bonade.sdk.opencenter.pojo.PlatformJobPositionInfo;
import com.bonade.sdk.opencenter.vo.JobPositionInfoVo;
import com.bonade.sdk.opencenter.vo.JobpositionTreeVo;
import com.bonade.sdk.opencenter.vo.PageData;
import com.bonade.sdk.opencenter.vo.PlatformStaffPositionVo;

/**
 * author: chd
 * date: 2020/6/29 17:46
 */
public interface IJobPositionService extends SdkService {

    /**
     * 新增岗位
     * @param platformJobPositionDto 岗位基础信息
     * @return java.lang.String 岗位id
     */
    String addJobPosition(PlatformJobPositionDto platformJobPositionDto);

    /**
     * 编辑岗位
     * @param platformJobPositionDto 岗位基础信息
     * @return int 受影响行数
     */
    int editJobPosition(PlatformJobPositionDto platformJobPositionDto);

    /**
     * 岗位分页查询
     * @param platformJobPositionPageDto 岗位信息入参
     * @return  岗位分页列表信息
     */
    PageData<List<JobPositionInfoVo>> findJobPositionByPage(PlatformJobPositionPageDto platformJobPositionPageDto);

    /**
     * 根据岗位id删除(包含所有下级, 如果员工关联岗位会打回),多条记录用逗号分隔
     * @param ids 岗位id,可逗号隔开传多条记录
     * @return int 受影响行数
     */
    int delete(String ids);

    /**
     * 根据岗位id查询对应岗位数据
     * @param id 岗位id
     * @return PlatformJobPositionInfo 岗位信息
     */
    JobPositionInfoVo getJobPositionById(String id);

    /**
     *获取当前公司所有岗位--返回树结构
     * @param companyId 企业id
     * @param positionName 岗位名称
     * @return  岗位树实体集合
     */
    List<JobpositionTreeVo> getAllJobToTree(String companyId, String positionName);


}
