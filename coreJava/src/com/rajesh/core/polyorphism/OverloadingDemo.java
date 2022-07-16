package com.rajesh.core.polyorphism;

public class OverloadingDemo {

//	public static void main(String[] args) {
//		System.out.println(trangle(4));
//		System.out.println(trangle(2, 4, 6));
//	}

	public static int trangle(int length, int bredth, int height) {

		return length * bredth * height;
	}

	public int trangle(int length) {
		return length * length * length;
	}

}
