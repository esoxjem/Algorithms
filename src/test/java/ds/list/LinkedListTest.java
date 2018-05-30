package ds.list;

import algos.list.Node;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author arunsasidharan
 */
public class LinkedListTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowErrorIfListCreatedWithoutHead() throws Exception {
        new LinkedList(null);
    }

    @Test
    public void shouldReturnCorrectSizeOfList() {
        LinkedList list = new LinkedList(new Node(1));
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void shouldBeAbleToInsertNodeAtBeginning() {
        LinkedList list = new LinkedList(new Node(3));
        list.insert(new Node(2));
        list.insert(new Node(1));

        Assert.assertEquals(3, list.size());
        Assert.assertEquals(1, list.head.data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowErrorIfNullIsInserted() throws Exception {
        LinkedList list = new LinkedList(new Node(10));
        list.insert(null);
    }

    @Test
    public void shouldBeAbleToInsertNodeAtStart() {
        LinkedList list = new LinkedList(new Node(4));
        list.insert(new Node(3));
        list.insert(new Node(2));
        list.insert(new Node(1), 0);

        Assert.assertEquals(4, list.size());
        Assert.assertEquals(1, list.head.data);
        Assert.assertEquals(2, list.head.next.data);
    }

    @Test
    public void shouldBeAbleToInsertNodeAtMiddle() {
        LinkedList list = new LinkedList(new Node(4));
        list.insert(new Node(3));
        list.insert(new Node(1));
        list.insert(new Node(2), 1);

        Assert.assertEquals(4, list.size());
        Assert.assertEquals(1, list.head.data);
        Assert.assertEquals(2, list.head.next.data);
    }

    @Test
    public void shouldBeAbleToInsertNodeAtEnd() {
        LinkedList list = new LinkedList(new Node(3));
        list.insert(new Node(2));
        list.insert(new Node(1));
        list.insert(new Node(4), 3);

        Assert.assertEquals(4, list.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowErrorIfNodeInsertedIsNull() {
        LinkedList list = new LinkedList(new Node(4));
        list.insert(new Node(3));
        list.insert(new Node(1));
        list.insert(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowErrorIfNodeInsertedOutsideListIndex() {
        LinkedList list = new LinkedList(new Node(4));
        list.insert(new Node(3));
        list.insert(new Node(1));
        list.insert(new Node(2), -1);
    }

    @Test
    public void shouldBeAbleToRemoveNodeFromBeginning() {
        LinkedList list = new LinkedList(new Node(4));
        list.insert(new Node(3));
        list.insert(new Node(2));
        list.insert(new Node(1));
        list.remove(0);

        Assert.assertEquals(3, list.size());
        Assert.assertEquals(2, list.head.data);
    }

    @Test
    public void shouldBeAbleToRemoveNodeFromMiddle() {
        LinkedList list = new LinkedList(new Node(4));
        list.insert(new Node(3));
        list.insert(new Node(2));
        list.insert(new Node(1));
        list.remove(1);

        Assert.assertEquals(3, list.size());
        Assert.assertEquals(3, list.head.next.data);
    }

    @Test
    public void shouldBeAbleToRemoveNodeFromEnd() {
        LinkedList list = new LinkedList(new Node(4));
        list.insert(new Node(3));
        list.insert(new Node(2));
        list.insert(new Node(1));
        list.remove(3);

        Assert.assertEquals(3, list.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowErrorIfNodeRemovalIsOutsideListIndex() {
        LinkedList list = new LinkedList(new Node(4));
        list.insert(new Node(3));
        list.insert(new Node(1));
        list.remove(-1);
    }
}
