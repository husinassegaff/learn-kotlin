package learn.kotlin.basic

fun main(){
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper: (String) -> String = {
        it.toUpperCase()
    }

    val lambdaLower = {value: String -> value.toLowerCase()}

    println(hello("Husin", lambdaUpper))
    println(hello("Husin", lambdaLower))
    println(hello("husin assegaff", { value: String -> value.toUpperCase() }))

    // trailing lambda
    val result = hello("Husin Muhammad") { value : String ->
        value.toLowerCase()
    }

    println(result)
}