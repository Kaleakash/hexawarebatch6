package com;

import java.util.ArrayList;

public class DemoTest1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Reeta");al.add("Ramesh");al.add("Vijay");al.add("Ajay");al.add("Veeta");al.add("Seeta");
		al.add("Teeta");al.add("Dinesh");al.add("Ravi");al.add("Mahesh");al.add("Lokesh");al.add("Amar");
		
		//al.stream().filter(data->data.startsWith("R")).forEach(info->System.out.println(info));
		//al.stream().filter(data->data.contains("ee")).forEach(info->System.out.println(info));
	//al.stream().filter(data->data.startsWith("R")).map(val->val.toLowerCase()).forEach(info->System.out.println(info));
	//long num=	al.stream().filter(data->data.startsWith("R")).map(val->val.toLowerCase()).count();
	//System.out.println("Number of names "+num);
		
		long num=	al.stream().filter(data->data.endsWith("h")).map(val->val.toLowerCase()).count();
		System.out.println("Number of names "+num);
	}

}
