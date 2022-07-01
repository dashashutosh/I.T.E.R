package Chapter_08;

import java.util.Scanner;

public class Searching_SLL {
	
	static Node head;
	
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
	
	public static boolean Search(int data) {
		
		while(head!=null) {
			
			if(head.data==data) {
				return true;
				
			}
			head=head.next;
		}
		
		return false;
	}
			
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Searching_SLL list=new Searching_SLL();
		list.InsertAtEnd(5);
		list.InsertAtEnd(8);
		list.InsertAtEnd(10);
		list.InsertAtEnd(3);
		list.InsertAtEnd(45);
		
		System.out.println("Enter the element to be searched:");
		int n=sc.nextInt();
		
		boolean k=Search(n);
		if(k==true)
			System.out.println("Element is found");
		else
			System.out.println("Element not found");

	}

}
