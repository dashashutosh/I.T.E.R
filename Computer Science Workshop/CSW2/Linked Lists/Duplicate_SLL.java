package Chapter_08;

public class Duplicate_SLL {
	
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
	
	public void removeDuplicate() {
		
		Node node=head;
		while(node.next!=null) {
			
			if(node.data==node.next.data) {
				node.next=node.next.next;
				continue;
			}
			node=node.next;
		}
	}
	
	public void show() {
		
		Node node = head;
		while(node.next!=null) {
			System.out.print(node.data+"--->");
			node = node.next;
		}	
		System.out.print(node.data+"--->null\n");
	}
	
	public static void main(String[] args) {
		
		Duplicate_SLL list=new Duplicate_SLL();
		list.InsertAtEnd(5);
		list.InsertAtEnd(5);
		list.InsertAtEnd(10);
		list.InsertAtEnd(14);
		list.InsertAtEnd(45);		
		list.InsertAtEnd(45);
		
		System.out.println("Elements of LinkedList:");
		list.show();
		
		System.out.println("\nAfter removing duplicates:");
		list.removeDuplicate();
		list.show();
	}

}
