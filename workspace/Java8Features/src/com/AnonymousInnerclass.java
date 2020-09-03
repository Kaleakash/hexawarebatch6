package com;
@FunctionalInterface
interface M {
	void dis1();
}
//1st way to provide the body.
class N implements M {
	public void dis1() {
		System.out.println("Provided body by N class");
	}
}
public class AnonymousInnerclass {
	public static void main(String[] args) {
	M obj1 = new N();
	obj1.dis1();
	//2nd way to provide the body - using Anonymous Inner class 
	M obj2 = new M() {
		public void dis1() {
			System.out.println("Provided by by Anonymous Inner class");
		}
	};
	obj2.dis1();
	
	M obj3 = new M() {
		public void dis1() {
			System.out.println("Provided by by Anonymous Inner class another logic");
		}
	};
	obj3.dis1();
	
	M obj4= ()->System.out.println("Lambda Expression example");
	obj4.dis1();
	}
}
