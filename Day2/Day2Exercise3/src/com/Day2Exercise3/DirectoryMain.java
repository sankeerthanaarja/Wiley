package com.Day2Exercise3;
import java.util.*;
import java.util.Iterator;

public class DirectoryMain {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		Directory d=new Directory();
		
		while(true)
			{
			System.out.println("Enter choice\n1.Add contact\n2.Remove Contact\n3.Display Number\n4.Display all Contacts\n5.Exit");
			int choice=sc.nextInt();
			
			switch(choice)
		{
		case 1:
			{
				System.out.println("Enter Name ");
				String s=sc.next();
				System.out.println("Enter  Number");
			    int n=sc.nextInt();
				d.addContact(s,n);
				break;
			}
		case 2:
		{
			System.out.println("Enter name of contact to remove");
			d.remove(sc.next());
			break;
		}
		case 3:
		{
			System.out.println("Enter name of person");
			String name=sc.next();
			if(d.displayNumber(name)==null)
			{
				System.out.println("contact not found!!");
			}
			else  System.out.println(d.displayNumber(name));
			break;
		}
		case 4:
		{
			hm=d.display();
		     System.out.println("-----------------Contact List-----------------");
		     for(HashMap.Entry m : hm.entrySet())
		    	    System.out.println("Name: "+m.getKey()+"\nPhone Number: "+m.getValue()); 
		     System.out.println("---------------------------------------");
		     break;
		}
		
		case 5:
			System.out.println("-----------------------Thank you-------------------------");
			return; 
		}
		}
			
		
		
		
	}

}
