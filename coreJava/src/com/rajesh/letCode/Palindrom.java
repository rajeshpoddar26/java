package com.rajesh.letCode;

public class Palindrom {

	public Object isPalindrom(int num) {
		
		int reversedNumb = 0;
		if (num < 0 || num % 10 == 0) {
			return false;
		}
		while (num > reversedNumb) {
			int temp = num % 10;
			reversedNumb = reversedNumb * 10 + temp;
			num = num / 10;
		}

		return num == reversedNumb || num == reversedNumb / 10;
	}

	public static void main(String[] args) {
		Palindrom p = new Palindrom();
		int n = 10;
		System.out.println(n);
		boolean b = (boolean) p.isPalindrom(n);
		if (b) {
			System.out.println(n + " is palindrom number");
		} else {
			System.out.println(n + " is not a palindrom number");
		}
	}
	
}
