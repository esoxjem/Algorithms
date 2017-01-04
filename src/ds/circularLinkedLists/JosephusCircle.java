package ds.circularLinkedLists;

public class JosephusCircle {

	// elect leader by eliminating every Kth person from the circle
	CLLNode josephusPosition(CLLNode head, int k)
	{
		CLLNode prev = null, current = head, next = null;
		k--;
	
		while(current != current.getNext())
		{	
			int count = k;
			while(count!=0)
			{
				prev = current;
				current = current.getNext();
				count--;
			}		
					
			next = current.getNext();
			prev.setNext(next);
			current.setNext(null);
			current = next;	
		}
		
		return current;
	}
}
