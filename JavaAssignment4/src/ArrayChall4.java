import java.util.Scanner;
public class ArrayChall4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter your choice : Y/y to continue , n to exit");
		char t = in.next().charAt(0);
		while(t!='n')
		{
		System.out.println("Enter the rows and columns for the First matrix");
		int r1 = in.nextInt();
		int c1 = in.nextInt();
		int first[][] = new int[r1][c1];
		System.out.println("Enter the elements in the First matrix");
        for(int i=0;i<r1;i++)
        {
        	for(int j=0;j<c1;j++)
        	{
        		first[i][j] = in.nextInt();
        	}
        }
        System.out.println("Enter the rows and columns for the Second matrix");
		int r2 = in.nextInt();
		int c2 = in.nextInt();
        if(c1 != r2)
        	System.out.println("Matrix multiplication is not possible gor given orders");
        else
        {
        	int second[][] = new int[r2][c2];
        	int multiplicationMatrix[][] = new int[r1][c2];
        System.out.println("Enter the elements in the Second matrix");
        for(int i=0;i<r2;i++)
        {
        	for(int j=0;j<c2;j++)
        	{
        		second[i][j] = in.nextInt();
        	}
        }
        for(int i=0;i<r1;i++)
        {
        	for(int j=0;j<c2;j++)
        	{
        		for(int k=0;k<c1;k++)
        		{
        		  sum = sum + first[i][k] * second[k][j]; 
        		}
        		multiplicationMatrix[i][j] = sum;
        		sum = 0;
        	}
        }
        System.out.println("The matrix after multiplication is ");
        for(int i=0;i<r1;i++)
        {
        	for(int j=0;j<c2;j++)
        	{
        		System.out.print(multiplicationMatrix[i][j]+"\t");
        	}
        	System.out.println();
        }
	}
        System.out.println("Wish to continue for different matrices? Press Y/y to continue , n to exit");
        t = in.next().charAt(0);
}
	}
}
