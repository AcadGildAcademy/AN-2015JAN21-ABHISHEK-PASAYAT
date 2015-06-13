import java.util.Scanner;
public class ArrayChall1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your choice : Y/y to continue , n to exit");
		char t = in.next().charAt(0);
		while(t!='n')
		{
		System.out.println("Enter the Size of the array");
		int n = in.nextInt();
		int [] ar = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			ar[i] = in.nextInt();
		}
		System.out.println("The original array is ");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("The reversed array is ");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Wish to continue with different size array? Press Y/y to continue , n to exit");
		t = in.next().charAt(0);
	}
	}
}
