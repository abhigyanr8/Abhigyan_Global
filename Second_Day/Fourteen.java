package second_day;

import java.util.Scanner;

public class Fourteen 
{
	public static void main(String args[])
	{
		int max1,max2,min1,min2;
		int[] x = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of array");
		for(int i=0;i<10;i++)
			 x[i]=sc.nextInt();
		max1=x[0];
		max2=x[0];
		min1=x[0];
		min2=x[0];
		for(int i=0;i<10;i++)
		{
			if(x[i]>max1)
				max1=x[i];
			if(x[i]<min1)
				min1=x[i];
		}
		for(int i=0;i<10;i++)
		{
			if(x[i]>max2&&x[i]<max1)
				max2=x[i];
			if(x[i]<min2&&x[i]>min1)
				min2=x[i];
		}
		System.out.println("Second Largest Number is "+max2);
		System.out.println("Second Smallest Number is "+min2);
	}

}
