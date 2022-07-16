package com.orange.configuration.utilities;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class Timestamp {
	
	public static String getTimestamp() {
		LocalTime str=java.time.LocalTime.now();
		String time=str.toString();
		String replaceTime=time.replace(":", "");
		String Timestamp=replaceTime.replace(".", "");
		return Timestamp;
	}
	public static String getDayTime() {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
		return timeStamp;
	}


}
