package Spoj;
import java.util.*;
public class Fun_with_Sequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum1=0;
		int sum2=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum1+=a[i];
		}
		int m=sc.nextInt();
		int b[]=new int[m];
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
			sum2+=b[i];
		}
		int f=sum2/m;
		int s=sum1/n;

		for(int i=0;i<m+n;i++)
		{
			 int s1=f<s? b[i] :a[i];
		
			System.out.println(s1);		
		}
	}

}
