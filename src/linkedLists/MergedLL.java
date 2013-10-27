package linkedLists;

public class MergedLL {

	// merges two sorted lists in sorted order
	public LinkedListNode mergeSortedLists(LinkedListNode head1, LinkedListNode head2){
		if(head1 == null) return head2;
		if(head2 == null) return head1;
		
		LinkedListNode sortedList = null;

			if(head1.getData() < head2.getData()){
				sortedList = head1;
				sortedList.setNext(mergeSortedLists(head1.getNext(), head2));			
			}
			else{
				sortedList =head2;
				sortedList.setNext(mergeSortedLists(head1, head2.getNext()));
			}
			return sortedList;

	}
	
	// finds the intersecting node of two intersecting linked lists
	public LinkedListNode findIntersectingNode(LinkedList list1,
			LinkedList list2) {
		LinkedListNode head1 = list1.getHead(), head2 = list2.getHead();
		int length1 = 0, length2 = 0, diff = 0;

		while (head1 != null) {
			head1 = head1.getNext();
			length1++;
		}

		while (head2 != null) {
			head2 = head2.getNext();
			length2++;
		}
		if (length2 > length1) {
			diff = length2 - length1;
			head2 = list1.getHead();
			head1 = list2.getHead();
		} else {
			diff = length1 - length2;
			head1 = list1.getHead();
			head2 = list2.getHead();
		}

		for (int i = 0; i < diff; i++) { // iterate till point of diff is
											// reached
			head1 = head1.getNext();
		}
		while (head1 != null && head2 != null) {
			if (head1 == head2) {
				return head1;
			}
			head1 = head1.getNext();
			head2 = head2.getNext();
		}
		return null;
	}
}
