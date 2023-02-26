package com.lannstark.lec10

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int, // 프로퍼티를 상속받을 때 open 키워드를 사용하여 허용 해주어야한다.
) {
    abstract fun move()
}