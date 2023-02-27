package com.bonade.sdk.opencenter.client.service;

import com.bonade.sdk.opencenter.dto.BaseExtendDto;
import com.bonade.sdk.opencenter.dto.platformstaffinfo.PlatformStaffInfoDto;
import com.bonade.sdk.opencenter.dto.platformstaffinfo.StaffInfoPageByDepartIdDto;
import com.bonade.sdk.opencenter.dto.platformstaffinfo.PlatformStaffInfoPageDto;
import com.bonade.sdk.opencenter.pojo.PlatformUnionStaffDepart;
import com.bonade.sdk.opencenter.vo.PageData;
import com.bonade.sdk.opencenter.vo.PlatformStaffInfoVo;
import com.bonade.sdk.opencenter.vo.StaffBaseVo;
import com.bonade.sdk.opencenter.vo.StaffInfoPageByDepartVo;

import java.util.List;

/**
 * <p>
 * 员工表 服务类
 * </p>
 *
 * @author zxx
 * @since 2020-06-28
 */
public interface IStaffInfoService<T extends BaseExtendDto> extends SdkService {
	
    /**
     * 添加一个员工
     * @param platformStaffInfoDto 员工实体
     * @return 员工id
     */
    String addStaff(PlatformStaffInfoDto<T> platformStaffInfoDto);

    /**
     *修改员工
     * @param platformStaffInfoDto 员工实体
     * @return int 影响行数 0-失败 1-成功
     */
    int editStaff(PlatformStaffInfoDto<T> platformStaffInfoDto);

    /**
     *  获取员工详情
     * @param staffId 员工id
     * @return 员工实体
     */
    PlatformStaffInfoVo<T> getStaffById(String staffId);

    /**
     * 批量删除员工
     * @param ids 员工ids集合
     * @return int 删除行数 0-失败
     */
    int deleteStaffByIds(List<String> ids);

    /**
     * 获取员工分页列表
     * @param platformStaffInfoPageDto 查询字段封装实体
     * @return PageData 分页后列表
     */
    PageData<List<PlatformStaffInfoVo<T>>> findStaffByPage(PlatformStaffInfoPageDto platformStaffInfoPageDto);

    /**
     *  批量离职员工
     * @param ids 员工ids集合
     * @return int 删除行数 0-失败
     */
    int dimissStaffByIds(List<String> ids);

    PageData<List<StaffInfoPageByDepartVo<T>>> pageByDepartmentId(StaffInfoPageByDepartIdDto dto);


}
