import java.util.Scanner;
public class IfElseChall2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of test cases.");
		int t = in.nextInt();
		while(t!=0)
		{
			System.out.println("Enter the number to be checked");
			int num = in.nextInt();
			System.out.println((num & 1)!=0?"The enterd number is Odd" : "The entered number is Even");
			t--;
		}

	}

}
