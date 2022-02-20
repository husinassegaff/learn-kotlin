package learn.kotlin.basic

fun main(){
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    // anonymous function
    val editString = fun(value: String): String {
        return if (value == "") "ups"
        else value.toUpperCase()
    }

    println(hello("Husin", editString))
}