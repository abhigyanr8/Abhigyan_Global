package second_day;

public class Fourth 
{
	

	public static void main(String args[])
	{
		for(int i=10;i<=99;i++)
		{
		   boolean flag=true;
		   for(int j=2;j<=i/2;j++)
		   {
			   if(i%j==0)
			   {
				   flag=false;
				   break;
			   }
		   }
		   if(flag)
			   System.out.println(i);
		}
	}

}
