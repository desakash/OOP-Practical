package hello;

class Camera
{
    private String brand;
    private double cost;
    Camera(String brand,double cost)
    {
        this.brand = brand;
        this.cost = cost;
    }
}
class DigitalCamera extends Camera
{
    private int memory;
    DigitalCamera(String brand,double cost,int memory)
    {
        super(brand,cost);
        this.memory = memory;
        System.out.println(brand+", "+cost+"$, "+memory+"GB");
    }
}
public class Q24
{
	public static void main(String[] args) {
		Camera d = new DigitalCamera("Nikon",100,16);
	
		
	}
}

