package com;

public class DemoTest2 {

	public static void main(String[] args) {
	System.out.println("Hi");
	int a=10;
	int b=1;
	int info[]= {10,20,30,40};
	try {
	int res1 =a/b;
	System.out.println("Result is "+res1);
	int res2 = info[2];
	System.out.println("Result is "+res2);
	}catch(ArithmeticException e) {
		System.out.println("Divided by Zero");
		e.printStackTrace();
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Wrong index position");
	}
	System.out.println("Bye...");
	System.out.println("Bye...");
	System.out.println("Bye...");
	}

}
