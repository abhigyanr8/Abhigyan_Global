package second_day;

import java.util.Scanner;

public class Third 
{
	public static void main(String args[])
	{
		boolean flag=true;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			 System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}

}
