package ds.tree

import java.util.*

class TreeNode(val data: Int, var children: Array<TreeNode>? = null)

class Tree(val root: TreeNode) {

    fun print(node: TreeNode) {
        println(node.data)
    }

    /**
     * Depth first search
     * recursive
     * O(n)
     */
    fun dfs() {
        fun dfsRecurse(node: TreeNode) {
            print(node)
            node.children?.forEach { child ->
                dfsRecurse(child)
            }
        }

        dfsRecurse(root)
    }

    /**
     * Depth first search
     * iterative
     * O(n)
     */
    fun dfsIterative() {
        val stack = Stack<TreeNode>()
        stack.push(root)

        while (stack.empty().not()) {
            val n = stack.pop()
            print(n)
            n.children?.forEach {
                stack.add(it)
            }
        }
    }

    /**
     * Breadth first search
     * level order
     * O(n)
     */
    fun bfs() {
        val queue = ArrayDeque<TreeNode>()
        queue.push(root)

        while (queue.isNotEmpty()) {
            val n = queue.pop()
            print(n)

            n.children?.forEach {
                queue.add(it)
            }
        }
    }
}

fun main(args: Array<String>) {
    val a = TreeNode(1)
    val b = TreeNode(2)
    val c = TreeNode(3)
    val d = TreeNode(4)
    val e = TreeNode(5)
    val f = TreeNode(6)

    a.children = arrayOf(b, c, d)
    d.children = arrayOf(e, f)

    val tree = Tree(a)

    println("DFS Recursive:")
    tree.dfs()

    println("DFS Iterative:")
    tree.dfsIterative()

    println("BFS Iterative:")
    tree.bfs()
}