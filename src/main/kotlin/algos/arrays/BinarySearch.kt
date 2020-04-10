package algos.arrays

class BinarySearch {

    fun search(arr: Array<Int>, target: Int): Int {
        return binary(arr, 0, arr.lastIndex, target)
    }

    private fun binary(arr: Array<Int>, start: Int, end: Int, target: Int): Int {
        val mid = (start + end) / 2

        if (start > end) {
            return -1
        }

        if (arr[mid] == target) {
            return mid
        }

        return if (mid < target) {
            binary(arr, mid + 1, end, target)
        } else {
            binary(arr, start, mid - 1, target)
        }
    }

    fun searchIterative(arr: Array<Int>, target: Int): Int {
        var left = 0
        var right = arr.lastIndex
        var mid = (left + right) / 2

        while (left <= right) {
            if (arr[mid] == target) {
                return mid
            }

            if (arr[mid] < target) {
                left = mid + 1
            } else {
                right = mid - 1
            }

            mid = (left + right) / 2
        }

        return -1
    }
}

fun main(args: Array<String>) {
    val arr = arrayOf(1, 2, 4, 10, 22)

    val bs = BinarySearch()
    println("index: " + bs.search(arr, 2))
    println("index: " + bs.search(arr, 12))

    println("index: " + bs.searchIterative(arr, 22))
    println("index: " + bs.searchIterative(arr, 25))
}