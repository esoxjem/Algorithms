package ds.list;

public class MergedLL {

	// merges two sorted lists in sorted order
	public Node mergeSortedLists(Node head1,
								 Node head2) {
		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;

		Node sortedList = null;

		if (head1.data < head2.data) {
			sortedList = head1;
			sortedList.next = mergeSortedLists(head1.next, head2);
		} else {
			sortedList = head2;
			sortedList.next = mergeSortedLists(head1, head2.next);
		}
		return sortedList;

	}

	// merge without recursion
	public void mergeTwoLists(Node l1, Node l2) {
		Node cur = null;
		while (l1 != null && l2 != null) {

			if (l1.data <= l2.data) {
				cur = l1;
				l1 = l1.next;
			} else {
				cur = l2;
				l2 = l2.next;
			}
			cur = cur.next;
		}
		if (l1 != null) {
			cur.next = (l1);
		} else {
			cur.next = (l2);
		}
	}

	// finds the intersecting node of two intersecting linked lists
	public Node findIntersectingNode(LinkedList list1,
									 LinkedList list2) {
		Node head1 = list1.head, head2 = list2.head;
		int length1 = 0, length2 = 0, diff = 0;

		while (head1 != null) {
			head1 = head1.next;
			length1++;
		}

		while (head2 != null) {
			head2 = head2.next;
			length2++;
		}
		if (length2 > length1) {
			diff = length2 - length1;
			head2 = list1.head;
			head1 = list2.head;
		} else {
			diff = length1 - length2;
			head1 = list1.head;
			head2 = list2.head;
		}

		for (int i = 0; i < diff; i++) { // iterate till point of diff is
											// reached
			head1 = head1.next;
		}
		while (head1 != null && head2 != null) {
			if (head1 == head2) {
				return head1;
			}
			head1 = head1.next;
			head2 = head2.next;
		}
		return null;
	}
}
