package com;

public class DemoTest1 {

	public static void main(String[] args) {
	System.out.println("Hi");
	int a=10;
	int b=1;
	int info[]= {10,20,30,40};
	try {
	int res1 =a/b;
	System.out.println("Result is "+res1);
	int res2 = info[6];
	System.out.println("Result is "+res2);
	}catch(Exception e) {
		//System.out.println("I Take Care!");
		System.out.println(e.toString());
	}
	System.out.println("Bye...");
	System.out.println("Bye...");
	System.out.println("Bye...");
	}

}
