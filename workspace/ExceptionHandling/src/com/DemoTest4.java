package com;

public class DemoTest4 {

	public static void main(String[] args) {
	System.out.println("Hi");
	try {
		int res = 10/1;
		System.out.println("No Exception");
	}
	catch (ArithmeticException e) {
		System.out.println("Catch block");
	}catch(ArrayIndexOutOfBoundsException e) {
		
	}catch(NumberFormatException e) {
		
	}catch(Exception e) {
		
	} 
	
	}

}
