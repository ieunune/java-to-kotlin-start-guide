package com.lannstark.lec15

fun main() {

    // List
    val array = arrayOf(100, 200)
    array.plus(300) // plus 배열에 값 추가

    // 0 부터 배열의 마지막 까지
    //    for (i in array.indices) {
    //        println("${i} ${array[i]}")
    //    }

    // 인덱스와 값을 한번에 가져오기
    for ((index, value) in array.withIndex()) {
        println("$index $value")
    }

    // Tip. 우선 불변 리스트를 만들고, 꼭 필요한 경우 가변 리스트로 바꾸자!
   // 불변 리스트
    // val numbers = listOf(100, 200)
    // 가변 리스트
    val numbers = mutableListOf(100, 200)
    numbers.add(300)

    // 비어있는 배열을 선언 할 때는 타입을 명시적으로 적어 주어야함.
    val emptyList = emptyList<Int>()

    println(numbers[0])

    for (number in numbers) {
        println("number : $number")
    }

    for ((idx, value) in numbers.withIndex()) {
        println("idx : $idx, value : $value")
    }

    // Set
    var set_numbers = mutableSetOf<Int>(100, 200)

    // Map
    val oldMap = mutableMapOf<Int, String>()
    // map[key] = value
    oldMap[1] = "MONDAY"
    oldMap[1] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}

/** Collection
 * - 가변(Mutable) 컬렉션 : 컬렉션에 element를 추가, 삭제할 수 있다.
 * - 불변 컬렉션 : 컬렉션에 element를 추가, 삭제할 수 없다.
 */
/** 3. 컬렉션의 null 가능성, Java와 함께 사용하기
 * - List<Int?> : 리스트에 null이 들어갈 수 있지만, 리스트는 절대 null이 아님
 * - List<Int>? : 리스트에는 null이 들어갈 수 없지만, 리스트는 null일 수 있음
 * - List<Int?>> : 리스트에 null이 들어갈 수도 있고, 리스트가 null일 수도 있음.
 */