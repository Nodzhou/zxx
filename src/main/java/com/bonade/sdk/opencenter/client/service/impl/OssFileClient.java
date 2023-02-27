package com.bonade.sdk.opencenter.client.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.service.IOssFileService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.dto.oss.ImgFileCompanyDto;
import com.bonade.sdk.opencenter.dto.oss.ImgFileUserDto;
import com.bonade.sdk.opencenter.exception.ClientException;


/**
 * author yw
 *
 * <p>
 * 文件上传实现类
 * </p>
 */
public class OssFileClient  implements IOssFileService { 

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
    @Override
    public String uploadCompanyFile(ImgFileCompanyDto imgFileCompanyDto) {
        JSONObject resultObject = getClient().postByJson(ApiPathConstant.OssFileUrl.OSS_POST_UPLOAD_COMPANY_FILE,
                 (JSONObject) JSONObject.toJSON(imgFileCompanyDto));
        if (resultObject == null) {
            throw new ClientException("SDK调用企业文件上传接口返回信息为空！");
        }
        return resultObject.getString("ossPath");
    }


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
    @Override
    public String uploadUserFile(ImgFileUserDto imgFileUserDto) {
        JSONObject resultObject = getClient().postByJson(ApiPathConstant.OssFileUrl.OSS_POST_UPLOAD_USER_FILE,
                (JSONObject) JSONObject.toJSON(imgFileUserDto));
        if (resultObject == null) {
            throw new ClientException("SDK调用用户文件上传接口返回信息为空！");
        }
        return resultObject.getString("ossPath");
    }
}
