package com.rajesh.core.enumDemo;

public class Test {

	Human human;

	Test(Human human) {
		this.human = human;
	}

	public void dispplayGender() {
		switch (human) {
		case MAN:
			System.out.println("He is Man");
			break;
		case WOMEN:
			System.out.println("She is Women");
			break;
		case TRANSGENDER:
			System.out.println("He/She is Transgender");
			break;
		default:
			System.out.println("Not Yeat defined by The World society");
			break;
		}
	}
}
