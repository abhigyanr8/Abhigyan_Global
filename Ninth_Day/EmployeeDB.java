package Second_day;

import java.util.ArrayList;

public class EmployeeDB 
{
	ArrayList<Employee> List = new ArrayList<Employee>();
	
	boolean addEmployee(Employee e) 
	{
		return List.add(e);
	}
	boolean deleteEmployee(int empId)
	{
		boolean flag=false;
		for(Employee e : List)
		{
			if(e.empId==empId)
			{
				flag=true;
				List.remove(e);
			}
		}
		return flag;
	}
	
	String showPaySleep(int empid)
	{
		String sal="Not Found";
		for(Employee e : List)
		{
			if(e.empId==empid)
				sal= Float.toString(e.salary);
				
		}
		return sal;
	}

}
