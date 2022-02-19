package learn.kotlin.basic

fun says(firstName: String, lastName: String? = null){
    if(lastName == null) println("hello $firstName")
    else println("Hello $firstName $lastName")
}

fun main(){
    says("Husin", "Assegaff")
    says("Husin")
    says("Test", null)
}