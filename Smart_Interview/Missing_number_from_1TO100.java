package Smart_Interview;

import java.util.Scanner;

public class Missing_number_from_1TO100 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=100;
		int sum=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int exp=n+1;
        int total=(exp*(exp+1))/2;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum-total);		
	}

}
