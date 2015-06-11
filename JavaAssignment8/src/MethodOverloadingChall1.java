import java.util.Scanner;
class Rectangle
{
	int a,b;
	Rectangle()
	{
		a=0;
		b=0;
		System.out.println("The Area of Square and Rectangle is same and that is :"+" "+0);
		System.out.println();
	}
	Rectangle(int a)
	{
		System.out.println("The Area of Square and Rectangle is same and that is :"+" "+a*a);
		System.out.println();
	}
	Rectangle(int a,int b)
	{
		if(a!=b)
		{
			System.out.println("Since sides are not equal ,therfore the shape is a Reactangle");
		System.out.println("The Area of Rectangle is :"+" "+a*b);
		System.out.println();
		}
		else
		{
			System.out.println("Since sides are equal ,therfore the shape is a Square");
			System.out.println("The Area of Square is :"+" "+a*b);
			System.out.println();
		}
	}
	
}
public class MethodOverloadingChall1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the sides");
		int m = in.nextInt();
		int n = in.nextInt();
		System.out.println("When no parameters are passed to constructor :");
		Rectangle r1 = new Rectangle();
		System.out.println("When first parameter is passed to constructor :");
		Rectangle r2 = new Rectangle(m);
		System.out.println("When second parameter is passed to constructor :");
		Rectangle r3 = new Rectangle(n);
		System.out.println("When both parameters are passed to constructor :");
		Rectangle r4 = new Rectangle(m,n);
        	
	}

}
