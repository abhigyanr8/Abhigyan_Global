package second_day;

import java.util.Scanner;

public class Thirteen 
{
	public static void main(String args[])
	{
	int[] x = new int[10];
	char[] y = new char[10];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter elements of array");
	for(int i=0;i<10;i++)
	{
		x[i]=sc.nextInt();
	}
	for(int i=0;i<10;i++)
	{
		y[i]=(char)x[i];
		System.out.print(y[i]+" ");
	}
	
	}	

}
