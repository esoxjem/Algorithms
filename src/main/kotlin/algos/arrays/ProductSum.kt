package algos.arrays

import java.util.*


/**
 *
 * Write a function that takes in a "special" array and returns its product sum.
 * A "special" array is a non-empty array that contains either integers or other
 * "special" arrays. The product sum of a "special" array is the sum of its
 * elements, where "special" arrays inside it are summed themselves and then
 * multiplied by their level of depth.
 *
 * For example,
 * the product sum of [x, y] is x + y;
 * the product sum of [x, [y, z]] x + 2y + 2z
 *
 * Sample input:  [5, 2, [7, -1], 3, [6, [-13, 8], 4]]
 * Sample output: 12
 * calculated as: 5 + 2 + 2 * (7 - 1) + 3 + 2 * (6 + 3 * (-13 + 8) + 4)
 */
class ProductSum {

    fun productSumHelper(list: List<Any>): Int {
        return productSumHelper(list, 1)
    }

    private fun productSumHelper(list: List<Any>, accumulator: Int): Int {
        var sum = 0

        list.forEach { item ->
            if(item is Int) {
                sum += item
            } else {
                val inner = item as List<Int>
                sum += productSumHelper(inner, accumulator + 1)
            }
        }

        return sum * accumulator
    }
}

fun main(args: Array<String>) {
    val ps = ProductSum()
    val test: List<Any> = ArrayList<Any>(listOf(1, 2, ArrayList<Any>(listOf(3)), 4, 5))

    println(ps.productSumHelper(test))
}