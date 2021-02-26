package Practice;

import java.util.Scanner;

public class Sum_of_Sub_Array {
  static void sum(int a[],int x,int y)
  {
	  int ans=Integer.MIN_VALUE;
	  int sum=0;
	  for(int i=x;i<=y;i++)
	  {
		  sum=sum+a[i];
	  }
	  ans=Math.max(sum, ans);
	  System.out.println(ans);
  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			sum(a,x,y);
		}

	}

}
