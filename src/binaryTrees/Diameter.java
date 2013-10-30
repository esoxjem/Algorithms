package binaryTrees;

public class Diameter {

	/**
	 * diameter of a binary tree T will be the largest of the following
	 * quantities: 
	 * 
	 * 1. the diameter of T’s left subtree 
	 * 2. the diameter of T’s right subtree 
	 * 3. the longest path between leaves that goes through the root of T
	 * 	  (this can be computed from the heights of the subtrees of T)
	 **/

	public int diameterOfTree(BinaryTreeNode root, int diameter) {
		if (root == null) {
			return 0;
		}
		int left = diameterOfTree(root.getLeft(), diameter);
		int right = diameterOfTree(root.getRight(), diameter);

		int lheight = height(root.getLeft());
		int rheight = height(root.getRight());

		if (left + right > diameter) {
			diameter = left + right;
		}
		return Math.max(lheight + rheight + 1, Math.max(left, right));
	}

	private int height(BinaryTreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return Math.max(height(root.getLeft()), height(root.getRight())) + 1;
		}
	}
}
