package Third_day_2;


import java.util.Scanner;

public class TestClasses 
{
	public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
	    
	    Person p = new Person();
	    
	    System.out.println("Enter name of the person");
	    String s= sc.nextLine();
	    p.setName(s);
	    
	    System.out.println("Enter DOB of the person");
	    String DOB = sc.next();
	    p.setDOB(DOB);
	    
	    System.out.println("Name of the person is "+p.getName());
	    System.out.println("DOB of the person is "+p.getDOB());
	    
	    System.out.println("Enter Name of the student");
	    String studentname=sc.nextLine();
	    
	    Student st = new Student();
	    st.setName(studentname);
	    
	    System.out.println("Enter studentid");
	    String stdid= sc.next();
	    
	   
	    
	}

}
