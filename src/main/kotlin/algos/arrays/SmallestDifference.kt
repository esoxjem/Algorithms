package algos.arrays

import kotlin.math.absoluteValue

/**
 *
 * Write a function that takes in two non-empty arrays of integers, finds the
 * pair of numbers (one from each array) whose absolute difference is closest to
 * zero, and returns an array containing these two numbers, with the number from
 * the first array in the first position.
 *
 */
class SmallestDifference {

    fun findPair(arrOne: Array<Int>, arrTwo: Array<Int>): Array<Int> {
        arrOne.sort()
        arrTwo.sort()
        var i = 0
        var j = 0
        var smallestDifference = Int.MAX_VALUE
        var pair: Array<Int> = emptyArray()

        while (i < arrOne.size && j < arrTwo.size) {
            val first = arrOne[i]
            val second = arrTwo[j]

            val currentDiff = (first - second).absoluteValue
            if (currentDiff < smallestDifference) {
                smallestDifference = currentDiff
                pair = arrayOf(first, second)
            }

            if (first == second) {
                return arrayOf(first, second)
            } else if (first < second) {
                i++
            } else {
                j++
            }
        }

        return pair
    }

}

fun main() {
    val b = arrayOf(-1, 5, 10, 20, 28, 3)
    val a = arrayOf(26, 134, 135, 15, 17)
    val pair = SmallestDifference().findPair(a, b)
    println(pair.contentToString())
}