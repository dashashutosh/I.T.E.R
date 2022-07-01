package Chapter_10;

import java.util.Stack;

public class InOrder_WithoutRecursion {
	
	Node root;
	static int x;
	public static void InorderTraversal(Node root) {
		
		Stack<Integer> s = new Stack<Integer>();
		
		while (!s.isEmpty() || root!=null) 
		{	
			if(root != null) 
			{
				s.push(root.data);
				root=root.left ;
			} 
			
			else 
			{
				s.pop();
				System.out.println(x);
				//root=root.right;
			}
		}
	}
	
	public static void main(String[] args) {
		
		 InOrder_WithoutRecursion tree = new InOrder_WithoutRecursion(); 
		   
	     tree.root = new Node(1); 								
	     tree.root.left = new Node(2); 
	     tree.root.right = new Node(3); 
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(5);
	     InorderTraversal(tree.root);
	}

}
