package Fourth_Day;

import java.util.Scanner;

public class String_Cat 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String s1 = sc.next();
		System.out.println("Enter Second string");
		String s2 = sc.next();
		String result;
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.charAt(s1.length()-1)==s2.charAt(0))
		   {
			  s2=s2.substring(1,s2.length());
			    result = s1+s2;
		   }
		else
			  result = s1+" "+s2;
		System.out.println(result);
	}

}
