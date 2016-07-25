package com.lxxc.common.utils.date;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/**
	 * 获取距离d时间 day前的时间
	 * @param d
	 * @param day
	 * @return
	 */
	public  static String getDateBefore(Date d, int day) {
		return getDateBefore(d, day, DateFormatStyle.YYYY_MM_DD.getValue());
	}
	/**
	 * 获取距离date时间 day前的时间
	 * @param d
	 * @param day
	 * @param format 转换格式
	 * @return
	 */
	public static String getDateBefore(Date date, int day,String format) {
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.set(Calendar.DATE, now.get(Calendar.DATE) - day);
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(now.getTime());
	}
	
	
	/**
	 * 将字符串类型的时间转换为时间类型的时间
	 * @param strDate
	 * @return
	 */
	public static Date getDateFromStr(String strDate){
		return getDateFromStr(strDate,null);
	}
	
	
	public static Date getDateFromStr(String strDate,String format){
		if (format == null){
			format = DateFormatStyle.YYYY_MM_DD.getValue();
		}
		SimpleDateFormat df = new SimpleDateFormat(format);
		Date date =  df.parse(strDate,new ParsePosition(0));
		return date;
	}
	
	
	public static void main(String[] args) {
		String strDate = "2016-01-01";
		Date date = getDateFromStr(strDate);
		System.out.println(getDateBefore(date, 7));
	}
}
