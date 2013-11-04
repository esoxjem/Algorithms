package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class KthSmallestElement {

	void findKthSmallestElement(BSTNode root, int k) {
		//use queue to find kth smallest and stack to find kth largest
		Queue<BSTNode> q = new LinkedList<BSTNode>(); 
		findKthSmallestElement(root, k, q);
		BSTNode temp;
		while(!q.isEmpty()){
			temp = q.poll();
			k--;
			if(k == 0){
				System.out.println(temp.getData());
			}
		}
		
	}

	private void findKthSmallestElement(BSTNode root, int k, Queue<BSTNode> s) {
		if (root == null || k < 0)
			return;
		findKthSmallestElement(root.getLeft(), k, s);
		s.add(root);
		findKthSmallestElement(root.getRight(), k, s);
	}
}
