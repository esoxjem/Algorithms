package ds.binaryTrees;

public class LCA {

	public BinaryTreeNode getLCA(BinaryTreeNode root, BinaryTreeNode a,
			BinaryTreeNode b) {
		BinaryTreeNode left, right;

		// base case
		if (root == null) {
			return root;
		}
		if (root == a || root == b) {
			return root;
		}
		
		left = getLCA(root.getLeft(), a, b);
		right = getLCA(root.getRight(), a, b);

		if (left != null && right != null) {
			return root;
		} else {
			if(left != null)
				return left;
			else
				return right;
		}

	}
}
