package com.bonade.sdk.opencenter.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.dto.BaseExtendDto;
import com.bonade.sdk.opencenter.dto.platformstaffinfo.PlatformStaffInfoDto;
import com.bonade.sdk.opencenter.dto.platformstaffinfo.PlatformStaffInfoPageDto;
import com.bonade.sdk.opencenter.dto.platformstaffinfo.StaffInfoPageByDepartIdDto;
import com.bonade.sdk.opencenter.vo.PageData;
import com.bonade.sdk.opencenter.vo.PlatformStaffInfoVo;
import com.bonade.sdk.opencenter.vo.StaffBaseVo;
import com.bonade.sdk.opencenter.vo.StaffInfoPageByDepartVo;

public class TestStaffInfo {

    private static String host = "http://localhost:4190/";
    private static String clientId = "54a4f5de3f434a50a245b1174efb588f";
    private static String secret = "bc20f2c1ad224141b1c52f7d0e157f22";

//    static String host = "http://192.168.14.214/";
//    private static String clientId = "00ptbnd7877146261592211220014159";
//    private static String secret = "00ptbnd1736481859159221122001415";


//    private static String host = "http://zttest.bndxqc.com";
//    private static String clientId = "a686023f70a711e9b9fd7cd30a5a3208";
//    private static String secret = "563a81b870b211e9b9fd7cd30a5a3208";


    static SdkClient client = SdkClient.getSdkClient();

    static {

        client.init(host, clientId, secret);
    }

    public static void main(String[] str) {
//        edit();
        add();
//        delete();
//        get();
        // dimiss();
//        saveDepart();
//        editDepart();
//        deleteDepart();
//        findRecordsByCondition();
//        page();
        page2();
//        getStaffByPhoneAndOpenId();
    }


//    private static void getStaffByPhoneAndOpenId() {
//        String phonenumber = "";
//        String userId = "00ptbnd6077965615924681390581592";
//        String ccompanyId = "3123f7f8a2824c13a7ff94f0752925e1";
//        StaffBaseVo staffByPhoneAndOpenId = client.getStaffInfoService().getStaffByPhoneAndOpenId(phonenumber, userId, ccompanyId);
//        System.out.println(JSONObject.toJSONString(staffByPhoneAndOpenId));
//    }

    private static void add() {
        PlatformStaffInfoDto platformStaffInfo = new PlatformStaffInfoDto();
        platformStaffInfo.setUserName("张先锋1");
        platformStaffInfo.setCertificateType(1);
        platformStaffInfo.setCompanyId("daa12c31c26b4b5fad0e0dd2879cd37c");
        platformStaffInfo.setDepartmentId("b9cc9f6e0c0542c7afc886acc63fdf15");
        platformStaffInfo.setGender(1);
        platformStaffInfo.setCertificateCard("420621199805260314");
        platformStaffInfo.setPhoneNumber("13024112777");
        platformStaffInfo.setPositionId("30f8979909c3404cbb02ca4c55c5977d");
        String addString = client.getStaffInfoService().addStaff(platformStaffInfo);
        System.out.println("addString=" + addString);
    }

    private static void edit() {
        PlatformStaffInfoDto platformStaffInfo = new PlatformStaffInfoDto();
        platformStaffInfo.setCompanyId("daa12c31c26b4b5fad0e0dd2879cd37c");
        platformStaffInfo.setId("00ptbnd2027958579159911726473816");
        platformStaffInfo.setPhoneNumber("13954112776");
        platformStaffInfo.setUserName("泥猴啊");
//        platformStaffInfo.setCertificateType(1);
        platformStaffInfo.setDepartmentId("b9cc9f6e0c0542c7afc886acc63fdf16");
        platformStaffInfo.setDepartmentName("泥猴部门");
//        platformStaffInfo.setEmploymentDate(new Date());
//        platformStaffInfo.setGender(1);
//        platformStaffInfo.setCertificateCard("420621199805260314");
//        platformStaffInfo.setIsMainCompany(1);
//        platformStaffInfo.setPositionId("30f8979909c3404cbb02ca4c55c5977d");
        int addString = client.getStaffInfoService().editStaff(platformStaffInfo);
        System.out.println("intString=" + addString);
    }

    private static void get() {
        PlatformStaffInfoVo platformStaffInfo = (PlatformStaffInfoVo) client.getStaffInfoService().getStaffById("00ptbnd1808978394159471090966215");
        System.out.println("get staffInfoVo getUserName =" + platformStaffInfo.getUserName());
    }


    private static void delete() {
        List<String> list = new ArrayList<>();
        list.add("00ptbnd8250269751597038005180159");
        list.add("00ptbnd1119194717159702575134815");
        int i = client.getStaffInfoService().deleteStaffByIds(list);
        System.out.println("i = " + i);
    }


    private static void dimiss() {
        List<String> list = new ArrayList<>();
        list.add("00ptbnd8250269751597038005180159");
        list.add("00ptbnd1119194717159702575134815");
        int i = client.getStaffInfoService().dimissStaffByIds(list);
        System.out.println("dimiss=" + i);
    }

    private static void page() {

        PlatformStaffInfoPageDto pageDto = new PlatformStaffInfoPageDto();
        pageDto.setPageNum(1);
        pageDto.setPageSize(10);
        //pageDto.setKeyword("测试");
        pageDto.setCompanyId("00ptbnd6284161101597213484744159"); //查询列表
        //pageDto.setDepartmentId("b5020d59c0514442984a9c6a51326cdc");
        //pageDto.setPositionId("2228");
        //pageDto.setIsCertificated(1);
        // pageDto.setIsMainCompany(1);
        //pageDto.setIsNotLeft(0);
        PageData<List<PlatformStaffInfoVo<BaseExtendDto>>> page = client.getStaffInfoService().findStaffByPage(pageDto);
        System.out.println("getData=====>" + JSON.toJSON(page.getData()));
        System.out.println("getTotal=====>" + JSON.toJSON(page.getTotal()));


    }

    private static void page2() {
        StaffInfoPageByDepartIdDto pageDto = new StaffInfoPageByDepartIdDto();
        pageDto.setDepartmentId("00ptbnd1162440715159098009382115");
        pageDto.setPageNow(1);
        pageDto.setPageSize(10);
        PageData<List<StaffInfoPageByDepartVo<BaseExtendDto>>> page = client.getStaffInfoService().pageByDepartmentId(pageDto);
        System.out.println("getData=====>" + JSON.toJSON(page.getData()));
        System.out.println("getTotal=====>" + JSON.toJSON(page.getTotal()));
    }
}
