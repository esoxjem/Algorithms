package binaryTrees;

public class SumAll {
	public int sumOfAllElements(BinaryTreeNode root) {
		if(root == null){
			return 0;
		}
		return (root.getData() + sumOfAllElements(root.getLeft()) + sumOfAllElements(root.getRight()));
		
	}
}
