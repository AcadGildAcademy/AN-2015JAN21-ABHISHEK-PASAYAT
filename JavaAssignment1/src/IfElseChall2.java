import java.util.Scanner;


public class IfElseChall2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your choice : Y/y for continuing , n for Exit ");
		char t = in.next().charAt(0);
		while(t!='n')
		{
			System.out.println("Enter the number to be checked");
			int num = in.nextInt();
			System.out.println((num & 1)!=0?"The enterd number is Odd" : "The entered number is Even");
			System.out.println("Wish to continue : Press Y/y for continuing n for exit");
			t = in.next().charAt(0);
		}

	}

}
