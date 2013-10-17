package circularLinkedLists;

public class CircularLinkedList {

	CLLNode head;
	
	public void setHead(CLLNode head) {
		this.head = head;
	}
	
	// counts the number of nodes
	public int circularListLength(){
		int length = 0;
		CLLNode current = head;
		while(current != null){
			current = current.getNext();
			length++;
			if(current == head){ //exit condition
				break;
			}
		}
		return length;
	}
	
	// prints the list contents
	public void printList(){
		if(head == null){
			System.out.println("empty list");
		}
		else {
			CLLNode current = head;
			System.out.print("--> ");
			while(current != null){
				System.out.print(current.getData() + " ");
				current = current.getNext();
				if(current == null){
					break;
				}
			}
			System.out.println("(" + current.getData() + ")head" );
		}
	}
	
	// inserts at the end of the list
	public void insetAtEnd(CLLNode newNode){
		if(head == null){
			newNode.setNext(newNode);
			head = newNode;
		} else {
			CLLNode current = head;
			while(current.getNext() != head){ // traverse to last node
				current = current.getNext();
			}
			current.setNext(newNode);
			newNode.setNext(head);
		}
	}
}
