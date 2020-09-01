package bean;

public class Employee {
private int id;
String name;
protected float salary;
public int age;

	public void disInfo() {
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
		System.out.println("Age is "+age);
	}
}
