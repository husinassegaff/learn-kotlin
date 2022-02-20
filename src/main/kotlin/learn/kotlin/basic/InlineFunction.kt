package learn.kotlin.basic

inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

inline fun hello2(firstName: () -> String, noinline lastName: () -> String): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main(){
    println(hello { "Husin" })
    println(hello2({ "Husin" }, { "Assegaff" }))
}