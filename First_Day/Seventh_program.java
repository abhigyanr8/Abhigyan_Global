import java.util.Scanner;

public class Seventh_program 
{
	public static void main(String[] args)
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the color code");
		ch=sc.next().charAt(0);
		ch=Character.toUpperCase(ch);
		switch(ch)
		{
		case 'R' : System.out.println("Red");
		         break;
		case 'B' : System.out.println("Blue");
                 break;
		case 'Y' : System.out.println("Yellow");
                 break;
		case 'O' : System.out.println("Orange");
                  break;
		case 'W' : System.out.println("White");
                 break;
		case 'G' : System.out.println("Green");
                 break;
        default : System.out.println("Invalid");
                  break;
		}
		
	}

}
