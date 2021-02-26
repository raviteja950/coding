package Smart_Interview;

import java.util.Scanner;
public class Pair_with_difference_k {
   public static boolean differ(int a[],int n,int k)
   {
	   int p=0;
	   int p1=1;
	   while(p<n && p1<n )
	   {
		   if(p!=p1 && a[p1]-a[p]==k)
		   {
			   return true;
		   }
		   else if(a[p1]-a[p]<k)
		   {
			   p1++;
		   }
		   else
		   {
			   p++;
		   }
	   }
	   
	   
           return false;
   }
        public static void main(String[] args) 
        {
               Scanner sc=new Scanner(System.in);
               int t=sc.nextInt();
                while(t-->0)
                {
			                int n=sc.nextInt();
			               int a[]=new int[n];
			               int m=sc.nextInt();
			               for(int i=0;i<n;i++)
			               {
			            	   a[i]=sc.nextInt();
			               }
			              if(differ(a,n,m)==true)
			              {
			            	  System.out.print("true");
			              }
			              else
			              {
			            	  System.out.println("false");
			              }
                }
        
       }
}

