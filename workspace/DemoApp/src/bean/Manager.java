package bean;

public class Manager extends Employee{

	void disMgrInfo() {
		//System.out.println("Id is "+id); private can't access in other class. 
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
		System.out.println("Age is "+age);
	}
}
