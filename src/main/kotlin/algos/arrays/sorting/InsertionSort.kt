package algos.arrays.sorting

class InsertionSort {

    fun sort(array: Array<Int>): Array<Int> {
        if (array.isEmpty()) return array

        (1..array.lastIndex).forEach { i ->
            var j = i
            while (j > 0) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1)
                    j--
                } else {
                    break
                }
            }
        }

        return array
    }

    private fun swap(array: Array<Int>, i: Int, j: Int) {
        val temp = array[j]
        array[j] = array[i]
        array[i] = temp
    }
}

fun main(args: Array<String>) {
    val arr = arrayOf(4, 1, 6, 5, 2, 3)
    println(arr.contentToString())

    InsertionSort().sort(arr)

    println("\nsorted:")
    println(arr.contentToString())
}