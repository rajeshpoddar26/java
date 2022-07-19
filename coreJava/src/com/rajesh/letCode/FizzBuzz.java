package com.rajesh.letCode;

import java.util.ArrayList;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));
	}
	public static Object fizzBuzz(int n) {

		var list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				list.add("FizzBuzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");
			} else if (i % 5 == 0) {
				list.add("Bizz");
			}
			else {
				list.add(i);
			}
		}
		return list;
	}

}
