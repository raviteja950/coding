package Strings;

import java.util.Scanner;

public class Panagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int a[]=new int[26];
		for(int i=0;i<26;i++)
		{
			a[i]=0;
		}
		for(int i=0;i<s.length();i++)
		{
			if('a'<=s.charAt(i) && s.charAt(i)<='z')
			{
				a[(int)s.charAt(i)-'a']++;
			}
			else if('A'<=s.charAt(i) && s.charAt(i)<='Z')
			{
				a[(int)s.charAt(i)-'A']++;
			}
		}
		for(int i=0;i<26;i++)
		{
			if(a[i]==0)
			{
				System.out.println("not pangram");
				return;
			}
		}
		System.out.println("pangram");
		
	}

}
