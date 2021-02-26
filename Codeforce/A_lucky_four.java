package Codeforce;

import java.util.Scanner;

public class A_lucky_four {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(x%4==0
				||x%7==0||x%47==0||
				x%477==0 ? "YES" : "NO");

	}

}
