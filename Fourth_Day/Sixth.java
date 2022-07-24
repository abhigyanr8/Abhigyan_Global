package Fourth_Day;

import java.util.Scanner;

public class Sixth 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings");
		String str1 = sc.next();
		String str2 = sc.next();
		String result;
		if(str1.length()<str2.length())
			   result=str1+str2+str1;
		else
			   result = str2+str1+str2;
		
		System.out.println(result);
		
	}

}
