package learn.kotlin.hackerrank

/*
 * Complete the 'reverseArray' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun reverseArray(a: Array<Int>): Array<Int> {
    // Write your code here
    val b = Array(a.size) { it }


    for (i in a.indices) {
        b[i] = a[a.size - 1 - i]
    }

    return b

}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val res = reverseArray(arr)

    println(res.joinToString(" "))
}
