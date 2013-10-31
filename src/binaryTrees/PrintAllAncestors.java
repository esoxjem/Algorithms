package binaryTrees;

public class PrintAllAncestors {

	public boolean printAllAncestors(BinaryTreeNode root, int target) {

		// base cases
		if (root == null) {
			return false;
		}
		if (root.getData() == target) {
			return true;
		}

		// If target is present in either left or right subtree of this node,
		// then print this node
		if (printAllAncestors(root.getLeft(), target)
				|| printAllAncestors(root.getRight(), target)) {
			System.out.print(root.getData() + " ");
			return true;
		}
		return false;
	}
}
