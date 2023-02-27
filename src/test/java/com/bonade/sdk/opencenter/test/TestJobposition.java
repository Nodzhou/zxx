package com.bonade.sdk.opencenter.test;

import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.dto.jobposition.PlatformJobPositionDto;
import com.bonade.sdk.opencenter.dto.jobposition.PlatformJobPositionPageDto;
import com.bonade.sdk.opencenter.dto.jobposition.PositionStaffPageDto;
import com.bonade.sdk.opencenter.vo.JobPositionInfoVo;
import com.bonade.sdk.opencenter.vo.JobpositionTreeVo;
import com.bonade.sdk.opencenter.vo.PageData;
import com.bonade.sdk.opencenter.vo.PlatformStaffPositionVo;

import java.util.List;

/**
 * author: chd date: 2020/7/1 15:39
 */
public class TestJobposition {

    public static void main(String[] args) {
        //  add();
        //   get();
        // page();
        //getTreeAll();
//        delete();
        //edit();
  //      pageStaffByPosition();
    }

    private static SdkClient client = SdkClient.getSdkClient();
     private static String host = "http://192.168.14.214/";
    //private static String host = "http://localhost:4190";
    private static String clientId = "00ptbnd7877146261592211220014159";
    private static String secret = "00ptbnd1736481859159221122001415";

    static {
        client.init(host, clientId, secret);
    }


    public static void edit() {
        PlatformJobPositionDto platformJobPositionDto = new PlatformJobPositionDto();
        platformJobPositionDto.setStatus(1);
        platformJobPositionDto.setId("00ptbnd1185245958159926942498815");
        platformJobPositionDto.setCompanyId("3123f7f8a2824c13a7ff94f0752925e1");
//        platformJobPositionDto.setParentId("457c52c4fad74d44a3a99cc34c69e625");
        platformJobPositionDto.setPositionName("岗位扩展备注测试1");
        platformJobPositionDto.setJobScope("888");
        platformJobPositionDto.setLevel(1);
        platformJobPositionDto.setPositionCode("123");
        platformJobPositionDto.setPositionType(0);
        platformJobPositionDto.setPositionSort(21);
        platformJobPositionDto.setPositionNumber(20);
        platformJobPositionDto.setRoleIds("27f41af39dad49c59c518fa7daf95a55");
        int jsonObject = client.getJobPositionService().editJobPosition(platformJobPositionDto);
        System.out.println("jsonObject:" + jsonObject);
    }

    public static void add() {
        PlatformJobPositionDto platformJobPositionDto = new PlatformJobPositionDto();
        platformJobPositionDto.setStatus(1);
        platformJobPositionDto.setCompanyId("3123f7f8a2824c13a7ff94f0752925e1");
        platformJobPositionDto.setPositionName("测试77777");
        platformJobPositionDto.setJobScope("666666");
        //platformJobPositionDto.setParentId("");
        platformJobPositionDto.setLevel(2);
        platformJobPositionDto.setPositionCode("5121315454");
        platformJobPositionDto.setPositionType(0);
        platformJobPositionDto.setPositionSort(21);
        platformJobPositionDto.setPositionNumber(20);
        platformJobPositionDto.setRoleIds("27f41af39dad49c59c518fa7daf95a55");
        String s = client.getJobPositionService().addJobPosition(platformJobPositionDto);
        System.out.println("jsonObject:" + s);
    }

    public static void get() {
        String id = "00ptbnd1868151519159892666487115";
        JobPositionInfoVo jobPositionInfoVo = client.getJobPositionService().getJobPositionById(id);
        System.out.println("platformDepartmentInfo:" + JSONObject.toJSONString(jobPositionInfoVo));
    }

    public static void page() {

        PlatformJobPositionPageDto platformJobPositionParam = new PlatformJobPositionPageDto();
        platformJobPositionParam.setCompanyId("3123f7f8a2824c13a7ff94f0752925e1");
        PageData<List<JobPositionInfoVo>> jobPositionByPage = client.getJobPositionService().findJobPositionByPage(platformJobPositionParam);
        System.out.println(JSONObject.toJSONString(jobPositionByPage.getData()));

    }

    public static void getTreeAll() {
        String companyId = "3123f7f8a2824c13a7ff94f0752925e1";
        List<JobpositionTreeVo> treeAll = client.getJobPositionService().getAllJobToTree(companyId, null);
        System.out.println(JSONObject.toJSONString(treeAll));
    }

    public static void delete() {
        String ids = "00ptbnd1875842181159922056819615";
        int reslut = client.getJobPositionService().delete(ids);
        System.out.println("reslut:" + reslut);
    }

//    public static void pageStaffByPosition() {
//        PositionStaffPageDto positionStaffPageDto = new PositionStaffPageDto();
//        positionStaffPageDto.setPositionId("0a11bbf88543405682a52fecd19e9311");
//        positionStaffPageDto.setUserName("刘");
//        positionStaffPageDto.setPhoneNumber("132");
//        positionStaffPageDto.setCertificateCard("430");
//        positionStaffPageDto.setStatus("3");
//        positionStaffPageDto.setPageNum(1);
//        positionStaffPageDto.setPageSize(10);
//        PageData<List<PlatformStaffPositionVo>> listPageData = client.getJobPositionService().pageStaffByPosition(positionStaffPageDto);
//        System.out.println(JSONObject.toJSONString(listPageData));
//    }
}
