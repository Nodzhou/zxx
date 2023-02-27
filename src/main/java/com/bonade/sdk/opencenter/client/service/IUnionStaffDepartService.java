package com.bonade.sdk.opencenter.client.service;

import com.bonade.sdk.opencenter.dto.unionstaffdepartDto.UnionStaffDepartDto;
import com.bonade.sdk.opencenter.pojo.PlatformUnionStaffDepart;
import com.bonade.sdk.opencenter.vo.unionstaffdepart.UnionStaffDepartVo;

import java.util.List;

/**
 * @author wmx
 * <p>
 * 员工部门岗位关联表
 * </p>
 */
public interface IUnionStaffDepartService extends SdkService {
    /**
     * @param UnionStaffDepartDto 中间表对象dto。包含了 员工id 部门id 岗位id
     * @author: wumengxuan
     * @return: 添加或者修改的id、
     * <b>Description:</b> 添加或修改中间表信息 <br>
     * <br><b>Date:2020/8/15 9:31</b>
     * <br><b>Version:1.0</b>
     */
    String addAndEdit(UnionStaffDepartDto UnionStaffDepartDto);


    /**
     * @param unionStaffDepartDto 中间表对象dto。包含了 员工id 部门id 岗位id
     * @author: wumengxuan
     * @return: UnionStaffDepartVo实体对象集合
     * <b>Description:</b>获取关联表信息<br>
     * <br><b>Date:2020/8/15 9:27</b>
     * <br><b>Version:1.0</b>
     */
    List<UnionStaffDepartVo> get(UnionStaffDepartDto unionStaffDepartDto);

}
