package linkedLists;

public class CycleDetection {

	// Floyd's algorithm
	public boolean isCyclic(LinkedList list) {
		LinkedListNode slowPtr = list.getHead(), fastPtr = list.getHead();
		while(fastPtr != null && slowPtr != null){
			fastPtr = fastPtr.getNext();
			if(fastPtr == slowPtr) return true;
			if(fastPtr == null) return false;
			fastPtr = fastPtr.getNext();
			if(fastPtr == slowPtr) return true;
			slowPtr = slowPtr.getNext();
		}
		return false;
	}
	
	// finds the starting node of the cycle
	public LinkedListNode findLoopStart(LinkedList list){
		LinkedListNode slowPtr = list.getHead(), fastPtr = list.getHead();
		boolean cyclic = false;
		while(slowPtr != null && fastPtr != null){
			fastPtr = fastPtr.getNext();
			if(fastPtr == slowPtr) {
				cyclic = true;
				break;
			}
			if(fastPtr == null){
				cyclic = false;
				break;
			}
			fastPtr = fastPtr.getNext();
			if(fastPtr == slowPtr){
				cyclic = true;
				break;
			}
			slowPtr = slowPtr.getNext();
		}
		
		// if cycle exists
		if(cyclic){
			while(slowPtr != fastPtr){
				slowPtr = slowPtr.getNext();
				fastPtr = fastPtr.getNext();
			}
			return slowPtr;
		}
		return null;
	}
}
