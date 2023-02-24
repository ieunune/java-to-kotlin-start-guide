package com.lannstark.lec08

fun main() {
    println(max(10, 7))

    repeat("Hello")

    printNameAndGender(name = "박은우", gender = "남자")

}

//fun max(a: Int, b: Int): Int {
////    if (a > b) {
////        return a
////    }
////    return b
//    return if (a > b) {
//        a
//    } else {
//        b
//    }
//}

fun max(a: Int, b: Int) = if (a > b) { a } else { b }

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if(useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println("$name $gender")
}