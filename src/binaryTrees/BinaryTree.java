package binaryTrees;

import java.util.Stack;

public class BinaryTree {

	// recursive preOrder traversal
	public void preOrder(BinaryTreeNode root) {
		if (root != null) {
			System.out.print(root.getData());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}

	// preOrder non recursive
	public void preOrder2(BinaryTreeNode root) {
		if (root == null) {
			System.out.println("empty tree");
			return;
		}
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		while (true) {
			while (root != null) {
				System.out.println(root.getData());
				stack.push(root);
				root = root.getLeft();
			}
			if (stack.isEmpty())
				break;

			root = stack.pop();
			root = root.getRight();
		}
	}

	// recursive inOrder traversal
	public void inOrder(BinaryTreeNode root) {
		if (root != null) {
			inOrder(root.getLeft());
			System.out.println(root.getData());
			inOrder(root.getRight());
		}
	}

	// inOrder non recursive
	public void inOrder2(BinaryTreeNode root) {
		if (root == null)
			return;

		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		while (true) {
			while (root != null) {
				stack.push(root);
				root = root.getLeft();
			}
			if (stack.isEmpty()) {
				break;
			}

			root = stack.pop();
			System.out.println(root.getData());
			root = root.getRight();
		}
	}

	// recursive postOrder traversal
	public void postOrder(BinaryTreeNode root) {
		if (root != null) {
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.println(root.getData());
		}
	}

	// non recursive post order traversal
	public void postOrder2(BinaryTreeNode root) {
		if (root == null) {
			return;
		}

		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();

		while (true) {
			if (root != null) {
				stack.push(root);
				root = root.getLeft();
			} else if (stack.isEmpty()) {
				break;
			} else if (stack.peek().getRight() == null) { // if there is no right child
				root = stack.pop();
				System.out.println(root.getData());
				if (root == stack.peek().getRight()) {
					System.out.println(stack.peek().getData());
					stack.pop();
				}
			}
			if (!stack.isEmpty())
				root = stack.peek().getRight();
			else
				root = null;
		}
	}
}
