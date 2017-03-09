package com.empleodigital.bquiet.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class UnixTime {
	
	public static String getFecha(long unixtime) {
		Date date = new Date(unixtime*1000L);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT+1"));
		String formattedDate = sdf.format(date);
		return formattedDate;
	}
	
	public static String getHora(long unixtime) {
		Date date = new Date(unixtime*1000L);
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT+1"));
		String formattedDate = sdf.format(date);
		return formattedDate;
	}

}
