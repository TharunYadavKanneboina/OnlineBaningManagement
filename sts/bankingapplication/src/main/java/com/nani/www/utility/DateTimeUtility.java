package com.nani.www.utility;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeUtility {
	
		private static String DateFormatPattern;
		private static LocalDateTime dateTime;

		public static String getLocalDateTimeFromEpochTime(String epochTimeString) {
			Long epochTimeMilliSeconds = Long.parseLong(epochTimeString);
			Instant insta = Instant.ofEpochMilli(epochTimeMilliSeconds);
			ZoneId zoneid = ZoneId.systemDefault();
			LocalDateTime localdatetime=LocalDateTime.ofInstant(insta,zoneid);
		
			String DateFormatPattern="YYYY-MM-DD"; 
			//LocalDateTime to DteTime format
			String FormatedDateTime = formatLocalDateTime(localdatetime,DateFormatPattern);
			System.out.print(FormatedDateTime);
			
			return(FormatedDateTime);
			
		}

		private static String formatLocalDateTime(LocalDateTime localdatetime, String dateFormatPttern) {
		
			DateTimeFormatter formate =DateTimeFormatter.ofPattern(DateFormatPattern);
			
			return (dateTime.format(formate)) ;
			
		}
}



