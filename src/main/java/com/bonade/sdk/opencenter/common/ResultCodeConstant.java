package com.bonade.sdk.opencenter.common;

/**
 * 结果错误码
 *
 * @author jimmy
 */
public class ResultCodeConstant {

    /**
     * 请求成功
     */
    public static final int SUCCESS = 10200;


    /**
     * 请求失败
     */
    public static final int FAIL = 10500;


    /**
     * 无资源范围权限
     */
    public static final int NO_PERMISSION = 10001;


    /**
     * 未登录
     */
    public static final int NO_LOGIN = 10002;

    /**
     * 业务错误
     */
    public static final int BIZ_ERROR = 10003;


    /**
     * 方法错误
     */
    public static final int METHOD_ERROR = 10004;

    /**
     * 参数错误
     */
    public static final int PARAM_ERROR = 10005;

    /**
     * 服务器错误
     */
    public static final int SERVER_ERROR = 10006;


    /**
     * 账号密码错误
     */
    public static final int ACCOUNT_ERROR = 10007;


    /**
     * token 无效
     */
    public static final int TOKEN_ERROR = 10008;


    /**
     * 没有带token
     */
    public static final int NO_TOKEN = 10009;


    /**
     * 不支持刷新token
     */
    public static final int NO_REFRESH_TOKEN = 10010;


    /**
     * 刷新token无效
     */
    public static final int REFRESH_TOKEN_EXPIRE = 10011;


    /**
     * 刷新token上限
     */
    public static final int REFRESH_TOKEN_LIMIT = 10012;


    /**
     * 不存在的clientId
     */
    public static final int CLIENT_ID_NOT_EXIT = 11002;


    /**
     * clientSecret不匹配
     */
    public static final int CLIENT_SECRET_ERROR = 11003;


    /**
     * 无效的授权类型
     */
    public static final int GRANT_TYPE_ERROR = 11004;


    /**
     * 无效的scope
     */
    public static final int SCOP_ERROR = 11005;


    /**
     * 生成token失败
     */
    public static final int CREATE_TOKEN_ERROR = 11006;


    /**
     * 验证码失效或者不存在
     */
    public static final int VERIFY_CODE_EXPIRE = 11007;


    /**
     * 验证码不匹配
     */
    public static final int VERIFY_CODE_ERROR = 11008;


    /**
     * 手机号不存在
     */
    public static final int PHONE_NOT_EXIST = 11009;


    /**
     * 短信当日发送超过次数
     */
    public static final int SMS_QUOTA_LIMIT = 11010;


    /**
     * 调用短信服务失败
     */
    public static final int SMS_SERVER_ERROR = 11011;


    /**
     * RSA解密出错
     */
    public static final int RSA_DES_ERROR = 11012;


    /**
     * 调用平台登录超时
     */
    public static final int LOGIN_TIME_OUT = 11013;

    /**
     * 该用户未在本地系统初始化
     */
    public static final int USER_NOT_INIT = 11014;

    /**
     * 重复请求
     */
    public static final int REPEATED_REQUEST = 11015;

    /**
     * 未配置第三方系统的登陆地址
     */
    public static final int NO_THIRD_URL = 11016;


    /**
     * 访问第三方系统的登陆地址失败
     */
    public static final int ACCESS_THIRD_URL_FAIL = 11017;


    /**
     * 不存在的第三方userId
     */
    public static final int NO_THIRD_USER_ID = 12010;


    /**
     * 用户找不到
     */
    public static final int USER_NOT_FOUND = 12011;

    /**
     * 身份证已实名
     */
    public static final int ID_NO_EXIST = 12012;


    /**
     * 系统已存在该用户
     */
    public static final int USER_EXIST = 12015;


    /**
     * 不存在的第三方COMPANY_ID
     */
    public static final int NO_THIRD_COMPANY_ID = 12020;


    /**
     * 不存在该企业
     */
    public static final int COMPANY_NOT_EXIST = 12021;


    /**
     * 系统已存在该企业
     */
    public static final int COMPANY_EXIST = 12025;


    /**
     * 不存在该staff_id
     */
    public static final int STAFF_ID_NOT_EXIST = 12030;


    /**
     * 不存在员工
     */
    public static final int STAFF_NOT_EXIST = 12031;


    /**
     * 系统已存在该员工
     */
    public static final int STAFF_EXIST = 12035;


    /**
     * 手机号已存在
     */
    public static final int PHONE_EXIST = 12070;


    /**
     * 网关异常
     */
    public static final int GETWAY_ERROR = 13500;

    /**
     * 平台无任何返回
     */
    public static final int PLATFORM_RETURN_VOID = 14000;

}
