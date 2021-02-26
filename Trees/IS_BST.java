package Trees;

import java.util.Scanner;

class node13
{
	int data;
	node13 left;
	node13 right;
	node13(int x)
	{
		this.data=x;
		this.left=null;
		this.right=null;
		
	}
	
}
public class IS_BST {
	static boolean isbst(node13 root,node13 l,node13 r)
	{
		if(root==null)return true;
		if(l!=null && root.data<=l.data)
		{
			return false;
		}
		if(r!=null && root.data>=r.data)
		{
			return false;
		}
		return isbst(root.left,l,root) && isbst(root.right,root,r);
	}
    static node13 insert(node13 root,int x)
    {
    	if(root==null) return new node13(x);
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
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		node13 root=null;
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			root=insert(root,x);
		}
		if(isbst(root,null,null))
		{
			System.out.print("True");
		}
		else
		{
			System.out.print("False");
		}

	}

}
