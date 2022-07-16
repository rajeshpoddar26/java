package com.rajesh.core.condition;

public class Days {

	public static void main(String[] args) {

		displaybasedOnDay(3);
		displayday("Friday");
	}
	public static void displaybasedOnDay(int length) {
		switch (length) {
		case 1:
			System.out.println("SUNDAY");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("TUESDAY");
			break;
		case 4:
			System.out.println("WEDNESDAY");
			break;
		case 5:
			System.out.println("tHRUSDAY");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;

		default:
			break;
		}
	}
	public static void displayday(String day) {
		switch (day) {
		case "SUNDAY":
			System.out.println(1);
			break;
		case "monday":
			System.out.println(2);
			break;
		case "TUESDAY":
			System.out.println(3);
			break;

		default:
			System.out.println("wrong input");
			break;
		}
	}

}
