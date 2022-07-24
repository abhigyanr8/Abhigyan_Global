package Seventh_Day_1st;

import java.util.*;

 class Employee
{
	String name;
	String Eid;
	Employee(String name,String eid)
	{
		this.name = name;
		this.Eid=eid;
	}
	String getName()
	{
		return this.name;
	}
	String getEid()
	{
		return this.Eid;
	}
}


public class Fourth {

	public static void main(String[] args) 
	{
		Vector<Employee> ep = new Vector<Employee>();
		
		ep.add(new Employee("Abhigyan","123"));
		ep.add(new Employee("Abhishek","456"));
		ep.add(new Employee("Ram","897"));
		
		
		//Iterator Methode to print all elements
		for(Employee e : ep)
			 System.out.println(e.getName()+"  "+e.getEid());
		
		
		//Enumeration methode to print all elements
		
		Enumeration en = ep.elements();
		
		while(en.hasMoreElements())
		{
			Employee o = (Employee) en.nextElement();
			 System.out.println(o.getName()+"  "+o.getEid());
			 
		}

	}

}
