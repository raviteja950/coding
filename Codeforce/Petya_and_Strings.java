package Codeforce;

import java.util.Scanner;

public class Petya_and_Strings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=sc.next().compareToIgnoreCase(sc.next());
		System.out.print(v<0?-1:v>0?1:0);

	}

}
