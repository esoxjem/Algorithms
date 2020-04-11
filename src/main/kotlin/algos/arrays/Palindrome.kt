package algos.arrays

class Palindrome {
    fun isPalindrome(str: String): Boolean {
        var start = 0
        var end = str.lastIndex

        while (start <= end) {
            if (str[start] != str[end]) {
                return false
            }
            start++
            end--
        }
        return true
    }
}

fun main() {
    val str = "malayalam"
    println(Palindrome().isPalindrome(str))

    val str2 = "abcdefdcba"
    println(Palindrome().isPalindrome(str2))
}