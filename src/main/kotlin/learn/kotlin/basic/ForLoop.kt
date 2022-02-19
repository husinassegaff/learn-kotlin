package learn.kotlin.basic

fun main(){
    var array = arrayOf("Husin", "Muhammad", "Assegaff")

    for(name in array){
        println("$name ")
    }

    // For Range
    for(value in 0..100){
        if(value == 100) println("$value")
        else print("$value, ")
    }

    for(value in 50 downTo 0 step 5){
        if(value == 0) println("$value")
        else print("$value, ")
    }

    val arraySize = array.size - 1
    for(i in 0..arraySize){
        println("index $i = ${array.get(i)}")
    }
}