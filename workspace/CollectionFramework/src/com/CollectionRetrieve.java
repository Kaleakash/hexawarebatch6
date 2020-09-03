package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionRetrieve {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);      // auto-boxing : converting primitive to object. 
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		System.out.println("Using for each loop");
		for(Object obj:al) {
			System.out.println(obj);
		}
		System.out.println("Using Iterator");
		Iterator li1 = al.iterator();
		while(li1.hasNext()) {
			System.out.println(li1.next());
		}
		System.out.println("forward direction using list iterator");
		ListIterator li2 = al.listIterator();
		while(li2.hasNext()) {
			System.out.println(li2.next());
		}
		System.out.println("backward direction using list iterator");
		while(li2.hasPrevious()) {
			System.out.println(li2.previous());
		}
	}

}
