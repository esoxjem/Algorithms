package algos.arrays.sorting

/**
 *
 * Write a function that takes in a non-empty array of distinct integers and an
 * integer representing a target sum. The function should find all triplets in
 * the array that sum up to the target sum and return a two-dimensional array of
 * all these triplets. The numbers in each triplet should be ordered in ascending
 * order, and the triplets themselves should be ordered in ascending order with
 * respect to the numbers they hold.
 *
 */
class ThreeNumberSum {

    fun findTriplets(array: Array<Int>, targetSum: Int): List<Array<Int>> {
        val result = mutableListOf<Array<Int>>()
        array.sort()
        array.forEachIndexed { index, num ->
            var left = index
            var right = array.lastIndex

            while (left < right) {
                val currentSum = num + array[left] + array[right]
                if (currentSum == targetSum) {
                    result.add(arrayOf(num, array[left], array[right]))
                    left++
                    right--
                } else if (currentSum < targetSum) {
                    left++
                } else {
                    right--
                }
            }
        }
        return result
    }

}

fun main() {
    val result = ThreeNumberSum().findTriplets(arrayOf(5, 1, 0, -5, 4 ,7, 9, -11, 2), 0)
    result.forEach { print(it.contentToString()) }
}