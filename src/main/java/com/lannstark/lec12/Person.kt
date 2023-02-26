package com.lannstark.lec12

fun main() {

    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

}

class Person private constructor(
    var name: String,
    var age: Int
) {
    // static이 없음 Kotlin에서는 companion object 으로 사용
    companion object Factory : Log {
        private const val MIN_AGE = 1 // const 컴파일시에 할당
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
        override fun log() {
            println("나는 Person 클래스의 동행 객체 Factory 입니다.")
        }
    }
}

// 싱글톤 사용은 Object 키워드로 사용 한다.
object Singleton {
    var a: Int = 0
}
/**
 *
 */