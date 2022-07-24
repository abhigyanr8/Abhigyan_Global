package Seventh_Day_1st;

import java.util.*;

public class First {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList ar = new ArrayList<Integer>();
		
		System.out.println("Enter Values");
		int i = sc.nextInt();
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		short sh = sc.nextShort();
		
		ar.add(i);
		ar.add(f);
		ar.add(d);
		ar.add(sh);
		
		Iterator it = ar.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }

	}

}
