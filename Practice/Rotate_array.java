package Practice;

import java.util.Scanner;

public class Rotate_array {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int a[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 int d=sc.nextInt();
		 int tem[]=new int[d];
		 for(int i=0;i<d;i++)
		 {
			 tem[i]=a[i];
		 }
		 for(int i=d;i<n;i++)
		 {
			 a[i-d]=a[i];
		 }
		 for(int i=0;i<d;i++)
		 {
			 a[i+n-d]=tem[i];
		 }
		 for(int i=0;i<n;i++)
		 {
			 System.out.print(a[i]+" ");
		 }

	}

}
