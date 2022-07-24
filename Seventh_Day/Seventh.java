package Seventh_Day_1st;

import java.util.*;

public class Seventh {

	public static void main(String[] args) 
	{
		HashSet<String> Name = new HashSet<String>();
		Name.add("Abhigyan");
		Name.add("Abhishek");
		Name.add("Suraj");
		Name.add("Ram");
		Name.add("Shyam");
		
		
		Iterator it =  Name.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
