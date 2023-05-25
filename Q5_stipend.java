package hello;

public class Q5 {
	public static int TotalStipend(int ID,double agg)
	{
		int bonus=0;
		if(agg>=85 && agg<90)
			bonus=10;
		else if(agg>=90 && agg<95)
			bonus = 15;
		else if(agg>95)
			bonus =20;
		return bonus;
	}
	public static void main (String[] Args) {
		final int stipend = 100+TotalStipend(1212,93); 
		System.out.println("Stipend is "+stipend);
	}

}
