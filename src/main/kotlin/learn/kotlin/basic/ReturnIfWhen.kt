package learn.kotlin.basic

fun main(){
    fun sayHello(name: String = ""): String {
      return if (name == "") "Hello"
      else "Hello $name"
    }

    fun sayHai(name:String = ""): String {
        return when(name){
            "" -> "Hello"
            else -> "Hello $name"
        }
    }

    println(sayHello())
    println(sayHello("Husin"))

    println(sayHai())
    println(sayHai("Husin"))
}