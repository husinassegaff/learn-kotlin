package learn.kotlin.basic

fun functionOne(){
    println("Function 1")
    println("Ini function 1")
    functionTwo()
}

fun functionTwo(){
    println("Function 2")
    println("ini function 2")
}

fun main(){
    fun functionThree(){
        println("Function 3")
        functionOne()
        functionTwo()
        println("ini function 3")
    }
    functionOne()
    functionTwo()
    functionThree()
}