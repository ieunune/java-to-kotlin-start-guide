package com.lannstark.lec03

import com.lannstark.lec03.Lec03Main.printAgeIfPerson

fun main() {

    printAgeIfPerson(Person("박은우", 28))

    fun printAgeIfPerson(obj: Any?) {
        if (obj is Person) {
            println(obj.age)
        }
    }
}
