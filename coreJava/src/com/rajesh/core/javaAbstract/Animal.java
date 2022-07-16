package com.rajesh.core.javaAbstract;

abstract class Animal {
	public Animal() {
		System.out.println("Animal Constructor called...");
	}

	public void display() {
		System.out.println("Regular ethod...");
	}

	public abstract void dispaly1();
}

class Cat extends Animal {
	
	public Cat() {
		super();
	}

	@Override
	public void dispaly1() {
		System.out.println("display1() method called which is abstract method");
	}
}

class Maina {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.dispaly1();
	}
}
