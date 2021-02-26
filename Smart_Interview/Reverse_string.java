package Smart_Interview;

import java.util.Collections;
import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
         char a[]=s.toCharArray();
         for(int i=s.length()-1;i>=0;i--)
         {
        	 System.out.print(a[i]);
         }
	}

}
