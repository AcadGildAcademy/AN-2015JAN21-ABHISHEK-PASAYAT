import java.util.Scanner;
public class IfElseChall1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int t = in.nextInt();
		while(t!=0)
		{
		System.out.println("Enter your Age");
	    int age = in.nextInt();
		System.out.println((age>=18)?"You are eligible to vote." : "You are not eligible to vote.");	
		t--;
	    }
	}

}

