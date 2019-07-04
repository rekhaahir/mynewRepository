package com_5_6_19_practicals;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Prac59 {
	public static void main(String[] args) {

		Date now = new Date();

		SimpleDateFormat simpleDateformat = new SimpleDateFormat("E");
		System.out.println(simpleDateformat.format(now));

		simpleDateformat = new SimpleDateFormat("EEEE");
		System.out.println(simpleDateformat.format(now));

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

	}
}
