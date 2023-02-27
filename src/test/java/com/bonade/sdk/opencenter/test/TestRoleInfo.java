package com.bonade.sdk.opencenter.test;

import com.bonade.sdk.opencenter.client.SdkClient;
import com.bonade.sdk.opencenter.pojo.EosRoleInfo;
import com.bonade.sdk.opencenter.vo.EosRoleResourceVo;
import com.bonade.sdk.opencenter.vo.PageData;
import com.bonade.sdk.opencenter.vo.RoleAccreditVo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author pengjie
 * @date 9:28 2020/6/30
 */
public class TestRoleInfo {
    public static void main(String[] args) throws Exception {
        SdkClient client = init();
//        testAdd(client);
        testGet(client);
//        testEdit(client);
//        testDelete(client);
//        testListPage(client);
//        testAddStaffRole(client);
//        testDeleteStaffRole(client);
//        testRoleAccredit(client);
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

    public static void testAdd(SdkClient client) {
        EosRoleInfo eosRoleInfo = new EosRoleInfo();

        eosRoleInfo.setRoleName("由SDK添加的角色名称20200713");
        eosRoleInfo.setCompanyOpenId("1aa6cecac48042d2bb08d78e33a64bc4");
        try {
            String roleOpenId = client.getRoleInfoService().add(eosRoleInfo);
            System.out.println("roleOpenId:" + roleOpenId);
        } catch (Exception e
        ) {
            e.printStackTrace();
        }
    }

    public static void testEdit(SdkClient client) {
        EosRoleInfo eosRoleInfo = new EosRoleInfo();

        eosRoleInfo.setRoleName("由SDK添加的角色名称20200713");
        eosRoleInfo.setCompanyOpenId("1aa6cecac48042d2bb08d78e33a64bc4");
        eosRoleInfo.setRoleDesc("添加测试的内容获取了！！Ll");
        eosRoleInfo.setRoleOpenId("00ptbnd4815576415946284347231594");
        eosRoleInfo.setRoleValidityPeriod(new Date());
        try {
            int affectRows = client.getRoleInfoService().update(eosRoleInfo);
            System.out.println("affectRows:" + affectRows);
        } catch (Exception e
        ) {
            e.printStackTrace();
        }
    }

    public static void testGet(SdkClient client) throws Exception {
        String roleOpenId = "00ptbnd4815576415946284347231594";
        System.out.println(((EosRoleInfo) client.getRoleInfoService().get(roleOpenId)).getRoleName());
    }

    public static void testDelete(SdkClient client) throws Exception {
        String roleOpenId = "00ptbnd4815576415946284347231594";
        System.out.println(client.getRoleInfoService().delete(roleOpenId));
    }

    public static void testListPage(SdkClient client) throws Exception {
        int pageNum = 0;
        int pageSize = 3;
        String keyword = "角色名称测试";
        String companyOpenId = "1aa6cecac48042d2bb08d78e33a64bc4";
        PageData<List<EosRoleInfo>> roleLis = client.getRoleInfoService().listByPage(pageNum, pageSize, companyOpenId, keyword);
        for (EosRoleInfo eos : roleLis.getData()) {
            System.out.println(eos.getRoleName() + "-" + eos.getStatus());
        }
    }

    public static void testAddStaffRole(SdkClient client) throws Exception {
        String roleID = "00ptbnd1007840900159350524769515";
        String staffIds = "bd9168f66bcf4cae85132ab0ce79c58a";
        int i = client.getRoleInfoService().addStaffRole(roleID, staffIds, null);

        System.out.println("i:" + i);
    }

    public static void testDeleteStaffRole(SdkClient client) throws Exception {
        String roleID = "00ptbnd1007840900159350524769515";
        String staffIds = "bd9168f66bcf4cae85132ab0ce79c58a";
        int i = client.getRoleInfoService().deleteStaffRole(roleID, staffIds);

        System.out.println("i:" + i);
    }

    public static void testRoleAccredit(SdkClient client) throws Exception {
        RoleAccreditVo roleAccreditVo = new RoleAccreditVo();
        roleAccreditVo.setRoleId("06e3573253cc44fcbc613cc56bee3693");
        List<EosRoleResourceVo> eosRoleResourceVos = new ArrayList<>();
        EosRoleResourceVo eosRoleResourceVos1 = new EosRoleResourceVo();
        eosRoleResourceVos1.setMenuId("2f9351494c7d46a686911e08aa714dd9");
        EosRoleResourceVo eosRoleResourceVos2 = new EosRoleResourceVo();
        eosRoleResourceVos2.setMenuId("e1dfe8d32e6e40ee8685db7494cd811f");
        EosRoleResourceVo eosRoleResourceVos3 = new EosRoleResourceVo();
        eosRoleResourceVos3.setMenuId("6d3abb9555074f98adce025a070314eb");
        EosRoleResourceVo eosRoleResourceVos4 = new EosRoleResourceVo();
        eosRoleResourceVos4.setMenuId("583eff4191f94f6ea5e32dc9d03e24e4");
        EosRoleResourceVo eosRoleResourceVos5 = new EosRoleResourceVo();
        eosRoleResourceVos5.setMenuId("07b57cdf406e4354939fc65eeaadf330");

        EosRoleResourceVo eosRoleResourceVos6 = new EosRoleResourceVo();
        eosRoleResourceVos6.setMenuId("3c58b8924a9b42caa6f3ad62c05de09b");
        EosRoleResourceVo eosRoleResourceVos7 = new EosRoleResourceVo();
        eosRoleResourceVos7.setMenuId("a7c8e912bc3e401a9fe420f099f83777");
        EosRoleResourceVo eosRoleResourceVos8 = new EosRoleResourceVo();
//        eosRoleResourceVos8.setMenuId("101796c56f4a4231ae19e793d153e02e");

        eosRoleResourceVos.add(eosRoleResourceVos1);
        eosRoleResourceVos.add(eosRoleResourceVos2);
        eosRoleResourceVos.add(eosRoleResourceVos3);
        eosRoleResourceVos.add(eosRoleResourceVos4);

        eosRoleResourceVos.add(eosRoleResourceVos5);
        eosRoleResourceVos.add(eosRoleResourceVos6);
        eosRoleResourceVos.add(eosRoleResourceVos7);
//        eosRoleResourceVos.add(eosRoleResourceVos8);

        roleAccreditVo.setMenuRoles(eosRoleResourceVos);
        roleAccreditVo.setClientId("00ptbnd7877146261592211220014159");

        System.out.println(client.getRoleInfoService().roleAccredit(roleAccreditVo));
    }
}
