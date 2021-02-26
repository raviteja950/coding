package Practice;

import java.util.Scanner;

public class Collecting_water {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int n =sc.nextInt();
		int ml[]=new int[n];
		int mr[]=new int[n];
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		ml[0]=a[0];
		for(int i=1;i<n-1;i++)
		{
			ml[i]=Math.max(ml[i-1], a[i]);
		}
		
		mr[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--)
		{
			mr[i]=Math.max(mr[i+1], a[i]);
		}
		int ans=0;
		for(int i=0;i<n-1;i++)
		{
			ans=ans+Math.min(ml[i], mr[i])-a[i];
	    }
		System.out.println(ans);

	}
	}

}
