package com.bonade.sdk.opencenter.enums;


/**
 * 角色状态类型枚举类
 * <p>
 * * status状态：1-激活，-1删除, 2-停用，3.申请中, 4.申请不通过, 5.申请撤回
 *
 * @author pengjie
 */

public enum PlatformRoleInfoStatusEnum {
    /**
     * 激活-可用
     */
    激活(1),
    /**
     * 删除-逻辑删除。
     */
    删除(-1),
    /**
     * 停用
     */
    停用(2),
    /**
     * 申请中-待领导通过申请
     */
    申请中(3),
    /**
     * 申请不通过-未通过领导审批
     */
    申请不通过(4),
    /**
     * 申请撤回-审批发起者撤销审批
     */
    申请撤回(5);

    int value;

    PlatformRoleInfoStatusEnum(Integer value) {
        this.ordinal();
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }

    public static PlatformRoleInfoStatusEnum valueStatusEnum(Integer value) {
        for (PlatformRoleInfoStatusEnum status : PlatformRoleInfoStatusEnum.values()) {
            if (status.value == value) {
                return status;
            }
        }
        throw new IllegalArgumentException("无效的value值: " + value + "!");
    }
}
