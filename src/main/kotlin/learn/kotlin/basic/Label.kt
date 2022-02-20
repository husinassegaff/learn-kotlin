package learn.kotlin.basic

fun test(name: String, param: (String) -> Unit): Unit = param(name)

fun main(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            println("$i * $j = ${i * j}")
        }
    }

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