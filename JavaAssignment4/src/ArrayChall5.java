import java.util.Scanner;
public class ArrayChall5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your choice : Y/y to continue , n to exit");
		char t = in.next().charAt(0);
		while(t!='n')
		{
			System.out.println("Enter the rows and columns of a two dimensioanl array");
			int r = in.nextInt();
			int c = in.nextInt();
		int ar[][] = new int[r][c];
		System.out.println("Dimension 1 :"+ar.length);
		System.out.println("Dimension 2 :"+ar[0].length);
		 System.out.println("Wish to continue for different dimensions? Press Y/y to continue , n to exit");
	        t = in.next().charAt(0);
	}
	}
}
