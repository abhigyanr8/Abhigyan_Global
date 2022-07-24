package Seventh_Day_1st;

import java.util.*;

class CountryClass
{
	HashSet<String> h1 = new HashSet<String>();
	
	HashSet<String> saveCountryNames(String names)
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

public class Sixth {

	public static void main(String[] args) 
	{
		
		CountryClass c = new CountryClass();
		
		HashSet<String> h = new HashSet<String>();
		
		h=c.saveCountryNames("India");
		h=c.saveCountryNames("Nepal");
		h=c.saveCountryNames("Bangladesh");
		h=c.saveCountryNames("France");
		
		System.out.println(c.getCountry("India"));
		
		System.out.println(c.getCountry("Pakistan"));
		

	}

}
