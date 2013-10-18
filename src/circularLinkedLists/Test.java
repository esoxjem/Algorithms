package circularLinkedLists;

public class Test {
	public static void main(String[] args) {

		CLLNode a = new CLLNode(1);
		CLLNode b = new CLLNode(2);
		CLLNode c = new CLLNode(3);
		CLLNode d = new CLLNode(4);
		
		CircularLinkedList list = new CircularLinkedList();
		
		list.setHead(b);
		list.insertAtHead(a);
		list.insetAtEnd(c);
		
		list.printList();
	}
}
