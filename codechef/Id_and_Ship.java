package codechef;

import java.util.Scanner;

public class Id_and_Ship {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		char s=sc.next().charAt(0);
		if( s =='B' || s=='b')
		{
			System.out.println("BattleShip");
		}
		else if(s =='C' || s=='c')
		{
			System.out.println("Cruiser");
		}
		else if(s=='D'|| s=='d')
		{
			System.out.println("Destroyer");
		}
		else if(s=='F' || s=='f')
		{
			System.out.println("Frigate");
		}
		}
	}

}
