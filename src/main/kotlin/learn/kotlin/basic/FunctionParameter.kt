package learn.kotlin.basic

fun sayHello(firstName: String, lastName: String){
    println("$firstName $lastName")
}

// parameter boleh kosong dengan menggunakan `?`
fun sayHai(firstName: String, lastName: String?){
    if(lastName == null) println("Hello $firstName")
    else println("Hello $firstName $lastName")
}

fun main(){
    sayHello("Husin", "Assegaff")
    sayHai("Husin", "Muhammad")
    sayHai("Husin", null)
}