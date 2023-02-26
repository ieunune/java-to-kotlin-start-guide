package com.lannstark.lec10


fun main() {
    val penguin = Penguin("dd")
    penguin.move()
    penguin.act()
}

class Penguin (
    species: String
) : Animal(species, 2), Swimable, Flyable {
    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직인다. 펭펭")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 5
}
/** 상속 관련 키워드 4가지 정리
 * 1. final : override를 할 수 없게 한다.
 * 2. open :  override를 열어 준다.
 * 3. abstract: 반드시 override 해야 한다.
 * 4. override : 상위 타입을 오버라이드 하고 있다.
 */
/**
 * 상속 또는 구현을 할 때에 : 을 사용하고 extends와 implements를 구분하지 않는다.
 */
