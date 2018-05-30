package algos.list;

import ds.list.LinkedList;

public class CycleDetection {

	// Floyd's algorithm
	public boolean isCyclic(LinkedList list) {
		Node slowPtr = list.head, fastPtr = list.head;
		while(fastPtr != null && slowPtr != null){
			fastPtr = fastPtr.next;
			if(fastPtr == slowPtr) return true;
			if(fastPtr == null) return false;
			fastPtr = fastPtr.next;
			if(fastPtr == slowPtr) return true;
			slowPtr = slowPtr.next;
		}
		return false;
	}
	
	// finds the starting node of the cycle
	public Node findLoopStart(LinkedList list){
		Node slowPtr = list.head, fastPtr = list.head;
		boolean cyclic = false;
		while(slowPtr != null && fastPtr != null){
			fastPtr = fastPtr.next;
			if(fastPtr == slowPtr) {
				cyclic = true;
				break;
			}
			if(fastPtr == null){
				cyclic = false;
				break;
			}
			fastPtr = fastPtr.next;
			if(fastPtr == slowPtr){
				cyclic = true;
				break;
			}
			slowPtr = slowPtr.next;
		}
		
		// if cycle exists
		if(cyclic){
			slowPtr = list.head;
			while(slowPtr != fastPtr){
				slowPtr = slowPtr.next;
				fastPtr = fastPtr.next;
			}
			return slowPtr;
		}
		return null;
	}
	
	// find size of the loop
	public int findLoopLength(LinkedList list){
		boolean cyclic = false;
		int length = 0;
		Node slowPtr = list.head, fastPtr = list.head;
		while(fastPtr != null && slowPtr != null){
			fastPtr = fastPtr.next;
			if(fastPtr == slowPtr){
				cyclic = true;
				break;
			}
			if(fastPtr == null){
				break;
			}
			fastPtr = fastPtr.next;
			if(fastPtr == slowPtr){
				cyclic = true;
				break;
			}
			slowPtr = slowPtr.next;
		}
		if(cyclic){
			while(slowPtr != fastPtr){
				slowPtr = slowPtr.next;
				length++;
			}
		}
		return length;
	}
}
