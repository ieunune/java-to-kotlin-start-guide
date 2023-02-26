package com.lannstark.lec14

fun main() {
    val personDto1 = PersonDto("박은우", 100)
    val personDto2 = PersonDto("박은우", 100)
    println(personDto1 == personDto2)
    println(personDto1)
}

// data 키워드를 붙여주면 equals, hashcode, toString을 만들어 준다.
data class PersonDto(
    val name: String,
    val age: Int
) {
}