package ds.list;

public class LLMiddle {

	public Node getListMiddle(LinkedList list){
		Node slowPtr = list.head, fastPtr = list.head;
		while(slowPtr != null && fastPtr != null){
			fastPtr = fastPtr.next;
			if(fastPtr == null) break;
			fastPtr = fastPtr.next;
			slowPtr = slowPtr.next;
		}
		return slowPtr;
	}
}
