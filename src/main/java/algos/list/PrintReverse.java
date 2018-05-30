package algos.list;

public class PrintReverse {

	public void printReverse(Node head){
		if( head == null) return;
		printReverse(head.next);
		System.out.print(head.data + " ");
	}
}
