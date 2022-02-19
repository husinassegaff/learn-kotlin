package learn.kotlin.basic

fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
){
    println("Hello $firstName $middleName $lastName")
}


fun main(){
    fullName("Husin","Muhammad", "Assegaff")
    fullName(middleName = "Muhammad", lastName = "Assegaff", firstName = "Husin")
}