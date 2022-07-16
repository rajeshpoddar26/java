package com.rajesh.core.condition;

public class DemoOnSwitch {
	public static void main(String[] args) {
		String lion = "Lion";
		String deer = "Deer";
		String donkey = "Donkey";
		String monkey = "Monkey";
		String allAnimals = "All Animals";
		int number = 0;
		switch (number) {
		case 0:
			System.out.println(allAnimals + " are :");
		case 1: {
			int i = 1;
			System.out.println(i + ". " + lion);
			if (number != 0) {
				break;
			}
		}
		case 2: {
			int i = 2;
			System.out.println(i + ". " + deer);
			if (number != 0) {
				break;
			}
		}
		case 3: {
			int i = 3;
			System.out.println(i + ". " + donkey);
			if (number != 0) {
				break;
			}
		}
		case 4:
			int i = 4;
			System.out.println(i + ". " + monkey);
			break;
		default:
			System.out.println("No Animals are present");
		}
	}
}