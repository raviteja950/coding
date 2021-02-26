package Trees;
import java.io.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Tree_Traversal {
    
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    public static Node insert(Node root,int x){
        if(root == null) return new Node(x);
        if(x < root.data){
            root.left = insert(root.left,x);
        }
        else{
            root.right = insert(root.right,x);
        }
        return root;
    }
    
    public static void preOrder(Node root)throws IOException{
        if(root == null) return;
        bw.write(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    public static void inOrder(Node root) throws IOException{
        if(root == null) return;
        inOrder(root.left);
        bw.write(root.data + " ");
        inOrder(root.right);
    }
    
    public static void postOrder(Node root) throws IOException{
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        bw.write(root.data + " ");
    }

    public static void main(String[] args) throws IOException {
        
        int t = Integer.parseInt(br.readLine());
        while(t-- != 0){
            int n = Integer.parseInt(br.readLine());
            Node root = null;
            String[] inp=br.readLine().split(" ");
            for(int i = 0;i < n;i++){
                int x = Integer.parseInt(inp[i]);
                root = insert(root,x);
            }
            preOrder(root);
            bw.write("\n");
            inOrder(root);
            bw.write("\n");
            postOrder(root);
            bw.write("\n");
            bw.write("\n");
        }
        bw.flush(); 
    }
}







