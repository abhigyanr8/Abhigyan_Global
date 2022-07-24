package Sixth_Day_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Second 
{
	public static void main(String args[])
	{
		ArrayList ar = new ArrayList<String>();
		
		ar.add("one");
		ar.add("two");
		ar.add("Three");
		ar.add("Four");
		
		Iterator it = ar.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
