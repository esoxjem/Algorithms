package linkedLists;

public class OddEvenLL {
	public void OddorEven(LinkedList list) {
		LinkedListNode current = list.getHead();
		while (current != null && current.getNext() != null) {
			current = current.getNext().getNext();
			if (current == null) {
				System.out.println("even");
				return;
			}
		}
		System.out.println("odd");
	}
}
