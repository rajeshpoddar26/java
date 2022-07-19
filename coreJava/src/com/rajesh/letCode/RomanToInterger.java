package com.rajesh.letCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInterger {
	public static void main(String[] args) {
		System.out.println(romanToInt("IV"));
	}

	public static int romanToInt(String s) {
		Map<Character, Integer> hashNumber = new HashMap<>();
		hashNumber.put('I', 1);
		hashNumber.put('V', 5);
		hashNumber.put('X', 10);
		hashNumber.put('L', 50);
		hashNumber.put('C', 100);
		hashNumber.put('D', 500);
		hashNumber.put('M', 1000);

		int result = 0;
 		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
		
			if (i > 0 && hashNumber.get(ch) > hashNumber.get(s.charAt(i - 1))) {
				System.out.println(hashNumber.get(ch));
				System.out.println(hashNumber.get(s.charAt(i - 1)));
				result += hashNumber.get(ch) - 2 * hashNumber.get(s.charAt(i - 1));
			} else {
				{
					result += hashNumber.get(ch);
				}
			}
		}
		return result;
	}
}
