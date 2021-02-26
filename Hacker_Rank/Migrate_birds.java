package Hacker_Rank;
import java.util.*;
public class Migrate_birds {
static void count(int a[],int n)  //by using count Array
{
	int coun[]=new int[n];
	for(int i=0;i<n;i++)
	{
		coun[i]=0;
	}
	for(int i=0;i<n;i++)
	{
		coun[a[i]]++;
	}
	int idx=0;
	for(int i=0;i<n;i++)
	{
		if(coun[i]>coun[idx])
		{
			
			idx=i;
		}
	}
	System.out.println(idx);

}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
    count(a,n);
	}

}
