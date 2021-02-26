package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Diagonal_traversel_of_matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
    	   a[i]=sc.nextInt();
       }
       Arrays.sort(a);
       for(int i=0;i<n;i++)
       {
    	   System.out.print(a[i]+" ");
       }
       int min=a[0];
       int max=a[a.length-1];
       System.out.println(max-min);
	}

}
