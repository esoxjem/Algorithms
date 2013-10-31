package binaryTrees;

public class PathWithGivenSum {

	public boolean findPathWithGivenSum(BinaryTreeNode root, int sum){
		if(root == null){
			if(sum == 0)
				return true;
			else
				return false;
		}
		int sub = sum - root.getData();
		return(findPathWithGivenSum(root.getLeft(), sub) || findPathWithGivenSum(root.getRight(), sub) );
	}
}
