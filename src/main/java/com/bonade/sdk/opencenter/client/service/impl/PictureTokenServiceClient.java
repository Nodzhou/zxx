package com.bonade.sdk.opencenter.client.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.service.IPictureTokenService;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.utils.HttpClientUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * <b>Description:</b><br>
 *
 * @author nod
 * <b>ProjectName:</b> open-center-sdk
 * <br><b>PackageName:</b> com.bonade.sdk.opencenter.client
 * <br><b>ClassName:</b>  PictureTokenServiceClient
 * <br><b>Date:</b> 2020/8/18 17:43
 */
public class PictureTokenServiceClient implements IPictureTokenService { 

    /***
     * PC端 获取图片上传的token信息
     * @author:  nod
     * @param callBack 设置的回调函数 可不传
     * @return  返回token信息
    */
    @Override
    public String getPicToken(String callBack) {

        JSONObject param=new JSONObject(1);
        if(StringUtils.isNotBlank(callBack)) {
            param.put("callback", callBack);
        }
        JSONObject obj = getClient().executePost(ApiPathConstant.PicTokenUrl.GET_PIC_TOKEN, HttpClientUtils.CONTENT_TYPE_URLENCODED,
                param);
       return obj.toJSONString();
    }

    /***
     * PC端 获取私密图片上传的token信息
     * @author:  nod
     * @param callBack 设置的回调函数 可不传
     * @return  返回token信息
     */
    @Override
    public String getPrivateToken(String callBack) {
        JSONObject param=new JSONObject(1);
        if(StringUtils.isNotBlank(callBack)) {
            param.put("callback", callBack);
        }
        JSONObject obj = getClient().executePost(ApiPathConstant.PicTokenUrl.GET_PRI_TOKEN, HttpClientUtils.CONTENT_TYPE_URLENCODED,
                param);
        return obj.toJSONString();
    }

    /***
     * 移动端 获取图片上传的token信息
     * @author:  nod
     * @return  返回token信息
    */
    @Override
    public String getStsToken() {
        JSONObject param=new JSONObject(1);
        JSONObject obj = getClient().executeGet(ApiPathConstant.PicTokenUrl.GET_STS_TOKEN,param);
        return obj.toJSONString();
    }

    @Override
    public String viewCompanyPic(String url) {
        JSONObject params = new JSONObject(1);
        params.put("url",url);
        JSONObject resultObj = getClient()
                .executePost(ApiPathConstant.PicTokenUrl.VIEW_PIC, HttpClientUtils.CONTENT_TYPE_JSON,params );
        if(resultObj!=null) {
            return resultObj.getString("url");
        }
        return  null;
    }


}
