package com.Friday_05_02;

public class AreaOfCircle implements AreaInterface
{
	
	public double CircleArea(double r)
	{
		return 3.14*r*r;
	}
	
	public double circleCircumference(double r)
	{
		return new CircumferenceOfCircle().circleStatus(r);
	}

}
