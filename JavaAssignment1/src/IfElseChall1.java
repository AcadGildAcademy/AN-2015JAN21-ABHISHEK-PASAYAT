import java.util.Scanner;


public class IfElseChall1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your choice : Y/y for continuing , n for Exit ");
		char t = in.next().charAt(0);
		while(t!='n')
		{
		System.out.println("Enter your Age");
	    int age = in.nextInt();
		System.out.println((age>=18)?"You are eligible to vote." : "You are not eligible to vote.");	
		System.out.println("Wish to continue : Press Y/y for continuing n for exit");
		t = in.next().charAt(0);
	    }
	}

}
