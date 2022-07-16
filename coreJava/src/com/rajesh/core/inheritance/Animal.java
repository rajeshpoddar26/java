package com.rajesh.core.inheritance;

public class Animal {
	
	String name;
	public void eat() {
		System.out.println("I can eat");
	}

}

class Dog extends Animal {
	
	public void display() {
		System.out.println("My name is "+name);
	}
}

class Cat extends Animal {
	@Override
	public void eat() {
		System.out.println("Cat is eating...");
	}
}
class Main{
	public static void main(String[] args) {
		Dog labrador = new Dog();
		labrador.name="rohit";
		labrador.display();
		labrador.eat();
		
		Cat pushycat= new Cat();
		pushycat.eat();
		
		
	}
}