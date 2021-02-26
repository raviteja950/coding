package Hacker_Rank;
import java.util.*;
public class Hour_glass {
	static int hourglassSum(int[][] a) 
    {
            int max=Integer.MIN_VALUE;
            int n=a.length;
            for(int i=0;i<n-2;i++)
            {
                    for(int j=0;j<n-2;j++)
                    {
                          int  sum=a[i][j]+a[i][j+1]+a[i][j+2]
                            +a[i+1][j+1]+
                            a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                    
                    max=Math.max(max,sum);
                    }
            }
    
            return max;
    }
	
	
	
	
	
	
	
	  public static void main(String[] args) 
	  {
            Scanner sc=new Scanner(System.in);
	        int[][] arr = new int[6][6];

	        for (int i = 0; i < 6; i++) {

	            for (int j = 0; j < 6; j++) {
	                int arrItem = sc.nextInt();
	                arr[i][j] = arrItem;
	            }
	        }

	        int result = hourglassSum(arr);
	        System.out.println(result);
	    }

}
