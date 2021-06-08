package com.Day2Exercise3;
import java.util.*;
public class Directory {
HashMap<String, Integer> h=new HashMap<String,Integer>();
String name;
int number;
public void addContact(String name,int number)
{
	h.put(name,number);
}
public void remove(String name)
{
	h.remove(name);
}
public HashMap<String,Integer> display()
{
	 return h;
}
public Integer displayNumber(String name)
{
	if(h.containsKey(name))
	{
		return h.get(name);
	}
	return null;
}
}

