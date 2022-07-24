package Third_Day;

import java.util.Scanner;

class Patient
{
	String patientName;
	double height;
	double weight;
	
	Patient(String name ,double height,double weight)
	{
		this.patientName=name;
		this.height=height;
		this.weight=weight;
	}
	
	 double computeBMI()
	 {
		 return (this.weight/(this.height*this.height));
	 }
	
}


public class Third__ 
{
	
public static void main(String args[])
{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Patient name");
	  String name = sc.nextLine();
	  System.out.println("Enter height of the Patient");
	  double height=sc.nextDouble();
	  System.out.println("Enter Weight of the patient");
	  double weight=sc.nextDouble();
	  
	  Patient ob = new Patient(name,height,weight);
	  System.out.println("BMI is  " +ob.computeBMI());
}
}
