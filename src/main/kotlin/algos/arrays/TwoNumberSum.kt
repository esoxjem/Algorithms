package algos.arrays

import kotlin.collections.HashMap

/**
 *
 * Write a function that takes in a non-empty array of distinct integers and an
 * integer representing a target sum. If any two numbers in the input array sum
 * up to the target sum, the function should return them in an array, in any
 * order. If no two numbers sum up to the target sum, the function should return
 * an empty array.
 */
class TwoNumberSum {

    /**
     * Space: O(n)
     * Time: O(n)
     */
    fun findPair(array: Array<Int>, sum: Int): Array<Int> {
        val map = HashMap<Int, Boolean>()

        array.forEach { num ->
            val complement = sum - num
            if (map.contains(complement)) {
                return arrayOf(num, complement)
            } else {
                map[num] = true
                map[complement] = true
            }
        }

        return emptyArray()
    }
}

fun main(args: Array<String>) {
    val test = TwoNumberSum()
    val arr = arrayOf(1, 5, 7, 9, 11)
    val target = 10

    println(test.findPair(arr, target).contentToString())

    println()

    val arr2 = arrayOf(-1, 5, 7, 8, 11)
    val target2 = 10

    println(test.findPair(arr2, target2).contentToString())
}