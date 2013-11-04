package binarySearchTree;

public class ArrayToBST {

	 public BSTNode sortedArrayToBST(int[] num) {
         return sortedArrayToBST(num, 0, num.length - 1);
 }

	private BSTNode sortedArrayToBST(int[] num, int start, int end) {
		if(start < end){
			int mid = (start + end)/2;
			BSTNode left = sortedArrayToBST(num, start, mid - 1);
			BSTNode right = sortedArrayToBST(num, mid + 1, end);
			BSTNode newNode = new BSTNode(num[mid]);
			newNode.setLeft(left);
			newNode.setRight(right);
			return newNode;
		}
		return null;
	}
}
