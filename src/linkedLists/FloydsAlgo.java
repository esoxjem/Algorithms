package linkedLists;

public class FloydsAlgo {

	//tortoise and the hare algorithm
	public boolean isCyclic(LinkedList list) {
		LinkedListNode slowPtr = list.getHead(), fastPtr = list.getHead();
		while(fastPtr != null){
			fastPtr = fastPtr.getNext();
			if(fastPtr == slowPtr) return true;
			if(fastPtr == null) return false;
			fastPtr = fastPtr.getNext();
			if(fastPtr == slowPtr) return true;
			slowPtr = slowPtr.getNext();
		}
		return false;
	}
}
