package hello;

interface Account
{
	void set(int account_number,int balance);
	void display();
	}
interface Person1
{
	void store(String name);
	void disp();
	}
class Customer implements Account,Person1
{
	String name;
	int account_number;
	int balance;
	public void set(int account_number,int balance)
	{
		this.account_number=account_number;
		this.balance = balance;
	}
	public void display()
	{
		System.out.println("Account number = "+account_number);
		System.out.println("Balance = "+balance);
	}
	public void store(String name)
	{
		this.name = name;
	}
	public void disp()
	{
		System.out.println("Name of the customer = "+name);
	}
	
	}
public class Q16 {
    public static void main(String[] args) {
        // Create a customer object
        Customer customer = new Customer();

        // Set the account information for the customer
        customer.set(123456, 1000);

        // Store the name for the customer
        customer.store("John Smith");

        // Display the account information and name for the customer
        System.out.println("Customer information:");
        customer.display();
        customer.disp();
    }
}



