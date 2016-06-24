package com.lxxc.common.util;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

public class ParamUtils {
	public static String getParameter(HttpServletRequest request, String name) {
		return getParameter(request, name, false);
	}
	
	public static String getParameter(HttpServletRequest request, String name, boolean emptyStringsOK) {
		String[] temp = request.getParameterValues(name);
		if (temp != null && temp.length > 0) {
			if (temp[0].equals("") && !emptyStringsOK) {
				return null;
			} else {
				return temp[0];
			}
		} else {
			return null;
		}
	}
	
	public static String getStringParameter(HttpServletRequest request, String name, String defaultString) {
		return getParameter(request, name, defaultString);
	}
	
	public static String getParameter(HttpServletRequest request, String name, String defaultString) {
		String[] temp = request.getParameterValues(name);
		if (temp != null && temp.length > 0 && !temp[0].equals("")) {
			return temp[0];
		} else {
			return defaultString;
		}
	}
	
	public static String getFilteredParameter(HttpServletRequest request, String name, int maxLength, String defaultString) {
		String[] temp = request.getParameterValues(name);
		if (temp != null && temp.length > 0 && !temp[0].equals("")) {
			String ret = WebUtils.escapeParamString(temp[0]);
			if (maxLength > 0)
				ret = StringUtils.substring(ret, 0, maxLength);
			return ret;
		} else {
			return defaultString;
		}
	}
	
	public static String[] getFilteredParameters(HttpServletRequest request, String name, int maxLength, String defaultString) {
		String[] paramValues = request.getParameterValues(name);
		if (paramValues == null) {
			return null;
		}
		if (paramValues.length < 1) {
			return new String[0];
		}
		String[] values = new String[paramValues.length];
		for (int i = 0; i < paramValues.length; i++) {
			try {
				String temp = paramValues[i];
				if ((temp != null) && (!temp.equals(""))) {
					temp = WebUtils.escapeParamString(temp);
					if (maxLength > 0)
						temp = StringUtils.substring(temp, 0, maxLength);
					values[i] = temp;
				} else {
					values[i] = defaultString;
				}
			} catch (Exception e) {
				values[i] = defaultString;
			}
		}
		return values;
	}

	public static boolean getBooleanParameter(HttpServletRequest request, String name) {
		return getBooleanParameter(request, name, false);
	}

	public static boolean getBooleanParameter(HttpServletRequest request, String name, boolean defaultVal) {
		String[] temp = request.getParameterValues(name);
		if (temp == null || temp.length <= 0)
			return defaultVal;
		if ("true".equals(temp[0]) || "on".equals(temp[0])) {
			return true;
		} else if ("false".equals(temp[0]) || "off".equals(temp[0])) {
			return false;
		} else {
			return defaultVal;
		}
	}
	
	public static Integer getIntParameter(HttpServletRequest request, String name, Integer defaultNum) {
		String[] temp = request.getParameterValues(name);
		if (temp != null && temp.length > 0 && !temp[0].equals("")) {
			Integer num = defaultNum;
			try {
				num = Integer.parseInt(temp[0]);
			} catch (Exception ignored) {
			}
			return num;
		} else {
			return defaultNum;
		}
	}
	
	public static int getIntParameter(HttpServletRequest request, String name, int defaultNum) {
		return getIntParameter(request, name, new Integer(defaultNum));
	}
	
	public static int[] getIntParameters(HttpServletRequest request, String name, int defaultNum) {
		String[] paramValues = request.getParameterValues(name);
		if (paramValues == null) {
			return null;
		}
		if (paramValues.length < 1) {
			return new int[0];
		}
		int[] values = new int[paramValues.length];
		for (int i = 0; i < paramValues.length; i++) {
			try {
				values[i] = Integer.parseInt(paramValues[i]);
			} catch (Exception e) {
				values[i] = defaultNum;
			}
		}
		return values;
	}
	
	public static Integer[] getIntegerParameters(HttpServletRequest request, String name, Integer defaultNum) {
		String[] paramValues = request.getParameterValues(name);
		if (paramValues == null) {
			return null;
		}
		if (paramValues.length < 1) {
			return new Integer[0];
		}
		Integer[] values = new Integer[paramValues.length];
		for (int i = 0; i < paramValues.length; i++) {
			try {
				values[i] = Integer.parseInt(paramValues[i]);
			} catch (Exception e) {
				values[i] = defaultNum;
			}
		}
		return values;
	}
	
	public static Double getDoubleParameter(HttpServletRequest request, String name, Double defaultNum) {
		String[] temp = request.getParameterValues(name);
		if (temp != null && temp.length > 0 && !temp[0].equals("")) {
			Double num = defaultNum;
			try {
				num = Double.parseDouble(temp[0]);
			} catch (Exception ignored) {
			}
			return num;
		} else {
			return defaultNum;
		}
	}

	public static double getDoubleParameter(HttpServletRequest request, String name, double defaultNum) {
		return getDoubleParameter(request, name, new Double(defaultNum));
	}

	public static Float getFloatParameter(HttpServletRequest request, String name, Float defaultNum) {
		String[] temp = request.getParameterValues(name);
		if (temp != null && temp.length > 0 && !temp[0].equals("")) {
			Float num = defaultNum;
			try {
				num = Float.parseFloat(temp[0]);
			} catch (Exception ignored) {
			}
			return num;
		} else {
			return defaultNum;
		}
	}

	public static float getFloatParameter(HttpServletRequest request, String name, float defaultNum) {
		return getFloatParameter(request, name, new Float(defaultNum));
	}

	public static Long getLongParameter(HttpServletRequest request, String name, Long defaultNum) {
		String[] temp = request.getParameterValues(name);
		if (temp != null && temp.length > 0 && !temp[0].equals("")) {
			Long num = defaultNum;
			try {
				num = Long.parseLong(temp[0]);
			} catch (Exception ignored) {
			}
			return num;
		} else {
			return defaultNum;
		}
	}

	public static long getLongParameter(HttpServletRequest request, String name, long defaultNum) {
		return getLongParameter(request, name, new Long(defaultNum));
	}

	public static long[] getLongParameters(HttpServletRequest request, String name, long defaultNum) {
		String[] paramValues = request.getParameterValues(name);
		if (paramValues == null) {
			return null;
		}
		if (paramValues.length < 1) {
			return new long[0];
		}
		long[] values = new long[paramValues.length];
		for (int i = 0; i < paramValues.length; i++) {
			try {
				values[i] = Long.parseLong(paramValues[i]);
			} catch (Exception e) {
				values[i] = defaultNum;
			}
		}
		return values;
	}

	public static java.util.Date getDateParameter(HttpServletRequest request, String name, String format, java.util.Date defaultDate) {
		String[] temp = request.getParameterValues(name);
		if (temp != null && temp.length > 0 && !temp[0].equals("")) {
			try {
				java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(format);
				defaultDate = formatter.parse(temp[0]);

			} catch (Exception ignored) {
				//
			}
		}
		return defaultDate;
	}

	public static java.util.Date getDateParameter(HttpServletRequest request, String name, java.util.Date defaultDate) {
		return getDateParameter(request, name, "yyyy-MM-dd", defaultDate);
	}

	public static java.util.Date getDateParameter(HttpServletRequest request, String name, String format) {
		return getDateParameter(request, name, format, null);
	}

	public static java.util.Date getDateParameter(HttpServletRequest request, String name) {
		return getDateParameter(request, name, "yyyy-MM-dd", null);
	}
	
	@SuppressWarnings("unchecked")
	public static Map<String, String> getParametersStartingWith(HttpServletRequest request, String prefix) {
		Map<String, String> params = new LinkedHashMap<String, String>();
		Map<String, String[]> parameters = request.getParameterMap();
		if (prefix == null) {
			prefix = "";
		}
		for (String key : parameters.keySet()) {

			if ("".equals(prefix) || key.startsWith(prefix)) {
				String unprefixed = key.substring(prefix.length());
				String[] values = parameters.get(key);
				if (values == null || values.length == 0) {// NOSONAR
					// Do nothing, no values found at all.
				} else if (values.length > 1) {
					String temp = StringUtils.join(values, ';');
					params.put(unprefixed, WebUtils.escapeParamString(temp));
				} else {
					if (!StringUtils.isEmpty(values[0]))
						params.put(unprefixed, WebUtils.escapeParamString(values[0]));
					else
						params.put(unprefixed, "");
				}
			}
		}
		return params;
	}
	
	
}
