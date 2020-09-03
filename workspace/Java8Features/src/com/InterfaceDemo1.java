package com;
interface A {
	void dis1();
	default void dis2() {
		System.out.println("Default method implementation provided by A interface ");
	}
	static void dis3() {
		System.out.println("static method implementation provided by interface A");
	}
}
class B implements A {
	public void dis1() {
		System.out.println("provided body for dis1() method by B class");
	}
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		B obj1 = new B();
		obj1.dis1();
		obj1.dis2();
		A.dis3();
	}

}
