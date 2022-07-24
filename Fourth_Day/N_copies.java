package Fourth_Day;

import java.util.Scanner;

public class N_copies 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		String result="";
		String st=s.substring(0,2);
		for(int i=0;i<s.length();i++)
		{
			
			result+=st;
		}
		System.out.println(result);
	}

}
