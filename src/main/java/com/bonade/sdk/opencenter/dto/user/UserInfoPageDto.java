package com.bonade.sdk.opencenter.dto.user;

import com.bonade.sdk.opencenter.vo.PageInfo;

/**
 * @author: yw
 * <b>Description:</b><br>
 * <b>ProjectName:</b> open-center-sdk
 * <br><b>PackageName:</b>com.bonade.sdk.opencenter.pojo.dto
 * <br><b>ClassName:</b> PageDataDto
 * <br><b>Date:</b> 2020/8/10 8:58
 */
public class UserInfoPageDto extends PageInfo {
    /**
     * 关键字(手机号,用户名)
     */
    private String keyword;
    /**
     * 用户状态 1-激活，-1删除, 2-停用
     */
    private Integer status;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }



}
