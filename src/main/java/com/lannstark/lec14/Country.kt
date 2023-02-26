package com.lannstark.lec14

// Enum의 변화 감지 가능
fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}
enum class Country(private val code: String) {
    KOREA("KO"),
    AMERICA("US"),
}