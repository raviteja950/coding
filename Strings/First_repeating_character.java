package Strings;

import java.util.HashSet;
import java.util.Scanner;

public class First_repeating_character {
     static int First(String s)
     {
    	 int p=-1,i,j;
    	 for( i=0;i<s.length();i++)
    	 {
    		 for(j=i+1;j<s.length();j++)
    		 {
    			 if(s.charAt(i)==s.charAt(j))
    			 {
    				 p=i;
    				 break;
    			 }
    		 }
    		 if(p!=-1)
    		 {
    			 break;
    		 }
    	 }
    	 return p;
    	
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		String s=sc.nextLine();
		int po=First(s);
		if(po==-1)
		{
			System.out.println(".");
		}
		else
		{
			System.out.println(s.charAt(po));
		}

		}	
	}

}
