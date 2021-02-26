package Smart_Interview;

import java.util.Scanner;

public class To_check_setBit {
   static void checkbit(int N,int K )
   {
        if((N & (1<<K))!=0)
	   {
		   System.out.println("Set");
	   }
	   else
	   {
		   System.out.println("Not set");
	   }
	    
   }
   public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int i=sc.nextInt();
	  checkbit(n,i);
	}
	}


