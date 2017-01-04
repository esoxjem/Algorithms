package ds.binarySearchTree;

public class LCA {

	BSTNode findLCA(BSTNode root, BSTNode node1, BSTNode node2) {
		while(true){
			// node1 < root < node2
			if ((node1.getData() < root.getData() && root.getData() < node2.getData())
					|| (node2.getData() < root.getData() && root.getData() < node1.getData())) 
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
