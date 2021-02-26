package Trees;

import java.util.HashMap;
import java.util.Scanner;

public class Preorder_Inorder_to_postorder {
	static int pos=0;
	static void search(int in[],int pre[],int s,int e,HashMap<Integer,Integer>hm)
	{
		if(s>e)return;
		int idx=hm.get(pre[pos++]);
		search(in,pre,s,idx-1,hm);
		search(in,pre,idx+1,e,hm);
		System.out.print(in[idx]+" ");
	}
    static void post(int in[],int pre[])
    {
    	int n=pre.length;
    	HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
    	for(int i=0;i<n;i++)
    	{
    		hm.put(in[i],i);
    	}
    	search(in,pre,0,n-1,hm);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pre[]=new int[n];
		int in[]=new int[n];
		for(int i=0;i<n;i++)
		{
			pre[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		  in[i]=sc.nextInt();
		}
		post(in,pre);
		
	}

}
