package algos.arrays

class BinarySearch {

    fun search(arr: Array<Int>, target: Int): Int {
        return search(arr, 0, arr.lastIndex, target)
    }

    private fun search(arr: Array<Int>, start: Int, end: Int, target: Int): Int {
        if (start > end) {
            return -1
        }
        val mid = (start + end) / 2

        return when {
            arr[mid] == target -> mid
            mid < target -> search(arr, mid + 1, end, target)
            else -> search(arr, start, mid - 1, target)
        }
    }

    fun searchIterative(arr: Array<Int>, target: Int): Int {
        var left = 0
        var right = arr.lastIndex

        while (left <= right) {
            val mid = (left + right) / 2
            when {
                arr[mid] == target -> return mid
                arr[mid] < target -> left = mid + 1
                else -> right = mid - 1
            }
        }

        return -1
    }
}

fun main(args: Array<String>) {
    val arr = arrayOf(1, 2, 4, 10, 22)

    val bs = BinarySearch()
    println("index: " + bs.search(arr, 10))
    println("index: " + bs.search(arr, 12))

    println("index: " + bs.searchIterative(arr, 22))
    println("index: " + bs.searchIterative(arr, 25))
}