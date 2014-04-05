package circularLinkedLists;

public class JosephusCircle {

	// elect leader by eliminating every Kth person from the circle
	LLNode josephusPosition(LLNode head, int k)
	{
		LLNode prev = null, current = head, next = null;
		k--;
	
		while(current != current.next)
		{	
			int count = k;
			while(count!=0)
			{
				prev = current;
				current = current.next;
				count--;
			}		
					
			next = current.next;
			prev.next = next;
			current.next = null;
			current = next;	
		}
		
		return current;
	}
}
