package service;
import bean.*;
public class Programmer extends Employee{

	public void prgInfo() {
		//System.out.println("Id is "+id);		private within a same class 
		//System.out.println("Name is "+name);		default within a same package. 
		System.out.println("Salary is "+salary);
		System.out.println("Age is "+age);
	}
}
