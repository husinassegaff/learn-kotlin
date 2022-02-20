package learn.kotlin.basic

fun String.hello(): String  = "Hello $this"

fun String.printHello(): Unit = println("Hai $this")

fun main(){
    val name = "Husin"

    println(name.hello())
    name.printHello()
    "Muhammad".printHello()
}