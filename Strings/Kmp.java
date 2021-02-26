package Strings;

import java.util.Scanner;

public class Kmp {
	static void lpsa(String pat,int m,int lps[])
	{
		int len=0;
		int i=1;
		lps[0]=0;
		while(i<m)
		{
			if(pat.charAt(i)==pat.charAt(len))
			{
				lps[i]=len+1;
				len++;
				i++;
			}
			else
			{
				if(len!=0)
				{
					len=lps[len-1];
				}
				else
				{
				lps[i]=0;
				i++;
				}
			}
		}
	}
      static void kmp_search(String pat,String text)
      {
    	  int n=text.length();
    	  int m=pat.length();
    	  int lps[]=new int[m];
    	  lpsa(pat,m,lps);
    	  int i=0;
    	  int j=0;
    	  int count=0;
    	  while(i<n)
    	  {
    		  if(text.charAt(i)==pat.charAt(j)) { i++  ;  j++;  }
    		  else	 { 
			    			      if(j!=0)
			    				  {   
			    			    	  j=lps[j-1]; 
			    			      }
			    			      else
			    			      {
			    			    	  i++;
			    			      }
    		         }
    		  if(j==m)
    		  {
    			 count++;
    			  j=lps[j-1];
    		  }
    	  }
    	  System.out.println(count);
      }
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);	
     int t=sc.nextInt();
     while(t-->0)
     {
     String pat=sc.next();
     String text=sc.next();
     kmp_search(pat,text);
     }
	}

}
