package com.bonade.sdk.opencenter.enums;

/**
 * 性别枚举
 * 
 * @author linsj
 *
 */
public enum SexEnum {
	//位置
	未知(0),
	//男
	男(1),
	//女
	女(2);

	int value;

	private SexEnum(Integer value) {
		this.ordinal();
		this.value = value;
	}

	public Integer getValue() {
		return this.value;
	}

	public static SexEnum valueSexEnum(Integer value) {
		for (SexEnum sex : SexEnum.values()) {
			if (sex.value == value) {
				return sex;
			}
		}
		throw new IllegalArgumentException("无效的value值: " + value + "!");
	}
}
