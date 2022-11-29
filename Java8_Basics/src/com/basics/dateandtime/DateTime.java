package com.basics.dateandtime;
import java.text.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
//import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		
		//LocalDate today = LocalDate.now();
		LocalDate today = LocalDate.of(2022,Month.AUGUST,15);
		System.out.println(today);
		
		//Date today = new Date();
		
		LocalDateTime rightNow = LocalDateTime.now();
		System.out.println(rightNow);
		
		LocalTime t1 = LocalTime.now();
		System.out.println(t1);
		
		LocalTime t2 = LocalTime.now(ZoneId.of("CET"));
		System.out.println(t2);
		

	}

}
