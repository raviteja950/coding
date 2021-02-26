package Codeforce;

import java.util.Arrays;
import java.util.Scanner;

public class A_help_full_math {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		String[] s = sc.nextLine().split("\\+");
		String x = "";
		Arrays.sort(s);
		
		x+=s[0];
		
		for (int i = 1; i < s.length; i++) {
			x += "+" + s[i];
		}
		
		System.out.println(x);

	}

}
