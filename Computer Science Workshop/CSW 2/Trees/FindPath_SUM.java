package Chapter_10;

public class FindPath_SUM {
	
	Node root;
	static int res=0;
	
	public static void Travel(Node root,int val) 
	{
		if(root==null)
			System.out.println("There is no path");
		
		res=res*10;
		res+=root.data;
		
		if(root.left==null && root.right==null) 
		{
			int s=digitSUM(res);
			if(s==val)
				System.out.println("Path found which adds up to the given value "+val+" is "+res);
		}
		
		Travel(root.left,res);
		Travel(root.right,res);
	}
	
	public static int digitSUM(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=sum+n%10;
			n/=10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		FindPath_SUM tree=new FindPath_SUM();
		
		tree.root = new Node(1); 								
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.right.left = new Node(6);
		tree.root.right.left = new Node(3);
		
		Travel(tree.root,7);

	}

}
