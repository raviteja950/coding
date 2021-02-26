package Codeforce;

import java.util.Scanner;

public class Theater_square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int m=sc.nextInt();
		int row=a%m;
		int col=b%m;
		int ans=row*col;
		System.out.println(ans);

	}

}
