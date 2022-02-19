#Learn-Kotlin
---

## Tabel Konten

A. Kotlin Basic
1. [When Expression](#when-expression)
2. [For Loops](#for-loops)
3. [While Loops](#while-loops)
4. [Do While Loops](#do-while-loops)
5. [Break & Continue](#break-&-continue)
6. [Function](#function)
7. [Function Parameter](#function-parameter)
8. [Function Default Argument](#function-default-argument)
9. [Function Named Argument](#function-named-argument)
10. [Unit Returning Function](#unit-returning-function)
11. [Function Return Type](#function-return-type)
12. [Single Expression Function](#single-expression-function)


### When Expression
- Selain `if expression`, untuk melakukan percabangan di Kotlin juga dapat menggunakna `when expression`
- Lebih sederhana dibandingkan `if expression`
- Biasanya digunakan untuk pengecekan kondisi dalam suatu variabel

```kotlin
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
```
- Ekspresi ini juga dapat digunakan sebagai pengganti `if else` dengan tidak perlu menggunakan variabel di dalam `when`
```kotlin
val examValue = 99

when {
    examValue == 100 -> println("Amazing")
    else -> {
        println("Ok")
    }
}
```

### For Loops
- `for` digunakan untuk melakukan perulangan iterasi dari data iterator seperti array, range, dan semacamnya
```kotlin
var array = arrayOf("Husin", "Muhammad", "Assegaff")

for(name in array){
    println("$name ")
}

// For Range
for(value in 0..100){
    if(value == 100) println("$value")
    else print("$value, ")
}

for(value in 50 downTo 0 step 5){
    if(value == 0) println("$value")
    else print("$value, ")
}

val arraySize = array.size - 1
for(i in 0..arraySize){
    println("index $i = ${array.get(i)}")
}
```

### While Loops
- `while` adalah perulangan yang fleksibel, karena hanya menjalankan blok while apabila kondisi bernilai true dan akan terus berulang hingga bernilai false
```kotlin
var i = 0

while (i < 10){
    println("Perulangan $i")
    i++
}
```

### Do While Loops
- Perulangan yang hampir sama dengan `while loop`. Perbedaannya pada kode blok akan dijalankan dahulu, baru di akhir akan dilakukan pengecekan kondisi
```kotlin
var i = 0

do {
    println("perulangan ke $i")
    i++
} while (i < 10)
```

### Break & Continue
- Merupakan kata kunci yang dapat digunakan dalam semua perulangan di Kotlin
- `break` digunakan untuk menghentikan seluruh perulangan
- `continue` digunakan untuk menghentikan perulangan yang sedang berjalan, sehingga langsung berlanjut ke perulangan selanjutnya

```kotlin
var i = 0

// break
while(true){
    println("Perulangan ke $i")
    i++

    if(i > 100) break
}

// continue
for(i in 1..100){
    if(i % 2 == 0) continue

    println("Bilangan ganjil = $i")
}
```

### Function
- Merupakan sebuah blok kode yang sengaja dibuat dalam program agar bisa digunakan secara berulang-ulang
- Di kotlin untuk membuat function dengna menggunakan sintaks `fun`
- Untuk memanggil sebuah function, hanya perlu menulis nama function tersebut
- Penulisan nama function pada Kotlin biasanya menggunakan format _camelCase_
```kotlin
fun helloWorld(){
    println("Hello")
    println("World")
}

fun main(){
    helloWorld()
}
```

### Function Parameter
- Dalam membuat function, terkadang membutuhkan data dari luar function atau bisa disebut `parameter`
- `parameter` tidak wajib ada di function, tetapi jika pada function terdapat `parameter` maka ketika memanggil function tersebut diwajibkan untuk memasukkan data ke dalam paramternya
```kotlin
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
```

### Function Default Argument
- Dapat memasukkan nilai default pada parameter, sehingga saat memanggil function tidak wajib memasukkan nilai pada parameternya
- Default parameter ini cocok digunakan pada jenis parameter yang tidak wajib untuk diisi
```kotlin
fun says(firstName: String, lastName: String? = null){
    if(lastName == null) println("hello $firstName")
    else println("Hello $firstName $lastName")
}

fun main(){
    says("Husin", "Assegaff")
    says("Husin")
    says("Test", null)
}
```

### Function Named Argument
- Apabila ada function yang parameternya banyak, terkadang menyulitkan untuk mengikuti urutan parameter dari function tersebut
- Dengan fitur named argument bisa menyebutkan nama parameter saat memanggil function tanpa harus mengetahui urutan dari parameter tersebut
- Jika pemanggilan parameter menggunakan named argument, maka seluruh parameter yang ada di function tersebut harus menggunakan named argument juga
```kotlin
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
```

### Unit Returning Function
- Function yang tidak mengembalikan nilai pada dasarnya tetap mengembalikan nilai berupa tipe data Unit.
- Tipe data Unit digunakan sebagai penanda bahwa function tersebut tidak mengembalikan nilai
- Penulisan tipe data Unit tidak wajib, namun jika menulis tipe data pengembalian sebuah function, maka secara otomatis tipe data tersebut adalah Unit
```kotlin
fun printHello() : Unit{
    println("Hello")
}

fun main(){
    printHello()
}
```

### Function Return Type
- Jika function dideklarasikan dengan tipe data pengembalian, maka wajib di dalam function untuk mengembalikan data
- Untuk mengembalikan data dari function, dapat menggunakan kata kunci return diikuti dengan data yang ingin dikembalikan
```kotlin
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main(){
    println(sum(1,2))
}
```

### Single Expression Function
- Merupakan deklarasi function dengan hanya satu baris kode dengan menggunakan tanda `=` setelah deklarasi tipe data pengembalian function
```kotlin
fun sum(a: Int): Int = a + 2

fun test(name: String): Unit = println("Hello $name")

fun main(){
    println(sum(2))
    test("Husin")
}
```