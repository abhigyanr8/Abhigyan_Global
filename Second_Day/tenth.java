package second_day;

import java.util.Scanner;

public class tenth 
{
	public static void main(String args[])
	{
		int sum=0;
		float avg;
	   int[] x= new int[10];
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the elements of array");
       for(int i=0;i<10;i++)
       {
    	   x[i]=sc.nextInt();
       }
       for(int i=0;i<10;i++)
    	    sum=sum+x[i];
       avg=sum/10;
       System.out.println("Sum of the array is "+sum);
       System.out.println("Average of the array is "+avg);
       
	}

	
    
    
}
