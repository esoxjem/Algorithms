package binarySearchTree;

public class Test {
	public static void main(String[] args) {
		
		BST tree = new BST();

		BSTNode root = new BSTNode(6);
		BSTNode a = new BSTNode(2);
		BSTNode b = new BSTNode(8);
		BSTNode c = new BSTNode(1);
		BSTNode d = new BSTNode(5);
		
		tree.insertIterative(root, 2);
		root.setLeft(a);
		root.setRight(b);
		a.setLeft(c);
		a.setRight(d);
		
		System.out.println("inOrder:");
		tree.preOrder(root);
		
		LCA l = new LCA();
		System.out.println("\nLCA:");
		System.out.println(l.findLCA(root, d, b).getData());
	}
}
