package com.day3exercise1;
import java.util.*;
public class EmployeeMain {
public static void main(String [] args)
{
	int age=0;
	String name = null;
	HashSet <Employee> s=new HashSet<Employee>();
	Scanner sc=new Scanner(System.in);
	s.add(new Employee("A",21));
	s.add(new Employee("B",28));
	s.add(new Employee("C",26));
	System.out.println("Enter name");
	Employee m=new Employee();
	try {
	name=sc.next();
	m.validateName(name,s);
	System.out.println("Enter age");
	age=sc.nextInt();
	m.validateAge(age);
	s.add(new Employee(name,age));
	System.out.println("Employee Added");
	System.out.println("List of Employees");
	for(Employee emp:s)
	System.out.println(emp.name+" "+emp.age);
	}
	catch(Exception e){System.out.println("Exception occured: "+e);}  

	
}
}
