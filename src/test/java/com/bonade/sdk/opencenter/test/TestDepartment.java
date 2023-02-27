package com.bonade.sdk.opencenter.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.client.service.IClientCurrentLoginInfoService;
import com.bonade.sdk.opencenter.dto.departmentDto.DepartNumByCompanyIdDto;
import com.bonade.sdk.opencenter.dto.departmentDto.DepartmentInfoDto;
import com.bonade.sdk.opencenter.dto.departmentDto.DepartmentPageDto;
import com.bonade.sdk.opencenter.dto.departmentDto.InsertOrDeleteDepartmentLeaderDto;
import com.bonade.sdk.opencenter.dto.ticket.TicketDto;
import com.bonade.sdk.opencenter.vo.AccessTokenVo;
import com.bonade.sdk.opencenter.vo.PageData;
import com.bonade.sdk.opencenter.vo.StaffInfoVo;
import com.bonade.sdk.opencenter.vo.UserInfoSimpVo;
import com.bonade.sdk.opencenter.vo.departmentVo.DepartmentChildVo;
import com.bonade.sdk.opencenter.vo.departmentVo.DepartmentInfoPageVo;
import com.bonade.sdk.opencenter.vo.departmentVo.DepartmentInfoVo;
import com.bonade.sdk.opencenter.vo.departmentVo.DepartmentTreeVo;
import com.sun.xml.internal.ws.api.server.SDDocument;
import org.junit.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

/**
 * author: chd date: 2020/7/1 14:48
 */
public class TestDepartment {

    private static SdkClient client = SdkClient.getSdkClient();
    private static String host = "http://zttest.bndxqc.com";
  //  private static String host = "http://ztdev.bndxqc.com/";
    //public static String host = "http://localhost:4190/";
//    private static String clientId = "ac18b84ea65e437f9f860581ed89ba50";
//    private static String secret = "6069351a14064504960bba3fc47a2107";
  //  public static String host = "http://zttest.bndxqc.com"; // 中台测试环境host
    public static String clientId = "00ptbnd8164305251592548366580159";
    public static String secret = "00ptbnd1992579583159254836658015";

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
        // getFatherList();
//        add();
//        edit();
        // getTreeDetailed();
//        String accessToken = SdkClient.getTokenClient().accessToken().getAccessToken();
//
//        System.out.println(accessToken);
        String accessToken = SdkClient.getTokenClient().accessToken().getAccessToken();
        System.out.println(accessToken);

//        TicketDto ticketDto = new TicketDto();
//        ticketDto.setOpenId("00ptbnd1988681534161581416196516");
//        ticketDto.setRequestedClientId("1ec595e8ba7211e99c7e7cd30ad3a6a8");
//        SdkClient.getTokenClient().accessToken().setAccessToken("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRJZCI6IjMxNmUyY2VmMjYyODQyMmNhNjVlNDZiZGZkYWNhMWZiIiwiZXhwIjoxNjE2NzYxNjA5LCJ1c2VyX25hbWUiOiIzMTZlMmNlZjI2Mjg0MjJjYTY1ZTQ2YmRmZGFjYTFmYiIsImp0aSI6IjRmYjczMjEyLTQ1MTEtNDQ4NC1hM2Q4LWQ5OTU1NzI0M2I4MyIsImNsaWVudF9pZCI6IjMxNmUyY2VmMjYyODQyMmNhNjVlNDZiZGZkYWNhMWZiIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIiwic2VydmVyIiwiWFhRWSJdfQ.e69hHvO50HPTVgLuVqrQP4eY3f92eqyGhrCb_eVdwnE");
//        ticketDto.setData(new JSONObject());
//        String ticket = client.getTicketService().createTicket(ticketDto);
//        System.out.println(ticket);

        //  get();
        //page();
//        delete();
        //  getTreeAll();
//        getChildList();
//        getChildrenIds();
//        getDepartmentIds();
//        getDepartNumByCompanyId();

        // getDepartByCompanyId();

        /***
         * 需求变更不需要，暂时保留
         */
        // getDepartmentByStaffId();
    }


    public static void getChildrenIds() {
        String id = "00ptbnd1175035545159653350413715";
        //String id = "d089d87d9f9f492e929dc9492b572340";
        List<String> childrenIds = client.getDepartmentService().getChildrenIds(id);
        System.out.println("retuen:" + childrenIds);
    }

    /**
     * {"compId":"f771b1461dc140f1b219446211591f7d","departmentName":"SDK测试","departmentType":0,"parentId":"","departmentCode":"2828","departmentDesc":"用来测试sdk的","leaders":[{"staffId":"00ptbnd1626764889159246813931615"}],"departmentNumber":"20","departmentSort":"","status":"enable"}
     */
    public static void add() {
        List<String> leaders = new ArrayList<>();
        leaders.add("00ptbnd1626764889159246813931615");
        DepartmentInfoDto departmentInfoDto = new DepartmentInfoDto();
        departmentInfoDto.setStatus(1);
        departmentInfoDto.setCompanyId("3123f7f8a2824c13a7ff94f0752925e1");
        departmentInfoDto.setDepartmentName("菜鸡部门-3");
        departmentInfoDto.setDepartmentType(0);
        departmentInfoDto.setParentId("83bc77305180401f926766266892b6b9");
        departmentInfoDto.setDepartmentCode("2828");
        departmentInfoDto.setDepartmentDesc("200");
        departmentInfoDto.setDepartmentNumber(20);
        departmentInfoDto.setDepartmentSort(2);
        departmentInfoDto.setLeaders(leaders);
        String add = client.getDepartmentService().add(departmentInfoDto);
        System.out.println("jsonObject:" + add);
    }

    @Test
    public void edit() {
        List<String> leaders = new ArrayList<>();
        leaders.add("00ptbnd1626764889159246813931615");
        DepartmentInfoDto departmentInfoDto = new DepartmentInfoDto();
        departmentInfoDto.setId("00ptbnd6146222061597051313910159");
        departmentInfoDto.setStatus(1);
        departmentInfoDto.setCompanyId("3123f7f8a2824c13a7ff94f0752925e1");
        departmentInfoDto.setDepartmentName("SDK哈哈");
        departmentInfoDto.setDepartmentType(0);
        departmentInfoDto.setParentId("1ae503f0b63047f399e6a1dce91b6a7a");
        departmentInfoDto.setDepartmentCode("2828");
        departmentInfoDto.setDepartmentDesc("200");
        departmentInfoDto.setDepartmentNumber(20);
        departmentInfoDto.setDepartmentSort(2);
        departmentInfoDto.setLeaders(leaders);
        int edit = client.getDepartmentService().edit(departmentInfoDto);
        System.out.println("jsonObject:" + edit);
//        PlatformDepartmentInfo departmentInfo = new PlatformDepartmentInfo();
//        departmentInfo.setCompanyId("00ptbnd1752818699159229337695715");
//        departmentInfo.setId("00ptbnd8715930181595488102447159");
//        departmentInfo.setDepartmentName("给sdk修改的部门");
//        departmentInfo.setDepartmentCode("test_sdk_edit");
//        departmentInfo.setDepartmentDesc("测试sdk部门修改描述");
//        int compId = client.getDepartmentService().edit(departmentInfo);
//        System.out.println("接口四：修改部门");
////        System.out.println("企业id:"+compId);
    }

    public static void get() {
        int a = 0;
        while (true) {

            try {
                String id = "d85eff9a192e42109b2cf289252348aa";

                DepartmentInfoVo departmentInfoVo = client.getDepartmentService().get(id);
                System.out.println("departmentInfoPageVo:" + JSONObject.toJSONString(departmentInfoVo));
                Thread.sleep(500);
                System.out.println("已经请求：" + a++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    public static void page() {
        DepartmentPageDto departmentPageDto = new DepartmentPageDto();
        departmentPageDto.setCompanyId("3123f7f8a2824c13a7ff94f0752925e1");
        departmentPageDto.setPageNum(1);
        departmentPageDto.setPageSize(10);
        departmentPageDto.setStatus(1);
        PageData<List<DepartmentInfoPageVo>> page = client.getDepartmentService().page(departmentPageDto);
        System.out.println("page：" + JSONObject.toJSONString(page));
    }


    public static void getTreeAll() {
        String companyId = "3123f7f8a2824c13a7ff94f0752925e1";
        String departmentName = null;
        List<DepartmentTreeVo> treeAll = client.getDepartmentService().getTreeAll(companyId, departmentName, "-1");
        System.out.println("treeAll:" + JSONObject.toJSONString(treeAll));
    }


    public static void getChildList() {
        String id = "00ptbnd1175035545159653350413715";
        DepartmentChildVo childList = client.getDepartmentService().getChildList(id);
        System.out.println("result:" + JSONObject.toJSONString(childList));
    }

    @Test
    public void getFatherList() {
        String id = "228411c3ceb74f5e990d3fdb3946e8b6";
        DepartmentChildVo childList = client.getDepartmentService().getFatherList(id);
        System.out.println("result:" + JSONObject.toJSONString(childList));
    }

    @Test
    public void delete() {
        String id = "00ptbnd2049023588159920614319215,00ptbnd6314390651599206003381159,00ptbnd5072854251599205692893159,00ptbnd4266291311599205571100159,00ptbnd7910497901599205463099159,00ptbnd1314546781599205370277159,00ptbnd3373862701599129266467159,00ptbnd3373862701599129266467159,00ptbnd4776944201599129172491159,00ptbnd1262386400159912912841015,00ptbnd5160634121599128857411159,00ptbnd1775484400159912846643115";
        int result = client.getDepartmentService().delete(id);
        System.out.println("result:" + result);
    }

    @Test
    public void getDepartmentIds() {
//        String companyId = "404c673c43114f77a615fccfc44f7298";
//        String departmentId = "24c8affcf4524482a6b8892456f44e4f";
        String departmentId = "1ae503f0b63047f399e6a1dce91b6a7a";
        String companyId = "3123f7f8a2824c13a7ff94f0752925e1";
        List<String> sonlist = client.getDepartmentService().getDepartmentIds(companyId, departmentId);
        System.out.println("sonlist:" + JSONObject.toJSONString(sonlist));
    }

    @Test
    public void getDepartmentByStaffId() {
        String staffId = "00ptbnd5671542801593398840696159";
        DepartmentInfoVo departmentByStaffId = client.getDepartmentService().getDepartmentByStaffId(staffId);
        System.out.println("platformDepartmentInfo:" + JSONObject.toJSONString(departmentByStaffId));
    }

    @Test
    public void getDepartByCompanyId() {
        String companyId = "00ptbnd2121482605159712875362815";
        List<DepartmentInfoVo> departList = client.getDepartmentService().getDepartByCompanyId(companyId, null, null);
//        System.out.println("departList:" + JSONObject.toJSONString(departList));
        System.out.println("departList:" + JSON.toJSON(departList));
    }

    @Test
    public void getDepartNumByCompanyId() {
        DepartNumByCompanyIdDto departNumByCompanyIdDto = new DepartNumByCompanyIdDto();
        ArrayList<String> ids = new ArrayList<>();
        ids.add("66a68db5742a4deaa19580c23f1ab59f");
        ids.add("9eab6593de164c0a953cfcb3982c5975");
        departNumByCompanyIdDto.setDepartmentIds(ids);
        departNumByCompanyIdDto.setCompanyId("3123f7f8a2824c13a7ff94f0752925e1");
        List<com.bonade.sdk.opencenter.vo.departmentVo.DepartStaffNumVo> departStaffNumVoList = client.getDepartmentService()
                .getDepartNumByCompanyId(departNumByCompanyIdDto);
        System.out.println("departList:" + JSONObject.toJSONString(departStaffNumVoList));
    }

    @Test
    public void insertBatchDepartmentLeader() {
        List<String> staffIds = new ArrayList<>();
        staffIds.add("00ptbnd1529634923159679664950315");
        staffIds.add("00ptbnd1742203418159678325479815");
        staffIds.add("00ptbnd3503796901597112209592159");
        //测试非同一企业下的员工id
        //staffIds.add("00044652680411e989b18cec4b6d151c");
        //测试不传参数
        String departmentId = "00ptbnd4cd7874ed7ce486290ec9d34";
        InsertOrDeleteDepartmentLeaderDto insertOrDeleteDepartmentLeaderDto = new InsertOrDeleteDepartmentLeaderDto();
        insertOrDeleteDepartmentLeaderDto.setDepartmentId(departmentId);
        insertOrDeleteDepartmentLeaderDto.setStaffIds(staffIds);
        String ids = client.getDepartmentService().insertBatchDepartmentLeader(insertOrDeleteDepartmentLeaderDto);
        System.out.println("批量插入部门领导人成功Ids：" + ids);
    }

    @Test
    public void deleteBatchDepartmentLeader() {
        List<String> staffIds = new ArrayList<>();
        staffIds.add("00ptbnd1529634923159679664950315");
        staffIds.add("00ptbnd1742203418159678325479815");
        staffIds.add("00ptbnd3503796901597112209592159");
        //测试非同一企业下的员工id
        //staffIds.add("00044652680411e989b18cec4b6d151c");
        //测试不传参数
        String departmentId = "00ptbnd4cd7874ed7ce486290ec9d34";
        InsertOrDeleteDepartmentLeaderDto insertOrDeleteDepartmentLeaderDto = new InsertOrDeleteDepartmentLeaderDto();
        insertOrDeleteDepartmentLeaderDto.setDepartmentId(departmentId);
        insertOrDeleteDepartmentLeaderDto.setStaffIds(staffIds);
        int count = client.getDepartmentService().deleteBatchDepartmentLeader(insertOrDeleteDepartmentLeaderDto);
        System.out.println("批量删除部门负责人执行成功行数：" + count);
    }


    public static void getTreeDetailed() {
        String companyId = "3123f7f8a2824c13a7ff94f0752925e1";
        String status = "1";
        List<DepartmentChildVo> treeDetailed = client.getDepartmentService().getTreeDetailed(companyId, status);
        System.out.println(JSONObject.toJSONString(treeDetailed));
    }
}
