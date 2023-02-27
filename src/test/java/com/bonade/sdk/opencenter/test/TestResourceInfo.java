package com.bonade.sdk.opencenter.test;

import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.pojo.EosResourceInfo;
import com.bonade.sdk.opencenter.vo.PageData;

import java.util.List;

/**
 * @author pengjie
 * @date 15:23 2020/7/1
 */
public class TestResourceInfo {
    public static void main(String[] args) throws Exception {
        SdkClient sdkClient = init();
//        testAdd(sdkClient);
//        testEdit(sdkClient);
        testDelete(sdkClient);
//        testPage(sdkClient);
//        testGet1(sdkClient, "00f6780fb7a4487b87fb21251ae609c2");
    }

    public static SdkClient init() {
        String host = "http://192.168.14.214";
        String clientId = "00ptbnd7877146261592211220014159";
        String secret = "00ptbnd1736481859159221122001415";

        SdkClient client = SdkClient.getSdkClient();
        client.init(host, clientId, secret);
//        client.getTokenClient().accessToken();
        return client;
    }

    public static void testAdd(SdkClient client) throws Exception {
        EosResourceInfo eosResourceInfo = new EosResourceInfo();
        eosResourceInfo.setApplicationName("hello test");
        eosResourceInfo.setResourceName("由SDK添加测试的资源名称");
        eosResourceInfo.setSystemId("6208050fc3864598a8504558264e9766");
        eosResourceInfo.setResourceUrl("http://zhongtaioss.bndxqc.com/test/file-dir/hnT4my3FBG.png");
        eosResourceInfo.setClientId("bonade");
        eosResourceInfo.setThirdResourceId("werwerwer237462736");
        System.out.println(client.getResourceInfoService().add(eosResourceInfo));
    }

    public static void testEdit(SdkClient client) throws Exception {
        EosResourceInfo eosResourceInfo = new EosResourceInfo();
        eosResourceInfo.setApplicationName("asdfas");
        eosResourceInfo.setResourceName("由SDK添加测试的资源名称234");
        eosResourceInfo.setSystemId("6208050fc3864598a8504558264e9766");
        eosResourceInfo.setResourceUrl("http://zhongtaioss.bndxqc.com/test/file-dir/hnT4my3FBG.png");
        eosResourceInfo.setClientId("bonade");
        eosResourceInfo.setThirdResourceId("werwerwer237462736");
        eosResourceInfo.setResourceOpenId("00ptbnd9552551451594628976590159");
        System.out.println(client.getResourceInfoService().update(eosResourceInfo));
    }

    public static void testDelete(SdkClient client) throws Exception {
        String resourceOPeind = "01ac275271f143e1b715724f0e5727fd";
        System.out.println(client.getResourceInfoService().delete(resourceOPeind));
    }

    public static void testGet(SdkClient client, String roleOpenId) throws Exception {
        System.out.println(((EosResourceInfo) client.getResourceInfoService().get(roleOpenId)).getResourceName());
    }

    public static void testGet1(SdkClient client, String roleOpenId) throws Exception {
        EosResourceInfo eosResourceInfo = ((EosResourceInfo) client.getResourceInfoService().get(roleOpenId));
        System.out.println(eosResourceInfo.getResourceName());
        System.out.println(eosResourceInfo.getResourceDesc());
//        System.out.println(client.getResourceInfoService().get(roleOpenId).getResourceName());
    }

    public static void testPage(SdkClient client) throws Exception {

        int pageNum = 0;
        int pageSize = 100;
        String companyOpenId = "1aa6cecac48042d2bb08d78e33a64bc4";
        String systemId = "683adaf4e6dd4bb09fbb1925fdb2e55a";
        String keyword = null;
        PageData<List<EosResourceInfo>> eos = client.getResourceInfoService().listByPage(pageNum, pageSize, companyOpenId, keyword);
        for (EosResourceInfo e : eos.getData()) {
            System.out.println(e.getResourceOpenId());
            testGet(client, e.getResourceOpenId());
            System.out.println(e.getParentResourceName());
        }
    }
}
