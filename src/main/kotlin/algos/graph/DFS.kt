package algos.trees.tree

import ds.tree.TreeNode

/**
 * Implement func, which takes in an empty array, traverses the tree
 * using the Depth-first Search approach (specifically navigating the tree from
 * left to right), stores all of the nodes' names in the input array, and returns
 * it.
 */
class DFS {

    fun dfs(root: TreeNode<String>, list: MutableList<String>) {
        fill(root, list)
    }

    private fun fill(node: TreeNode<String>, list: MutableList<String>) {
        list.add(node.value)

        node.children.forEach { child ->
            fill(child, list)
        }
    }

}

fun main(args: Array<String>) {

    val tree = TreeNode("A")
    tree.addChild("B").addChild("C").addChild("D")
    tree.children[0].addChild("E").addChild("F")
    tree.children[2].addChild("G").addChild("H")
    tree.children[0].children[1].addChild("I").addChild("J")
    tree.children[2].children[0].addChild("K")

    val list = mutableListOf<String>()
    DFS().dfs(tree, list)

    print(list)

}