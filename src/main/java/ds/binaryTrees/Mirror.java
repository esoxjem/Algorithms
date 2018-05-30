package ds.binaryTrees;

public class Mirror {

	// convert to mirror
	public BinaryTreeNode mirror(BinaryTreeNode root) {
		if (root == null) {
			return null;
		} else {
			BinaryTreeNode temp;

			// swapping
			temp = root.getLeft();
			root.setLeft(root.getRight());
			root.setRight(temp);

			mirror(root.getLeft());
			mirror(root.getRight());
		}
		return root;
	}

	// check if two tree are mirrors
	public boolean ifMirror(BinaryTreeNode root1, BinaryTreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		if (root1.getData() != root2.getData()) {
			return false;
		}
		else
			return (ifMirror(root1.getLeft(), root2.getRight()) && ifMirror(
				root1.getRight(), root2.getLeft()));
	}
}
