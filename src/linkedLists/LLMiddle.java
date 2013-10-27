package linkedLists;

public class LLMiddle {

	public LinkedListNode getListMiddle(LinkedList list){
		LinkedListNode slowPtr = list.getHead(), fastPtr = list.getHead();
		while(slowPtr != null && fastPtr != null){
			fastPtr = fastPtr.getNext();
			if(fastPtr == null) break;
			fastPtr = fastPtr.getNext();
			slowPtr = slowPtr.getNext();
		}
		return slowPtr;
	}
}
