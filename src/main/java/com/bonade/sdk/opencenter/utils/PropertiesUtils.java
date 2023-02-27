package com.bonade.sdk.opencenter.utils;

import java.io.IOException;
import java.util.Properties;

/**
 * 读取配置文件
 */
public class PropertiesUtils {

	private static PropertiesUtils propUtil;
	private static Properties props;

	private PropertiesUtils(String path) throws IOException {
		init(path);
	}

	private void init(String path) throws IOException {
		props = new Properties();
		props.load(PropertiesUtils.class.getClassLoader().getResourceAsStream(path));
	}

	public static PropertiesUtils getInstance(String path) throws IOException {
		if (propUtil == null) {
			propUtil = new PropertiesUtils(path);
		}
		return propUtil;
	}

	public static String getProperties(String key) {
		return props.getProperty(key);
	}
}
