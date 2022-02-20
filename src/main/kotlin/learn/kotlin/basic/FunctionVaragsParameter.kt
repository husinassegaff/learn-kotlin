package learn.kotlin.basic


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