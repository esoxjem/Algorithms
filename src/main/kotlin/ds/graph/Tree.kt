package ds.tree

class TreeNode<T>(val value: T, val children: MutableList<TreeNode<T>> = mutableListOf()) {

    fun addChild(node: TreeNode<T>): TreeNode<T> {
        children.add(node)
        return this
    }

    fun addChild(value: T): TreeNode<T> {
        children.add(TreeNode(value))
        return this
    }

}
