package Eighth_day;

import java.util.*;

public class Second 
{
	
	public static void main(String args[])
	{
		Properties p = new Properties();
		p.setProperty("Uttar Pradesh","Lucknow");
		p.setProperty("Rajasthan","Jaipur");
		p.setProperty("Madhya Pradesh","Bhopal");
		p.setProperty("Karnataka","Banglore");
		p.setProperty("Punjab","Chandigarh");
		p.setProperty("Bihar","Patna");
		
		
		Set<String> keys = p.stringPropertyNames();
		
		for(String s :keys)
			 System.out.println(s+"  =  "+p.getProperty(s));
		
	}

}
