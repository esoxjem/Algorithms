package algos.sorting

class MergeSort {

    fun sort(arr: Array<Int>) {
        splitAndMerge(arr)
    }

    private fun splitAndMerge(arr: Array<Int>) {
        if(arr.size <= 1) return

        val mid = (arr.size / 2)

        val left = arr.sliceArray(0 until mid)
        val right = arr.sliceArray(mid..arr.lastIndex)

        splitAndMerge(left)
        splitAndMerge(right)

        merge(left, right, arr)
    }


    private fun merge(left: Array<Int>, right: Array<Int>, result: Array<Int>) {
        var i = 0
        var j = 0
        var k = 0

        // put values in sorted order
        while (i <= left.lastIndex && j <= right.lastIndex) {
            if (left[i] < right[j]) {
                result[k] = left[i]
                i++
                k++
            } else {
                result[k] = right[j]
                j++
                k++
            }
        }

        // put remaining values in left
        while (i <= left.lastIndex) {
            result[k] = left[i]
            i++
            k++
        }

        // put remaining values in right
        while (j <= right.lastIndex) {
            result[k] = right[j]
            j++
            k++
        }
    }
}

fun main(args: Array<String>) {
    val arr = arrayOf(4, 1, 6, 5, 2, 3)
    log(arr)

    MergeSort().sort(arr)

    println("\nsorted:")
    log(arr)
}