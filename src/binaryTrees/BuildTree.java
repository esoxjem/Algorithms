package binaryTrees;

public class BuildTree {
	
	// build tree from inorder and postorder
	public BinaryTreeNode buildFromInPost(int inorder[], int postorder[]) {
		return buildTreeInPo(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
	}

	private BinaryTreeNode buildTreeInPo(int[] inorder, int is, int ie, int[] postorder, int ps, int pe) {
		int rootval = postorder[pe];
		BinaryTreeNode node = new BinaryTreeNode(rootval);
		
		//searching in inorder
		for(int i = is; i < ie; i++){
			if(rootval == inorder[i]){
				BinaryTreeNode left = buildTreeInPo(inorder, is, i - 1, postorder, ps, ps + i - is - 1);
				BinaryTreeNode right = buildTreeInPo(inorder, i + 1, ie, postorder, pe - ie + 1, pe - 1);
				node.setLeft(left);
				node.setRight(right);
			}
		}
		
		return node;
	}

}
