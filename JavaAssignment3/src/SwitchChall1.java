
import java.util.Scanner;
public class SwitchChall1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your choice : Y/y for continuing , N/n for exit");
		char t = in.next().charAt(0);
		if(t=='n')
			System.out.println("Sorry you choose to exit before checking");
		while(t!='n')
		{
		System.out.println("Enter the month in numbers. Like 1 for january , 2 for february , 3 for march and so on till 12 for december.");
		int str = in.nextInt();
		System.out.println("Enter the year also");
		int year = in.nextInt();
		//int leapyear(int year1);
		//SwitchChall1 obj = new SwitchChall1();
		switch(str)
		{
		case 1 : System.out.println("The number of days in the month of january is 31");
		break;
		case 2:
			int ly = leapyear(year);
			if(ly==1)
			{
				System.out.println("The number of days in the month of february is 29");
				break;
			}
			else
			{
				System.out.println("The number of days in the month of february is 28");
				break;
			}
		 
		case 3: System.out.println("The number of days in the month of march is 31");
		   break;
		case 4: System.out.println("The number of days in the month of april is 30");
		   break;
		case 5: System.out.println("The number of days in the month of may is 31");
		   break;
		case 6: System.out.println("The number of days in the month of june is 30");
		   break;
		case 7: System.out.println("The number of days in the month of july is 31");
		   break;
		case 8: System.out.println("The number of days in the month of august is 31");
		   break;
		case 9: System.out.println("The number of days in the month of september is 30");
		   break;
		case 10: System.out.println("The number of days in the month of october is 31");
		   break;
		case 11: System.out.println("The number of days in the month of november is 30");
		   break;
		case 12: System.out.println("The number of days in the month of december is 31");
		   break;
		}
		System.out.println("Wish to continue? Press Y to continue or N to exit");
		t =  in.next().charAt(0);
		}
	}
	public static int leapyear(int year1)
	{
		int ly1;
		if(year1 % 4 == 0)
		{
			if(year1 % 100 == 0)
			{
				if(year1 % 400 == 0)
				{
					ly1 = 1;
				}
				else 
				{
					ly1 = 0;
				}
			}
			else
			{
			ly1 = 1;
			}
		}
		else
		{
			ly1 = 0;
	    }
		return ly1;
	}

}

