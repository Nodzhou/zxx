package com.bonade.sdk.opencenter.enums;

public enum PlatformStaffStatusEnum {

    //正常
    enable(1),
    //禁用(本地)
    disable(2),
    //离职
    leave(-2),
    //删除
    delete(-1),
    //禁用所有(数据库没使用,参数传值用)
    disableAll(3);

    int value;

    private PlatformStaffStatusEnum(Integer value) {
        this.ordinal();
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }

    public static PlatformStaffStatusEnum valueStaffStatusEnum(Integer value) {
        for (PlatformStaffStatusEnum status : PlatformStaffStatusEnum.values()) {
            if (status.value == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("无效的value值: " + value + "!");
    }
}
