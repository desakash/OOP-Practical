package hello;

public class Q26 {
	public static void main(String[] args)
	{
		int[] a = {25,14,56,15,36,56,77,18,29,7,49};
		int max = a[0];
		int min = a[0];
		for(int i =0;i<a.length;i++)
		{
			if(a[i]<min)
				min = a[i];
			if(a[i]>max)
				max = a[i];
		}
		System.out.println(max+" "+min);
		int[] rev = new int[a.length];
		int ctr =a.length-1;
		for(int i =0;i<a.length;i++)
			{rev[i] = a[ctr];
			ctr--;
	}
		for(int i =0;i<a.length;i++)
			System.out.println(rev[i]);
	}
}
