package algos.list;

import ds.list.LinkedList;

public class NthNodeFromEnd {

    // in two scans: O(n)
    public Node nthNodeFromEnd(LinkedList list, int n) {
        int size = list.size(); // O(n)
        int position = size - n + 1;
        Node current = list.head;

        if (current == null) {
            System.out.println("empty ds.list");
            return null;
        } else if (n > size || n < 1) {
            System.out.println("invalid position");
            return null;
        } else {
            int count = 1;
            while (count < position) {
                current = current.next;
                count++;
            }
            return current;
        }
    }

    // in one scan, using 2 pointers: O(n)
    public Node nthNodeFromEnd2(LinkedList list, int n) {
        Node temp = list.head, nth = list.head;
        int count = 1;
        while (temp != null) {
            temp = temp.next;
            if (n - count < 0) {
                nth = nth.next;
            }
            count++;
        }
        if (count >= n) {
            return nth;
        }
        return null;
    }
}
