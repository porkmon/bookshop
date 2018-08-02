package cn.pork.util;

import java.util.UUID;

public class WebUtil {
	public static String uuId() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}
