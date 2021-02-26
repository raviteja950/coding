package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class node12
   {
	   int data;
	   node12 left;
	   node12 right;
	   node12(int x)
	   {
		   this.data=x;
		   this.left=null;
		   this.right=null;
	   }
   }



public class Right_view {
	static void rightview(node12 root)
	{
		Queue<node12> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			int c=q.size();
			for(int i=0;i<c;i++)
			{
				node12 temp=q.poll();
				if(i==0)
				{
					System.out.print(temp.data+" ");
				}
				if(temp.right!=null)
				{
					q.add(temp.right);
				}
				if(temp.left!=null)
				{
					q.add(temp.left);
				}
			}
		}
	}
	
	
    static node12 insert(node12 root,int x)
    {
    	if(root==null)return new node12(x);
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
		int n=sc.nextInt();
		node12 root=null;
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			root=insert(root,x);
		}
      rightview(root);
	}

}
