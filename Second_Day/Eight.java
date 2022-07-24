package second_day;

import java.util.Scanner;

public class Eight 
{
	public static void main(String args[])
	{
		int rev=0,m,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		n=sc.nextInt();
		m=n;
		
		while(m!=0)
		{
			rev=rev*10+m%10;
			m=m/10;
		}
		if(n==rev)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
