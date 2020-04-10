package ds.linkedlist

import java.lang.Exception
import java.lang.IllegalArgumentException

class DLLNode(val value: Int, var prev: DLLNode? = null, var next: DLLNode? = null)

class DoublyLinkedList {

    private var head: DLLNode? = null
    private var tail: DLLNode? = null

    fun head(node: DLLNode) {
        if (head == null) {
            head = node
            tail = node
            return
        }

        head?.let { insertBefore(it, node) }

    }

    fun tail(node: DLLNode) {
        if (tail == null) {
            head = node
            tail = node
            return
        }

        tail?.let { insertAfter(it, node) }
    }

    fun insertAtPosition(position: Int, nodeToInsert: DLLNode) {
        var counter = 0
        var curr = head

        while (counter != position) {
            curr = curr?.next
            counter++
        }

        curr?.let { insertBefore(it, nodeToInsert) }
    }

    fun insertAfter(node: DLLNode, nodeToInsert: DLLNode) {
        if (find(nodeToInsert)) {
            throw IllegalArgumentException("Cannot modify list. $nodeToInsert is already part of the list")
        }

        if (node == tail) {
            tail = nodeToInsert
        } else {
            val next = node.next
            next?.prev = nodeToInsert
            nodeToInsert.next = next
        }

        nodeToInsert.prev = node
        node.next = nodeToInsert
    }

    fun insertBefore(node: DLLNode, nodeToInsert: DLLNode) {
        if (find(nodeToInsert)) throw Exception("Cannot modify list. $nodeToInsert is already part of the list")

        if (node == head) {
            head = nodeToInsert
        } else {
            val prev = node.prev
            prev?.next = nodeToInsert
            nodeToInsert.prev = prev
        }

        nodeToInsert.next = node
        node.prev = nodeToInsert
    }

    /**
     * Tip: save next node while iterating as bindings are removed by remove()
     * and loop won't iterate till the end.
     *
     * Can use findAll() and remove() but that takes O(n) space while this
     * executes in-place.
     */
    fun removeNodesWithValue(value: Int) {
        var curr = head

        while (curr != null) {
            val next = curr.next

            if (curr.value == value) {
                remove(curr)
            }

            curr = next
        }
    }

    fun find(node: DLLNode): Boolean {
        var curr = head
        while (curr != null) {
            if (curr == node) {
                return true
            }

            curr = curr.next
        }

        return false
    }

    /**
     * Tip: return when first result is found
     */
    private fun find(value: Int): DLLNode? {
        var result: DLLNode? = null

        var curr = head
        while (curr != null) {
            if (curr.value == value) {
                result = curr
                break
            }

            curr = curr.next
        }

        return result
    }

    /**
     * Tip: special handling of head and tail cases
     */
    fun remove(node: DLLNode) {
        if (node == head) {
            head = head?.next
        }

        if (node == tail) {
            tail = tail?.prev
        }

        removeBindings(node)
    }

    private fun removeBindings(node: DLLNode) {
        val next = node.next
        val prev = node.prev

        prev?.next = next
        next?.prev = prev

        node.next = null
        node.prev = null
    }


    fun containsNodeWithValue(value: Int): Boolean {
        val result = find(value)
        return result != null
    }

    fun print() {
        var curr = head
        print("[")
        while (curr != null) {
            if (curr.prev != null) {
                print("->")
            }

            print(" ${curr.value} ")

            if (curr.next != null) {
                print("<-")
            }
            curr = curr.next
        }
        print("]\n")
    }

}

fun main(args: Array<String>) {
    val node1 = DLLNode(1)
    val node2 = DLLNode(2)
    val node3 = DLLNode(3)
    val node4 = DLLNode(4)
    val node5 = DLLNode(5)
    val node6 = DLLNode(1)

    val dll = DoublyLinkedList()
    dll.head(node1)
    dll.insertAfter(node1, node2)
    dll.insertAfter(node2, node3)
    dll.insertAfter(node3, node4)
    dll.insertAfter(node4, node5)
    dll.insertAfter(node5, node6)

    println("List:")
    dll.print()

    println("\nRemove 3:")
    dll.remove(node3)
    dll.print()

    println("\nRemove 1:")
    dll.removeNodesWithValue(1)
    dll.print()

    println("\ncontains 3: " + dll.containsNodeWithValue(3))
    println("contains 5: " + dll.containsNodeWithValue(5))

    println("\nInsert 1 before 2:")
    dll.insertBefore(node2, node1)
    dll.print()

    println("\nInsert 3 before 4:")
    dll.insertBefore(node4, node3)
    dll.print()

    println("\nInsert 7 after 5")
    dll.insertAfter(node5, DLLNode(7))
    dll.print()

    println("\nInsert 6 after 5")
    dll.insertAfter(node5, DLLNode(6))
    dll.print()

    println("\nInsert 0 at position 0")
    dll.insertAtPosition(0, DLLNode(0))
    dll.print()

    println("\nSet head to -1")
    dll.head(DLLNode(-1))
    dll.print()

    println("\nSet tail to -2")
    dll.tail(DLLNode(-2))
    dll.print()

}