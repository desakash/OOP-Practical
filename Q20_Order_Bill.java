package hello;

class Orders1
{
	int orderId;
	String orderedFoods;
	double totalPrice;
	Orders1(int orderId,String orderedFoods,double totalPrice){
		this.orderedFoods= orderedFoods;
		this.orderId = orderId;
		this.totalPrice = totalPrice;
	}
	double calculateTotalPrice(int unitprice)
	{
		totalPrice = totalPrice+(0.05*totalPrice);
		return totalPrice;
	}
	}
public class Q20 {
	public static void main(String[] args)
	{
		Orders1 o = new Orders1(1001,"Kebab",100.0);
		double total = o.calculateTotalPrice(100);
		System.out.println("OrderID="+o.orderId);
		System.out.println("Order food = "+o.orderedFoods);
		System.out.println("Total price"+total);
	}

}
