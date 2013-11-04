package binarySearchTree;

public class Floor {

	BSTNode floorInBST(BSTNode root, int data){
		BSTNode prev = null;
		return floorInBST(root, data, prev);
	}

	private BSTNode floorInBST(BSTNode root, int data, BSTNode prev) {
		if(root == null){
			return null;
		}
		if(floorInBST(root.getLeft(), data, prev) == null){
			return null;
		}
		if(root.getData() == data){
			return root;
		}
		if(root.getData() > data){
			return prev;
		}
		prev = root;
		return floorInBST(root.getRight(), data, prev);
			
		
	}
}
