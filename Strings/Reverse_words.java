package Strings;

import java.util.Scanner;

public class Reverse_words {
   static void rever(String s)
   {
	  String a[]=s.split(" ");
	  for(int i=a.length-1;i>=0;i--)
	  {
		  System.out.print(a[i]+" ");
	  }
   }
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	rever(s) ;
	}

}
