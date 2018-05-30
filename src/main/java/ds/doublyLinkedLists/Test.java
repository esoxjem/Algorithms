package ds.doublyLinkedLists;

public class Test {

	public static void main(String[] args) {
		DLLNode a = new DLLNode(1);
		DLLNode b = new DLLNode(2);
		DLLNode c = new DLLNode(3);
		DLLNode d = new DLLNode(4);
		DLLNode e = new DLLNode(5);
		
		ds.doublyLinkedLists.DoublyLinkedList list = new ds.doublyLinkedLists.DoublyLinkedList();
		
		list.setHead(b);
		list.insertAtHead(a);
		list.insertAtEnd(d);
		list.insertInList(c, 3);
		list.insertAtEnd(e);
		
		
		
		list.printList();
		System.out.println();
		
		DLLToBST dbs = new DLLToBST();
		dbs.convertTotree(a);
		
		System.out.println(c.getData());
		System.out.println(c.getPrevious().getData() + " " + c.getNext().getData());
		System.out.println(c.getNext().getPrevious().getData());
		
	}
}
