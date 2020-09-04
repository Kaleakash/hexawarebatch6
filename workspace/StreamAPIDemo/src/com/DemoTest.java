package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.Stream;
class DisplayData implements Consumer<Integer>{
	//@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println("VAlue is "+t);
	}
}
public class DemoTest {

	public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<>();
	al.add(1);al.add(2);al.add(3);al.add(4);al.add(5);al.add(6);al.add(7);al.add(8);al.add(9);
	al.add(11);al.add(21);al.add(31);al.add(10);al.add(56);al.add(76);al.add(98);al.add(98);al.add(86);
	al.add(31);al.add(16);al.add(31);al.add(214);al.add(122);al.add(10);al.add(15);al.add(18);al.add(61);
	System.out.println("Using Iterator");
/*	Iterator<Integer> li = al.iterator();
int sumOfNatural=0;
int sumOfEven=0;
	while(li.hasNext()) {
		int data = li.next();
		//System.out.println(data);
		sumOfNatural= sumOfNatural+data;
		if(data%2==0) {
			sumOfEven = sumOfEven +data;
		}
	}
	System.out.println("Sum of natural numbers are "+sumOfNatural);
	System.out.println("Sum of event is "+sumOfEven);*/
	//Stream<Integer> ss = al.stream();				//converting list to stream 
	//ss.forEach(abc->System.out.println("Value is "+abc));
	//Consumer<Integer> cc = new DisplayData();
	//ss.forEach((data)->System.out.println(data));
	//ss.forEach(cc);
	//al.stream().forEach(data->System.out.println(data));
	//al.stream().skip(10).forEach(data->System.out.println(data));		//display all elements 
	//al.stream().filter(val->val%2==0).forEach(data->System.out.println(data));		//display even numbers
	//al.stream().filter(val->val%2!=0).forEach(data->System.out.println(data));		//display odd numbers 
	int sumOfEven = al.stream().filter(val->val%2==0).mapToInt(data->data).sum();
	System.out.println("sum of even number is "+sumOfEven);
	}

}
