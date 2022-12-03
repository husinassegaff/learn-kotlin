package learn.kotlin.basic

fun sum(a: Int): Int = a + 2

fun test(name: String): Unit = println("Hello $name")

fun main(){
    println(sum(2))
    test("Husin")
}