package Fourth_Day;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String sr = sc.nextLine();
		String rev="";
		for(int i=0;i<sr.length();i++)
		{
			char ch= sr.charAt(i);
			rev=ch+rev;
		}
		if(sr.equals(rev))
             System.out.println("palindrome");
        else
             System.out.println("Not Palindrome");
	}
	

}
