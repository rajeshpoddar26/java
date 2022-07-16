package com.rajesh.core.enumDemo;

public class Result {

	public static void main(String[] args) {

		Test transgender = new Test(Human.TRANSGENDER);
		transgender.dispplayGender();

		Test women = new Test(Human.WOMEN);
		women.dispplayGender();

		Test men = new Test(Human.MAN);
		men.dispplayGender();
		
		Test other= new Test(Human.OTHER);
		other.dispplayGender();
	}
}
