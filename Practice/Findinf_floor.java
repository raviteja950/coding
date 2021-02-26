package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Findinf_floor 
      {
//    static void floor(int a[],int x,int n,int m)
//    {
//    	
//    	
//    		
//    				
//    	int ans=Integer.MIN_VALUE;
//    	for(int i=0;i<n;i++)
//    	{
//    		if(a[i]<=x)
//    		{
//    			ans=Math.max(ans, a[i]);
//    		}
//    	}
//    	System.out.println(ans);
//    }
//	public static void floor_binary(int a[],int x,int n)
//	{
//		Arrays.sort(a);
//		int l=0;
//		int h=n-1;
//		int ans=Integer.MIN_VALUE;
//		
//		while(l<=h)
//		{
//			
//			int m=l+(h-l)/2;
//			if(a[m]>x)
//			{
//				
//				h=m-1;
//				
//			}
//			else
//			{
//				ans=a[m];
//				l=m+1;
//				
//			}
//		}
//		System.out.println(ans);
//		
//	}
	static void floor_two_pointer(int a[],int x,int n)
	{
		Arrays.sort(a);
		int p=0;
		int p1=n-1;
		if(p<p1)
		{
			if(p<=x)
			{
				
			}
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n =sc.nextInt();
		System.out.println("enter element");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter size");
		int m=sc.nextInt();
		System.out.println("enter element");
		for(int i=0;i<m;i++)
		{	
			int x=sc.nextInt();
           // floor(a,x,n,m);
			//floor_binary(a,x,n);
			floor_two_pointer(a,x,n);
		}
	}

}
