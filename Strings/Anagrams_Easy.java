package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams_Easy {
    static boolean angram(String s1,String s2)
    {
    	char str1[]=s1.toCharArray();
    	char str2[]=s2.toCharArray();
    	Arrays.sort(str1);
    	Arrays.sort(str2);
    	return Arrays.equals(str1,str2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
       String s1=sc.next(), s2=sc.next();
      if(angram(s1,s2))
    	  {
    	  System.out.println("True");
    	  }
      else
      {
    	  System.out.println("False");
      }
      }
	}
	}
