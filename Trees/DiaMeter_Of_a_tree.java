package Trees;
import java.util.*;
class node15
{
	int data;
	node15 left;
	node15 right;
	node15(int x)
	{
		this.data=x;
		this.left=null;
		this.right=null;
	}
}




public class DiaMeter_Of_a_tree {
	
	static int diameter(node15 root)
	{
		if(root==null)return 0;
		int l=height(root.left);
		int r=height(root.right);
		int dl=diameter(root.left);
		int dr=diameter(root.right);
		return Math.max(l+r+1,Math.max(dl, dr));
	}
	static int height(node15 root)
	{
		if(root==null)return 0;
		return 1+Math.max(height(root.left),height(root.right));
	}
   static node15 insert(node15 root,int x)
   {
	   if(root==null)return new node15(x);
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
		int t=sc.nextInt();
		while(t-->0)
		{
        int n=sc.nextInt();
        node15 root=null;
        for(int i=0;i<n;i++)
        {
        	int x=sc.nextInt();
        	root=insert(root,x);
        }
        int d=diameter(root);
        System.out.println(d);		
	}
	}

}
