package algos.arrays.sorting

class BubbleSort {

    fun sort(array: Array<Int>): Array<Int> {
        if(array.isEmpty()) return emptyArray()

        var end = array.lastIndex

        while (end >= 0) {

            (0..end).forEach{ index ->
                if (index == array.lastIndex) return@forEach

                if (array[index] > array[index + 1]) {
                    swap(array, index, index+1)
                }
            }

            end--
        }

        return array;
    }


    private fun swap(arr: Array<Int>, i: Int, j: Int) {
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }
}

fun main(args: Array<String>) {
    val arr = arrayOf(2, 1, 3)
    println(arr.contentToString())

    BubbleSort().sort(arr)

    println("\nsorted:")
    println(arr.contentToString())
}