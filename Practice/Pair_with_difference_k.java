package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_with_difference_k {
   public static boolean differ(int a[],int n,int k)
   {
	   Arrays.sort(a);
	   for(int i=0;i<n-1;i++)
	   {
		   for(int j=i+1;j<n;j++)
		   {
			   if(a[j]-a[i]==k)
			   {
				   return true;
			   }
		   }
	   }
	   return false;
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
    boolean res=differ(a,n,k);
    if(res==true)
    {
    	System.out.println("true");
    }
    else
    {
    	System.out.println("false");
    }
	}

}
