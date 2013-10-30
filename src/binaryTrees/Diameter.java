package binaryTrees;

public class Diameter {

	public int diameterOfTree(BinaryTreeNode root, int diameter){
		int left,right;
		if(root == null){
			return 0;
		}
		left = diameterOfTree(root.getLeft(), diameter); //diameter of left sub-tree
		right = diameterOfTree(root.getRight(), diameter); //diameter of right sub-tree
		if(left + right > diameter){
			diameter = left + right;
		}
		return Math.max(left, right) + 1;
	}
}
