 package Smart_Interview;

import java.util.Scanner;

public class Amstrong_number {
       public static void main(String[] args)
       {
    	   Scanner sc=new Scanner(System.in);
    	   Long n=sc.nextLong();
    	   long temp=n;
    	   long c=0;
    	   while(n>0)
    	   {
    		   long r=n%10;
    		   n=n/10;
    		   c+=r*r*r*r;
    	   }
    	   if(temp==c)
    	   {
    		   System.out.println("yes");
    	   }
    	   else
    	   {
    		   System.out.println("No");
    	   }
       }
}
