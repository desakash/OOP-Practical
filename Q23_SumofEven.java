package hello;
import java.util.*;
class Even
{
	int calculateSumOfEvenNumbers(int[] a)
	{
		int sum = 0;
		for(int i =0;i<a.length;i++)
		{
			if(a[i]%2==0)
				sum = sum+a[i];
		}
		return sum;
	}
	
}
public class Q23 {
	public static void main(String[] args) {
	Even e = new Even();
	int[] a = {1,2,3,4,5,6,7,8,9,10};
	int s = e.calculateSumOfEvenNumbers(a);
	System.out.println("Sum="+s);

}
}
