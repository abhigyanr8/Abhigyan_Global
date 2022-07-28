/*1)Write a program in Java to demonstrate Java 8 Functional Interface Predicate feature. The class will print all numbers , even numberrs and number greater than 3 of the numbers in the array list



Step1: create Java main class Java8 Tester

Step2: create a method eval which will take 2 parameters (list of numbers from 1 to 9 and predicate condition)

Step3: call the eval method from main method to print all the even numbers by passing appropriate parameters

Step4: call the eval method from main method to print all the numbers greater than 3 by passing appropriate parameters

*/

package Tenth_day;

import java.util.*;
import java.util.function.Predicate;


interface Number
{
	void eval(List<Integer> list,Predicate<Integer> pre);
}

public class First_Program 
{
	public static void main(String args[])
	{
		
	List<Integer> list = new ArrayList<Integer>();
	for(int i=1;i<=9;i++)
		 list.add(i);
	
	//Lambda Expression to define eval function.
	
	Number n = (list1,pre)->
	{
		for(int i=1;i<=list1.size();i++)
		{
			if(pre.test(i))
				 System.out.println(i+" ");
		}
	};
	
	//To print all numbers
	
	   n.eval(list,(num)->true);
	   System.out.println();
	   
	//To print Even Numbers
	   
	   n.eval(list,(num)->num%2==0);
	   System.out.println();
	   
	//To Print Numbers greater than 3
	   
	    n.eval(list,(num)->num>3);
	
	}
}
