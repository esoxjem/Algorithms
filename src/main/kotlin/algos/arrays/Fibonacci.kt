package algos.arrays

class Fibonacci {

    fun nthFib(n: Int): Int {
        if(n == 0) return 0
        if(n == 1) return 1

        return nthFib(n-1) + nthFib(n-2)
    }

}

fun main(args: Array<String>) {
    val fib = Fibonacci()

    val n = fib.nthFib(0)
    println("fib: $n")
}