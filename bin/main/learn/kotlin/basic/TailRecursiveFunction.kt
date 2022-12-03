package learn.kotlin.basic

fun main(){
    tailrec fun display(value: Int){
        println("Recursive $value")
        if (value > 0) display(value - 1)
    }

    tailrec fun factorialTail(value: Int, total: Int = 1): Int{
        return when(value){
            1 -> total
            else -> factorialTail(value - 1, total * value)
        }
    }

    display(1000)
    println(factorialTail(10))
}