package com.rajesh.core.polyorphism;

public class OverRidingImplDemo extends OverloadingDemo {
	public static void main(String[] args) {
		OverRidingImplDemo demo= new  OverRidingImplDemo();
		System.out.println(demo.trangle(5));
	}
//	@Override
//	public void count() {
//		System.out.println("Over riding accepted...");
//	}
	@Override
	public int trangle(int length) {
		
		return 5+super.trangle(length);
	}
	

}
