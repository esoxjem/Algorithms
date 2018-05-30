package ds.binaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class FindMax {

	public void findMaxElement(BinaryTreeNode root) {
		if (root == null) {
			System.out.println("null");
			return;
		}

		BinaryTreeNode temp;
		int max = root.getData();
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.add(root);

		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.getData() > max) {
				max = temp.getData();
			}
			if (temp.getLeft() != null)
				q.add(temp.getLeft());
			if (temp.getRight() != null)
				q.add(temp.getRight());
		}
		System.out.println("max element: " + max);
	}
}
