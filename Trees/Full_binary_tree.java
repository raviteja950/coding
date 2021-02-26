package Trees;

import java.util.Scanner;

class node3
{
	int data;
	node3 left;
	node3 right;
	node3(int x)
	{
	this.data=x;
	this.left=null;
	this.right=null;
	}
}


public class Full_binary_tree {
	static boolean full(node3 root)
	{
		if(root==null)
			return true;
		if((root.left==null && root.right==null))
			return true;
		if((root.left!=null)&&(root.right!=null))
			return (full(root.left)&&full(root.right));
		return false;
	}
	
	static node3 insert(node3 root,int x)
	{
		if(root==null)return new node3(x);
		if(x<root.data)
		{
			root.left=insert(root.left,x);
		}
		else {
			root.right=insert(root.right,x);
		}
		return root;
	}
      public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	int t=sc.nextInt();
    	while(t-->0) {
    	int n=sc.nextInt();
    	node3 root=null;
    	for(int i=0;i<n;i++)
    	{
    		int x=sc.nextInt();
    		root=insert(root,x);
    	}
    	if(full(root))
    	{
    		System.out.println("True");
    	}
    	else
    	{
    		System.out.println("Fasle");
    	}
    	}
      }
}
