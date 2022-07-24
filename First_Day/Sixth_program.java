import java.util.Scanner;
import java.lang.Character;
public class Sixth_program 
{
	public static void main(String[] args)
	{
		char a,ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphabet");
		a=sc.next().charAt(0);
		if(Character.isUpperCase(a))
			ans=Character.toLowerCase(a);
		else
			ans=Character.toUpperCase(a);
		System.out.println(ans);
	}  

}
