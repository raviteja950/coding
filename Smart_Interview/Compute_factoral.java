package Smart_Interview;

import java.util.Scanner;

public class Compute_factoral {
   static long fact(int ans)
   {
	   int m1=(int)10e9+7;
	   if(ans==1|| ans==0)
	   {
		   return 1;
	   }
	   return (ans*fact(ans-1))%m1;
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int n=sc.nextInt();
		int ans=n;
		int m=(int)10e9+7;
		System.out.println(fact(ans)%m);
	    }

	}
}
