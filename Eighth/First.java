package Eighth_day;

import java.util.*;
import java.util.Map.Entry;

public class First {

	public static void main(String[] args) 
	{
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "a");
		hm.put(2, "b");
		hm.put(3, "c");
		hm.put(4,"d");
	    
	
		
		System.out.println(hm.get(1));
		
		String value = "d";
		
		for(Entry<Integer, String> hm2 : hm.entrySet())
			
		{
			if(hm2.getValue()==value)
				 System.out.println("the value is present at "+hm2.getKey());
		}

		 Iterator<Integer> it = hm.keySet().iterator();
		 
		 
		 while(it.hasNext())
		 {
			 int i = it.next();
			  System.out.println(i+" "+hm.get(i));
		 }
	}

}
