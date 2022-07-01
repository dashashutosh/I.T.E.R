package Chapter_08;

import java.util.Scanner;

public class Delete_kthLastnode {
	
	static Node head;
	
	public static void InsertAtEnd(int data) {
		
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
	
	public static void Delete(int posn) {
		
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
	
	public static void show() {
		
		Node node = head;
		while(node.next!=null) {
			System.out.print(node.data+"--->");
			node = node.next;
		}	
		System.out.print(node.data+"--->null\n");
	}
	
	public static int length() {
			
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
		
		int k;
		char ch;
		
		System.out.println("Do you want to enter elements to the LinkedList? (y/n):");
		ch=sc.next().charAt(0);

		while(ch!='n') {
			
			k=sc.nextInt();
			InsertAtEnd(k);
			
			System.out.println("Do you want to add more? (y/n):");
			ch=sc.next().charAt(0);
		}
		
		System.out.print("\nElements of LinkedList are: ");
		show();
		int l=length();
		
		System.out.println("\nEnter the kth last element to be deleted:");
		k=sc.nextInt();
		
		System.out.println("\nAfter deletion:");
		Delete(l-k+1); 
		show();
	}

}
