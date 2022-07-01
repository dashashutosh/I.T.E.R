package Chapter_10;

public class SUM_Root_to_Leaf {
	
	Node root;
	static int sum=0;
	
	public static void Travel(Node root,int res) 
	{
		if(root==null)
			return;
		
		res=res*10;
		res+=root.data;
		
		if(root.left==null && root.right==null) 
		{
			sum+=res;
			return;
		}
		
		Travel(root.left,res);
		Travel(root.right,res);
	}
	
	public static int SUMtree(Node root)
	{
		if(root==null)
			return 0;
		
		Travel(root,0);
		return sum;
	}
	
	public static void main(String[] args) {
		
		SUM_Root_to_Leaf tree=new SUM_Root_to_Leaf();
		
     /*						       	 1
									/ \
								   2   3
								  / \						124+1257+1256+13
								 4   5
								 	/ \
								   6   7                                       */
		
		tree.root = new Node(1); 								
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.right.left = new Node(6);
		tree.root.left.right.right = new Node(7);
		
		System.out.println("Sum from root to leaf path: "+SUMtree(tree.root));
	}

}
