package Trees;
import java.util.*;

class node16{
	int data;
	node16 left;
	node16 right;
	node16(int x)
	{
		this.data=x;
		this.left=null;
		this.right=null;
	}
}


public class Find_the_distance_k {
    static node16 insert(node16 root,int x)
    {
    	if(root==null)return new node16(x);
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
    static node16 lca(node16 root,int n1,int n2)
    {
    	 if (root == null)
             return root;
         if(root.data>n1 && root.data>n2)
         {
        	 return lca(root.left,n1,n2);
         }
         if(root.data<n1 && root.data<n2)
         {
        	 return lca(root.right,n1,n2);
         }
         return root;
    }
    public static int finalevel(node16 root,int node,int level)
    {
    	if(root==null)
    		return -1;
    	if(root.data==node) {
    		return level;}
    	int d=finalevel(root.left,node,level+1);
    	if(d != -1)
    		return d;
    	d=finalevel(root.right,node,level+1);
    	return d;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[]=new int[n];
        node16 root=null;
        for(int i=0;i<n;i++)
        {
        	 arr[i]=sc.nextInt();
        	root=insert(root,arr[i]);
        }
        node16 l=lca(root,a,b);
        int d1=finalevel(root,a,0);
        int d2=finalevel(root,b,0);
        System.out.println(d1+d2);
	}

}
