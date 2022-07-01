package Chapter_10;

public class SymmetricTree {
	
	Node root;
	
	 public SymmetricTree(int data) 
	 { 
		 root = new Node(data); 
	 } 
	  
	 public SymmetricTree() 
	 { 
		 root = null; 
	 } 
	 
	 public boolean checkSymmetric(Node LNode,Node RNode) {
		  
		  if(LNode==null && RNode==null)
			 return true;
		  
		  else if(LNode!=null && RNode!=null) {
			  return (LNode.data==RNode.data) &&	 
			  checkSymmetric(LNode.left,RNode.right)
			  && checkSymmetric(LNode.right,RNode.left);
		  }
			 	
		  return false;
	 }
	 
	public static void main(String[] args) {
		
		SymmetricTree tree=new SymmetricTree();
		
		 tree.root = new Node(1); 								
	     tree.root.left = new Node(2); 
	     tree.root.right = new Node(2); 
	     
	     boolean b=false;
	     if(tree.root!=null)
	    	 b=tree.checkSymmetric(tree.root.left, tree.root.right);
	     
	     System.out.println(b);
	}

}
