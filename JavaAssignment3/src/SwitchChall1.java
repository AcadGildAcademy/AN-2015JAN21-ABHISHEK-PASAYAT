
import java.util.Scanner;
public class SwitchChall1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the year and the month in lower case");
		int year = in.nextInt();
		String str = in.nextLine();
		//int leapyear(int year1);
		switch(str)
		{
		case "january": System.out.println("The number of days in the month of january is 31");
		break;
		case "february":{
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
		 
		}
		case "march": System.out.println("The number of days in the month of march is 31");
		   break;
		case "april": System.out.println("The number of days in the month of april is 30");
		   break;
		case "may": System.out.println("The number of days in the month of may is 31");
		   break;
		case "june": System.out.println("The number of days in the month of june is 30");
		   break;
		case "july": System.out.println("The number of days in the month of july is 31");
		   break;
		case "august": System.out.println("The number of days in the month of august is 31");
		   break;
		case "september": System.out.println("The number of days in the month of september is 30");
		   break;
		case "october": System.out.println("The number of days in the month of october is 31");
		   break;
		case "november": System.out.println("The number of days in the month of novembe is 30");
		   break;
		case "december": System.out.println("The number of days in the month of decembe is 31");
		   break;
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

