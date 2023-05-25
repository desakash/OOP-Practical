package hello;

import java.util.*;
public class Q2
{

	
	    static <String>ArrayList<String> concatenateLists(ArrayList<String> l1,ArrayList<String> l2)
	    {
	        Collections.reverse(l2);
	        l1.addAll(l2);
	        return l1;
	    }
		public static void main(String[] args) {
		    ArrayList<String> l1 = new ArrayList<String>();
		    l1.add("N");
		    l1.add("I");
		    ArrayList<String> l2 = new ArrayList<String>();
		    l2.add("A");
		    l2.add("B");
		    l2.add("C");
		    List<String> l3 = new ArrayList<String>();
		    l3 = concatenateLists(l1,l2);
		    for(String s:l3)
		    System.out.println(s);
			

		}
}

   /*static void concentrateList(){
       List<String>list1=new ArrayList<String>();
       list1.add("Hello");
       list1.add("102");
       list1.add("200.8");
       list1.add("25");
       System.out.println("listone:"+list1);
       List<String>list2=new ArrayList<String>();
       list2.add("150");
       list2.add("40.8");
       list2.add("welcome");
       list2.add("A");
       System.out.println("listtwo:"+list2);
       Collections.reverse(list2);
       System.out.println("Reverse listtwo"+list2);
       String s1 = "";
      StringBuffer sb = new StringBuffer();
      for(String s : list1)
      {
          sb.append(s);
          sb.append(" ");
      }
            for(String s : list2)
      {
          sb.append(s);
          sb.append(" ");
     }
      
      String str = sb.toString();
      System.out.println(str);
   }
   public static void main(String[]args){
       concentrateList();
   }
}
*/