package Fifth_day;

import java.util.Random;

class FirstClass extends Compartment
{

	@Override
	public  String notice() 
	{
		return"This is FIrstClass Compartment";
	}
	
}

  class Ladies extends Compartment
  {

	@Override
	public String notice()
	{
		return "This is Ladies Compartment";
	}
	  
  }
  
  class General extends Compartment
  {
	  
	  public String notice()
		{
			return "This is General Compartment";
		}
  }

  
  class Luggage extends Compartment
  {
	  public String notice()
		{
			return "This is Luggae Compartment";
		}
  }

public class TestClassMain 
{
    public static void main(String args[])
    {
    	Compartment a[]= new Compartment[10];
    	
    	
         Random r = new Random();
         
         int x= r.nextInt(5);
         Compartment b;
                 
         switch(x)
         {
               case 1:  b= new FirstClass();
                              break;
                         
               case 2:  b=new Ladies();
                              break;
                        
               case 3: b= new General();
                              break;
                         
               case 4: b = new Luggage();
                             break;               
 
         }
         
    	System.out.println(b.notice());
    	
    }
}
