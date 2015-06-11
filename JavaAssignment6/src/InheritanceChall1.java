import java.util.Scanner;
public class InheritanceChall1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two sides for calculating area ");
		int side1 = in.nextInt();
		int side2 = in.nextInt();
		Triangle t = new Triangle(side1,side2);
		System.out.println("The Area of Rectangle is :");
		System.out.println(t.AreaOfRect());
		System.out.println("The Area of Traingle is :");
		System.out.println(t.AreaOfTriangle());
	}
}

class Rectangle
{
	int side1;
	int side2;
	Rectangle(int side1, int side2)
	{
	  this.side1=side1;
	  this.side2=side2;
	}
	public int AreaOfRect()
	{
		return side1*side2;
	}
}


 class Triangle extends Rectangle
{
	 double area;
	 Triangle(int side1, int side2)
	 {
		 super(side1,side2);
	 }
	 public double AreaOfTriangle()
	 {
		 area = 0.5 * side1* side2;
		 return area;
	 }
}