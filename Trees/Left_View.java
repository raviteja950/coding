package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class node1
{
	int data;
	node1 left;
	node1 right;
	node1(int x)
	{
		this.data=x;
		this.left=null;
		this.right=null;
	}
	
}
public class Left_View {
	
	static void leftview(node1 root)
	{
		Queue<node1>q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			int c=q.size();
			for(int i=0;i<c;i++)
			{
				node1 temp=q.poll();
				if(i==0) {
				System.out.print(temp.data+" ");}
				if(temp.left!=null)
				{
					q.add(temp.left);
				}
				if(temp.right!=null)
				{
					q.add(temp.right);
				}
			}
		}
	}
  static node1 insert(node1 root,int x)
  {
	  if(root==null)
	  {
		  return new node1(x);
	  }
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
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int n=sc.nextInt();
		int a[]=new int[n];
		node1 root=null;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			root=insert(root,a[i]);
		}
		
		leftview(root);
		
		}
	}

}
