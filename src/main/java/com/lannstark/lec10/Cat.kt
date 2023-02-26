package com.lannstark.lec10

class Cat(
    species: String
) : Animal(species, 4) {
    override fun move() {
        print("고양이가 사뿐 사뿐")
    }
}

//  : 상속 받을 때는 한칸 띄우고 쓰는 것.