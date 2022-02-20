package learn.kotlin.basic

fun main(){
    var temp: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("Lambda increment")
        temp++
    }

    val anonymousIncrement = fun() {
        println("Anonymous function increment")
        temp++
    }

    fun functionIncrement(){
        println("Function increment")
        temp++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(temp)
}