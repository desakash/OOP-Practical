package hello;
import java.util.*;
class OddNumberException extends Exception
{
	public String getMessage()
	{
		return "Number is ODD !";
		
	}

}
public class Q22 {
	public static void main(String[] args) throws OddNumberException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n =sc.nextInt();
		try
		{
			if(n%2!=0)
				throw new OddNumberException();
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
	}
	}
}


