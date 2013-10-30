package binaryTrees;

public class IdenticalTrees {

	public boolean ifIdentical(BinaryTreeNode root1, BinaryTreeNode root2) {
		// both empty
		if (root1 == null && root2 == null)
			return true;
		// one empty
		if (root1 == null || root2 == null)
			return false;
		// both not empty
		return (root1.getData() == root2.getData()
				&& ifIdentical(root1.getLeft(), root2.getLeft()) && ifIdentical(
					root1.getRight(), root2.getRight()));
	}
}
