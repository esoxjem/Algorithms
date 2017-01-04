package ds.list;

public class ReverseLL {

	public LinkedList reverseList(LinkedList list) {
		Node prev = null, current = list.head, next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		list.head = prev;
		return list;
	}
}
