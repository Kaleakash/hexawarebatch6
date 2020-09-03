package com;

interface Operation {
	int add(int x, int y);
}
public class LambdaDemo {

	public static void main(String[] args) {
	Operation op1 = 	(x,y)->x+y;
	System.out.println(op1.add(10, 20));
	
	Operation op2 = (a,b)->a+b;
	System.out.println(op2.add(100, 200));
	
	Operation op3 = (int x, int y)->x+y;
	System.out.println(op3.add(1000,2000));
	
	Operation op4 = (x,y)-> {
						int sum = x+y;
						return sum;
						};
	System.out.println(op4.add(111, 222));					
	}

}
