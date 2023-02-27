package com.bonade.sdk.opencenter.enums;

public enum PlatformStatusEnum {
    //正常
    激活(1),
    //禁用(本地)
    停用(2),
    //离职
    离职(-2),
    //删除
    删除(-1);


    int value;

    private PlatformStatusEnum(Integer value) {
        this.ordinal();
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }

    public static PlatformStatusEnum valueStatusEnum(Integer value) {
        for (PlatformStatusEnum status : PlatformStatusEnum.values()) {
            if (status.value == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("无效的value值: " + value + "!");
    }
}
