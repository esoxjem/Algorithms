package binaryTrees;

public class SumAll {

	// recursive
	public int sumOfAllElements(BinaryTreeNode root) {
		if (root == null) {
			return 0;
		}
		return (root.getData() + sumOfAllElements(root.getLeft()) + sumOfAllElements(root
				.getRight()));

	}

	/**
	 * For noon recursive, do a level order traversal and keep adding
	 * node.getData()
	 */
}
