package Practice;

import java.util.HashMap;
import java.util.Scanner;

public class Finding_frequency_using_map {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
    	  int n=sc.nextInt();
    	  int a[]=new int[n];
    	  HashMap<Integer,Integer> hm=new HashMap<>();
    	  for(int i=0;i<n;i++)
    	  {
    		  a[i]=sc.nextInt();
    		  if(hm.containsKey(a[i]))
    		  {
    		  hm.put(a[i],hm.get(a[i])+1);
    	      }
    		  else
    		  {
    			hm.put(a[i], 1);  
    		  }
    	  }
    		int m=sc.nextInt();	  
    	  for(int i=0;i<m;i++)
    	  {
    		  int k=sc.nextInt();
    		  if(hm.containsKey(k))
    		  {
    			  System.out.println(hm.get(k));
    		  }
    		  else 
    		  {
    			  System.out.println(0);
    		  }
    	  }
    			  
      }
	}


