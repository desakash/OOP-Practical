package hello;

public class Q15
{
	public static void main(String[] args)
	{
		Employee p = new Employee("Avish",19,"student",123221);
		Employee p1 = new Employee("Anish",19,"student",123);

	}
	}

class Person {
	String name;
	int age;
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}

}
class Employee extends Person
{
	String designation;
	long salary;
	Employee(String name,int age,String designation,long salary)
	{
		super(name,age);
		this.designation = designation;
		this.salary = salary;
		if(salary>5000)
			System.out.println(name+" "+salary);
	}
}
	
