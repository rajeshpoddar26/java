package com.rajesh.core.javaAbstract;

public abstract class AbstractDemo {
	public AbstractDemo() {
		super();
		System.out.println("Abstract Constructor called");
	}

	public abstract void method1();
	public abstract void method2();
	
	
	public static void method3() {
		System.out.println("static method3() called");
	}
	public abstract  void method4();
	
}
abstract class Demo extends AbstractDemo {
	public Demo() {
		System.out.println("Demo constructor callled");
	}

	@Override
	public void method1() {
		System.out.println("Method1() called from Demo");
	}
	public abstract void method5();
	
}
class Demochild extends Demo{
	public Demochild() {
		super();
		System.out.println("Demochild constructor");
	}

	@Override
	public void method5() {
		System.out.println("Method5() called from DemoChild");
	}

	@Override
	public void method2() {
		System.out.println("Method2() called from DemoChild present in Animal");
	}

	@Override
	public void method4() {
		System.out.println("Method4() called from DemoChild present in Animal");
	}
}
class MainAnimal{
	public static void main(String[] args) {
		Demochild demochild= new Demochild();
		demochild.method1();
		demochild.method2();
		AbstractDemo.method3();
		demochild.method4();
		demochild.method5();
	}
}