package algos.arrays


/*
    Given an array of integers nums, write a method that returns the "pivot" index of this array.

    We define the pivot index as the index where the sum of the numbers to the left of the index is equal to
    the sum of the numbers to the right of the index.
    If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the
    left-most pivot index.

    Example 1:
    Input:
    nums = [1, 7, 3, 6, 5, 6]
    Output: 3
    Explanation:
    The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right
    of index 3.
    Also, 3 is the first index where this occurs.
*/


fun pivotIndex(nums: Array<Int>): Int {
    val start = 0
    val end = nums.size - 1
    return pivot(start, end, nums)
}

fun pivot(start: Int, end: Int, nums: Array<Int>): Int {
    var mid = (start + end) / 2
    val leftSum = sum(start, mid - 1, nums)
    val rightSum = sum(mid + 1, end, nums)

    if (leftSum == rightSum) return mid

    if (leftSum < rightSum) {
        mid++
        return pivot(mid + 1, end, nums)
    } else if (leftSum > rightSum) {
        mid--
        return pivot(start, mid - 1, nums)
    }

    return -1
}

fun sum(start: Int, end: Int, nums: Array<Int>): Int {
    var sum = 0
    for (i in start..end) {
        sum += nums[i]
    }

    return sum
}