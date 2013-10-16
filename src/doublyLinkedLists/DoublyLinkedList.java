package doublyLinkedLists;

public class DoublyLinkedList {

	private DLLNode head;

	public void setHead(DLLNode head) {
		this.head = head;
	}

	// calculates length
	public int listLength() {
		DLLNode current = head;
		int length = 0;
		while (current != null) {
			current = current.getNext();
			length++;
		}
		return length;
	}

	// inserts node before head
	public void insertAtHead(DLLNode newNode) {
		if (head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head.setPrevious(newNode);
			head = newNode;
		}
	}

	// inserts node at the end
	public void insertAtEnd(DLLNode newNode) {
		if (head == null) {
			head = newNode;
		} else {
			DLLNode current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
			newNode.setPrevious(current);
		}
	}

	// inserts node in the middle of the list
	public void insertInList(DLLNode newNode, int position) {
		if (head == null) {
			head = newNode;
		} else {
			int size = listLength();
			if (position > size + 1 || position < 1) {
				System.out.println("invalid position");
			} else if (position == 1) { // inserting at head
				newNode.setNext(head);
				head.setPrevious(newNode);
				head = newNode;
			} else { // inserting at the middle or the end
				DLLNode prev = head;
				int count = 1;
				while (count < position - 1) {
					prev = prev.getNext();
					count++;
				}
				DLLNode current = prev.getNext();
				newNode.setNext(current);
				if (current != null) // avoids null pointer exception
					current.setPrevious(newNode);
				prev.setNext(newNode);
				newNode.setPrevious(prev);

			}
		}
	}

	// prints the list
	public void printList() {
		if (head == null) {
			System.out.println("empty list");
		} else {
			DLLNode current = head;
			System.out.print("-> ");
			while (current != null) {
				System.out.print(current.getData() + " ");
				current = current.getNext();
			}
		}
	}

	// deletes first node
	public DLLNode deleteFirst() {
		if (head == null) {
			System.out.println("empty list");
			return null;
		}
		DLLNode temp = head;
		head = temp.getNext();
		head.setPrevious(null);
		return temp;
	}

	// deletes last node
	public DLLNode deleteLast() {
		if (head == null) {
			System.out.println("emty lisy");
			return null;
		}
		DLLNode prev = null, current = head;
		while (current.getNext() != null) { // traverse to tail, tail - 1
			prev = current;
			current = current.getNext();
		}
		prev.setNext(null);
		current.setPrevious(null);
		return current;
	}
}
