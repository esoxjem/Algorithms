package ds.binarySearchTree;

public class BST {

	private BSTNode root;

	public BSTNode getRoot() {
		return root;
	}

	public void setRoot(BSTNode root) {
		this.root = root;
	}

	// find node iteratively
	BSTNode find(BSTNode root, int data) {
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

	// insert node recursively
	BSTNode insert(BSTNode root, int data) {
		if (root == null) {
			root = new BSTNode(data);
		}
		if (data < root.getData()) {
			root.setLeft((insert(root.getLeft(), data)));
		} else if (data > root.getData()) {
			root.setRight(insert(root.getRight(), data));
		}
		return root;
	}

	// insert iterative
	void insertIterative(BSTNode root, int data) {
		BSTNode parent;
		if (root == null) {
			root = new BSTNode(data);
			return;
		}
		parent = root;
		while (root != null) {
			if (data < root.getData()) {
				root = root.getLeft();
				if (root == null) {
					parent.setLeft(new BSTNode(data));
					return;
				}

			} else if (data > root.getData()) {
				root = root.getRight();
				if (root == null) {
					parent.setRight(new BSTNode(data));
					return;
				}
			}
		}

	}

	// in order traversal, returns nodes in sorted order
	void inOrder(BSTNode root) {
		if (root != null) {
			inOrder(root.getLeft());
			System.out.print(root.getData() + " ");
			inOrder(root.getRight());
		}
	}

	// pre order
	void preOrder(BSTNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.getData() + " ");
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}

	// removes a node
	boolean remove(BSTNode root, int data) {
		BSTNode current = root, parent = root;

		boolean isItALeft = true;

		while (current.getData() != data) {
			parent = current;
			if (data < current.getData()) {
				isItALeft = true;
				current = current.getLeft();
			} else {
				isItALeft = false;
				current = current.getRight();
			}
			if (current == null) {
				return false;
			}
		}
		// leaf node
		if (current.getLeft() == null && current.getRight() == null) {
			if (current == root) {
				root = null;
			} else if (isItALeft) {
				parent.setLeft(null);
			} else {
				parent.setRight(null);
			}
		}
		// no right child
		else if (current.getRight() == null) {
			if (current == root) {
				root = current.getLeft();
			} else if (isItALeft) {
				parent.setLeft(current.getLeft());
			} else {
				parent.setRight(current.getLeft());
			}
		}
		// no left child
		else if (current.getLeft() == null) {
			if (current == root) {
				root = current.getRight();
			} else if (isItALeft) {
				parent.setLeft(current.getRight());
			} else {
				parent.setRight(current.getRight());
			}
		}
		// there are 2 children
		else if (current.getLeft() != null && current.getRight() != null) {
			BSTNode temp = findmax(current.getLeft());

			if (current == root) {
				root = temp;
			} else if (isItALeft) {
				parent.setLeft(temp);
			} else {
				parent.setRight(temp);
			}

			temp.setRight(current.getRight());
		}
		return true;
	}
}
