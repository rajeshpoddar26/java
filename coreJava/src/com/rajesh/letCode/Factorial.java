package com.rajesh.letCode;

public class Factorial {

	public static Object fact(int num) {

		var temp = 1;
		while (num > 0) {
			temp *= num;
			num--;
		}
		return temp;
	}
	public static Object myPow(double x, int n) {
		double ans = 1.0;
		long num = n;
		if (n < 0) {
			num = -1 * num;
		}
		while (num > 0) {
			if (num % 2 == 0) {
				x = x * x;
				num = num / 2;
			} else {
				ans = ans * x;
				num = num - 1;
			}
		}
		if (n < 0) {
			return (double) (1.0) / (double) (ans);
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println("Fact: " + (int) fact(3));
		System.out.println("POW: " + (double) myPow(3, 3));
		double d = (double) myPow(3, 3);
		System.out.println("D: " + d);

	}

}
