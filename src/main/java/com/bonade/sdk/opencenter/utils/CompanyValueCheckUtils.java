package com.bonade.sdk.opencenter.utils;

import com.bonade.sdk.opencenter.common.CompanyValueType;
import com.bonade.sdk.opencenter.dto.CompanyInfoDto.CompanyDto;
import com.bonade.sdk.opencenter.dto.CompanyInfoDto.PlatformCompanyInfoDto;
import com.bonade.sdk.opencenter.exception.ClientException;

import java.util.Arrays;

/**
 * <b>Description:</b><br>
 *
 * @author nod
 * <b>ProjectName:</b> bonade-platform-usercenter
 * <br><b>PackageName:</b> com.bonade.sdk.opencenter.utils
 * <br><b>ClassName:</b>  type
 * <br><b>Date:</b> 2020/8/20 14:14
 */
public class CompanyValueCheckUtils {

    /***
     * 校验企业相关枚举值
     * @author:  nod
     * @param ztSysCompanyInfo 企业信息
    */
    public static void checkValueType(CompanyDto ztSysCompanyInfo) {
        if (ztSysCompanyInfo != null) {
            Integer comType = ztSysCompanyInfo.getCompanyType();
            Integer isGroup = ztSysCompanyInfo.getIsGroup();
            Integer nature = ztSysCompanyInfo.getEnterpriseNature();
            Integer s = ztSysCompanyInfo.getEnterpriseSize();

            Integer it = ztSysCompanyInfo.getIsTaxPayer();
//            Integer b = ztSysCompanyInfo.getIsBusiness();
//            Integer g = ztSysCompanyInfo.getIsOrganization();
           // Integer ic = ztSysCompanyInfo.getIsCertificated();


           /**是否为集团，0 ：不是集团, 1集团、2事业群  **/
            if (isGroup != null) {
                if (!Arrays.asList(CompanyValueType.companyGroup).contains(String.valueOf(isGroup))) {
                    throw new ClientException(10005,"是否集团 只限定值为0,1,2");
                    //return false;
                }
            }

            /**
             * 企业类型
             * 	1	客户企业
             * 2	运营企业
             * 3	合作企业
             * 4	管理员企业
             * 5	客户运营企业
             * 6	个体户
             * 7	小微企业
             */
            if (comType!=null) {
                if (!Arrays.asList(CompanyValueType.companyType).contains(String.valueOf(comType))) {
                    throw new ClientException(10005,"企业类型 只限定值为1,2,3,4,5,6,7,8");
                }
            }
            /** 企业来源
             * 	1	企业自己注册
             * 2	集团企业自己添加
             * 3	平台添加
             * 4	运营企业添加
             * 5	业务线导入
             * 6	其他
             * */
//            if (StringUtils.isNotBlank(comForm)) {
//                if (!Arrays.asList(CompanyValueType.companyForm).contains(comForm)) {
//                    return false;
//                }
//            }

            /**
             * 企业性质
             * 1	国有企业
             * 2	集体所有制
             * 3	私营企业
             * 4	外商投资企业
             * 5	个人独资企业
             * 6	股份制企业
             * 7	有限合伙企业
             * 8	联营企业
             * 9	港澳台企业
             * 10	股份合作企业
             * 11	其他
             */
            if (nature!=null) {
                if (!Arrays.asList(CompanyValueType.companyNature).contains(String.valueOf(nature))) {
                    throw new ClientException(10005,"企业性质 只限定值为1,2,3,4,5,6,7,8,9,10,11");

                }
            }
            /** 企业规模
             * 	1	大型企业
             * 2	中型企业
             * 3	小型企业
             * 4	微型企业
             * */
            if (s != null) {
                if (!Arrays.asList(CompanyValueType.companySize).contains(String.valueOf(s))) {
                    throw new ClientException(10005,"企业规模 只限定值为1,2,3,4");
                }
            }
//            /** 是否一般纳税人 1是 0否 **/
            if (it!= null&&it != 0 && it != 1) {
                throw new ClientException(10005,"是否一般纳税人 只限定值为0,1");
            }

        }

    }

    /***
     * 校验企业相关枚举值
     * @author:  nod
     * @param ztSysCompanyInfo 企业信息
     * @return  返回true 或者 false
     */
    public static Boolean checkValueType(PlatformCompanyInfoDto ztSysCompanyInfo) {
        if (ztSysCompanyInfo != null) {
            Integer comType = ztSysCompanyInfo.getCompanyType();
            Integer isGroup = ztSysCompanyInfo.getIsGroup();
            Integer nature = ztSysCompanyInfo.getEnterpriseNature();
            Integer s = ztSysCompanyInfo.getEnterpriseSize();
            Integer it = ztSysCompanyInfo.getIsTaxPayer();
            Integer b = ztSysCompanyInfo.getIsBusiness();
            Integer g = ztSysCompanyInfo.getIsOrganization();
            // Integer ic = ztSysCompanyInfo.getIsCertificated();


            /**是否为集团，0 ：不是集团, 1集团、2事业群  **/
            if (isGroup != null) {
                if (!Arrays.asList(CompanyValueType.companyGroup).contains(String.valueOf(isGroup))) {
                    return false;
                }
            }

            /**
             * 企业类型
             * 	1	客户企业
             * 2	运营企业
             * 3	合作企业
             * 4	管理员企业
             * 5	客户运营企业
             * 6	个体户
             * 7	小微企业
             */
            if (comType!=null) {
                if (!Arrays.asList(CompanyValueType.companyType).contains(String.valueOf(comType))) {
                    return false;
                }
            }
            /** 企业来源
             * 	1	企业自己注册
             * 2	集团企业自己添加
             * 3	平台添加
             * 4	运营企业添加
             * 5	业务线导入
             * 6	其他
             * */
//            if (StringUtils.isNotBlank(comForm)) {
//                if (!Arrays.asList(CompanyValueType.companyForm).contains(comForm)) {
//                    return false;
//                }
//            }

            /**
             * 企业性质
             * 1	国有企业
             * 2	集体所有制
             * 3	私营企业
             * 4	外商投资企业
             * 5	个人独资企业
             * 6	股份制企业
             * 7	有限合伙企业
             * 8	联营企业
             * 9	港澳台企业
             * 10	股份合作企业
             * 11	其他
             */
            if (nature!=null) {
                if (!Arrays.asList(CompanyValueType.companyNature).contains(String.valueOf(nature))) {
                    return false;
                }
            }
            /** 企业规模
             * 	1	大型企业
             * 2	中型企业
             * 3	小型企业
             * 4	微型企业
             * */
            if (s != null) {
                if (!Arrays.asList(CompanyValueType.companySize).contains(String.valueOf(s))) {
                    return false;
                }
            }
            /** 是否一般纳税人 1是 0否 **/
            if (it!= null&&it != 0 && it != 1) {
                return false;
            }
            /** 是否是个体工商户 1 是 0否 */
            if (b!=null&&b != 0 && b != 1) {
                return false;
            }
            /** 是否是分支组织  1 是 0否*/
            if (g!=null&& g != 0 && g != 1) {
                return false;
            }
            /** 是否实名,0-未实名，1-已实名 */
//            if (ic!=null&&ic != 0 && ic != 1) {
//                return false;
//            }
            return true;
        }
        return false;
    }
}


