package com.bonade.sdk.opencenter.client.service;

import com.bonade.sdk.opencenter.dto.BaseExtendDto;
import com.bonade.sdk.opencenter.dto.departmentDto.DepartNumByCompanyIdDto;
import com.bonade.sdk.opencenter.dto.departmentDto.DepartmentInfoDto;
import com.bonade.sdk.opencenter.dto.departmentDto.DepartmentPageDto;
import com.bonade.sdk.opencenter.dto.departmentDto.InsertOrDeleteDepartmentLeaderDto;
import com.bonade.sdk.opencenter.vo.PageData;
import com.bonade.sdk.opencenter.vo.departmentVo.*;

import java.util.List;

/**
 * @author: wumengxuan
 * <b>Description: 部门接口类</b><br>
 * <br><b>Date:2020/8/5 18:10</b>
 * <br><b>Version:1.0</b>
 */
public interface IDepartmentService<T extends BaseExtendDto> extends SdkService {

    /**
     * 新增部门接口
     *
     * @param departmentInfoDto 部门信息dto
     * @author: wumengxuan
     * @return: 新增部门id
     * <b>Description: 新增部门接口</b><br>
     * <br><b>Date:2020/8/10 15:00</b>
     * <br><b>Version:1.0</b>
     */
    String add(DepartmentInfoDto<T> departmentInfoDto);

    /**
     * 修改部门接口
     *
     * @param departmentInfoDto 部门信息dto
     * @author: wumengxuan
     * @return: 修改部门数量
     * <b>Description: 修改部门接口</b><br>
     * <br><b>Date:2020/8/10 15:00</b>
     * <br><b>Version:1.0</b>
     */
    int edit(DepartmentInfoDto<T> departmentInfoDto);


    /**
     * 根据部门id删除部门接口
     *
     * @param ids 需要删除的部门id，中间用逗号隔开
     * @author: wumengxuan
     * @return: 返回删除的数量
     * <b>Description:根据部门id删除部门接口</b><br>
     * <br><b>Date:2020/8/10 15:02</b>
     * <br><b>Version:1.0</b>
     */
    int delete(String ids);

    /**
     * @param id 需要获取的部门id
     * @author: wumengxuan
     * @return: 返回部门信息vo
     * <b>Description: 根据部门id获取部门信息</b><br>
     * <br><b>Date:2020/8/10 15:02</b>
     * <br><b>Version:1.0</b>
     */
    DepartmentInfoVo<T> get(String id);


    /**
     * @param departmentPageDto 部门分页信息dto
     * @author: wumengxuan
     * @return: 部门信息和分页信息
     * <b>Description: 分页查询部门信息</b><br>
     * <br><b>Date:2020/8/10 15:04</b>
     * <br><b>Version:1.0</b>
     */
    PageData<List<DepartmentInfoPageVo>> page(DepartmentPageDto departmentPageDto);


    /**
     * @param companyId      企业id
     * @param departmentName 部门名称
     * @param status 状态值
     * @author: wumengxuan
     * @return: 返回的部门树
     * <b>Description: 根据企业id和部门名称返回部门树</b><br>
     * <br><b>Date:2020/8/10 15:04</b>
     * <br><b>Version:1.0</b>
     */
    List<DepartmentTreeVo> getTreeAll(String companyId, String departmentName, String status);

    /**
     * @param companyId    企业id
     * @param departmentId 部门id
     * @author: wumengxuan
     * @return: 部门id集合
     * <b>Description: 根据企业id和部门id查询部门下的部门id集合</b><br>
     * <br><b>Date:2020/8/10 15:06</b>
     * <br><b>Version:1.0</b>
     */
    List<String> getDepartmentIds(String companyId, String departmentId);

    /**
     * <b>Description:</b> 根据员工id查询部门信息接口 <br>
     *
     * @param staffId 员工id
     * @author: biyizhuo <br>
     * <b>Date:</b> 2020/7/25 <br>
     * <b>Version:</b> 1.0
     * @return: 返回该员工所在部门信息
     */
    DepartmentInfoVo getDepartmentByStaffId(String staffId);

    /**
     * <b>Description:</b> 根据企业id查询所有部门 <br>
     *
     * @param companyId  企业id
     * @param departName 部门名
     * @param keyword    部门名关键字
     * @author: biyizhuo <br>
     * <b>Date:</b> 2020/7/25 <br>
     * <b>Version:</b> 1.0
     * @return: 返回企业下的所有部门，或者具体部门信息
     */
    List<DepartmentInfoVo> getDepartByCompanyId(String companyId, String departName, String keyword);

    /**
     * <b>Description:</b> 根据企业ID查询每个部门下的人员数目接口 <br>
     *
     * @param departNumByCompanyIdDto 包含企业id和部门id集合的dto
     * @author: biyizhuo <br>
     * <b>Date:</b> 2020/7/25 <br>
     * <b>Version:</b> 1.0
     * @return: 返回企业下的所有部门，或者具体部门信息
     */
    List<DepartStaffNumVo> getDepartNumByCompanyId(DepartNumByCompanyIdDto departNumByCompanyIdDto);

    /**
     * @param departmentId 部门id
     * @author: wumengxuan
     * @return: 子部门集合vo类
     * <b>Description:</b> 根据部门id查询子部门集合<br>
     * <br><b>Date:2020/8/6 10:01</b>
     * <br><b>Version:1.0</b>
     */
    DepartmentChildVo getChildList(String departmentId);


    /**
     * @param departmentId 部门id
     * @author: wumengxuan
     * @return: 子部门集合vo类
     * <b>Description:</b> 根据部门id查询父类部门集合<br>
     * <br><b>Date:2020/8/6 10:01</b>
     * <br><b>Version:1.0</b>
     */
    DepartmentChildVo getFatherList(String departmentId);

    /**
     * 根据id返回子部门的id集合
     *
     * @param departmentId 部门id
     * @author: wumengxuan
     * @return: ids集合
     * <b>Description: 根据id返回子部门的id集合</b><br>
     * <br><b>Date:2020/8/7 15:16</b>
     * <br><b>Version:1.0</b>
     */
    List<String> getChildrenIds(String departmentId);

    /**
     * <b>Description:</b> 根据员工Ids和部门id批量插入部门负责人 <br>
     * @author: biyizhuo
     * <br><b>Date:</b> 2020/8/19 19:03
     * <br><b>Version:</b> 1.0
     * @param insertOrDeleteDepartmentLeaderDto 员工ids集合和部门id dto
     * @return: 返回执行成功员工id
     */
    String insertBatchDepartmentLeader(InsertOrDeleteDepartmentLeaderDto insertOrDeleteDepartmentLeaderDto);

    /**
     * <b>Description:</b> 根据员工Ids和部门id批量删除部门负责人 <br>
     * @author: biyizhuo
     * <br><b>Date:</b> 2020/8/19 19:06
     * <br><b>Version:</b> 1.0
     * @param insertOrDeleteDepartmentLeaderDto 员工ids集合和部门id dto
     * @return: 返回执行成功行数
     */
    int deleteBatchDepartmentLeader(InsertOrDeleteDepartmentLeaderDto insertOrDeleteDepartmentLeaderDto);

    /**
     * @param companyId 企业id
     * @param status    要查询的部门状态
     * @author: wumengxuan
     * @return: 详细对象集合
     * <b>Description:</b> 根据企业id和状态查询部门树<br>
     * <br><b>Date:2020/8/20 16:01</b>
     * <br><b>Version:1.0</b>
     */
    List<DepartmentChildVo>  getTreeDetailed(String companyId, String status);

}
