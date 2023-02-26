package com.lannstark.lec13


fun main() {

}

class house(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@house.address
    }
}