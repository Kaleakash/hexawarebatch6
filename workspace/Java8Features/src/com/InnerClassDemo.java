package com;

class Outer {
		int a;
		void dis1() {
			System.out.println("This is dis1() method of Outer class");
		}
		class Inner {
			int b;
			void dis2() {
				System.out.println("This is dis2() method of Inner class");
			}
		}
}

public class InnerClassDemo {
	public static void main(String[] args) {
		Outer out = new Outer();
		out.dis1();
		Outer.Inner in =new Outer().new Inner();			//1st way to create the  object. 
		
		Outer.Inner in1 = out.new Inner();
		in.dis2();
		in1.dis2();
	}

}
