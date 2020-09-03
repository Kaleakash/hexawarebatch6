package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	Stack ss = new Stack();
	ss.push(100);
	ss.push(200);
	ss.push("Ramesh");
	ss.push(300);
	ss.push(400);
	System.out.println(ss);
	System.out.println("Remove "+ss.pop());
	System.out.println(ss);	
	System.out.println("Check topmost element "+ss.peek());
	System.out.println(ss);	
	System.out.println("Search "+ss.search(100));
	System.out.println("Search "+ss.search(1000));
	}

}
