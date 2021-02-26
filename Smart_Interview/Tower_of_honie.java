package Smart_Interview;

import java.util.Scanner;

public class Tower_of_honie {
    static void toh(int n,char source,char destination,char temp)
    {
    	
    	if(n==0)
    	{
    	 return;
    	}
    	toh(n-1,source,temp,destination);
    	System.out.println("move "+n+" from "+source+" to "+destination);
    	toh(n-1,temp,destination,source);
    	
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int c=n;
			c=1<<n;
			System.out.println(c-1);
			toh(n,'A','C','B');
		}

	}

}
