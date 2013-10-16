package doublyLinkedLists;

public class Test {

	public static void main(String[] args) {
		DLLNode a = new DLLNode(1);
		DLLNode b = new DLLNode(2);
		DLLNode c = new DLLNode(3);
		DLLNode d = new DLLNode(4);
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.setHead(b);
		list.insertAtHead(a);
		list.insertAtEnd(d);
		list.insertInList(c, 1);
		list.printList();
		
	}
}
