package com.lannstark.lec02

fun main() {

    fun startsWithA0(str: String?): Boolean {
        if (str == null) {
            throw IllegalArgumentException("null이 들어왔습니다");
        }
        return str.startsWith("A")
    }

    fun startsWithA1(str: String?): Boolean {
        requireNotNull(str) { "null이 들어왔습니다" }
        return str.startsWith("A")
    }

    fun startsWithA2(str: String?): Boolean? {
        return str?.startsWith("A")
    }

    fun startsWithA3(str: String?): Boolean {
        return str?.startsWith("A") ?: false
    }

}