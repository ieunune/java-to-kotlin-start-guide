package com.lannstark.lec05

fun main() {
    judgeNumber(0)
    judgeNumber(2)
    judgeNumber(5)

    println(getGrade(90))
    println(getGrade(89))
    println(getGrade(70))
    println(getGrade(69))
    println(getGrade(59))

    println(getGradeBetween(100))

    judgeNumber2(1);
    judgeNumber2(5);

}


fun startsWith(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun getGradeSwitch(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun getGradeBetween(score: Int): String {
    if (score !in 0..100) {
        throw IllegalArgumentException("${score}는 유효한 점수 범위(0~100)가 아닙니다.")
    }

    return if (score in 90..100) {
        "A"
    } else if (score in 80..89) {
        "B"
    } else if (score in 70..79) {
        "C"
    } else if (score in 60..69) {
        "D"
    } else {
        "F"
    }

}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else if (score >= 60) {
        "D"
    } else {
        "F"
    }

}

fun judgeNumber(number : Int) {
    when {
        number == 0 -> println("주어진 숫자는 0 입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}

fun judgeNumber2(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1, 0, -1이 아닙니다.")
    }
}

/*
- Note.
- if문은 Java와 문법이 동일하다.
- Kotlin에서 if문은 Expression으로 취급된다.
    - 때문에 삼항 연산자가 없다.
- Java의 switch는 Kotlin에서 when으로 대체디었고, when은 더 강력한 기능을 갖는다.
*/