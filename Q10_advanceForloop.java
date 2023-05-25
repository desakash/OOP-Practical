package hello;

import java.util.*;
public class Q10
{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		for(int i=0;i<list.size();i++)
		System.out.println(list.get(i));
		Iterator itr = list.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		for(int i:list)
		System.out.println(i);
	}
}
