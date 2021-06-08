package com.exercise1;
import java.util.*;
public class CalEggsMain {

	public static void main(String[] args) {
	CaluculateEggs c=new CaluculateEggs();
	Scanner s= new Scanner (System.in);
	 System.out.println("Enter the number of Eggs:");
    int Eggs=s.nextInt();
    c.setTotalNoOfEggs(Eggs);
    c.getConvertedEggs();
	}

}
