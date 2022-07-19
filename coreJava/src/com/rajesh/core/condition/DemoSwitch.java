package com.rajesh.core.condition;

import com.rajesh.core.enumDemo.Days;

public class DemoSwitch {

	public static void dispalyDays(Days days) {
		switch (days) {
		case SUNDAY:
			System.out.println("Holiday");
			break;
		case MONDAY :
			System.out.println("Office");
		case TUESDAY:
			System.out.println("Office");
		case WEDNESDAY:
			System.out.println("Office");
		case THRUSDAY:
			System.out.println("Office");
		case FRIDAY:
			System.out.println("Office");
		case SATURDAY:
			System.out.println("Holiday");
			break;
		}
	}

	public static void dispalyDaysDemo(int dayNumber) {
		switch (dayNumber) {
		case 1:
			System.out.println(Days.MONDAY);
		case 2:
			System.out.println(Days.TUESDAY);
		case 3:
			System.out.println(Days.WEDNESDAY);
		case 4:
			System.out.println(Days.THRUSDAY);
		case 5:
			System.out.println(Days.FRIDAY);
			break;
		case 6:
			System.out.println(Days.SATURDAY);
			break;
		case 7:
			System.out.println(Days.SUNDAY);
			break;
		}
	}

	public static void main(String[] args) {
		dispalyDays(Days.SUNDAY);
		dispalyDaysDemo(6);
	}

}
