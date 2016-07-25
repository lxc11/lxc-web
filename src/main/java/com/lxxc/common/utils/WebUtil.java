package com.lxxc.common.utils;

import org.apache.commons.lang3.StringUtils;

public class WebUtil {
	public static String escapeParamString(String value) {
		
		if (value == null)
			return "";
		
		value = StringUtils.replace(value, "|", "");
		value = StringUtils.replace(value, "&amp;", "");
		//value = StringUtils.replace(value, ";", "");
		value = StringUtils.replace(value, "$", "");
//		value = StringUtils.replace(value, "%", "");
		//value = StringUtils.replace(value, "@", "");
		value = StringUtils.replace(value, "'", "");
		value = StringUtils.replace(value, "\"", "");
		value = StringUtils.replace(value, "\\'", "");
		value = StringUtils.replace(value, "&lt;", "");
		value = StringUtils.replace(value, "&gt;", "");
		value = StringUtils.replace(value, "<", "");
		value = StringUtils.replace(value, ">", "");
		//value = StringUtils.replace(value, "(", "");
		//value = StringUtils.replace(value, ")", "");
		//value = StringUtils.replace(value, "+", "");
		value = StringUtils.replace(value, "\n", "");
		value = StringUtils.replace(value, "\r", "");
		//value = StringUtils.replace(value, ",", "");
		value = StringUtils.replace(value, "\\", "");
		
		return value;
	}
}
