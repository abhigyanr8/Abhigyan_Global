import java.util.Scanner;

public class Thirs_question 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First char");
		char a= sc.next().charAt(0);
		System.out.println("Enter Second cahr");
		char b= sc.next().charAt(0);
		if(a<b)
			 System.out.println(a+" "+b);
		else
			 System.out.println(b+" "+a);
		
	}

}
