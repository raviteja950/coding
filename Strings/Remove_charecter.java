package Strings;

import java.util.Scanner;

public class Remove_charecter {
 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c=sc.next().charAt(0);
		char a[]=s.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(a[i]!=c)
			{
				sb.append(a[i]);
			}
		}
		System.out.println(sb);
		sc.close();
	}

}
