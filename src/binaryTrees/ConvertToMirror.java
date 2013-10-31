package binaryTrees;

public class ConvertToMirror {

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
}
