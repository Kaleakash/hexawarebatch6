package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoTest {

	public static void main(String[] args) throws Exception{
	//Load the Driver 
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded successfully...");
	//Establish the connection 
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
	System.out.println("Connected database");
	Emp emp = new Emp();
	emp.setId(103);
	emp.setName("Ravi");
	emp.setSalary(18000);
	//Insert Query 
	/*
	PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?)");
	pstmt.setInt(1, emp.getId());
	pstmt.setString(2, emp.getName());
	pstmt.setFloat(3, emp.getSalary());
	int res = pstmt.executeUpdate();						//DML Operation 
	if(res>0) {
		System.out.println("Record inserted successfully....");
	}
	*
	*/
	//Delete Query 
	/*PreparedStatement pstmt = con.prepareStatement("delete from emp where id =?");
	pstmt.setInt(1, 100);
	int res = pstmt.executeUpdate();						//DML Operation 
	if(res>0) {
		System.out.println("Record deleted successfully....");
	}else {
		System.out.println("Record is not present");
	}*/
	//Update Query 
	/*PreparedStatement pstmt = con.prepareStatement("update emp set salary = salary +? where id =?");
	pstmt.setFloat(1, 500);
	pstmt.setInt(2, 101);
	int res = pstmt.executeUpdate();						//DML Operation 
	if(res>0) {
		System.out.println("Record updated successfully....");
	}else {
		System.out.println("Record is not present");
	}
	*/
	//Retrieve query 
	PreparedStatement pstmt = con.prepareStatement("select * from emp");
	ResultSet rs = pstmt.executeQuery();
	while(rs.next()) {
		System.out.println("Id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
	}
	con.close();
	}

}
