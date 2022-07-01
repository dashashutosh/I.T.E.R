package Chapter_10;

public class HeightBalance {
	
	Node root;
	
	public HeightBalance(int data) 
	{ 
	       root = new Node(data); 
	} 
	  
	public HeightBalance() 
	{ 
		root = null; 
	} 
	
	public int getHeight(Node node) 
	{
		if(node==null)
			return 0;
		else
			return Math.max(getHeight(node.left),getHeight(node.right)) + 1;
	}
	
	public boolean isHeightBalanced(Node root) 
	{
		if(root == null)
			return true;
		
		int LHeight = getHeight(root.left);
		int RHeight = getHeight(root.right);
		
		if(Math.abs(LHeight-RHeight)<=1 && isHeightBalanced(root.left) && isHeightBalanced(root.right))
			return true;
		
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		
		 HeightBalance tree = new HeightBalance(); 
		   
	     tree.root = new Node(1); 								
	     tree.root.left = new Node(2); 
	     tree.root.right = new Node(3); 
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(5);
	     tree.root.left.right.left = new Node(6);
	     tree.root.left.right.right = new Node(7);
	     
	     int h=tree.getHeight(tree.root);
	     System.out.println("Height of the Binary tree is "+ (h-1));
	     
	     boolean b=tree.isHeightBalanced(tree.root);
	     if(b==true)
	    	 System.out.println("The tree is HeightBalanced");
	     else
	    	 System.out.println("The tree is not HeightBalanced");
	     
	}

}
