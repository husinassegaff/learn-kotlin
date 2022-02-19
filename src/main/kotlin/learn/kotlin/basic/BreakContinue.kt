package learn.kotlin.basic

fun main(){
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
}
