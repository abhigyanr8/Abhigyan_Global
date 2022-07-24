package Fourth_Day;

import java.util.Scanner;

public class First_Half 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s= sc.next();
		
		if(s.length()%2==0)
		{
			s= s.substring(0,s.length()/2);
		}
		else
		{
			s="NULL";
		}
		System.out.println(s);
	}

}
