package com.bonade.sdk.opencenter.client.service;

/**
 * <b>Description:</b><br>
 *
 * @author nod
 * <b>ProjectName:</b> bonade-platform-usercenter
 * <br><b>PackageName:</b> com.bonade.sdk.opencenter.client.service
 * <br><b>ClassName:</b>  type
 * <br><b>Date:</b> 2020/8/18 17:41
 */
public interface IPictureTokenService extends SdkService {

    /*pc端 获取图片上传的token信息*/
    String getPicToken(String callBack);

    /*pc端 获取私密图片上传的token信息*/
    String getPrivateToken(String callBack);

    /*移动端 获取图片上传的token信息*/
    String getStsToken();

    /***
     * 获取私密图片的临时凭证
     * @author:  nod
     * @param url 入参
     * @return 返回私密图片的临时凭证
    */
    String viewCompanyPic(String url);
}
