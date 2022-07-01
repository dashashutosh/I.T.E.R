package Chapter_08;

import java.util.Scanner;

public class DetectCycle {
	
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
	
	public static void hasCycle() {
		
		 Node slow = head, fast = head;
	        int flag = 0;
	        while (slow != null && fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	            if (slow == fast) {
	                flag = 1;
	                break;
	            }
	        }
	        if (flag == 1)
	            System.out.println("Loop found");
	        else
	            System.out.println("Loop not found");
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
		
		head.next.next=head; //To create loop
		hasCycle();
		
	}

}
