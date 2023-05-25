package hello;
import java.util.*;
abstract class Bank
{
	abstract void getBalance(int n);
	
}
class BankA extends Bank
{
	void getBalance(int n)
	{
		System.out.println("Balance of bank A = "+n+"$");
	}
	}
class BankB extends Bank
{
	void getBalance(int n)
	{
		System.out.println("Balance of bank B = "+n+"$");
	}
	}
class BankC extends Bank
{
	void getBalance(int n)
	{
		System.out.println("Balance in bank C = "+n+"$");
	}
	}

public class Q29 {
	public static void main(String[] args)
	{
		BankA a = new BankA();
		a.getBalance(100);
		BankB b = new BankB();
		b.getBalance(200);
		BankC c = new BankC();
		c.getBalance(300);
		
	}

}
