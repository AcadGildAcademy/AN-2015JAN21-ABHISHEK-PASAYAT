import java.util.Scanner;
public class IfElseChall3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int t = in.nextInt();
		while(t!=0)
		{
			System.out.println("Enter the year to be checked");
			int year = in.nextInt();
			if(year % 4 == 0)
			{
				if(year % 100 == 0)
				{
					if(year % 400 == 0)
					{
						System.out.println("The entered year is a leap year");
					}
					else 
					{
						System.out.println("The entered year is not a leap year");
					}
				}
				else
				{
					System.out.println("The entered year is a leap year");
				}
			}
			else
			{
				System.out.println("The entered year is not a leap year");
			}
			t--;
		}

	}

}
