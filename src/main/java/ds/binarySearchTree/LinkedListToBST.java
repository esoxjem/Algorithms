package ds.binarySearchTree;

import algos.list.Node;

public class LinkedListToBST {
	

	BSTNode SortedListToBST(Node head, int n){
		return SortedListToBST(head, 0, n);
	}
	
	private BSTNode SortedListToBST(Node head, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;

			BSTNode left = SortedListToBST(head, start, mid - 1);
			BSTNode newNode = new BSTNode(head.data);
			newNode.setLeft(left);

			head = head.next;
			BSTNode right = SortedListToBST(head, mid + 1, end);
			newNode.setRight(right);

			return newNode;
		}
		return null;
	}
}
