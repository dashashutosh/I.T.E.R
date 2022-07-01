package Chapter_08;

import java.util.*;

public class MergeSort__SLL {
	
	public static void Insert(Node node) {
		
		Scanner sc=new Scanner(System.in);
		
		node.data=sc.nextInt();
		System.out.println("Do you want to add more? (y/n):");
		char ch=sc.next().charAt(0);
		
		while(ch!='n') {
		
			node.next=new Node();
			node=node.next;
			
			node.data=sc.nextInt();
			System.out.println("Do you want to add more?");
			ch=sc.next().charAt(0);
			
		} 
	}
	
	public static void Merge(Node L1,Node L2) {
		
		Node current=new Node();
		Node temp=current;

		while(L1!=null && L2!=null) {
			
			if(L1.data<=L2.data) {
				
				temp.next=L1;
				L1=L1.next;
				
			}
			else {
				
				temp.next=L2;
				L2=L2.next;
				
			}
			
			temp=temp.next;
		}
			
		temp.next=L1!=null?L1:L2;
		
		show(current.next);
	}
	
	public static void show(Node node) {
		
		while(node!=null) {
			
			System.out.print(node.data+"--->");
			node=node.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Node n1=new Node();
		Node n2=new Node();
		
		System.out.println("Do you want to enter elements of LinkedList 1? (y/n):");
		char ch=sc.next().charAt(0);
		
		if(ch!='n')
			Insert(n1);
		else 
			n1=null;
		
		System.out.println("\nDo you want to enter elements of LinkedList 2? (y/n):");
		ch=sc.next().charAt(0);
	
		if(ch!='n')
			Insert(n2);
		else 
			n2=null;
		
		System.out.print("\nLinked List 1: ");
		show(n1);
		
		System.out.print("\nLinked List 2: ");
		show(n2);
		
		System.out.println("\n\nMerging both the Lists:");
		Merge(n1,n2);
		
	}

}
