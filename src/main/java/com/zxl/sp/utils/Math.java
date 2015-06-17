package com.zxl.sp.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Math {
	static int a;
	static int abc;
	public static void main(String[] args) {
		int b;
		System.out.println(a);
		GregorianCalendar c=new GregorianCalendar();
		System.out.println(c.get(Calendar.MONTH));
		
		c.set(Calendar.YEAR, 2011);
		c.add(Calendar.DATE, 17);
		System.out.println(c.getTime());
	}
}
