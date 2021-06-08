package com.day3exercise1;
import java.util.*;


public class Employee {
String name;
int age;
Employee(){
}

Employee(String name,int age)
{
	this.name=name;
	this.age=age;;
}
static void validateAge(int age)throws InvalidAgeException
{  
    if(age<18||age>60)  
     throw new InvalidAgeException("Not a valid age");   
}
static void validateName(String name,HashSet<Employee> e )throws InvalidNameException
{
	for(Employee m: e) {
	if(m.name.equals(name))
	{
		 throw new InvalidNameException("Employee exists"); 
	}
}
}
}

