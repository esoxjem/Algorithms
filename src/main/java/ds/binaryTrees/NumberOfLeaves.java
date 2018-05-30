package ds.binaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfLeaves {

	// similar algo for full and half nodes
	public int findNumberOfLeaves(BinaryTreeNode root) {
		if (root == null) {
			return 0;
		}
		int count = 0;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		BinaryTreeNode temp;

		q.add(root);
		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.getLeft() == null && temp.getRight() == null) {
				count++;
			}
			if (temp.getLeft() != null) {
				q.add(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.add(temp.getRight());
			}
		}

		return count;
	}
}
