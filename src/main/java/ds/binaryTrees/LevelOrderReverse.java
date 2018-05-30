package ds.binaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderReverse {
	// level order in reverse
	public void reverseLevelOrder(BinaryTreeNode root) {
		if (root == null) {
			return;
		}
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		BinaryTreeNode temp;
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();

		q.add(root);

		while (!q.isEmpty()) {
			temp = q.poll();
			s.push(temp);
			if (temp.getLeft() != null) {
				q.add(temp.getLeft());
			}
			if (temp.getRight() != null) {
				q.add(temp.getRight());
			}
		}

		while (!s.isEmpty()) {
			System.out.print(s.pop().getData() + " ");
		}
	}

}
