package Trees;
import java.io.*;
import java.util.*;
class n
{
	int data;
	n left;
	n right;
	n(int x)
	{
		this.data=x;
		this.left=null;
		this.right=null;
	}
}



public class Level_order_Traversel {
	static void level(n root)
	{
		if(root==null)return;
		Queue<n>q=new LinkedList<>();
		q.add(root);
		while(true)
		{
			int c=q.size();
			if(c==0)
				break;
			while(c>0)
			{
				n node=q.peek();
				System.out.print(node.data+" ");
				q.remove();
				if(node.left!=null)
				{
					q.add(node.left);
				}
				if(node.right!=null)
				{
					q.add(node.right);
				}
				c--;
			}
			System.out.println();
		}
	}
    static n insert(n root,int x)
    {
    	if(root==null) return new n(x);
    	if(x<root.data) {
    		root.left=insert(root.left,x);
    	}
    	else
    	{
    		root.right=insert(root.right,x);
    	}
    	return root;
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
		int n=sc.nextInt();
		n root=null;
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			root=insert(root,x);
		}
		level(root);
		}
	}

}
