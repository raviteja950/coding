package Smart_Interview;

import java.util.Scanner;

public class Missing_number_And_repeated_Number_in_an_array {
 public static void  missing(int arr[],int n)
 {
	 int a=1;
	 int b=1;
	 for(int i=1;i<=n;i++)
	 {
		 b=b^i;
	 }
	 for(int i=0;i<n-1;i++)
	 {
		 a=a^arr[i];
	 }
	 System.out.println(a^b);
 }
 public static void repeated(int a[],int n)
 {
	 int res=a[0];
	 for(int i=1;i<a.length;i++)
	 {
		 res=res^a[i];
	 }
	 System.out.println(res);
 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		//missing(a,n);
        repeated(a,n);
	}

}
