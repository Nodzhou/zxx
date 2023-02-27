package com.bonade.sdk.opencenter.common;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description: TODO 请修改为自己的key名字
 *
 * @author zhaoshajin
 * <p>
 * Created by zhaoshajin on 2019/4/17 17:18
 */
public class Resource {

    public static final int PLATFORM_TOKEN_TIME = 86400;
    public static final int PLATFORM_REFRESH_TIME = 4320000;

    /**
     * platform接口的访问token
     */
    public static final String ACCESS_TOKEN = "access_token";
    /**
     * platform接口的刷新token
     */
    public static final String REFRESH_TOKEN = "refresh_token";
    /**
     * platform的token有效期
     */
    public static final String EXPIRES_IN = "expires_in";
    /**
     * ZT的client
     */
    public static final String CLIENT_ID = "client_id";
    public static final String CLIENT_SECRET = "client_secret";

    public static Map<String, String> cacheMap = new ConcurrentHashMap<>();

    //TODO 按照自己系统的规范来修改key名称
    /**
     * platform的访问token存放在redis里的key
     */
    public static final String PLATFORM_ACCESS_TOKEN = "zt_business:OAUTH2-ZT#ZT_ACCESS_PLATFORM";
    /**
     * platform的刷新token存放在redis里的key
     */
    public static final String PLATFORM_REFRESH_TOKEN = "zt_business:OAUTH2-ZT#ZT_REFRESH_PLATFORM";
    /**
     * 用于保存调用平台刷新token的次数和最近一次时间
     */
    public static final String REFRESH_PLATFORM_COUNT = "zt_business:OAUTH2-ZT#ZT_REFRESH_PLATFORM_COUNT";
    /**
     * 刷新应用token最多20次
     */
    public static final int REFRESH_PLATFORM_COUNT_MAX = 20;
    /**
     * 多久刷新一次
     */
    public static final int REFRESH_HOW_TIME = 3600 * 6;

    /**
     * 通过网关访问的各URL
     */
    public static final class Url {

        public static final String ACCESS_TOKEN = "/cgi-bin/oauth2-platform/access_token";
        public static final String REFRESH_TOKEN = "/cgi-bin/oauth2-platform/refresh_token";
    }
}
