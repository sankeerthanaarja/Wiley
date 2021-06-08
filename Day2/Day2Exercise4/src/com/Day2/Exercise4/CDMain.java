package com.Day2.Exercise4;
import java.util.*;
public class CDMain {
	public static void main(String[]args)
	{

		Set<CD> hs=new TreeSet<CD>(new SortBySinger());
        hs.add(new CD("song1","z"));
        hs.add(new CD("song8","x"));
        hs.add(new CD("song9","m"));
        hs.add(new CD("song6","b"));
        hs.add(new CD("song2","s"));
        hs.add(new CD("song5","a"));
        hs.add(new CD("Song4","p"));
        for(CD element:hs) {
			System.out.println(element.title+" "+element.singer);
		}
    }
}
