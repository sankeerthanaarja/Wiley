package com.Day2.Exercise4;
import java.util.Comparator;

public class SortBySinger implements Comparator<CD> {
	@Override
	public int compare(CD cd1,CD cd2) {
	 int compare = cd1.getSinger().compareTo(cd2.getSinger());  
	
		if(compare>0)
			return 1;
		else if(compare<0)
			return -1;
		return 0;
	}
}


