package Fourth_Day;

import java.util.Scanner;

public class Fifth 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		s=s.substring(1,s.length()-1);
		System.out.println(s);
	}

}
