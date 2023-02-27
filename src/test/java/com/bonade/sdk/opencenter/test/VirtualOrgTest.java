package com.bonade.sdk.opencenter.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.client.service.IClientCurrentLoginInfoService;
import com.bonade.sdk.opencenter.dto.virtualOrg.PlatformOrgTreeVo;
import com.bonade.sdk.opencenter.dto.virtualOrg.PlatformVirtualOrgParam;
import com.bonade.sdk.opencenter.dto.virtualOrg.PlatformVirtualOrgVo;
import com.bonade.sdk.opencenter.dto.virtualOrg.PlatformVirtualStaffPageParam;
import com.bonade.sdk.opencenter.vo.PageData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangbeiping
 * <b>Description:</b><br>
 * <b>ProjectName:open-center-sdk</b>
 * <br><b>PackageName:com.bonade.sdk.opencenter.test</b>
 * <br><b>ClassName:VirtualOrgTest</b>
 * <br><b>Date:2020/9/15 9:30</b>
 */
public class VirtualOrgTest {

    private static SdkClient client = SdkClient.getSdkClient();
    private static String host = "http://192.168.14.214/";
    //public static String host = "http://localhost:4190/";
    private static String clientId = "00ptbnd7877146261592211220014159";
    private static String secret = "00ptbnd1736481859159221122001415";

    static {
        client.init(host, clientId, secret);
        client.setClientCurrentLoginInfoService(new IClientCurrentLoginInfoService() {
            @Override
            public String getClientCurrentOpenId() {
                return "3369";
            }
        });
    }

    public static void main(String[] args) {
        getPlatformVirtualOrgTreeNode();
        getPlatformOrgTreeVoTree();
    }

    static void getPlatformVirtualOrgTreeNode() {
        PlatformVirtualOrgParam platformVirtualOrgParam = new PlatformVirtualOrgParam();
        platformVirtualOrgParam.setCompanyId("00ptbnd50c521fa92294d74a067216362bf4e69");
        List<PlatformVirtualOrgVo> platformVirtualOrgTreeNode = client.getVirtualOrgService().getPlatformVirtualOrgTreeNode(platformVirtualOrgParam);
        System.out.println(JSONObject.toJSONString(platformVirtualOrgTreeNode));

        List<PlatformOrgTreeVo> platformOrgTreeVoTree = client.getVirtualOrgService().getPlatformOrgTreeVoTree("00ptbnd50c521fa92294d74a067216362bf4e69");
        System.out.println(JSONObject.toJSONString(platformOrgTreeVoTree));
    }

    static void getPlatformOrgTreeVoTree() {
        List<PlatformOrgTreeVo> platformOrgTreeVoTree = client.getVirtualOrgService().getPlatformOrgTreeVoTree("00ptbnd50c521fa92294d74a067216362bf4e69");
        System.out.println(JSONObject.toJSONString(platformOrgTreeVoTree));
    }


    @Test
    public void TestGetPlatformVirtualStaffVoPage() {
        PlatformVirtualStaffPageParam platformVirtualStaffPageParam = new PlatformVirtualStaffPageParam();
        List<String> staffIds = new ArrayList<>();
        staffIds.add("00044652680411e989b18cec4b6d151c");
//        platformVirtualStaffPageParam.setIds(staffIds);
        platformVirtualStaffPageParam.setType(2);
        ArrayList<String> companyIds = new ArrayList<>();
        companyIds.add("16bc53cf1f3645eba8d6c3dd63bbf0fd");
        platformVirtualStaffPageParam.setVirtualOrgIds(companyIds);
        PageData platformVirtualStaffVoPage = client.getVirtualOrgService().getPlatformVirtualStaffVoPage(platformVirtualStaffPageParam);
        System.out.println("getData===" + JSON.toJSON(platformVirtualStaffVoPage.getData()));
        System.out.println("getTotal===" + JSON.toJSON(platformVirtualStaffVoPage.getTotal()));
    }

    @Test
    public void TestGetPlatformVirtualOrgInfo() {
        String id = "1d30ec1cb2a6482589e6cd8aac0b5dfb";
        Integer type = 1;
        PlatformVirtualOrgVo platformVirtualOrgInfo = client.getVirtualOrgService().getPlatformVirtualOrgInfo(id, type);
        System.out.println("getData===" + JSON.toJSON(platformVirtualOrgInfo));
    }
}
