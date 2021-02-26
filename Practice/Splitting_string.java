package Practice;

import java.util.Scanner;

public class Splitting_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0)
		{
		String s=sc.next();
		char a[]=s.toCharArray();
		int count=0;
			int l=0;
			int h=a.length-1;
			while(l<=h)
			{
			int m=(l+h)/2;
			count++;
			l++;
			h--;
			}
       if(count%2==0)
       {
    	   System.out.println(count-2);
       }
       else
       {
    	   System.out.println(1);
       }
	}
	}
}
