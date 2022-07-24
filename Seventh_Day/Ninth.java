package Seventh_Day_1st;

import java.util.*;

 class CountryClass1
{
	TreeSet<String> h1 = new TreeSet<String>();
	
	TreeSet<String> saveCountryNames(String names)
	{
		h1.add(names);
		return h1;
	}
	String getCountry(String name)
	{
		if(this.h1.contains(name))
			return name;
		else
			return "NULL";
	}
}

public class Ninth{

	public static void main(String[] args) 
	{
		
		CountryClass1 c = new CountryClass1();
		
		TreeSet<String> h = new TreeSet<String>();
		
		h=c.saveCountryNames("India");
		h=c.saveCountryNames("Nepal");
		h=c.saveCountryNames("Bangladesh");
		h=c.saveCountryNames("France");
		
		System.out.println(c.getCountry("India"));
		
		System.out.println(c.getCountry("Pakistan"));
		

	}

}
