package hello;
import java.util.*;
public class Q17 {
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
	    String str;
	    String arr1[]=new String[10];
	    for(int i=0;i<10;i++){
	        System.out.println("Enter String: "+i);
	        arr1[i] = sc.nextLine();
	        String ans="";//will store sorted string
	        arr1[i] = arr1[i].toUpperCase();
	        for(int j=65;j<=90;j++)
	        {
	        	for(int k=0;k<arr1[i].length();k++)
	        	{
	        		char ch = arr1[i].charAt(k);
	        	if(ch==(char)j)
	        		ans=ans+ch;
	        }
	        }
	        arr1[i]=ans;
	        System.out.println("the sorted string is = "+ans);

	}
	    System.out.println("Concatenating first two strings = "+arr1[0].concat(arr1[1]));
	    
	
}
}
	



