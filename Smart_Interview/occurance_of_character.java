package Smart_Interview;

import java.util.Scanner;

public class occurance_of_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c='a';
        int res=0;
        for(int i=0;i<s.length();i++)
        {
        	if(s.charAt(i)==c)
        	{
        		res++;
        	}
        }
        System.out.println(res);
        
	}

}
