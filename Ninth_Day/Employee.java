package Second_day;

public class Employee 
{
	public int empId;
	String EmpName;
	String email;
	String gender;
	float salary;
	
	void GetEmployeeDetails()
	{
		System.out.println("Name of the employee is "+this.EmpName);
		System.out.println("EmployeeId of the employee is "+this.empId);
		System.out.println("Email of the employee is "+this.email);
		System.out.println("Gender of the employee is "+this.gender);
		System.out.println("Salary of the employee is "+this.salary);
	}

}
