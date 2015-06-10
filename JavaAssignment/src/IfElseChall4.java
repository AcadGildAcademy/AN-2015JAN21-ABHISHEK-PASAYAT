import java.util.Scanner;
public class IfElseChall4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
        int t = in.nextInt();
        while(t!=0)
        {
        	System.out.println("enter a character from english alphabet");
        	char ch = in.next().charAt(0);
        	if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='u')
        		System.out.println("The entered character is a vowel");
        	else
        		System.out.println("The entered character is a consonant");
        	t--;
        }

	}

}
