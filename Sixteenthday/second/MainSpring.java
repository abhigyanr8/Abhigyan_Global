package com.Friday_05_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.Friday_05_02.AreaOfCircle;

public class MainSpring
{
   public static void main( String[] args )
     {
	    
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("Bean.xml");
		 AreaOfCircle ac =(AreaOfCircle)ctx.getBean(AreaOfCircle.class);
	     System.out.println(ac.CircleArea(7.00));
     }
}