package Third_Day;

import java.util.Scanner;

 class Box
{
	int height;
	int width;
	int depth;
	 Box(int x,int y,int z)
	{
		this.height=x;
		this.width=y;
		this.depth=z;
	}
	int volume()
	{
		return this.height*this.width*this.depth;
	}
}
public class First__ 
{
	public static void main(String args[])
	{
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Dimension of box");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		Box ob = new Box(x,y,z);
		System.out.println("Volume of the box is "+ob.volume());
	}

}
