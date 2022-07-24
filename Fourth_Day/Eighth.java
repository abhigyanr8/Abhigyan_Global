package Fourth_Day;

import java.util.Scanner;

public class Eighth 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.next();
		int l = s.indexOf('*');
		
		String result= s.substring(0,l-1)+s.substring(l+2,s.length());
		
		System.out.println(result);
	}

}
