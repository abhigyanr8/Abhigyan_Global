package second_day;

import java.util.Scanner;

public class Seventh 
{
	public static void main(String args[])
	{
		int rev=0,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n= sc.nextInt();
		while(n!=0)
		{
			m=n%10;
			rev=rev*10+m;
			n=n/10;
		}
		System.out.println("Reverse Number is"+ rev);
	}

}
