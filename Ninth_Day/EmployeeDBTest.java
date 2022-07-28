package Second_day;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeDBTest 
{
	Employee e = new Employee();
	EmployeeDB edb = new EmployeeDB();
	
	
	
	boolean res;

	@Test
	void testAddEmployee() 
	{
		res=edb.addEmployee(e);
	
		assertEquals(true,res);
	}

	@Test
	void testDeleteEmployee() 
	{
		
		res=edb.deleteEmployee(1234);
		assertEquals(false,res);
	}

	@Test
	void testShowPaySleep() 
	{
		String sal = edb.showPaySleep(1234);
		assertEquals("Not Found",sal);
	}

}
