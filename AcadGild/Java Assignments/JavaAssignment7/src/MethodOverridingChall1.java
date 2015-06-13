import java.util.Scanner;
class Bank
{
	int getRateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}
}

class ICICI extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}

class AXIS extends Bank
{
	int getRateOfInterest()
	{
		return 9;
	}
}


public class MethodOverridingChall1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
        System.out.println("The rate of interest offered by SBI is :" +" "+ s.getRateOfInterest() +" "+ '%'); 
        System.out.println("The rate of interest offered by ICICI is :" +" "+ i.getRateOfInterest() +" "+ '%');
        System.out.println("The rate of interest offered by AXIS is :" +" "+ a.getRateOfInterest() +" "+ '%');
	}

}
