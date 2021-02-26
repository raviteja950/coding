package Smart_Interview;
import java.util.*;
public class Lcm_and_Hcf {
   static long gcd(long a,long b)
   {
	   if(b==0)
		{
			return a;
		}
	   return gcd(b,a%b);
	   
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long f=gcd(a,b);
         long lcm=(a*b)/f;
         System.out.println(f+" "+lcm);
         
	}

}
