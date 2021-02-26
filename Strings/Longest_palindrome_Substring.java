package Strings;

import java.util.Scanner;

public class Longest_palindrome_Substring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int n=sc.nextInt();
		int ans=0;
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			int p1=i;
			int p2=i;
			while(p1>=0 && p2<s.length()&& s.charAt(p1)==s.charAt(p2))
			{
				p1--;
				p2++;
			}
			ans=Integer.max(ans,p2-p1-1);
		}
		for(int i=0;i<s.length()-1;i++)
		{
			int p1=i;
			int p2=i+1;
			while(p1>=0 && p2<s.length() && s.charAt(p1)==s.charAt(p2))
			{
				p1--;
				p2++;
			}
			ans=Integer.max(ans, p2-p1-1);
		}
		System.out.println(ans);

	}

}
}
