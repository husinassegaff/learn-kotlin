#Learn-Kotlin
---

## Tabel Konten

A. Kotlin Basic
1. [Tipe Data Number](#tipe-data-number)
2. [Tipe Data Character](#tipe-data-character)
3. [Tipe Data Boolean](#tipe-data-boolean)
4. [When Expression](#when-expression)
5. [For Loops](#for-loops)
6. [While Loops](#while-loops)
7. [Do While Loops](#do-while-loops)
8. [Break & Continue](#break-&-continue)
9. [Function](#function)
10. [Function Parameter](#function-parameter)
11. [Function Default Argument](#function-default-argument)
12. [Function Named Argument](#function-named-argument)
13. [Unit Returning Function](#unit-returning-function)
14. [Function Return Type](#function-return-type)
15. [Single Expression Function](#single-expression-function)
16. [Function Varargs Parameter](#function-varargs-parameter)
17. [Extension Function](#extension-function)
18. [Function Infix Notation](#function-infix-notation)
19. [Function Scope](#function-scope)
20. [Return If & When](#return-if-&-when)
21. [Recursive Function](#recursive-function)
22. [Tail Recursive Function](#tail-recursive-function)
23. [Lambda Expression](#lambda-expression)
24. [Higher Order Function](#higher-order-function)
25. [Anonymous Function](#anonymous-function)
26. [Closure](#closure)
27. [Inline Function](#inline-function)
28. [Label](#label)
29. [Package & Import](#package-&-import)
30. [Main Parameters](#main-parameters)

### Tipe Data Number
- Integer Number

  | Type| Size (bits) | Min value | Max value |
  | :---: | :---: | :---: | :---: |
  | Byte | 8 | -128 | 127 |
  | Short | 16 | -32768 | 32767 |
  | Int | 32 | -2.147.438.648 (-2^31) | 2.147.438.647 (2^31 - 1 |
  | Long | 64 | -9.223.372.036.854.775.808 (-2^63) | 9.223.372.036.854.775.808 (2^63 - 1) |
  
  ```kotlin
  var age: Byte = 30
  var height: Int = 170
  var distance: Short = 2000
  var balance: Long = 10_000_000L 
  //'_' sebagai pembatas satuan angka
  //'L' untuk menunjukkan bahwa itu tipe data Long
  ```
- Floating Point Number

  | Type| Size (bits) | Significant bits | Exponent bits | Decimal digits |
  | :---: | :---: | :---: | :---: | :---: |
  | Float | 32 | 24 | 8 | 6-7 |
  | Double | 64 | 53 | 11 | 15-16 |

  ```kotlin
  var value: Float = 98.98F
  var radius: Double = 234234234234.53434
  ```

- Literals
  ```kotlin
  var decimalLiteral: Int = 100
  var hexadecimalLiteral: Int = 0xFF
  var binaryLiteral: Int = 0b0001
  ```
- Underscore
  ```kotlin
  var age: Byte = 3_0
  var height: Int = 1_7_0
  var distance: Short = 2_000
  ```

- Conversion
  ```kotlin
  var number: Int = 100
  
  // conversion
  var byte: Byte = number.toByte()
  var short: Short = number.toShort()
  var int: Int = number.toInt()
  var long: Long = number.toLong()
  var float: Float = number.toFloat()
  var double: Double = number.toDouble()
  ```
  
### Tipe Data Character
- Untuk membuat data `char` di Kotlin menggunakan tanda '' (petik satu)
  ```kotlin
  var char1: Char = 'H'
  var char2: Char = 'M'
  var char3: Char = 'A'
  ``` 

### Tipe Data Boolean
```kotlin
var benar: Boolean = true
var salah: Boolean = false
```

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

### Function Varargs Parameter
- Parameter yang berada di posisi terakhir memiliki kemampuan untuk dijadikan `vararg`
- `vararg` adalah data yang bisa menerima lebih dari satu input atau bisa disebut semacam `array`
- Perbedaan dengan `array` adalah tidak perlu mendeklarasikan / membuat variabel terlebih dahulu sebelum dimasukkan ke function
- Dengan menggunakan tanda koma sudah dapat mengirimkan lebih dari satu data dengan menggunakan `vararg`
```kotlin
// Menggunakan Array
fun countSum(values: Array<Int>): Int {
    var count = 0

    for (value in values){
        count += value
    }

    return count
}

// Menggunakan vararg
fun countSum2(vararg values: Int): Int{
    var count = 0

    for (value in values){
        count += value
    }

    return count
}

fun averageGrade(name: String, vararg grades: Int){
    var count = 0
    var temp = 0

    for(grade in grades){
        count += grade
        temp++
    }

    val finalgrade = count / temp

    println("Nilai rata-rata $name adalah $finalgrade")
}

fun main(){
    // Menggunakan Array
    val values = arrayOf(10, 10, 10)
    val result = countSum(values)

    // Menggunakan vararg
    val result2 = countSum2(10, 10, 10)

    println("Hasil result = $result")
    println("Hasil result2 = $result2")
    averageGrade("Adi", 93,85,93)
}
```

### Extension Function
- Merupakan kemampuan untuk menambahkan function pada tipe data yang sudah ada
- Untuk menggunakannya dengan menambahkan tipe data sebelum nama function dengan diikuti tanda titik
```kotlin
fun String.hello(): String{
    // code
}
```
- Untuk mengakses data di fungsi ini, bisa mengggunakan kata kunci `this`
```kotlin
fun String.hello(): String  = "Hello $this"

fun String.printHello(): Unit = println("Hai $this")

fun main(){
    val name = "Husin"
    
    println(name.hello())
    name.printHello()
    "Muhammad".printHello()
}
```
- Disarankan untuk tidak sering membuat tipe function ini, karena dapat membuat program semakin kompleks

### Function Infix Notation
- Infix Notation adalah operasi yang biasa dilakukan di operasi matematika, yakni melakukan operasi terhadap dua data
- Untuk memanggil function infix notation, tidak wajib menggunakan tanda titik seperti extension function
```kotlin
infix fun String.to(type: String): String{
    if(type == "UP") return this.toUpperCase()
    else return this.toLowerCase()
}

fun main(){
  // menggunakan tanda titik
  val result  = "Husin Muhammad".to("UP")
  // tanpa menggunakan tanda titik
  val result2 = "Husin Muhammad" to "UP"

  println("result = $result")
  println("result = $result2")
}
```
- Syarat dari Function Infix Notation,
    1. Harus sebagai function member / function extension
    2. Hanya memiliki satu parameter
    3. Parameter tidak boleh varargs dan tidak memiliki nilai default

### Function Scope
- Merupakan ruang lingkup dimana sebuah function bisa diakses
- Saat membuat function, maka secara otomatis function bisa diakses dari file kotlin manapun
- Jika ingin membatasi hanya bisa diakses di tempat tertentu, maka dapat membuat function di dalam function
```kotlin
fun functionOne(){
    println("Function 1")
    println("Ini function 1")
    functionTwo()
}

fun functionTwo(){
    println("Function 2")
    println("ini function 2")
}

fun main(){
    fun functionThree(){
        println("Function 3")
        functionOne()
        functionTwo()
        println("ini function 3")
    }
    functionOne()
    functionTwo()
    functionThree()
}
```

### Return If & When
```kotlin
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
```

### Recursive Function
- Merupakan function yang memanggil function dirinya sendiri
```kotlin
fun factorialLoop(value: Int): Int {
    return when(value){
        1 -> 1
        else -> value * factorialLoop(value - 1)
    }
}

fun main(){
    println("factorialLoop(5) = ${factorialLoop(5)}")
}
```

### Tail Recursive Function
- Dalam penggunaan recursive bisa ada kemungkinan terjadinya _error stack overflow_ apabila terlalu dalam
- Solusinya dengan menggunakan tail recursive function yaitu mengubah recursive function menjadi looping saat di-compile
- Syaratnya adalah,
  1. Menambahkan `tailrec` di function
  2. Saat memanggil function dirinya sendiri, hanya boleh menulis function tersebut dengan tipe datanya saja, tanpa ada tambahan operasi dengan data lain
```kotlin
fun main(){
    tailrec fun display(value: Int){
        println("Recursive $value")
        if (value > 0) display(value - 1)
    }

    tailrec fun factorialTail(value: Int, total: Int = 1): Int{
        return when(value){
            1 -> total
            else -> factorialTail(value - 1, total * value)
        }
    }

    display(1000)
    println(factorialTail(10))
}
```

### lambda Expression
- Secara sederhana merupakan function yang tidak memiliki nama. Sehingga bisa membuat function tanpa harus mendeskripsikan function-nya
```kotlin
fun main(){
    // fungsi lambda
    val exampleLambda: (String, String) -> String = { firstName: String, lastName:String ->
        val result = "$firstName $lastName"
        result
    }
  
    println(exampleLambda("Husin", "Assegaff"))
}
```
- Apabila hanya terdapat satu variabel / parameter pada lambda, maka dapat menggunakan nama variabel `it` sebagai nama parameter default dan tidak perlu dideklarasikan
```kotlin
fun main(){
    // menggunakan nama variabel 'it' sebagai default apabila hanya ada 1 parameter
    val sayHello: (String) -> String = {
        "Hello $it"
    }
  
    println(sayHello("Husin"))
}
```
- Lambda juga dapat dibuat dengan `method reference`
```kotlin
fun toUpper(value: String): String = value.toUpperCase()

fun main(){
    // lambda dengan method reference
    val toUpperCase: (String) -> String = ::toUpper

    println(toUpperCase("Husin"))
}
```

### Higher Order Function
- Merupakan function yang menggunakan function sebagai parameter atau mengembalikan function
- Digunakan untuk mendapatkan input yang fleksibel berupa lambda
```kotlin
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
```

### Anonymous Function
- Lambda akan menganggap baris terakhir sebagai `return`
- Namun, terkadang perlu menggunakan lambda tetapi `return` bisa dibuat fleksibel
- Anonymous function merupakan solusinya, mirip dengan lambda hanya saja cara membuatnya menggunakan kata kunci `fun`
```kotlin
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
```

### Closure
- Merupakan sebuah function, lambda ataupun anonymous function yang berinteraksi dengan data-data di sekitarnya dalam scope yang sama
- Hati-hati dalam menggunakan fitur closure karena bisa tidak sengaja mengubah sebuah data\
```kotlin
fun main(){
    var temp: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("Lambda increment")
        temp++
    }

    val anonymousIncrement = fun() {
        println("Anonymous function increment")
        temp++
    }

    fun functionIncrement(){
        println("Function increment")
        temp++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(temp)
}
```

### Inline Function
- Merupakan fitur yang ada di Kotlin berupa mengubah higher order function menjadi inline function
- Proses perubahannya adalah code di dalam higher order function akan di _duplicate_ agar saat runtime, aplikasi tidak perlu membuat object lambda secara berulang-ulang
```kotlin
inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

fun main(){
    println(hello { "Husin" })
}
```
- Saat menandai sebuah function adalah inline, maka secara otomatis semua parameter akan menjadi inline
- Jika ingin tidak melakukan inline pada sebuah parameter, maka dapat menambahkan kata kunci `noinline`
```kotlin
inline fun hello2(firstName: () -> String, noinline lastName: () -> String): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main(){
    println(hello2({ "Husin" }, { "Assegaff" }))
}
```

### Label
- merupakan sebuah penanda
- Semua expression di Kotlin dapat ditandai dengan label
- Untuk membuatnya cukup dengan menggunakan nama label, kemudian diikuti dengan karakter `@`
```kotlin
fun main(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            println("$i * $j = ${i * j}")
        }
    }
}
```
- Kegunaanya dapat diintegrasikan dengan `break, continue, dan return`
```kotlin
fun test(name: String, param: (String) -> Unit): Unit = param(name)

fun main(){
    // break
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            println("$i * $j = ${i * j}")
            if (j == 10) break@loopI
        }
    }

    // continue
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            println("$i * $j = ${i * j}")
            if (j == 5) continue@loopJ
        }
    }

    // return
    test("Husin") testLabel@ {
        if (it == "HUsin") return@testLabel
    }

    println("Husin")
}
```

### Package & Import
a. Package
- Package adalah tempat yang bisa digunakan untuk mengorganisir kode program yang dibuat
- Penamaan package biasanya menggunakan _lowercase_
- Jika membuat sub package, maka menggunakan tanda titik. contoh : `package company.database`

b. Import
- Normalnya sebuah file hanya bisa mengakses file lain yang berada dalam package yang sama. Maka jika ingin mengakses file lain di luar package dapat menggunakan `import`
- import yang dapat dilakukan hanya bagian tertentu atau semua isi file. contohnya `import function.sayHello` atau `import function.*`


### Main Parameters
- `main function` dapat diberikan parameter yang biasanya merupakan input dari luar untuk konfigurasi program atau sebagainya
```kotlin
fun main(args: Array<String>){
    for (value in args){
        println(value)
    }
}
```