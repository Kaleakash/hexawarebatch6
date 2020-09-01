package com;

public class DemoTest5 {
public static void main(String[] args) {
	try {
		int res = 10/0;
		System.out.println("No Exception");
	} finally {
	System.out.println("finally block");
	}
	System.out.println("Normal Statement");
}
}
