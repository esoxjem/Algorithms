package binarySearchTree;

public class BST {

	// finds node recursively
	BSTNode find(BSTNode root, int data) {

		if (root == null) {
			return null;
		} else if (data < root.getData()) {
			find(root.getLeft(), data);
		} else if (data > root.getData()) {
			find(root.getRight(), data);
		}
		return root;
	}

	// find node iteratively
	BSTNode findItertaive(BSTNode root, int data) {
		if (root == null) {
			return null;
		}
		while (root != null) {
			if (root.getData() == data) {
				return root;
			} else if (root.getData() > data) {
				root = root.getLeft();
			} else if (root.getData() < data) {
				root = root.getRight();
			}
		}
		return root;
	}

	// find min recursive
	BSTNode findMin(BSTNode root) {
		if (root == null) {
			return null;
		}
		if (root.getLeft() == null) {
			return root;
		} else {
			return findMin(root.getLeft());
		}

	}

	// find min iterative
	BSTNode findMinIterative(BSTNode root) {
		if (root == null) {
			return null;
		}
		while (root.getLeft() != null) {
			root = root.getLeft();
		}
		return root;
	}

	// find max recursive
	BSTNode findmax(BSTNode root) {
		if (root == null) {
			return null;
		}
		if (root.getRight() == null) {
			return root;
		} else {
			return findmax(root.getRight());
		}
	}

	// find max iteratively
	BSTNode findMaxIterative(BSTNode root) {
		if (root == null) {
			return null;
		}
		while (root.getRight() != null) {
			root = root.getRight();
		}
		return root;
	}
}
