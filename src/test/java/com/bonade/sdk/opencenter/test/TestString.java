package com.bonade.sdk.opencenter.test;

import com.bonade.sdk.opencenter.utils.CommonUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * <b>Description:</b><br>
 *
 * @author: biyizhuo
 * <b>ProjectName:</b> open-center-sdk
 * <br><b>PackageName:</b>com.bonade.sdk.opencenter.test
 * <br><b>ClassName:</b> TestString
 * <br><b>Date:</b> 2020/12/23 10:28
 * <p> -----------------------
 * Copyright© 2020.10.20 by 博纳德集团有限公司.All rights reserved.
 * 1.版权归博纳德集团公司所有；
 * 2.未经原作者允许不得转载本代码内容，否则将视为侵权；
 * 3.对于不遵守此声明或者其他违法使用本代码内容者，本公司依法保留追究权。
 * </p>
 */
public class TestString {

    /**
     * 常见特殊字符过滤
     *
     * @param str
     * @return
     */
    public static String filtration(String str) {
        String regEx = "[`~!@#$%^&*()+=|{}:;\\\\[\\\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？']";
        str = Pattern.compile(regEx).matcher(str).replaceAll("").trim();
        return str;
    }

    public static String FilterStr(String str) throws PatternSyntaxException {
        /**
         * 特殊字符
         */
        String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？_]";

        /**
         * Pattern p = Pattern.compile("a*b");
         * Matcher m = p.matcher("aaaaab");
         * boolean b = m.matches();
         */
        Pattern pat = Pattern.compile(regEx);
        Matcher mat = pat.matcher(str);

         // 返回替换结果
        return mat.replaceAll("").trim();
    }


    public static void main(String[] args) {
//        String str = "%[角>....色&&&*]~`!";
        String str = "15815802845";
//        String filtration = filtration(str1);
//        System.out.println("str ======" + filtration);
//        String filterStr = FilterStr(str);
//        System.out.println("str ======" + filterStr);
        CommonUtils.filterStr(str);

    }
}
