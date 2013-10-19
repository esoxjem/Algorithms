package circularLinkedLists;

public class CircularLinkedList {

	private CLLNode head;

	public void setHead(CLLNode head) {
		head.setNext(head);
		this.head = head;
	}

	// counts the number of nodes
	public int circularListLength() {
		int length = 0;
		CLLNode current = head;
		while (current != null) {
			current = current.getNext();
			length++;
			if (current == head) { // exit condition
				break;
			}
		}
		return length;
	}

	// prints the list contents
	public void printList() {
		if (head == null) {
			System.out.println("empty list");
		} else {
			CLLNode current = head;
			System.out.print("--> ");
			while (current != null) {
				System.out.print(current.getData() + " ");
				current = current.getNext();
				if (current == head) {
					break;
				}
			}
			System.out.println("(" + current.getData() + ")head ");
		}
	}

	// inserts at the end of the list
	public void insetAtEnd(CLLNode newNode) {
		if (head == null) {
			newNode.setNext(newNode);
			head = newNode;
		} else {
			CLLNode current = head;
			while (current.getNext() != head) { // traverse to the last node
				current = current.getNext();
			}
			current.setNext(newNode);
			newNode.setNext(head);
		}
	}

	// insert node at the beginning
	public void insertAtHead(CLLNode newNode) {
		if (head == null) {
			newNode.setNext(newNode);
			head = newNode;
		} else {
			CLLNode current = head;
			while (current.getNext() != head) { // traverse to the last node
				current = current.getNext();
			}
			current.setNext(newNode);
			newNode.setNext(head);
			head = newNode;
		}
	}

	// insert in the middle
	public void insertInList(CLLNode newNode, int position) {
		if (head == null) {
			newNode.setNext(newNode);
			head = newNode;
		} else {
			int size = circularListLength();
			if (position < 1 || position > size + 1) {
				System.out.println("invalid position");
			} else if (position == 1) { // always handled separately, as head
										// needs to be changed
				CLLNode current = head;
				while (current.getNext() != head) {
					current = current.getNext();
				}
				current.setNext(newNode);
				newNode.setNext(head);
				head = newNode;
			} else {
				CLLNode prev = head;
				int count = 1;
				while (count < position - 1) {
					prev = prev.getNext();
					count++;
				}
				CLLNode current = prev.getNext();
				prev.setNext(newNode);
				newNode.setNext(current);
			}
		}
	}
}
