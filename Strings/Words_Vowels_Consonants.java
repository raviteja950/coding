package Strings;

import java.util.Scanner;

public class Words_Vowels_Consonants {

  static void vowels(String s)
  {
	 
		int count=0;
		int count1=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char str=s.charAt(i);
			if(str=='a' || str=='e'|| str=='i'|| str=='o' || str=='u')
			{
				count++;
			}
			else if(str>='a' && str<='z')
			{
				count1++;
			}
			
		}
		
			int count3=1;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==' ' && i<s.length()-1 && s.charAt(i+1)!=' ' )
				{
					count3++;
				}
			}
			System.out.print(count3+" "+count+" "+count1);
}
		
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		
		String s=sc.nextLine();
		s=sc.nextLine();
		vowels(s);
		}
		
		
		
		
		sc.close();
	}

}
