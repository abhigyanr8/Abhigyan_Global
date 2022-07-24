import java.util.Scanner;

public class Fifth_program 
{
	public static void main(String[] args)
	{
		double perc=0.0;
		Scanner sc = new Scanner(System.in);
		String gender=sc.next();
		int age=sc.nextInt();
		
		if(gender.equals("FEMALE"))
		{
			if(age>=1&&age<=58)
				perc=8.2;
			else if(age>58&&age<=100)
				perc=9.2;
		}
		else if(gender.equals("MALE"))
		{
			if(age>=1&&age<=58)
				perc=8.4;
			else if(age>58&&age<=100)
				 perc=10.5;
		}
		System.out.println("Percentage is "+ perc);
	}

}
