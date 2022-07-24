package Fifth_day;

import java.util.Scanner;

public class Second 

{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s= sc.next();
		System.out.println("Enter the value of n");
		int n= sc.nextInt();
		String result="";
		
		String sub = s.substring(s.length()-n,s.length());
		for(int i=0;i<n;i++)
		{
			result=result+sub;
		}
		System.out.println(result);
		
	}

}
