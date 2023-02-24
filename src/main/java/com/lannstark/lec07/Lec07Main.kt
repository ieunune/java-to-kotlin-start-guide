package com.lannstark.lec07

import java.io.BufferedReader
import java.io.FileReader

fun main() {
    parseIntOrThrow("10");
    // parseIntOrThrow("AA");

    readFile("./a.txt")

}

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    }catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.");
    }
}

fun readFile(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}