package ds.binaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelWithMaxSum {

	public int findLevelWithMaxSum(BinaryTreeNode root) {
		if (root == null) {
			return 0;
		}
		int level = 0;
		int maxlevel = 0;
		int sum = 0;
		int max = 0;
		BinaryTreeNode temp;

		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.add(root);
		q.add(null); // end of first level

		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp == null) {

				if (max < sum) {
					sum = max;
					maxlevel = level;
				}
				sum = 0;
				if (!q.isEmpty())
					q.add(null);
				level++;
			} else {
				sum = sum + temp.getData(); // sums up current level elements
				if (temp.getLeft() != null) {
					q.add(temp.getLeft());
				}
				if (temp.getRight() != null) {
					q.add(temp.getRight());
				}
			}
		}
		return maxlevel;
	}
}
