package Seventh_Day_1st;

import java.util.*;

public class Eighth {

	public static void main(String[] args) 
	{
		
		TreeSet<String> tr = new TreeSet<String>();
		
		tr.add("a");
		tr.add("b");
		tr.add("c");
		tr.add("d");
		TreeSet<String> revtr = new TreeSet<String>();
		revtr=(TreeSet<String>) tr.descendingSet();
		
		Iterator it = tr.iterator();
		Iterator it2 = revtr.iterator();
		while(it.hasNext())
			 System.out.print(it.next()+" ");
		System.out.println();
        while(it2.hasNext())
        	  System.out.print(it2.next()+" ");
	}

}
