package binarySearchTree;

public class LCA {

	BSTNode findLCA(BSTNode root, BSTNode node1, BSTNode node2) {
		while(true){
			if ((node1.getData() < root.getData() && node2.getData() > root.getData())
					|| (node1.getData() > root.getData() && node2.getData() < root.getData())) 
			{
				return root;
			}
			if (node1.getData() < root.getData()) {
				root = root.getLeft();
			} else {
				root = root.getRight();
			}
		}
	}

}
