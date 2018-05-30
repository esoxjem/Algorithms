package ds.circularLinkedLists;

public class CircularLinkedList {

	CLLNode head;

	public void setHead(CLLNode head) {
		head.setNext(head);
		this.head = head;
	}
	
	public CLLNode getHead() {
		return head;
	}

	// counts the number of nodes
	public int listLength() {
		if (head == null) {
			return 0;
		}
		int length = 1;
		CLLNode current = head;
		while (current.getNext() != head) {
			current = current.getNext();
			length++;
		}
		return length;
	}

	// prints the ds.list contents
	public void printList() {
		if (head == null) {
			System.out.println("empty ds.list");
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

	// inserts at the end of the ds.list
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
			int size = listLength();
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

	// deletes first node
	public CLLNode deleteFirst() {
		if (head == null) {
			System.out.println("ds.list is empty");
			return null;
		} else if (listLength() == 1) {
			CLLNode temp = head;
			head = null;
			return temp;
		}
		CLLNode tail = head;
		while (tail.getNext() != head) {
			tail = tail.getNext();
		}
		CLLNode temp = head;
		head = head.getNext();
		tail.setNext(head);
		temp.setNext(null); // isolate the node
		return temp;
	}

	// deletes last node
	public CLLNode deleteLast() {
		if (head == null) {
			System.out.println("ds.list is empty");
			return null;
		} else if (listLength() == 1) {
			CLLNode temp = head;
			head = null;
			return temp;
		}
		CLLNode prev = null, current = head;
		while (current.getNext() != head) {
			prev = current;
			current = current.getNext();
		}
		prev.setNext(head);
		current.setNext(null); // isolate node
		return current;
	}
}
