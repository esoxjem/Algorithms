package linkedLists;

public class Test {

	public static void main(String[] args) {

		LinkedListNode p = new LinkedListNode(5);
		LinkedListNode q = new LinkedListNode(6);
		LinkedListNode r = new LinkedListNode(7);
		LinkedListNode s = new LinkedListNode(8);
		LinkedList list = new LinkedList();

		list.setHead(q);
		
		list.insertAtHead(p);
		list.insertAtEnd(r);
		list.insertInList(s, 4);

		list.printList();
		
		MiscOperations op = new MiscOperations();
		
		System.out.println("\n nth node from the end " + op.nthNodeFromEnd2(list, 2).getData());
		
		
	}
}
