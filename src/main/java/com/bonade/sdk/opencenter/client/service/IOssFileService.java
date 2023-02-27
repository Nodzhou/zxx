package com.bonade.sdk.opencenter.client.service;

import com.bonade.sdk.opencenter.dto.oss.ImgFileCompanyDto;
import com.bonade.sdk.opencenter.dto.oss.ImgFileUserDto;


import java.util.Map;

/**
 * author yw
 *
 * <p>
 * 文件上传
 * </p>
 */
public interface IOssFileService extends SdkService {

    /**
     * 上传企业文件
     *
     * @param imgFileCompanyDto 上传企业文件的入参实体类
     * @author: yw
     * @return: 返回上传后文件oss路径
     * <b>Description:</b><br>
     * <br><b>Date:</b> 2020/8/19 10:19
     * <br><b>Version:</b> 1.0
     */
    String uploadCompanyFile(ImgFileCompanyDto imgFileCompanyDto);

    /**
     * 上传用户文件
     *
     * @param imgFileUserDto 用户文件入参实体类
     * @author: yw
     * @return: 返回上传后文件oss路径
     * <b>Description:</b><br>
     * <br><b>Date:</b> 2020/8/19 10:23
     * <br><b>Version:</b> 1.0
     */
    String uploadUserFile(ImgFileUserDto imgFileUserDto);

}
