import java.util.Scanner;
public class RecursionChall1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		String str = in.nextLine();
		String str1 = RecursiveReverse(str);
		System.out.println("The reversed string is :" );
		System.out.println(str1);
	}
	public static String RecursiveReverse(String str)
	{
		if((str=="\0") || (str.length()<=1))
		{
			return str;
		}
		else
			return  RecursiveReverse(str.substring(1)) + str.charAt(0);
	}

}
