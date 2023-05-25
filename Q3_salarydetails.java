package hello;

public class Q3 {
	public static double[] findDetails(double[] sal)
	{
		double salary[] = sal;
		double sum=0;
		for(int i=0;i<salary.length;i++)
		sum = sum+salary[i];
		double avg = sum/(salary.length);
		int ctr1=0;
		int ctr2 =0;
		for(int i=0;i<salary.length;i++)
		{
			if(salary[i]>avg)
				ctr1++;
			else
				ctr2++;
		
		
		}
		double[] arr = {avg,ctr1,ctr2};
		return arr;
	}
	public static void main(String[] args)
	{
		double[] a = {100,100.5,200,300,400,500};
		double[] arr = findDetails(a);
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
	}

}
