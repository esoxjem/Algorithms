package ds.circularLinkedLists;

public class Test {
	public static void main(String[] args) {

		CLLNode a = new CLLNode(1);
		CLLNode b = new CLLNode(2);
		CLLNode c = new CLLNode(3);
		CLLNode d = new CLLNode(4);
		CLLNode e = new CLLNode(5);
		
		ds.circularLinkedLists.CircularLinkedList list = new ds.circularLinkedLists.CircularLinkedList();
		
		list.setHead(b);
		list.insertAtHead(a);
		list.insetAtEnd(c);
		list.insertInList(d, 4);
		list.insetAtEnd(e);
		
		list.printList();
		
		JosephusCircle jc = new JosephusCircle();
		System.out.println("Josephus position: " + jc.josephusPosition(a, 3).getData());
		
	}
}
