package learn.kotlin.basic

fun main(){
    val nilai = "E"
    val notPassValues: Array<String> = arrayOf("E","F")

    when(nilai){
        "A" -> println("Amazing")
        "B" -> println("Good")
        // Multiple option
        "C", "D" -> {
            println("Not Bad")
        }
        // Operasi In
        in notPassValues -> {
            println("Please try again")
        }
        else -> {
            println("your values is invalid")
        }
    }

    // Operasi Is
    val name: String = "Husin"

    when(name){
        is String -> println("$name is String")
        !is String -> {
            println("$name is not String")
        }
    }

    // When pengganti if else

    val examValue = 99

    when {
        examValue == 100 -> println("Amazing")
        else -> {
            println("Ok")
        }
    }
}