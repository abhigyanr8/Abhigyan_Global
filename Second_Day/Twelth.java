package second_day;

import java.util.Scanner;

public class Twelth 
{
	public static void main(String args[])
	{
		int[] x= new int[10];
		int index=-1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements of array");
		for(int i=0;i<10;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("Enter Number to be search");
		int y=sc.nextInt();
		for(int i=0;i<10;i++)
		{
			if(x[i]==y)
			   index=i;
		}
		if(index==-1)
			 System.out.println(y+" is not present");
		else
			System.out.println("Number is present at "+index+" index");
	}

}
