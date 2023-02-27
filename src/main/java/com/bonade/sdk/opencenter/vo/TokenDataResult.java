package com.bonade.sdk.opencenter.vo;


import java.io.Serializable;

import com.bonade.sdk.opencenter.common.ResultCodeConstant;

public class TokenDataResult implements Serializable {
    private static final long serialVersionUID = 5063776667672736098L;

    private Integer code;

    private String message;

    private AccessTokenVo data;

    private long timestamp;

    public TokenDataResult() {
        this.code = ResultCodeConstant.SUCCESS;
        this.message = "成功";
        this.timestamp = System.currentTimeMillis();
    }

    public TokenDataResult(Integer code, String message, AccessTokenVo data) {
        this.code = ResultCodeConstant.SUCCESS;
        this.message = "成功";
        this.timestamp = System.currentTimeMillis();
        this.message = message;
        this.data = data;
        this.code = code;
    }

    public TokenDataResult(String message, AccessTokenVo data) {
        this.code = ResultCodeConstant.SUCCESS;
        this.message = "成功";
        this.timestamp = System.currentTimeMillis();
        this.message = message;
        this.data = data;
    }

    public TokenDataResult(AccessTokenVo data) {
        this.code = ResultCodeConstant.SUCCESS;
        this.message = "成功";
        this.timestamp = System.currentTimeMillis();
        this.data = data;
    }
    public TokenDataResult(Integer code, String message) {
        this.code = ResultCodeConstant.SUCCESS;
        this.message = "成功";
        this.timestamp = System.currentTimeMillis();
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AccessTokenVo getData() {
        return this.data;
    }


    public void setData(AccessTokenVo data) {
        this.data = data;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}