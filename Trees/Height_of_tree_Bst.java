package Trees;

import java.util.Scanner;
class Node1255
{
	int data;
	Node1255 left;
	Node1255 right;
	Node1255 (int x)
	{
		this.data=x;
		this.left=null;
		this.right=null;
				
	}
}



public class Height_of_tree_Bst {
	static Node1255 Insert(Node1255 root,int x)
	{
		if(root==null) { return new Node1255(x);}
		if(x < root.data)
		{
			root.left=Insert(root.left,x);
		}
		else
		{
			root.right=Insert(root.right,x);
		}
		return root;
	}
	static int height(Node1255 root)
	{
		if(root==null)
		{
			return -1;
		}
		return Math.max(height(root.left),height(root.right))+1;
	}
    
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
		int n=sc.nextInt();
		Node1255 root=null;
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			root=Insert(root,x);
		}
		int x=height(root);
		System.out.println(x);
		}
	}

}
