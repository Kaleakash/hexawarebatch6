package com;
class MyException extends Exception {
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	public MyException(String msg) {
		super(msg);
	}
}
public class DemoTest6 {

	public static void main(String[] args) {
	int age=18;
	
	try {
	if(age<21) {
		//throw new Exception();				//throwing super class 
		//throw new ArithmeticException();		// throws sub class 
		//throw new ArithmeticException("age must be >21");	//throws sub class with custom message 
		//throw new MyException();		//throwing own exception or custom exception 
		throw new MyException("age must be >21");
	}
	
	}catch(Exception e) {
		System.out.println("Catch block "+e.toString());
	
	}
	System.out.println("Finish");
	}

}
