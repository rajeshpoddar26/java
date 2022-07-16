package com.rajesh.core.javaAbstract;

abstract class Language {

	void method1() {
		System.out.println("regular method");
	}

	abstract void method();

}

class Main {
	public static void main(String[] args) {
		Language language = new Language() {
			@Override
			void method() {
				System.out.println("abstract method");
			}
		};
		language.method();
		language.method1();
	}

}
