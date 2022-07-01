package Chapter_15;

import java.util.Scanner;

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

public class BST {
	
	Node root;
	
	public Node Insert(Node root,int val) 
	{
		if(root==null)
		{
			root=new Node(val);
			return root;
		}
		else if(val<root.data) 
		{
			root.left=Insert(root.left,val);
		}
		else
			root.right=Insert(root.right,val);
		
		return root;
	}
	
	public Node Delete(Node root,int val)
	{
		 if (root == null)
	            return root;
	     
		 if (val < root.data)
	            root.left = Delete(root.left, val);
	     
		 else if (val > root.data)
	            root.right = Delete(root.right, val);
	     
		 else 
		 {
			 if (root.left == null)
	                return root.right;
	         
			 else if (root.right == null)
				 	return root.left;
	 
			 root.data = MinValue(root.right);
	         root.right = Delete(root.right, root.data);
	     }
		 
	     return root;
	}
	
	public static void Inorder(Node node)
	{
       if (node != null) {
    	   Inorder(node.left);
	  	   System.out.print(node.data+"  ");
     	   Inorder(node.right);
       }
	}
	
	public void InorderTraversal() {
		Inorder(root);
	}
	
	public boolean Search(Node root,int val)
	{
		if(root==null)
			return false;
		
		if(root.data==val)
			return true;
		
		if(Search(root.left,val))
			return true;
		
		return Search(root.right,val);
	}
	
	public int MaxValue(Node root) 
	{
		while(root.right!=null)
			root=root.right;
		
		return root.data;
	}
	
	public int MinValue(Node root) 
	{
		while(root.left!=null)
			root=root.left;
		
		return root.data;
	}
	
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		
		BST tree = new BST(); 
		   																	           
		/*											8
												  /   \
												 3	   10
												/ \      \
											   1   6     14
		                                          / \     /	
		                                          4   7   13                                        */
		tree.root = new Node(8); 												
	    tree.root.left = new Node(3); 											    															   		
	    tree.root.right = new Node(10); 
	    
	    tree.root.left.left = new Node(1);
	    tree.root.left.right = new Node(6);
	    
	    tree.root.left.right.left = new Node(4);
	    tree.root.left.right.right = new Node(7);
	    
	    tree.root.right.right = new Node(14); 
	    tree.root.right.right.left = new Node(13); 
	    
	    System.out.println("0.Exit \n1.Insertion \n2.Searching \n3.Maximum Value \n4.Minimum Value \n5.Delete \n6.Traversal");
    	
	    while(true)
	    {
	    	System.out.print("\nEnter your operation choice: ");
	    	int n=sc.nextInt();
	    	
	    	switch(n)
	    	{
	    		case 0:
	    			System.out.println("ByE ByE !!");
					System.exit(0);
	    			
	    		case 1:
	    			System.out.print("\nEnter the value of node to be inserted: ");
	    			int val=sc.nextInt();
	    			tree.Insert(tree.root, val);
	    			break;
	    			
	    		case 2:
	    			System.out.print("\nEnter the value of node to be searched: ");
	    			val=sc.nextInt();
	    			
	    			if(tree.Search(tree.root, val))
	    				System.out.println(val+" is found in the BST");
	    			else
	    				System.out.println(val+" is not found in the BST");
	    			break;
	    			
	    		case 3:
	    			System.out.println("\nMaximum value in the BST is "+tree.MaxValue(tree.root));
	    			break;
	    		
	    		case 4:
	    			System.out.println("\nMinimum value in the BST is "+tree.MinValue(tree.root));
	    			break;	
	    			
	    		case 5:
	    			System.out.print("\nEnter the value of the node to be deleted: ");
	    			val=sc.nextInt();
	    			tree.Delete(tree.root, val);
	    			break;	
	    		
	    		case 6:
	    			System.out.println("\nInorder Traversal: ");
	    			tree.InorderTraversal();
	    			break;	
	    			
	    		default:
	    			System.out.println("Invalid choice");
	    	}
	    }
	}
}
