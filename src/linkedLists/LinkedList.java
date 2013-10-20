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
		} else {
			int size = listLength();
			if (position > size + 1 || position < 1) {
				System.out.println("Invalid position");
			} else if (position == 1) { // inserting at the beginning
				newNode.setNext(head);
				head = newNode;
			} else { // inserting in the middle or at the end
				LinkedListNode prev = head;
				int count = 1;
				while (count < position - 1) { // traverse till prev = position - 1
					prev = prev.getNext();
					count++;
				}
				LinkedListNode current = prev.getNext();
				prev.setNext(newNode);
				newNode.setNext(current);

			}
		}
	}

	// prints the list
	public void printList() {
		LinkedListNode current = head;
		System.out.print("-> ");
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
	}

	// deletes first node
	public LinkedListNode deleteFirst() {
		if (head == null) {
			System.out.println("Empty list");
			return null;
		}
		LinkedListNode temp = head;
		head = head.getNext();
		temp.setNext(null); // isolate the node
		return temp;
	}

	// deletes last node
	public LinkedListNode deleteLast() {
		if (head == null) {
			System.out.println("list is empty");
			return null;
		} 
		if (listLength() == 1) {
			LinkedListNode temp = head;
			head = head.getNext();
			return temp;
		}
		LinkedListNode prev = null, 
					   current = head;
		while(current.getNext() != null){ //traverse till prev = tail - 1
			prev = current;
			current = current.getNext();
		}
		prev.setNext(null);
		return current;
	}
	
	// deletes node from the middle of the list 
	public LinkedListNode deleteFromList(int position){
		int size = listLength();
		if(position > size || position < 1){
			System.out.println("invalid position");
			return null;
		}
		else if(position == 1){ 
			LinkedListNode temp = head;
			head = head.getNext();
			return temp;
		}
		LinkedListNode prev, current;
		prev = head;
		int count = 1;
		while(count < position - 1){ // traverse till prev = position - 1
			prev = prev.getNext();	
			count++;
		}
		current = prev.getNext();
		prev.setNext(current.getNext()); // link node at position - 1 to position + 1
		current.setNext(null); // isolate the node
		return current;
	}
}
