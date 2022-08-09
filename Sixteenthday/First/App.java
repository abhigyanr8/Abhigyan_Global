package com.Friday_05;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App

{

 public static void main( String[] args )

 
 {
	 
	  Scanner sc = new Scanner(System.in);

	 ApplicationContext ctx = new ClassPathXmlApplicationContext("Bean.xml");
	    Customer c =(Customer)ctx.getBean(Customer.class);
	       System.out.println(c);
	     
	  System.out.println("Enter Amount to deposite");
	     int amount=sc.nextInt();
	     c.account.deposit(amount);
	     System.out.println(c);
	  
	  System.out.println("Enter Amount to withdraw");
	     int withdr=sc.nextInt();
	     c.account.withdraw(withdr);
	     System.out.println(c);
	     

 }

}