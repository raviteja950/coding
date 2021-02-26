package Smart_Interview;

import java.util.Scanner;

public class Triple_trouble {
   public static void triple(int a[],int n)
   {
	   int re=0;
	   int x,ans;
	   for(int i=0;i<32;i++)
	   {
		   ans=0;
		   x=(1<<i);
		   for(int j=0;j<n;j++)
		   {
			   if((a[j]&x)==0)
				   ans++;
		   }
		   if((ans%3)==0)
			   re|=x;
	   }
	   System.out.println(re);
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		triple(a,n);
		sc.close();
	}
}
