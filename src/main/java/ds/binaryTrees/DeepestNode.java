package ds.binaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestNode {

	public BinaryTreeNode findDeepestNode(BinaryTreeNode root){
		if(root == null){
			return null;
		}
		
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		BinaryTreeNode temp = null;
		
		q.add(root);
		while(!q.isEmpty()){
			temp = q.poll();
			if(temp.getLeft() != null){
				q.add(temp.getLeft());
			}
			if(temp.getRight() != null){
				q.add(temp.getRight());
			}
		}
		return temp;
	}
}
