package Fifth_day;

import java.util.Scanner;

public class Third 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1= sc.next();
		System.out.println("Enter Second String");
		String s2=sc.next();
		String result="";
		int l,u;
		for(int i=0;i<=s1.length()-s2.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(0))
			{
			   String sub = s1.substring(i,i+s2.length());
			   if(s2.equals(sub))
			   {
				   if(i>0)
				   {
					   l=i-1;
					   result+=s1.charAt(l);
				   }
				   if(i<s1.length()-s2.length())
				   {
				       u=i+s2.length();
				       result+=s1.charAt(u);
				   }
			   }
			}
			
			
		}
		System.out.println(result);
	}

}
