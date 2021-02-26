package Trees;

import java.util.Scanner;

class node14
{
	int data;
	node14 left;
	node14 right;
	node14 (int x)
	{
		this.data=x;
		this.left=null;
		this.right=null;
	}
}



public class Least_common_ansisters_LCA {
    static node14 insert(node14 root,int x)
    {
    	if(root==null)
    		return new node14(x);
    	if(x<root.data)
    	{
    		root.left=insert(root.left,x);
    	}
    	else
    	{
    		root.right=insert(root.right,x);
    	}
    	return root;
    }
    static node14 lca(node14 root,int p,int q)
    {
    	if(root==null)return null;
    	if(root.data>p && root.data>q)
    	{
    	return lca(root.left,p,q);
    	}
    	if(root.data<p && root.data<q)
    	{
    	return lca(root.right,p,q);
    	}
    	return root;
        
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int n=sc.nextInt();
		int m=sc.nextInt();
		node14 root=null;
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			root=insert(root,x);
	    }
		for(int i=0;i<m;i++)
		{
			int p=sc.nextInt();
			int q=sc.nextInt();
		 node14 f= lca(root,p,q);
		 System.out.print(f.data+" ");
		}
		
		}		
	}

}
