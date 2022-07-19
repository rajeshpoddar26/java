package com.rajesh.letCode;

public class FactorialTralingZeros {
	
	public static Object factorialtralingZero(int num) {
		
		var count=0;
		while(num>0) {
			num/=5;
			count+=num;  
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(factorialtralingZero(4));
	}

}
