package binarySearchTree;

public class Test {
	public static void main(String[] args) {
		
		BST tree = new BST();

		BSTNode root = new BSTNode(6);
		
		tree.insertIterative(root, 2);
		tree.insertIterative(root, 8);
		tree.insert(root, 1);
		tree.insert(root, 5);
		
		System.out.println("inOrder:");
		tree.inOrder(root);
		
		tree.remove(root, 6);
		
		System.out.println("\nafter removal:");
		tree.inOrder(root);
	}
}
