package com.valtech.training.corejava.day5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateTest {
	/*
	 * HH-Hour
	 * mm-Minutes
	 * ss-Second
	 * SS - Millisecond
	 * YY-Year (last two digit)
	 * YYYY
	 * MM/ MMM-Month
	 * MM- number
	 * MMM-jan
	 * DD-Days
	 * dd-date
	 */
	
	DateFormat df = new SimpleDateFormat("dd-MMM-YYYY  HH:mm:ss");
	
	@Test
	public void testDate() {
		Date date =new Date();
		System.out.println(date);
		System.out.println(df.format(date));
	}
	
	@Test
	public void testDateOldWay() {
		Date date =new Date(47,7,15);
		System.out.println(date);
		System.out.println(df.format(date));
		
	}
	
	@Test
	public void testDateWithCal() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1947);
		cal.set(Calendar.MONTH, Calendar.AUGUST);
		cal.set(Calendar.DATE, 15);
		
		Date date =cal.getTime();
		
		System.out.println(date);
		System.out.println(df.format(date));
		
	}
	
	
	@Test
	public void testDateFromString() throws Exception {
		DateFormat df =new SimpleDateFormat("dd-MM-yyyy");
		Date date =df.parse("15-08-1947");
		System.out.println(date);
		
	}

}
