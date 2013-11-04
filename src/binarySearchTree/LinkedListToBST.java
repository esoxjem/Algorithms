package binarySearchTree;

import linkedLists.LinkedListNode;

public class LinkedListToBST {
	

	BSTNode SortedListToBST(LinkedListNode head, int n){
		return SortedListToBST(head, 0, n);
	}
	
	private BSTNode SortedListToBST(LinkedListNode head, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;

			BSTNode left = SortedListToBST(head, start, mid - 1);
			BSTNode newNode = new BSTNode(head.getData());
			newNode.setLeft(left);

			head = head.getNext();
			BSTNode right = SortedListToBST(head, mid + 1, end);
			newNode.setRight(right);

			return newNode;
		}
		return null;
	}
}
