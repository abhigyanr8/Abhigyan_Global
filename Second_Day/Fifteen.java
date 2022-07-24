package second_day;

import java.util.Scanner;

public class Fifteen 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] x= new int[10];
		int temp;
		System.out.println("Enter the values of array");
		for(int i=0;i<10;i++)
			 x[i]=sc.nextInt();
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(x[i]>x[j])
				{
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array is ");
		for(int i=0;i<10;i++)
			 System.out.println(x[i]);
	}

}
