package binaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

	// recursive preOrder traversal
	public void preOrder(BinaryTreeNode root) {
		if (root != null) {
			System.out.print(root.getData() + " ");
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
				System.out.print(root.getData() + " ");
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
			System.out.print(root.getData() + " ");
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
			System.out.print(root.getData() + " ");
			root = root.getRight();
		}
	}

	// recursive postOrder traversal
	public void postOrder(BinaryTreeNode root) {
		if (root != null) {
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(root.getData() + " ");
		}
	}

	// non recursive post order traversal
	public void postOrder2(BinaryTreeNode root) {
		BinaryTreeNode cur = root;
		BinaryTreeNode pre = root;
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();

		if (root != null)
			s.push(root);

		while (!s.isEmpty()) {
			cur = s.peek();
			// traversing down the tree
			if (cur == pre || cur == pre.getLeft() || cur == pre.getRight()) {
				if (cur.getLeft() != null) {
					s.push(cur.getLeft());
				} else if (cur.getRight() != null) {
					s.push(cur.getRight());
				}
				if (cur.getLeft() == null && cur.getRight() == null) {
					System.out.print(s.pop().getData() + " ");
				}
			}
			// traversing up the tree from the left
			else if (pre == cur.getLeft()) {
				if (cur.getRight() != null) {
					s.push(cur.getRight());
				} else if (cur.getRight() == null) {
					System.out.print(s.pop().getData() + " ");
				}
			}
			// we are traversing up the tree from the right
			else if (pre == cur.getRight()) {
				System.out.print(s.pop().getData() + " ");
			}
			pre = cur;
		}
	}

	// level order traversal
	public void levelOrder(BinaryTreeNode root) {
		if (root == null)
			return;

		Queue<BinaryTreeNode> level = new LinkedList<BinaryTreeNode>();
		level.add(root);
		BinaryTreeNode node;

		while (!level.isEmpty()) {
			node = level.poll();
			System.out.print(node.getData() + " ");
			if (node.getLeft() != null)
				level.add(node.getLeft());
			if (node.getRight() != null)
				level.add(node.getRight());

		}

	}

	// insert into tree
	public void insert(BinaryTreeNode root, int data) {
		BinaryTreeNode temp, newNode = new BinaryTreeNode(data);

		if (root == null) {
			root = newNode;
			return;
		}

		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.add(root);

		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp.getLeft() == null) { // no left child
				temp.setLeft(newNode);
				return;
			}
			if (temp.getRight() == null) { // no right child
				temp.setRight(newNode);
				return;
			}
			q.add(temp.getLeft());
			q.add(temp.getRight());
		}
	}

	// return size of the tree
	public int treeSize(BinaryTreeNode root) {
		int size = 0;
		if (root == null) {
			return 0;
		} else {
			BinaryTreeNode temp;
			Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
			q.add(root);

			while (!q.isEmpty()) {
				temp = q.poll();
				size++;
				if (temp.getLeft() != null)
					q.add(temp.getLeft());
				if (temp.getRight() != null)
					q.add(temp.getRight());
			}
		}
		return size;
	}

	// returns height
	public int getHeight(BinaryTreeNode root) {

		if (root == null) {
			return 0;
		} else {
			Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
			BinaryTreeNode temp;

			q.add(root);
			int height = 0;
			q.add(null); // marks end of first level

			while (!q.isEmpty()) {
				temp = q.poll();

				if (temp == null) {
					if (!q.isEmpty())
						q.add(null); // marker for next level
					height++;
				} else {
					if (temp.getLeft() != null)
						q.add(temp.getLeft());
					if (temp.getRight() != null)
						q.add(temp.getRight());
				}
			}
			return height;
		}
	}

	// return height recursively
	public int getHeight2(BinaryTreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return (1 + Math.max(getHeight2(root.getLeft()), getHeight2(root.getRight())));
		}
	}
}
