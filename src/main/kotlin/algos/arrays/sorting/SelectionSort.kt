package algos.arrays.sorting

class SelectionSort {

    fun sort(array: Array<Int>) {
        array.forEachIndexed { index, _ ->
            val smallest = smallestIndex(array, index)
            swap(array, index, smallest)
        }
    }

    private fun smallestIndex(array: Array<Int>, start: Int): Int {
        var smallest = start

        (start..array.lastIndex).forEach { i ->
            if (array[i] < array[smallest])
                smallest = i
        }

        return smallest
    }

    private fun swap(array: Array<Int>, i: Int, j: Int) {
        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }
}

fun main() {
    val arr = arrayOf(4, 1, 6, 5, 2, 3)
    println(arr.contentToString())

    SelectionSort().sort(arr)

    println("\nsorted:")
    println(arr.contentToString())
}