package Eighth_day;

import java.util.*;
import java.util.Map.Entry;

public class Third {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> ContactList = new HashMap<String,Integer>();
		
		ContactList.put("Abhigyan",1234);
		ContactList.put("Abhishek",5678);
		ContactList.put("Ram",7654);
		ContactList.put("Shyam",9870);
		ContactList.put("Suraj",5432);
		
		System.out.println("The Number of ram is "+ContactList.get("Ram"));
		
		int value = 5432;
		
		for(Entry<String,Integer> entry : ContactList.entrySet())
		{
			if(entry.getValue()==value)
				 System.out.println(value+" is the value of  "+entry.getKey());
		}
		
		
		// TODO Auto-generated method stub

	}

}
