package Strings;

import java.util.Scanner;
public class Rabin_krap {
	public  final static int d = 256;
	    static void rabin(String pat,String text,int q)
	    {
	    	int m=pat.length();
	    	int n=text.length();
	    	int i,j;
	    	int count=0;
	    	int p=0;
	    	int t=0;
	    	int h=1;
	    	for(i=0;i<m-1;i++)
	    		h=(h*d)%q;
	    	
	    	for( i=0;i<m;i++)
	    	{
	    		p=(d*p+pat.charAt(i))%q;
	    		t=(d*t+text.charAt(i))%q;
	    	}
	    	for( i=0;i<=n-m;i++)
	    	{
	    		if(p==t)
	    		{
	    			for( j=0;j<m;j++)
	    			{
	    				if(text.charAt(i+j)!=pat.charAt(j))
	    					break;
	    			}
	    			if(j==m)
	    			{
	    				//System.out.println("pattern found at index:"+i);
	    				count++;
	    			}
	    			
	    		}
	    		if(i<n-m)
	    		{
	    			t=(d*(t-text.charAt(i)*h)+text.charAt(i+m))%q;
	    				if(t<0)
	    					t=(t+q);
	    		}
	    	}
	    	
	    	System.out.println(count);
	    }

		
		
		
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			while(t-->0)
			{
			
			String pat=sc.next();
		    String text=sc.next();;
			int q=101;
			rabin(pat,text,q);
		    }
		 }
	}

