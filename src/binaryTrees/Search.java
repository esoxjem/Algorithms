package binaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class Search {

	public boolean searchElement(BinaryTreeNode root, int ele) {
		if (root == null) {
			System.out.println("null");
		}

		BinaryTreeNode temp;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.add(root);

		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.getData() == ele) {
				return true;
			}
			if (temp.getLeft() != null)
				q.add(temp.getLeft());
			if (temp.getRight() != null)
				q.add(temp.getRight());
		}

		return false;
	}

	// finds element using recursion
	public boolean searchRecursive(BinaryTreeNode root, int data) {
		if (root == null) {
			return false;
		} else {
			if(root.getData() == data){
				return true;
			}
			else if(searchRecursive(root.getLeft(), data)){
				return true;
			}
			else{
				return searchRecursive(root.getRight(), data);
			}
		}

	}

}
