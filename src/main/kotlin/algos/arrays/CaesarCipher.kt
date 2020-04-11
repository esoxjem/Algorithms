package algos.arrays

/**
 *
 * Given a non-empty string of lowercase letters and a non-negative integer
 * representing a key, write a function that returns a new string obtained by
 * shifting every letter in the input string by k positions in the alphabet,
 * where k is the key.
 *
 * Note that letters should "wrap" around the alphabet; in other words, the
 * letter shifted by one returns the letter
 */
class CaesarCipher {

    fun encrypt(string: String, key: Int): String {
        val arr = Array(string.length) { '-' }
        val newKey = key % 26

        string.forEachIndexed { index, c ->
            val ascii = c.toInt()
            val shifted = ascii + newKey

            val encrypted = if (shifted > 'z'.toInt()) {
                shifted - 26
            } else {
                shifted
            }

            arr[index] = encrypted.toChar()
        }

        return arr.contentToString()
    }
}

fun main() {
    println(CaesarCipher().encrypt("abc", 1))
    println(CaesarCipher().encrypt("xyz", 1))
    println(CaesarCipher().encrypt("xyz", 27))
}