package learn.kotlin.basic

fun factorialLoop(value: Int): Int {
    return when(value){
        1 -> 1
        else -> value * factorialLoop(value - 1)
    }
}

fun main(){
    println("factorialLoop(5) = ${factorialLoop(5)}")
}