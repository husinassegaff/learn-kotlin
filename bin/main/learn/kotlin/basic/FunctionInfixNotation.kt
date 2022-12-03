package learn.kotlin.basic

infix fun String.to(type: String): String{
    if(type == "UP") return this.toUpperCase()
    else return this.toLowerCase()
}

fun main(){
    val result  = "Husin Muhammad".to("UP")
    val result2 = "Husin Muhammad" to "UP"

    println("result = $result")
    println("result = $result2")

}