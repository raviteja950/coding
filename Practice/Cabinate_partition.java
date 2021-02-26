package Practice;

import java.util.Scanner;

public class Cabinate_partition {

	static boolean solve(int a[],int n,int mid,int k)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
			if(sum>mid)
			{
				sum=a[i];
				k--;
			}
		}
		if(k>=1)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
			int l=0;
			int h=0;
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				h+=a[i];
				if(l<a[i])
				{
					l=a[i];
				}
			}
			int ans=0;
			while(l<=h)
			{
				int m=(l+h)/2;
				if(solve(a,n,m,k))
				{
					ans=m;
					h=m-1;
				}
				else
				{
					l=m+1;
				}
			}
			System.out.println(ans);
			
					
		}

	}

}
