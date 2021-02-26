package Trees;
import java.util.*;
class node4
{
	int data;
	node4 left;
	node4 right;
	node4(int x)
	{
		this.data=x;
		this.left=null;
		this.right=null;
	}
}


public class Complete_BT {
	static boolean full(node4 root,int idx,int count)
	{
		if(root==null)return true;
		if(idx>=count)return false;
		return (full(root.left,2*idx+1,count)&& full(root.right,2*idx+2,count));
	}
	static int count(node4 root)
	{
		if(root==null)return 0;
		return 1+count(root.left)+count(root.right);
	}
    static node4 insert(node4 root,int x)
    {
    	if(root==null) return new node4(x);
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
		node4 root=null;
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			root=insert(root,x);
		}
		int c=count(root);
		int indx=0;
		if(full(root,indx,c))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
