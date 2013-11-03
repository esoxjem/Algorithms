package doublyLinkedLists;

public class DLLToBST {

	// sorted DLL to Balanced BST
	DLLNode convertTotree(DLLNode head) {
		DLLNode temp, p, q;

		if (head == null || head.getNext() == null) {
			return head;
		}
		temp = findMid(head); // using 2 ptrs
		p = head;

		while (p.getNext() != temp)
			p = p.getNext(); // mid - 1

		q = temp.getNext(); // mid + 1
		
		//isolate mid
		p.setNext(null);       
		temp.setNext(null);
		
		temp.setPrevious(convertTotree(head));
		temp.setNext(convertTotree(q));
		return temp;
	}

	private DLLNode findMid(DLLNode head) {
		if (head == null)
			return null;

		DLLNode slowPtr = head, fastPtr = head;
		while (fastPtr != null) {
			fastPtr = fastPtr.getNext();
			if (fastPtr == null)
				break;
			fastPtr = fastPtr.getNext();
			slowPtr = slowPtr.getNext();
		}
		return slowPtr;
	}
}
