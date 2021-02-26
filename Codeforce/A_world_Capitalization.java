package Codeforce;

import java.util.Scanner;

public class A_world_Capitalization {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int l=s.length();
	String s1=s.substring(0,1).toUpperCase()+s.substring(1);
    System.out.println(s1);
	}

}
