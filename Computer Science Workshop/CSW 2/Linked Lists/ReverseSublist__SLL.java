package Chapter_08;

import java.util.Scanner;

public class ReverseSublist__SLL {
	
	static Node head;

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
	
	public static void ReverseSublist(Node n,int s,int f) {
		
		if(s==f)
			show(n);
		
		else {
			
			s-=1;
			f-=1;
			Node node= new Node();
			node=n;
			Node sublist1= node;
			int k=1;
		
			while(k<s) {
				sublist1=sublist1.next;
				k++;
			}
		
			Node sublist2= sublist1.next;
		
			while(s<f) {
			
				Node temp= sublist2.next;
				sublist2.next=temp.next;
				temp.next=sublist1.next;
				sublist1.next=temp;
				s++;
			}
		
			show(node);
		}	
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
		
		Node n=new Node();
		
		System.out.println("Do you want to enter elements of LinkedList? (y/n):");
		char ch=sc.next().charAt(0);
		
		if(ch!='n')
			Insert(n);
		else 
			n=null;
		
		System.out.print("\nElements of LinkedList are: ");
		show(n);
		
		System.out.println("\n\nEnter the starting and finishing node: ");
		System.out.print("Start sth: "); int s=sc.nextInt();
		System.out.print("Finish fth: "); int f=sc.nextInt();
		
		System.out.print("\nAfter reversing sublist of start & finish nodes: ");
		ReverseSublist(n, s, f);
		
	}

}
