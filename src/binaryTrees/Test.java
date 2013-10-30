package binaryTrees;

public class Test {
	public static void main(String[] args) {
		BinaryTreeNode a = new BinaryTreeNode(1);
		BinaryTreeNode b = new BinaryTreeNode(2);
		BinaryTreeNode c = new BinaryTreeNode(3);
		BinaryTreeNode d = new BinaryTreeNode(4);

		BinaryTreeNode e = new BinaryTreeNode(1);
		BinaryTreeNode f = new BinaryTreeNode(2);
		BinaryTreeNode g = new BinaryTreeNode(3);
		BinaryTreeNode h = new BinaryTreeNode(4);

		a.setLeft(b);
		a.setRight(c);
		b.setLeft(d);

		e.setLeft(f);
		e.setRight(g);
		f.setLeft(h);

		BinaryTree tree = new BinaryTree();
		tree.levelOrder(a);

		System.out.println();
		tree.levelOrder(e);
		
		System.out.println();
		IdenticalTrees it = new IdenticalTrees();
		System.out.println(it.ifIdentical(a, e));

	}
}
