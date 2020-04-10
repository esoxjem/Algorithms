package algos.arrays

class TheeLargestNumbers {

    /**
     * time: O(n)
     * space: O(1)
     */
    fun findThreeLargest(array: Array<Int>): Array<Int> {
        val result = arrayOf(Int.MIN_VALUE, Int.MIN_VALUE, Int.MIN_VALUE)

        array.forEach {
            updateLargest(it, result)
        }

        return result
    }

    private fun updateLargest(num: Int, result: Array<Int>) {
        when {
            num > result[2] -> shiftLeft(result, num, 2)
            num > result[1] -> shiftLeft(result, num, 1)
            num > result[0] -> shiftLeft(result, num, 0)
        }
    }

    private fun shiftLeft(array: Array<Int>, num: Int, index: Int) {
        (0..index).forEach { i ->
            if (i == index) {
                array[i] = num
            } else {
                array[i] = array[i + 1]
            }
        }
    }
}

fun main(args: Array<String>) {
    val arr = arrayOf(141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7)
    val program = TheeLargestNumbers()

    println(program.findThreeLargest(arr).contentToString())
}