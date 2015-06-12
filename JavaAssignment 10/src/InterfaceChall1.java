import java.util.Scanner;
interface shape
{
	void draw();
	void getArea();
}

class Circle implements shape
{
	int radius;
	double pi = 3.14;
	void getRadius(int radius)
	{
		this.radius = radius;
	}
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle will be drawn");
		
	}
	public void getArea() {
		// TODO Auto-generated method stub
		double area = pi * radius * radius;
		System.out.println("The area of circle with given radius is :"+area);
	}
}

class Rectangle implements shape
{
	int length,breadth;
	void getLength(int length)
	{
		this.length = length;
	}
	void getBreadth(int breadth)
	{
		this.breadth = breadth;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle will be drawn");
	}

	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("The area of rectangle with given length and breadth is :"+length*breadth);
	}
	
}

public class InterfaceChall1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Which shape you want to draw?");
		System.out.println();
		System.out.println("Press 1 to draw Circle, 2 for Rectangle ");
		int t = in.nextInt();
		if(t==1)
		{
			Circle c = new Circle();
			c.draw();
			System.out.println("Please enter the radius of the circle");
			 c.getRadius(in.nextInt());
			c.getArea();
		}
		if(t==2)
		{
			Rectangle r = new Rectangle();
			r.draw();
			System.out.println("Please enter the dimensions of the rectangle i.e length and breadth");
			 r.getLength(in.nextInt());
			 r.getBreadth(in.nextInt());
			r.getArea();
		}
	}

}
