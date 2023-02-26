package com.lannstark.lec17

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000)
    )

    // 람다를 만드는 방법 1
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 람다를 만드는 방법 2
    val isApple2: (Fruit) -> Boolean = {fruit: Fruit -> fruit.name == "사과"}

    // 람다를 직접 호출하는 방법 1
    isApple(fruits[0])
    // 람다를 직접 호출하는 방법 2
    isApple.invoke(fruits[0])

    filterFruits(fruits, isApple)
    // filterFruits(fruits, {fruit: Fruit -> fruit.name == "사과"})
    // -> filterFruits(fruits) {fruit: Fruit -> fruit.name == "사과"}
    // -> filterFruits(fruits) {fruit -> fruit.name == "사과"}
    // -> filterFruits(fruits) {it.name == "사과"}

}

private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}

/** Closure
 * - Java에서는 람다를 쓸 때 사용할 수 있는 변수에 제약이 있다.
 *  - (바나나 -> 수박으로 변경시 사용할 수 없음)
 * - Kotlin에서는 Closure를 사용하여 non-final 변수도 람다에서 사용할 수 있다.
 */