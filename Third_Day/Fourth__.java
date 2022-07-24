package Third_Day;

class Animal
{
	void eat()
	{
		System.out.println("This is eat methode of Animal class");
	}
	void sleep()
	{
		System.out.println("This is sleep methode of Animal class");
		
	}
}
class Bird extends Animal
{
	
	void eat()
	{
		System.out.println("This is eat methode of Bird class");
		
	}
	void sleep()
	{
		System.out.println("This is sleep methode of Bird class");
	}
	void fly()
	{
		System.out.println("This is fly methode of Bird class");
	}
}

public class Fourth__ 
{
	public static void main(String args[])
	{
		Animal ob1 = new Animal();
		ob1.eat();
		ob1.sleep();
		Bird ob2 = new Bird();
		ob2.eat();
		ob2.sleep();
		ob2.fly();
	}

}
