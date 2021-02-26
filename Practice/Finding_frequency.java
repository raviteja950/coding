package Practice;


import java.util.Scanner;

public class Finding_frequency {
   static void count(int a[],int x,int n)   //brute-force
   {
	   int count1=0;
	   for(int i=0;i<n;i++)
	   {
		   if(x==a[i])
		   {
			   count1++;
		   }
	   }
	   System.out.println(count1);
   }
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			
		int x=sc.nextInt();
		//brute-force//
		count(a,x,n);
		}

	}
}


