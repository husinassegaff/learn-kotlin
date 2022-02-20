package learn.kotlin.basic

fun toUpper(value: String): String = value.toUpperCase()

fun main(){
    // fungsi lambda
    val exampleLambda: (String, String) -> String = { firstName: String, lastName:String ->
        val result = "$firstName $lastName"
        result
    }

    // menggunakan nama variabel 'it' sebagai default apabila hanya ada 1 parameter
    val sayHello: (String) -> String = {
        "Hello $it"
    }

    // lambda dengan method reference
    val toUpperCase: (String) -> String = ::toUpper

    println(exampleLambda("Husin", "Assegaff"))
    println(sayHello("Husin"))
    println(toUpperCase("Husin"))
}