package ds.graph

class GraphNode<T>(val value: T, val children: MutableList<GraphNode<T>> = mutableListOf()) {

    fun addChild(node: GraphNode<T>): GraphNode<T> {
        children.add(node)
        return this
    }

    fun addChild(value: T): GraphNode<T> {
        children.add(GraphNode(value))
        return this
    }

}
