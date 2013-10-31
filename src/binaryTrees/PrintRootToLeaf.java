package binaryTrees;

public class PrintRootToLeaf {

	public void printPaths(BinaryTreeNode root) {
		int path[] = new int[256];
		printAll(root, path, 0);
	}

	private void printAll(BinaryTreeNode node, int[] path, int pathLength) {
		if (node == null) {
			return;
		}

		// append node to path array
		path[pathLength] = node.getData();
		pathLength++;
		
		//if its a leaf, print path that led to here
		if(node.getLeft() == null && node.getRight() == null){
			printArray(path, pathLength);
		}
		// else try both sub-trees
		else{
			printAll(node.getLeft(), path, pathLength);
			printAll(node.getRight(), path, pathLength);
		}

	}

	private void printArray(int[] path, int pathLength) {
		for(int i = 0; i < pathLength ; i++){
			System.out.print(path[i] + " ");
		}
		System.out.println();
	}
}
