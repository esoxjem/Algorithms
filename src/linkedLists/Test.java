package linkedLists;

public class Test {

	public static void main(String[] args) {

		LinkedListNode p = new LinkedListNode(2);
		LinkedListNode q = new LinkedListNode(4);
		LinkedListNode r = new LinkedListNode(6);
		LinkedListNode s = new LinkedListNode(8);
		
		LinkedList list = new LinkedList();
		list.setHead(q);
		list.insertAtHead(p);
		list.insertAtEnd(r);
		list.insertInList(s, 4);
		
		list.printList();
		
		LinkedListNode a = new LinkedListNode(1);
		LinkedListNode b = new LinkedListNode(3);
		LinkedListNode c = new LinkedListNode(5);
		LinkedListNode d = new LinkedListNode(7);
		
		LinkedList list2 = new LinkedList();
		list2.insertAtEnd(a);
		list2.insertAtEnd(b);
		list2.insertAtEnd(c);
		list2.insertAtEnd(d);		
		
		System.out.println();
		list2.printList();
		
		MergedLL mll = new MergedLL();
		LinkedListNode sorted = mll.mergeSortedLists(p, a);
		
		System.out.println("");

		while(sorted != null){
			System.out.print(sorted.getData() + " ");
			sorted = sorted.getNext();
		}

		
	}
}
