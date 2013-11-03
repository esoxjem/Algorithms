package binarySearchTree;

public class IsBST {

	// traverse inOrder and check if sorted
	public boolean isBST(BSTNode root) {
	     return isValidBST(root, Integer.MIN_VALUE,
	          Integer.MAX_VALUE);
	}
	private boolean isValidBST(BSTNode node, int MIN, int MAX) {
	     if(node == null)
	         return true;
	     if(node.getData() > MIN 									// min < root 
	         && node.getData() < MAX								// root < MAX
	         && isValidBST(node.getLeft(), MIN, node.getData())     // min < left < root
	         && isValidBST(node.getRight(), node.getData(), MAX))   // root < right < max
	         return true;
	     else 
	         return false;
	}
}
