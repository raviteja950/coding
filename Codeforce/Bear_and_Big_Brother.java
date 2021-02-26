package Codeforce;

import java.util.Scanner;

public class Bear_and_Big_Brother {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0;
		while(n<=m)
		{
			n*=3;
			m*=2;
			sum++;
		}
		System.out.println(sum);
	}

}
