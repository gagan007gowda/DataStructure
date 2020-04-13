	
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
	//Adding a node at the begining of the List
	void insertBegining(int newdata) {
		Node newNode=new Node(newdata);
		newNode.next=head;
		head=newNode;
	}
	
	void insertEnd(int newdata) {
		Node newNode=new Node(newdata);
		newNode.next=null;
		if(head == null) {
			head=newNode;
			return;
		}
		Node last=head;
		while(last.next!=null) {
			last=last.next;
		}
		last.next=newNode;
		return;
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
