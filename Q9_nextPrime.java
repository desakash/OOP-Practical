package hello;

public class Q9 {
	public static boolean isPrime(int n)
	{
		if(n==1)
			return false;
		int ctr=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				ctr++;
		}
		if(ctr==2)
			return true;
		else 
			return false;
	}
	public static int nextPrime(int x)
	{
		x=x+1;
		while(!isPrime(x))
			x++;
		return x;
	}
	public static void main(String[] Args)
	{
		int A[] = {1,2,3,4,5};
		int a2[] = new int[5];
		for(int i=0;i<A.length;i++)
		{
			a2[i]= nextPrime(A[i]);
		}
		for(int i=0;i<5;i++)
			System.out.println(a2[i]);

	}

}
