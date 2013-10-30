package binaryTrees;

public class Test {
	public static void main(String[] args) {
		BinaryTreeNode a = new BinaryTreeNode(1);
		BinaryTreeNode b = new BinaryTreeNode(2);
		BinaryTreeNode c = new BinaryTreeNode(3);
		BinaryTreeNode d = new BinaryTreeNode(4);
		BinaryTreeNode e = new BinaryTreeNode(5);
		BinaryTreeNode f = new BinaryTreeNode(6);
		BinaryTreeNode g = new BinaryTreeNode(7);
		BinaryTreeNode h = new BinaryTreeNode(8);
		
		a.setLeft(b);
		a.setRight(c);
		
		b.setLeft(d);
		b.setRight(e);
		
		c.setLeft(f);
		c.setRight(g);
		
		g.setLeft(h);
		
		BinaryTree tree = new BinaryTree();
		tree.levelOrder(a);
		
		
		
	}
}
