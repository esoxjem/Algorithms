package circularLinkedLists;
/**
 * Doesn't work. need to fix
 * */
public class JosephusCircle {

	// elect leader by eliminating every Mth person from the circle
	public void getJosephusPosition(int n, int m) {

		CLLNode current = new CLLNode(1);
		CLLNode head = current;

		// create CLL
		for (int i = 2; i <= n; ++i) {
			CLLNode newNode = new CLLNode(i);
			current.setNext(newNode);	
		}
		current.setNext(head);

		// eliminate every Mth player as long as > 1 remains
		for(int count = n; count > 1; --count){
			for(int i = 0; i < m - 1; i++)
				head = head.getNext();  // move to m-1
			head.setNext(head.getNext().getNext()); //set m-1 to m+1, eliminating m
		}
		System.out.println(head.getData());

	}
}
