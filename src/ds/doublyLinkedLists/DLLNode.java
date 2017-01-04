package ds.doublyLinkedLists;

public class DLLNode {

	private int data;
	private DLLNode next, previous;
	
	public DLLNode(int data) {
		this.data = data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setNext(DLLNode next) {
		this.next = next;
	}
	public DLLNode getNext() {
		return next;
	}
	public void setPrevious(DLLNode previous) {
		this.previous = previous;
	}
	public DLLNode getPrevious() {
		return previous;
	}
	
}
