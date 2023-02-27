package com.bonade.sdk.opencenter.test;

import com.alibaba.fastjson.JSON;
import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.common.ApiPathConstant;
import com.bonade.sdk.opencenter.dto.unionstaffdepartDto.UnionStaffDepartDto;
import com.bonade.sdk.opencenter.vo.unionstaffdepart.UnionStaffDepartVo;

import org.junit.Test;
import org.omg.CORBA.UNKNOWN;

import java.util.List;

/**
 * @author wumengxuan
 * <b>Description:</b><br>
 * <b>ProjectName:open-center-sdk</b>
 * <br><b>PackageName:com.bonade.sdk.opencenter.test</b>
 * <br><b>ClassName:TestUnionStaffDepart</b>
 * <br><b>Date:2020/8/13 16:18</b>
 */
public class TestUnionStaffDepart {
    private static SdkClient client = SdkClient.getSdkClient();

    private static String host = "http://192.168.14.214/";
    //private static String host = "http://localhost:4190/";
    private static String clientId = "00ptbnd7877146261592211220014159";
    private static String secret = "00ptbnd1736481859159221122001415";

    static {
        client.init(host, clientId, secret);
    }

//    public static void main(String[] args) {
//        addAndEdit();
        //  edit();
        //get();
//    }

    @Test
    public void addAndEdit() {
        UnionStaffDepartDto unionStaffDepartDto = new UnionStaffDepartDto();
        unionStaffDepartDto.setDepartmentId("27337aeb99ad442eb70b5434ff607c17");
        unionStaffDepartDto.setStaffId("00ptbnd1626764889159246813931615");
        // unionStaffDepartDto.setPositionId("2c9ad4afbc314ec2afffecb780ffa368");
        String add = client.getUnionStaffDepartService().addAndEdit(unionStaffDepartDto);
        System.out.println(add);
    }

    @Test
    public void get() {
        UnionStaffDepartDto unionStaffDepartDto = new UnionStaffDepartDto();
        //unionStaffDepartDto.setId("00ptbnd2024964044159739944186515");
        //  unionStaffDepartDto.setStaffId("00ptbnd1626764889159246813931615");
        // unionStaffDepartDto.setDepartmentId("66a68db5742a4deaa19580c23f1ab59f");
        unionStaffDepartDto.setPositionId("2c9ad4afbc314ec2afffecb780ffa368");
        List<UnionStaffDepartVo> unionStaffDepartVos = client.getUnionStaffDepartService().get(unionStaffDepartDto);
        System.out.println(JSON.toJSONString(unionStaffDepartVos));
    }
}
