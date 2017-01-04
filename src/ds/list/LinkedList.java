package ds.list;

/**
 * @author arunsasidharan
 */
public class LinkedList {

    Node head;

    public LinkedList(Node head) {
        checkNull(head);
        this.head = head;
    }

    private void checkNull(Node node) {
        if (node == null) {
            throw new IllegalArgumentException("Node is null");
        }
    }

    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public void insert(Node node) {
        checkNull(node);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void insert(Node node, int index) {
        checkNull(node);
        checkBounds(index);

        if (index == 0) {
            insert(node);
        } else {
            int i = 0;
            Node current = head;
            while (i < index - 1) {
                current = current.next;
                i++;
            }
            Node next = current.next;
            current.next = node;
            node.next = next;
        }
    }

    private void checkBounds(int index) {
        if (index < 0 || index > size()) {
            throw new IllegalArgumentException("Index out of bounds");
        }
    }

    public void remove(int index) {
        checkBounds(index);
        if (index == 0) {
            Node temp = head;
            head = head.next;
            temp.next = null;
        } else {
            Node current = head;
            int i = 0;
            while (i < index - 1) {
                current = current.next;
                i++;
            }
            Node next = current.next;
            current.next = next.next;
            next.next = null;
        }
    }
}
