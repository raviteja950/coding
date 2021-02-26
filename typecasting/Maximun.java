package typecasting;

import java.util.Scanner;

public class Maximun {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=1;
		for(int i=0;i<n;i++)
		{
		
			sum*=a[i];
		}
		
		System.out.println(sum/n);

	}

}
