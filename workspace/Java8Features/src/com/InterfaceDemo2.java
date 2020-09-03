package com;
interface AA {
	void dis1();
	default void dis2() {
		System.out.println("Default method implementation provided by AA interface ");
	}
}
class BB implements AA {
	public void dis1() {
		System.out.println("provided body for dis1() method by BB class");
	}
	public void dis2() {
		
		System.out.println("Default method override by BB class ");
	}
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		BB obj1 = new BB();
		obj1.dis1();
		obj1.dis2();

	}

}
