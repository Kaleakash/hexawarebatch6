package com;
import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
class Employee {
	@Override
	public String toString() {
		return "Employee class object";
	}
}
class Manager {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Manager class object";
	}
}
public class ListDemo1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		/*System.out.println("Size "+al.size());
		System.out.println("Empty "+al.isEmpty());
		al.add(100);
		al.add(10.10);
		al.add("Ravi");
		Employee emp1 = new Employee();
		al.add(emp1);
		Manager mgr = new Manager();
		al.add(mgr);
		System.out.println("Size "+al.size());
		System.out.println("Empty "+al.isEmpty());
		System.out.println(al);
		System.out.println(emp1);*/
		al.add(10);					//auto-boxing : converting primitive to object. 
		al.add(20);
		al.add(30);
		al.add(40);
		al.add("Ravi");
		System.out.println(al);
		al.add(1,100);
		System.out.println(al);
		System.out.println("Get using index postiion "+al.get(1));
		al.remove(2);							//remove using index position 
		Integer i = 40;			//converting int primtive to Integer object. 
		al.remove(i);	//remove using value 
		al.remove("Ravi");
		System.out.println(al);
	}

}
