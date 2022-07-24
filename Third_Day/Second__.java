package Third_Day;

import java.util.Scanner;

class calculator
{
	static int powerInt(int num1,int num2)
	{
		return (int)Math.pow(num1, num2);
	}
	static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1,num2);
	}
}


public class Second__ 
{
	public static void main(String args[])
	{
	        int x,y;
	        int b;
	        double a;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter two int values");
	        x=sc.nextInt();
          	y=sc.nextInt();
          	System.out.println("Result is "+calculator.powerInt(x,y));
          	System.out.println("Enter one double value and one int value");
          	a=sc.nextDouble();
          	b=sc.nextInt();
        	System.out.println("Result is "+calculator.powerDouble(a,b));
	}
	

}
