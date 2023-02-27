package com.bonade.sdk.opencenter.utils;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.apache.commons.lang3.StringUtils;

import com.bonade.sdk.opencenter.exception.ClientException;

public class CommonUtils {

    /**
     * token的过期时间转换成date
     * @param d 时间
     * @return 结果
     */
    public static Date getDateFromLocalDateTime(long d){
        LocalDateTime localDateTime =LocalDateTime.ofEpochSecond(d,0, ZoneOffset.ofHours(8));
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        return date;
    }


    public static String getScope(String scopes){
        int index = scopes.indexOf(" ");
        if(index > -1){
            return scopes.substring(0,index);
        }
        return scopes;
    }

    /**
     * 当前时间加上过期秒数，得到具体过期日期
     * @param expiresIn 过期秒数
     * @param date 时间
     * @return 结果
     */
    public static Date addExpires(Date date,long expiresIn){
        return new Date(date.getTime() + expiresIn*1000);
    }
 
    /**
     * <b>Description:</b> 校验名称含有特殊字符方法 <br>
     * @author: biyizhuo
     * <br><b>Date:</b> 2021/1/6 15:42
     * <br><b>Version:</b> 1.0
     * @param name 任何名称
     * @return : boolean 返回结果
     */
    public static boolean filterStr(String name) throws PatternSyntaxException {
        //特殊字符
        String regEx = ".*[`~!@#$%^&*()+=|{}:;\\\\[\\\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？'].*";
//        String regEx = ".*[!$^&*+=|{}';'\",<>/?~！#￥%……&*——|{}【】‘；：”“'。，、？ ].*";

        if (StringUtils.isNotBlank(name)) {
            Pattern pattern = Pattern.compile(regEx);
            Matcher matcher = pattern.matcher(name);
            boolean matches = matcher.matches();
            if (matches) {
                throw new ClientException("名称不允许存在特殊字符串，请重新输入！");
            }
        }
        // 返回替换结果
        return true;
    }
}
