package Fifth_day;

import java.util.Scanner;

public class First 
{
	public static void main(String args[])
	{
		Scanner sc = new  Scanner(System.in);
		int i=0,n,a=0,b=0;
		String result="";
		System.out.println("Enter first string");
		String s1 = sc.next();
		
		System.out.println("Enter Second String");
		String s2 = sc.next();
		
		
		
		while(a<s1.length()&&b<s2.length())
		{
			if(i%2==0)
			   {
				result+=s1.charAt(a);
				a++;
			   }
			else
				{
				   result+=s2.charAt(b);
				   b++;
				}
			i++;
		}
		if(a!=s1.length())
			result+=s1.substring(a,s1.length());
		if(b!=s2.length())
			 result+=s2.substring(b,s2.length());
		
		System.out.println(result);
		
	}

}
