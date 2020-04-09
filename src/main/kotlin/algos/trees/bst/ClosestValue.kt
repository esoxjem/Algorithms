package algos.trees.bst

import kotlin.math.absoluteValue

/**
 * Write a function that takes in a Binary Search Tree (BST) and a target integer
 * value and returns the closest value to that target value contained in the BST.
 */
class ClosestValue {

    /**
     * Time: O(log(n))
     * Space: O(log(n))
     */
    fun findClosest(tree: BST, target: Int): Int {
        return find(tree, closestValue = Int.MAX_VALUE, target = target)
    }

    private fun find(node: BST?, closestValue: Int, target: Int): Int {
        if (node == null) return closestValue

        val smallestDiff = (target - closestValue).absoluteValue
        val diff = (target - node.value).absoluteValue

        val newClosestValue = if (diff < smallestDiff) {
            node.value
        } else {
            closestValue
        }

        return if (node.value < target) {
            find(node = node.right, closestValue = newClosestValue, target = target)
        } else {
            find(node = node.left, closestValue = newClosestValue, target = target)
        }
    }

    fun findClosestIterative(tree: BST, target: Int): Int {
        var closest =  Int.MAX_VALUE

        var curr: BST? = tree
        while (curr != null) {
            val smallestDiff = (target - closest).absoluteValue
            val diff = (target - curr.value).absoluteValue

            if (diff <= smallestDiff) {
                closest = curr.value
            }

            curr = if (curr.value < target) {
                curr.right
            } else {
                curr.left
            }
        }

        return closest
    }

}

class BST(var left: BST? = null, var right: BST? = null, var value: Int)

fun main(args: Array<String>) {

    val program = ClosestValue()

    val a = BST(value = 5)
    val b = BST(value = 3)
    val c = BST(value = 8)
    val d = BST(value = 0)
    val e = BST(value = 4)
    val f = BST(value = 7)
    val g = BST(value = 13)
    val h = BST(value = 11)
    val i = BST(value = 14)

    a.left = b
    a.right = c

    b.left = d
    b.right = e

    c.left = f
    c.right = g

    g.left = h
    g.right = i

    println("closest value to 8: " + program.findClosest(a, 10))
    println("closest value to 8: " + program.findClosestIterative(a, 10))
}