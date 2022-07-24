package Third_day_2;

public class Fruit 
{
	String name;
	String taste;
	String size;
	
	Fruit(String name ,String taste,String size)
	{
		this.name=name;
		this.taste = taste;
		this.size=size;
	}
	
	void eat()
	{
		System.out.println("Name of the fruit is "+this.name);
		System.out.println("Taste of the fruit is "+this.taste);
		
	}

}
