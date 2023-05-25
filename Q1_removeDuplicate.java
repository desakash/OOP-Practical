package hello;

import java.util.*;

public class Q1 {
	public static <T>ArrayList<T> removeDuplicates(ArrayList<T> list)
	{
		ArrayList<T> l = new ArrayList<T>();
		for(T element : list)
		{
			if(!l.contains(element))
					l.add(element);
		}
		return l;
		
	}
	public static void main(String[] Args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(10,20,30,40,10,20,60));
		ArrayList<Integer> newlist = removeDuplicates(a);
		System.out.println("new list = "+newlist);
	}
	
}
