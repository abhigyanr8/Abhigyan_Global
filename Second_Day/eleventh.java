package second_day;

import java.util.Scanner;

public class eleventh 
{
	public static void main(String args[])
	{
		int[] x = new int[10];
		int max,min;
		System.out.println("Enter Elements of array");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements of Array");
		for(int i=0;i<10;i++)
		{
			x[i]=sc.nextInt();
		}
		max=x[0];
		min=x[0];
		for(int i=0;i<10;i++)
		{
			if(x[i]>max)
				max=x[i];
			if(x[i]<min)
				min=x[i];
		}
		System.out.println("Maximum Element is "+max);
		System.out.println("Minimum elemnet is "+min);
	}

}
