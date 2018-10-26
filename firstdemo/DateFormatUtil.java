package com.baidu.bookstore.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtil {
	public static String getStringfromDate(String geshi,Date date){
		SimpleDateFormat sdf=new SimpleDateFormat(geshi);
		try {
			return sdf.format(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static Date getDateFromString(String geshi,String dateStr){//2000-3-4
		SimpleDateFormat sdf=new SimpleDateFormat(geshi);
		try {
			return  sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
