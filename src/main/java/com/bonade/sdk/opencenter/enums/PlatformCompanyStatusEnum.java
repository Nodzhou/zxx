package com.bonade.sdk.opencenter.enums;

public enum PlatformCompanyStatusEnum {
    /**
     * 正常
     */
    激活(1),
    /**
     * 禁用(本地)
     */
    停用(2),
    /**
     * 删除
     */
    删除(-1),

    /**
     * 禁用所有(数据库没使用,参数传值用)
     */
    disableAll(3);

    int value;

    private PlatformCompanyStatusEnum(Integer value) {
        this.ordinal();
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }

    public static PlatformCompanyStatusEnum valueStatusEnum(Integer value) {
        for (PlatformCompanyStatusEnum status : PlatformCompanyStatusEnum.values()) {
            if (status.value == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("无效的value值: " + value + "!");
    }
}
