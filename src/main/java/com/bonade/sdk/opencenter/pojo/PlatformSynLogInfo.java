package com.bonade.sdk.opencenter.pojo;

import java.util.Date;

/**
 * @author: lyh
 * Description:
 * ProjectName: bonade-platform-opencenter
 * Date: 2020/9/4 14:40
 */
public class PlatformSynLogInfo {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 队列类型
     */
    private Integer logType;

    /**
     * 队列名称
     */
    private String queueName;

    /**
     * 消息数据
     */
    private String msg;

    /**
     * 日志类型
     */
    private Integer logStatus;

    /**
     * 业务线
     */
    private String ywx;

    /**
     * 创建者
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 备注
     */
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLogType() {
        return logType;
    }

    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getLogStatus() {
        return logStatus;
    }

    public void setLogStatus(Integer logStatus) {
        this.logStatus = logStatus;
    }

    public String getYwx() {
        return ywx;
    }

    public void setYwx(String ywx) {
        this.ywx = ywx;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
