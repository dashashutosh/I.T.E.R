package Chapter_08;

import java.util.Scanner;

public class PivotElement__SLL {
	
	public void Insert(Node n)
	{
		Scanner sc=new Scanner(System.in);
		Node node=n;
		
		System.out.println("Enter the number:");
		node.data=sc.nextInt();
		
		System.out.println("Do you want to enter more:");
		char ch=sc.next().charAt(0);
		do 
		{
			node.next=new Node();
			node=node.next;
			System.out.println("Enter the number:");
			node.data=sc.nextInt();
			System.out.println("Do you want to enter more:");
			ch=sc.next().charAt(0);
		}while(ch!='n');
	}
	
	public Node Pivot(Node n,int val)
	{
		Node Prev=new Node();
		Node current=new Node();
		Node nex=new Node();
		Node PrevItr=Prev;
		Node currItr=current;
		Node nexItr=nex;
		Node Itr=n;
		while(Itr.next!=null)
		{
			if(Itr.data<val)
			{
				PrevItr.next=Itr;
				PrevItr=Itr;
			}
			else if(Itr.data==val)
			{
				currItr.next=Itr;
				currItr=Itr;
			}
			else
			{
				nexItr.next=Itr;
				nexItr=Itr;
			}
			Itr=Itr.next;
		}
		
		nexItr.next=null;
		currItr.next=nexItr;
		PrevItr.next=currItr;
		return PrevItr.next;
	}
	
	public void show(Node n)
	{
		Node node=n;
		while(node!=null)
		{
			System.out.print(node.data+"--->");
			node=node.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Node node=new Node();
		PivotElement__SLL obj=new PivotElement__SLL();
		
		obj.Insert(node);
		
		System.out.print("\nElements of  LinkedList are:");
		obj.show(node);
		
		System.out.print("\nEnter the pivot element:");
		int k=sc.nextInt();
		
		obj.Pivot(node,k);
		obj.show(node);
	}

}
