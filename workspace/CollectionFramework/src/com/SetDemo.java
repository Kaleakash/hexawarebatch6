package com;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
	//HashSet hs = new HashSet();
	//LinkedHashSet hs = new LinkedHashSet();
		TreeSet hs = new TreeSet();
	hs.add(4);
	hs.add(1);
	hs.add(2);
	hs.add(5);
	hs.add(6);
	hs.add(3);
	//hs.add("Ravi");
	hs.add(1);
	System.out.println(hs);
	System.out.println("Contains "+hs.contains(4));
	//System.out.println("Contains "+hs.contains("Ravi"));
	hs.remove(4);
	//hs.remove("Ravi");
	System.out.println(hs);
	}

}
