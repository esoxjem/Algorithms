package linkedLists;

public class LinkedList {

	private LinkedListNode head;

	public LinkedListNode getHead() {
		return head;
	}

	public void setHead(LinkedListNode head) {
		this.head = head;
	}

	// returns length of the linked list: O(n)
	public int listLength() {
		int length = 0;
		LinkedListNode current = head;
		while (current != null) {
			length++;
			current = current.getNext();
		}
		return length;
	}

	// inserts node before the head: O(1)
	public void insertAtHead(LinkedListNode newNode) {
		if (head == null) { // list is empty
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	// inserts node at the end: O(n)
	public void insertAtEnd(LinkedListNode newNode) {
		if (head == null) { // list is empty
			head = newNode;
		} else {
			LinkedListNode current = head;
			while (current.getNext() != null) { // traverse to the last element
				current = current.getNext();
			}
			current.setNext(newNode);
		}
	}

	// insert node in the middle of the list: worst case O(n)
	public void insertInList(LinkedListNode newNode, int position) {
		if (head == null) { // list is empty
			head = newNode;
		}
		int size = listLength();
		if (position > size + 1 || position < 1) {
			System.out.println("Invalid position");
			return;
		}
		if (position == 1) { // inserting at the beginning
			newNode.setNext(head);
			head = newNode;
		} else { // inserting in the middle or at the end
			LinkedListNode prev = head;
			int count = 1;
			while (count < position - 1) { // traverse to position - 1
				prev = prev.getNext();
				count++;
			}
			LinkedListNode current = prev.getNext();
			prev.setNext(newNode);
			newNode.setNext(current);

		}
	}

	// prints the list
	public void printList() {
		LinkedListNode current = head;
		System.out.print(" -> ");
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
	}
}
