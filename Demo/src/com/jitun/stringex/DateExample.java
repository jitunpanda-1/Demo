package com.jitun.stringex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) throws ParseException {
		String pattern= "dd/mm/yy";
		SimpleDateFormat formater= new SimpleDateFormat(pattern);
		String date= formater.format(new Date());
		 System.out.println(date);
		 
		 String pattern1 = "yyyy-MM-dd";
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern1);

		 Date date1 = simpleDateFormat.parse("2018-09-09");

		 System.out.println(date1);
	}

}
