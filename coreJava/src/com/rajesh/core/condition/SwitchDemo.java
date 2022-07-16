package com.rajesh.core.condition;

public class SwitchDemo {

	public static void main(String[] args) {

		int number = 34;
		String size = null;
		switch (number) {
		case 10:
			System.out.println("less then the number" + size);
			break;
		case 34:
			System.out.println("greater then the number" );
			size="sized";
			break;
		case 24:
			System.out.println("equal");
			break;

		default:
			System.out.println("nothing");
			break;
		}
		System.out.println(size);
		
		
		
		
		
	}

}
