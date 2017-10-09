package edu.fudan.lwang.autologinclient.util;

import java.util.Calendar;
import java.util.Date;

public abstract class DateTimeUtils {

	public static Date getTimesRequest(int hour, int min, int sec) {
		Calendar cal = Calendar.getInstance();
		if(hour < cal.get(Calendar.HOUR_OF_DAY)) {
			cal.set(cal.get(Calendar.YEAR),
					cal.get(Calendar.MONTH),
					cal.get(Calendar.DATE)+1,
					hour, min, sec);
		}
		cal.set(Calendar.HOUR_OF_DAY, hour);
		cal.set(Calendar.MINUTE, min);
		cal.set(Calendar.SECOND, sec);
		cal.set(Calendar.MILLISECOND, 0);
		return  cal.getTime();
	}

}
