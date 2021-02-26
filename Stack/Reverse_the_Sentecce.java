package Stack;

import java.util.Scanner;



public class Reverse_the_Sentecce {
   
	
	
 public static void main(String args[]) 
 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 sc.nextLine();
	  while(t--!=0)
	  {
		  String s=sc.nextLine();
		  String st[]=s.split(" ");
		  for(int i=st.length-1;i>=0;i--)
		  {
			  System.out.print(st[i]+" ");
		  }
		  System.out.println();
      }

 }
 

}
