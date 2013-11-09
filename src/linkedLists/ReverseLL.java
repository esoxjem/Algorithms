package linkedLists;

public class ReverseLL {

	public LinkedList reverseList(LinkedList list) {
		LinkedListNode prev = null, current = list.getHead(), next;
		while (current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		list.setHead(prev); // update head
		return list;
	}
}
