package Fourth_Day;

import java.util.Scanner;

public class Seventh 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.next();
		
		if(s.charAt(0)=='x')
		{
			s=s.substring(1,s.length());
		}
		if(s.charAt(s.length()-1)=='x')
		{
			s=s.substring(0,s.length()-1);
		}
		System.out.println(s);
	}

}
