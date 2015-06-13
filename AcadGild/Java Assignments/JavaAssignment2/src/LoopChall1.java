
public class LoopChall1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int[] primes = new int[n+1];
		for(int i=0; i<n; i++)
			primes[i]=1;
		for(int i=2;i<=(int)Math.sqrt(n);i++) 
		{
			if(primes[i]==1)
			{
				for(int j=i;j*i<n;j++)
				{
					primes[i*j]=0;
				}
			}
		}
		System.out.println("Prime numbers between 1 and 100");
		for(int i=2;i<n;i++)
		{
			if(primes[i]==1)
			{
				System.out.print(i+" ");
			}
		}


	}

}
