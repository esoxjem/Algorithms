package binaryTrees;

import java.util.Stack;

public class ZigZag {

	public void zigZagTraversal(BinaryTreeNode root) {
		if (root == null) {
			return;
		}
		Stack<BinaryTreeNode> s1 = new Stack<BinaryTreeNode>();
		Stack<BinaryTreeNode> s2 = new Stack<BinaryTreeNode>();
		BinaryTreeNode temp;

		s1.push(root);

		while (!s1.isEmpty() || !s2.isEmpty()) {
			while (!s1.isEmpty()) {
				temp = s1.pop();
				System.out.print(temp.getData() + " ");

				if (temp.getRight() != null)
					s2.push(temp.getRight());
				if (temp.getLeft() != null)
					s2.push(temp.getLeft());
				
			}
			while (!s2.isEmpty()) {
				temp = s2.pop();
				System.out.print(temp.getData() + " ");

				if (temp != null)
					s1.push(temp.getLeft());
				if (temp != null)
					s1.push(temp.getRight());
				

			}
		}

	}
}
