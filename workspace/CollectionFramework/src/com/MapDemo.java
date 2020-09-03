package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
	//HashMap hm = new HashMap();
	//	LinkedHashMap hm = new LinkedHashMap();
		TreeMap hm = new TreeMap();
	hm.put(3, "ramesh");
	hm.put(1, "ajay");
	hm.put(3, "vijay");
	hm.put(2, "dinesh");
	System.out.println(hm);
	hm.put(1, "Mahesh");
	hm.put(5, "ramesh");
	System.out.println(hm);
	hm.remove(3);
	System.out.println(hm);
	}

}
