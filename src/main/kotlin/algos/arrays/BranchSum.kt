package algos.arrays

/**
 * Write a function that takes in a Binary Tree and returns a list of its branch
 * sums ordered from leftmost branch sum to rightmost branch sum.
 */
class BranchSum {

    class BinaryTree(val value: Int) {
        var left: BinaryTree? = null
        var right: BinaryTree? = null
    }

    fun branchSums(root: BinaryTree): List<Int> {
        val total = mutableListOf<Int>()
        traverse(root, total, 0)
        return total
    }

    private fun traverse(node: BinaryTree?, total: MutableList<Int>, sum: Int) {
        if (node == null) return

        val newSum = sum + node.value
        if (node.left == null && node.right == null) {
            total.add(newSum)
        }

        traverse(node.left, total, newSum)
        traverse(node.right, total, newSum)
    }
}

fun main() {
    val a = BranchSum.BinaryTree(1)
    val b  = BranchSum.BinaryTree(2)
    val c  = BranchSum.BinaryTree(3)
    val d  = BranchSum.BinaryTree(4)
    val e  = BranchSum.BinaryTree(5)
    val f  = BranchSum.BinaryTree(6)
    val g  = BranchSum.BinaryTree(7)
    val h  = BranchSum.BinaryTree(8)
    val i  = BranchSum.BinaryTree(9)
    val j  = BranchSum.BinaryTree(10)

    a.left = b
    a.right = c

    b.left = d
    b.right = e

    c.left = f
    c.right = g

    d.left = h
    d.right = i

    e.left = j

    println(BranchSum().branchSums(a)) // [15, 16, 18, 10, 11]
}