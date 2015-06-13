import java.util.Scanner;
abstract class Instrument
{
	String piano;
	abstract void play();
}
class StringedInstrument extends Instrument
{
	int numberOfStrings;
	StringedInstrument()
	{
		numberOfStrings = 0;
	}
	
	void play() {
		// TODO Auto-generated method stub
	}
}

class ElectricGuitar extends StringedInstrument
{
	ElectricGuitar()
	{
		numberOfStrings = 6;
	}
	void play()
	{
		System.out.println("ElectricGuitar is played which has "+numberOfStrings+" "+"strings");
	}
}

class ElectricBassGuitar  extends StringedInstrument
{
	ElectricBassGuitar()
	{
		numberOfStrings = 8;
	}
	void play()
	{
		System.out.println("ElectricBassGuitar is played which has "+numberOfStrings+" "+"strings");
	}
}
public class AbstractChall1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Which instrument you want to hear?");
		System.out.println();
		System.out.println("Press 1 for Electric Guitar , 2 for Electric Bass Guitar");
		int t = in.nextInt();
		if(t==1)
		{
		StringedInstrument s1 = new ElectricGuitar();
		s1.play();
		}
		else
		{
		StringedInstrument s2 = new ElectricBassGuitar();
		s2.play();
		}
	}
}
