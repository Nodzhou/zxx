package com.bonade.sdk.opencenter.enums;

/**
 * 资源类型枚举类
 * resource_type对应类型1=菜单 2=按钮 3=目录
 *
 * @author pengjie
 */
public enum PlatformResourceTypeEnum {
    /**
     * 资源类型-系统
     */
    系统(0),
    /**
     * 资源类型-菜单
     */
    菜单(1),
    /**
     * 资源类型-按钮
     */
    按钮(2),
    /**
     * 资源类型-目录
     */
    目录(3);

    int value;

    PlatformResourceTypeEnum(Integer value) {
        this.ordinal();
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }

    public static PlatformResourceTypeEnum valueStatusEnum(Integer value) {
        for (PlatformResourceTypeEnum status : PlatformResourceTypeEnum.values()) {
            if (status.value == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("无效的value值: " + value + "!");
    }
}
