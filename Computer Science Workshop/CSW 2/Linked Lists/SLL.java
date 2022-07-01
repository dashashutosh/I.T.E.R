package Chapter_08;

import java.util.Scanner;

class Node {
	
	int data;	
	Node next;
}

public class SLL {
		
	static Node head;
	
	public void InsertAtBegin(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}
	
	public void InsertAtEnd(int data) {
	
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head==null)
			head = node;
		
		else {
			Node n = head;
			while(n.next!=null)
				n = n.next;
			
			n.next = node;
		}
	}
	
	public void InsertAfter(Node prev, int data) {
		
		if(prev==null)
			System.out.println("Invalid");
		
		Node node=new Node();
		node.data=data;
		node.next=prev.next;
		prev.next=node;
	}
	
	public void delete(int posn) {
		
		int p=posn-1;
		if(head == null)
			System.out.println("List is empty");

		Node temp = head;
		if( p == 0) {
			head=temp.next;
			return;
		}
		
		for(int i=0;temp!=null&&i<p-1;i++)
			temp = temp.next;
		
		if(temp == null || temp.next == null)
			return;
			
		Node next=temp.next.next;
		temp.next=next;	
		
	}
	
	public void show() {
		
		while(head.next!=null) {
			System.out.print(head.data+"--->");
			head = head.next;
			
		}	
		System.out.print("null");
	}
	
	public int length() {
			
		int cnt=0;
		Node temp = head;
		while(temp!=null) {
			cnt++;
			temp=temp.next;
		}
		return cnt;		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		SLL list=new SLL();
		list.InsertAtEnd(5);
		list.InsertAtEnd(8);
		list.InsertAtEnd(10);
		list.InsertAtEnd(3);
		list.InsertAtEnd(45);
		
		System.out.println("Elements of LinkedList are:");
		list.show();
		
		while(true) {
			
			System.out.println("\nEnter your choice:");
			System.out.println("0.Exit");
			System.out.println("1.Insert At Beginning");
			System.out.println("2.Insert At End");
			System.out.println("3.Insert After a node");
			System.out.println("4.Delete from Beginning");
			System.out.println("5.Delete from End");
			System.out.println("6.Delete after a node");
			
			int n=sc.nextInt();
			switch(n) {
			
			case 0:
				System.out.println("ByE ByE !!");
				System.exit(0);
			
			case 1:
				System.out.println("\nInserting 12 at the front of LinkedList:");
				list.InsertAtBegin(12);
				list.show();
				break;
			
			case 2:
				System.out.println("\nInserting 99 at the end of LinkedList:");
				list.InsertAtEnd(99);
				list.show();
				break;
			
			case 3:
				System.out.println("\nInserting 999 after the 3rd node of LinkedList:");
				list.InsertAfter(head.next.next,999);
				list.show();
				break;	
			
			case 4:
				System.out.println("\nDeleting 1st node:");
				list.delete(1);
				list.show();
				break;
				
			case 5:
				System.out.println("\nDeleting last node:");
				list.delete(list.length()-2+1);
				list.show();
				break;
			
			case 6:
				System.out.println("\nDeleting a node after 3rd node");
				list.delete(4);
				list.show();
				break;
				
			default:
				System.out.println("Wrong choice");
			
			}	
		}	
	}

}
