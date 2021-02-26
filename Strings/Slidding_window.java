package Strings;
import java.util.HashMap;
import java.util.*;


public class Slidding_window {
    static void window(long a[],long k)
    {
    	HashMap<Long,Integer>h=new HashMap<>();
    	for(int i=0;i<k;i++)
    	{
    		h.put(a[i],h.getOrDefault(a[i], 0)+1);
    	}
    	System.out.print(h.size()+" ");
    	for(long i=k;i<a.length;i++)
    	{
    		if(h.get(a[(int) (i-k)])==1)
    		{
    			h.remove(a[(int) (i-k)]);
    		}
    		else
    		{
    			h.put(a[(int)(i-k)], h.get(a[(int) (i-k)])-1);
    		}
    		h.put(a[(int)i], h.getOrDefault(a[(int)i],0)+1);
    		System.out.print(h.size()+" ");
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		 long n=sc.nextLong();
		long k=sc.nextInt();
		long a[]=new long[(int)n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		window(a,k);
	    }

   }

}