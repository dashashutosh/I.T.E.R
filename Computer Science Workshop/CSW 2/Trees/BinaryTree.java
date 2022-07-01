package Chapter_10;

import java.util.*;

class Node 
{ 
    int data; 
    Node left, right; 
  
    public Node(int val) 
    { 
        data = val; 
        left = right = null; 
    } 
} 

public class BinaryTree {

   Node root;
	
   public BinaryTree(int data) 
   { 
       root = new Node(data); 
   } 
  
   public BinaryTree() 
   { 
       root = null; 
   } 
   
   public static void Inorder(Node node)
   {
       if (node != null) {
           Inorder(node.left);
       	   System.out.print(node.data+"  ");
       	   Inorder(node.right);
   	   }
   }
   
   public static void Postorder(Node node)
   {
       if (node == null)
           return;
       
       Postorder(node.left);
       Postorder(node.right);
       System.out.print(node.data+"  ");
   }
   
   public static void Preorder(Node node)
   {
       if (node == null)
           return;
       
       System.out.print(node.data+"  ");
       Preorder(node.left);
       Preorder(node.right);
   }
   
   public void Traversal(char ch)
   {
	   if(ch=='P')
		   Postorder(root);
	   if(ch=='p')
		   Preorder(root);
	   if(ch=='i')
		   Inorder(root);
   }
   
   public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 BinaryTree tree = new BinaryTree(); 
								   
	     tree.root = new Node(1); 								
	     tree.root.left = new Node(2); 
	     tree.root.right = new Node(3); 
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(5);
	     
	     System.out.println("Enter 'P' for PostOrder traversal,'p' for PreOrder traversal,'i' for InOrder traversal.");
	     char ch=sc.next().charAt(0);
	     tree.Traversal(ch);
	     sc.close();
	}

}
