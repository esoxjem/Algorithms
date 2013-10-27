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
		
		LinkedListNode a = new LinkedListNode(1);
		
		
		LinkedList list2 = new LinkedList();
		list2.insertAtEnd(a);
		
		list2.insertAtEnd(r);
		
		System.out.println();
		list2.printList();
		
		MergedLL mll = new MergedLL();
		LinkedListNode interect = mll.findIntersectingNode(list, list2);
		System.out.println("\nintersection at " + interect.getData());
		
		PrintReverse pr = new PrintReverse();
		pr.printReverse(p);
		
		LLMiddle llm = new LLMiddle();
		System.out.println("\nmiddle = " + llm.getListMiddle(list2).getData());
		
	}
}
