import java.util.Scanner;
import java.util.Arrays;
public class ArrayChall2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = in.nextInt();
		int [] ar1 = new int[n];
		System.out.println("Enter the elements into the array");
		for(int i=0;i<n;i++)
		{
			ar1[i] = in.nextInt();
		}
		Arrays.sort(ar1);
		System.out.println("The array after sorting is : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		int [] ar2 = new int[n+1];
		System.out.println("Enter a new number to insert");
		int n1 = in.nextInt();
		insertElement(ar1, ar2, n1, n);
	}
	public static void insertElement(int [] ar1, int [] ar2, int n1,int n)
	{
		int j=0 ; int p=0;int s=0;
		for(int i=0;i<n;i++)
		{
			if(ar1[i]<n1)
			{
				ar2[j] = ar1[i];
				j++;
			}
			else
			{
			    p = i;
			    s=s+1;
				ar2[j] = n1;
				j++;
				break;
			}
		}
		if(s==0)
		{
			ar2[j] = n1;
		}
		else
		{
		for(int i=p;i<n;i++)
		{
			ar2[j] = ar1[i];
			j++;
		}
		}
		System.out.println("The new array after insertion is :");
		for(int i=0;i<(n+1);i++)
		{
			System.out.print(ar2[i]+" ");
		}
	}
}
