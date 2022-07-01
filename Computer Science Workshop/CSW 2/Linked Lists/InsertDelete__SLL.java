package Chapter_08;

import java.util.Scanner;

public class InsertDelete__SLL {
	
	static Node head;
	
	public static void InsertAtFront(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}
	
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
	
	public static void InsertAtAny(Node temp,int posn,int data) { 
        
		 head = temp; 
	        if (posn < 1) 
	            System.out.print("Invalid position"); 
	  
	        if (posn == 1) 
	        { 
	            Node newNode = new Node();
	            newNode.data=data;
	            newNode.next = temp; 
	            head = newNode; 
	        } 
	        else 
	        { 
	            while (posn-- != 0) 
	            { 
	                if (posn == 1) 
	                { 
	                    Node newNode = new Node();
	                    newNode.data=data;
	                    newNode.next = temp.next; 
	                    temp.next = newNode; 
	                    break; 
	                } 
	                temp = temp.next; 
	            } 
	            if (posn != 1) 
	                System.out.print("Position out of range"); 
	        } 
	}
	
	public static void Delete(int posn) {
		
		int p=posn-1;
		if(head == null)
			System.out.println("list is empty");

		Node temp = head;
		if( p == 0)
		{
			head=temp.next;
			return;
		}
		for(int i=0;temp!=null&&i<p-1;i++)
		{
			temp = temp.next;
		}
			
		if(temp == null || temp.next == null)
			return;
			
		Node next=temp.next.next;
		temp.next=next;	
	}
	
	public static void DeleteFromEnd() {
		
		if(head==null || head.next==null)
			return;
		
		Node _2ndlast=head;
		while(_2ndlast.next.next!=null)
			_2ndlast=_2ndlast.next;
		
		_2ndlast.next=null;
	}
	
	public static void show() {
		
		if(head==null)
			System.out.println("List is empty");
		
		Node temp=head;
		while(temp!=null) {
			
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}
		System.out.print("null");
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
		
		System.out.print("\n\nEnter an element to the front of LinkedList: ");
		k=sc.nextInt();
		InsertAtFront(k);
		show();
		
		System.out.print("\n\nEnter an element to the end of LinkedList: ");
		k=sc.nextInt();
		InsertAtEnd(k);
		show();
		
		System.out.println("\n\nEnter an element to the specified position of LinkedList: ");
		System.out.print("Element is "); k=sc.nextInt();
		System.out.print("Position is "); int posn=sc.nextInt();
		InsertAtAny(head,posn,k);
		show();
		
		System.out.print("\n\nDelete an element from the front of LinkedList: ");
		Delete(1);
		show();
		
		System.out.print("\n\nDelete an element from the end of LinkedList: ");
		DeleteFromEnd();
		show();
		
		System.out.print("\n\nDelete an element from any position of LinkedList: ");
		k=sc.nextInt();
		Delete(k);
		show();
		
	}

}
