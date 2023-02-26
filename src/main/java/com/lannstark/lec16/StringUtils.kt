package com.lannstark.lec16

fun main() {
    val str = "ABC"
    println(str.lastChar())
    val person = Person("A", "B", 100)
    person.nextYearAge()

    // infix
    println(3 add 5)
}
// fun 확장하려는클래스.함수이름(파라미터): 리턴타입 {
//   this를 이용해 실제 클래스 안의 값에 접근 // this : 수신 객체 타입
// }
fun String.lastChar(): Char {
    // 불려진 인스턴스(this) 접근
    return this[this.length - 1]
}

fun Person.nextYearAge(): Int {
    println("extends fun")
    return this.age + 1
}

// infix 함수
infix fun Int.add(other: Int): Int {
    return this + other
}

// inline 함수 함수를 호출한 지점에 함수 본문을 그대로 복붙하고 싶은 경우
// 함수를 파라미터로 전달할 때에 오버헤드를 줄일 수 있따.
// 성능 측정과 함께 신중하게 사용 되어야 한다.
inline fun Int.add2(other: Int): Int {
    return this + other
}

/** 확장함수
 * 1. 확장함수는 원본 클래스의 private, protected 멤버 접근이 안된다.
 * 2. 멤버함수, 확장함수 중 멤버함수에 우선권이 있다.
 * 3. 확장함수는 현재 타입을 기준으로 호출된다.
 */