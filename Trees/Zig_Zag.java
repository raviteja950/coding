package Trees;

import java.util.Scanner;
import java.util.Stack;

class nodet
{
	int data;
	nodet left;
	nodet right;
	nodet(int x)
	{
		this.data=x;
		this.left=null;
		this.right=null;
	}
}
public class Zig_Zag {
	public static void zig(nodet root)
	{
		Stack<nodet> s1=new Stack<>();
		Stack<nodet> s2=new Stack<>();
		s1.push(root);
		while(!s1.isEmpty() || !s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
			nodet p=s1.pop();
			System.out.print(p.data+" ");
			
				if(p.right!=null)
				{
					s2.push(p.right);
				}
				if(p.left!=null)
				{
					s2.push(p.left);
				}
			 }
			while(!s2.isEmpty())
			{
				nodet p1=s2.pop();
				System.out.print(p1.data+" ");
				if(p1.left!=null)
				{
					s1.push(p1.left);
				}
				if(p1.right!=null)
				{
					s1.push(p1.right);
				}
			}
		}
		return;
	}
	
	
	
	
	
  static nodet insert(nodet root,int x)
  {
	  if(root==null) return new nodet(x);
	  
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
		nodet root=null;
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			root=insert(root,x);
		}
       zig(root);
		}
	}

}
