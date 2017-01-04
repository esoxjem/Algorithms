package ds.list;

public class OddEvenLL {
	public void OddorEven(LinkedList list) {
		Node current = list.head;
		while (current != null && current.next != null) {
			current = current.next.next;
			if (current == null) {
				System.out.println("even");
				return;
			}
		}
		System.out.println("odd");
	}
}
