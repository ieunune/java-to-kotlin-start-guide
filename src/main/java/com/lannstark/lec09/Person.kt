package com.lannstark.lec09

fun main() {
    // val person = Person("박은우", 100)
    // println(person.name) // get
    // person.age = 10 // set
    // println(person.age)
    // person.age = -1
    // println(person.age)
    // val person2 = Person("박은우", -1)

    val person = Person("test")
    println("${person.name}:${person.age}")
    println(person.upperCaseName)
}

class Person(
    val name: String = "박은우",
    var age: Int = 1
) {
    // 초기화 되는 시점에 호출
    init {

        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    // 함수식으로 사용
    // fun isAdult(): Boolean {
        // return this.age >= 20
    // }

    // 프로퍼티으로 사용
    val isAdult: Boolean
        get() {
            return this.age >= 20
        }

    val upperCaseName: String
        get() = this.name.uppercase()

    // Kotlin 에서는 초기화 해서 사용하는 것을 권고
//    constructor(name: String): this(name, 1) {
//        println("첫 번째 부생성자")
//    }
//
//    constructor(): this("홍길동") {
//        println("두 번째 부생성자")
//    }
}
// constructor 구문 생략 가능
// class Person constructor(name:String, age: Int)
// ->
// class Person(name:String, age: Int) {