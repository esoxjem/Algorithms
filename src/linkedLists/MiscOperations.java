package linkedLists;

public class MiscOperations {

	// in two scans: O(n)
	public LinkedListNode nthNodeFromEnd(LinkedList list, int n) {
		int size = list.listLength(); // O(n)
		int position = size - n + 1;
		LinkedListNode current = list.getHead();

		if (current == null) {
			System.out.println("empty list");
			return null;
		} else if (n > size || n < 1) {
			System.out.println("invalid position");
			return null;
		} else {
			int count = 1;
			while (count < position) {
				current = current.getNext();
				count++;
			}
			return current;
		}
	}

	// in one scan, using 2 pointers: O(n)
	public LinkedListNode nthNodeFromEnd2(LinkedList list, int n) {
		LinkedListNode temp = list.getHead(), nth = list.getHead();
		int count = 1;
		while (temp != null) {
			temp = temp.getNext();
			if (n - count < 0) {
				nth = nth.getNext();
			}
			count++;
		}
		if (count >= n) {
			return nth;
		}
		return null;
	}
	
	public LinkedList reverseList(LinkedList list){
		LinkedListNode prev = null, current = list.getHead(), next;
		while(current != null){
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		list.setHead(prev);
		return list;
	}
}
