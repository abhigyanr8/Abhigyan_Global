import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testFindName() 
	{
		Employee emp = new Employee();
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Abhigyan");
		list.add("Abhishek");
		list.add("Ram");
		
		String res = emp.findName(list,"Ram");
		
		assertEquals(res,"FOUND");
		
		res= emp.findName(list,"Suraj");
		assertEquals(res,"NOT FOUND");
	
	}

}
