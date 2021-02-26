package Smart_Interview;

import java.util.HashMap;
import java.util.Scanner;

public class Sum_of_pair {
//    static boolean sumOfpair(int a[],int n,int k)
//    {
//    
//    	for(int i=0;i<n;i++)
//    	{
//    		for(int j=i+1;j<n;j++)
//    		{
//    			if(a[i]+a[j]==k)
//    			{
//    				return true;
//    			}
//    		}
//    	}
//    	return false;
//    		
//    	
//    }
	
	
	
	static boolean hashMap(int a[],int n,int k)
	{
		HashMap<Integer,Integer> hm=new HashMap<>(n);
		for(int x:a)
		{
			if(hm.containsKey(x))
			{
				hm.put(x, hm.get(x)-1);
			}
			else
			{
				hm.put(x, 1);
			}
		}
		for(int i=0;i<n;i++)
		{
			if(hm.containsKey(k-a[i]))
			{
				return true;
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
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(hashMap(a,n,k))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
   }

}
}
