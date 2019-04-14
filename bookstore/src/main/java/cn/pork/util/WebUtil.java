package cn.pork.util;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;

public class WebUtil {
	public static String uuId() {
		return UUID.randomUUID().toString().replace("-", "");
	}
	public static Date getTime() {
		return new Date();
	}
	
}
