package linkedLists;

public class PrintReverse {

	public void printReverse(LinkedListNode head){
		if( head == null) return;
		printReverse(head.getNext());
		System.out.print(head.getData() + " ");
	}
}
