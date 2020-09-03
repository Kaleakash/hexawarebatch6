package com;

import java.util.ArrayList;

public class CollectionWithGenerics {

	public static void main(String[] args) {
		/*ArrayList al = new ArrayList();
	al.add(100);			//auto-boxing 
	al.add(10.10);
	al.add("Ravi");
	al.add(200);
	
	Object obj = al.get(1);
	Integer  i = (Integer)obj;
	System.out.println(i);*/
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);		//auto-boxing : converting primitive to object 
		al.add(20);
		al.add(30);
		
		int n = al.get(0);		//auto-unboxing : converting object to primitive 
		System.out.println(n);
	}

}
