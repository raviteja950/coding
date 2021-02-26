package Smart_Interview;

import java.util.Scanner;

public class A_power_B {
  
   static long power(int x,int y)
   {
	   long m=(int)1e9+7;
	   if(y==0)
	  return 1;
	   long z=power(x,y/2);
	   if(y%2==0)
	   {
		   return (z*z)%m;
	   }
	   else
	   {
		   return (x*z*z)%m;
	   }
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n=sc.nextInt();
		
		System.out.println(power(a,n));
		
		
	}

}
