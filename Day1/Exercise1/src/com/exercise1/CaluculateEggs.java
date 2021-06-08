package com.exercise1;
import java.util.*;
public class CaluculateEggs {
int totalNoOfEggs;
public void setTotalNoOfEggs(int totalNoOfEggs) {
	this.totalNoOfEggs = totalNoOfEggs;
}
public void getConvertedEggs() {
EggUnit e=new EggUnit(totalNoOfEggs);
System.out.println("Gross: "+e.getGross());
System.out.println("Dozen: "+e.getDozen());
System.out.println("Remaining: "+e.getRemaining());
}
}
