package circularLinkedLists;

public class SplitLists {

	public void split(CircularLinkedList list) {
		CLLNode slow = list.getHead(), fast = list.getHead();
		while (fast.getNext() != list.getHead()
				&& fast.getNext().getNext() != list.getHead()) {
			fast = fast.getNext().getNext();
			slow = slow.getNext();
		}
		if (fast == list.getHead()) { // odd number of nodes
			CLLNode last = slow;
			while (last.getNext() != list.getHead()) {
				last = last.getNext();
			}
			last.setNext(slow.getNext());
			slow.setNext(fast);
		} else { // even no. of nodes
			fast.setNext(slow.getNext());
			slow.setNext(list.getHead());
		}
	}
}
