package binarySearchTree;

public class ConvertToCDLL {

	/*
	 * helper function -- given two list nodes, join them together so the second
	 * immediately follow the first. Sets the .next of the first and the
	 * .previous of the second.
	 */
	void join(BSTNode a, BSTNode b) {
		a.setRight(b);
		b.setLeft(a);
	}

	/*
	 * helper function -- given two circular doubly linked lists, append them
	 * and return the new list.
	 */
	BSTNode append(BSTNode l1, BSTNode l2){
		
		// if either is null, return the other
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		// find the last node in each using the .previous pointer
		BSTNode l1last = l1.getLeft();
		BSTNode l2last = l2.getLeft();
		
		// join the two together to make it connected and circular
		join(l1last, l2);
		join(l2last, l1);
		
		// return head of new list
		return l1;
	}
	
	/*
	 * --Recursion-- Given an ordered binary tree, recursively change it into a
	 * circular doubly linked list which is returned.
	 */
	BSTNode treeToList(BSTNode root){
		// base case
		if(root == null) return null;
		
		// recursively do the subtrees(leap of faith)
		BSTNode left = treeToList(root.getLeft());
		BSTNode right = treeToList(root.getRight());
		
		// make root to a CDLL
		root.setLeft(root);
		root.setRight(root);
		
		//append the 3 lists
		left = append(left, root);
		left = append(left, right);
		
		//return head of new list
		return left;
	}
	
	// Do a traversal of the list and print it out
    void printList(BSTNode head) {
    	BSTNode current = head;
        
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getRight();
            if (current == head) break;
        }
        
        System.out.println();
    }
}
