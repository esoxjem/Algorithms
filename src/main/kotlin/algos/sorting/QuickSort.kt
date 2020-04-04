package algos.sorting

class QuickSort {

    fun sort(array: Array<Int>) {
        quickSort(array, 0, array.lastIndex)
    }

    private fun quickSort(array: Array<Int>, left: Int, right: Int) {
        if (left >= right) return // exit condition

        val pi = partition(array, left, right)
        quickSort(array, left, pi - 1)
        quickSort(array, pi + 1, right)
    }

    private fun partition(array: Array<Int>, left: Int, right: Int): Int {
        val pivot = array[right]
        var pi = left
        var counter = left

        for(curr in left..right) {
            if (array[curr] < pivot) {
                swap(array, pi, curr)
                pi++
            }
            counter = curr
        }

        swap(array, pi, counter)

        return pi
    }

    private fun swap(array: Array<Int>, a: Int, b: Int) {
        val temp = array[a]
        array[a] = array[b]
        array[b] = temp
    }
}

fun main(args: Array<String>) {
    val arr = arrayOf(4, 1, 7, 9, 2, 3)
    log(arr)

    QuickSort().sort(arr)

    println("\nsorted:")
    log(arr)
}

fun log(array: Array<Int>) {
    array.forEach { print(it) }
}