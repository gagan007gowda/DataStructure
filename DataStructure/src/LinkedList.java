	
public class LinkedList{
	Node head;
	//Creating a node that has data and the referencec to the next data
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public void printNodes() {
		Node node=head;
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
	
	public static void main(String args[]) {
		LinkedList llist=new LinkedList();
		llist.head=new Node(1);
		Node second=new Node(2);
		Node third= new Node(3);
		llist.head.next=second;
		second.next=third;
		third.next=null;
		llist.printNodes();
	}
}
