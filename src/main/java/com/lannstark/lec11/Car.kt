package com.lannstark.lec11

class Car (
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    var price = _price
        private set // setter에만 추가로 가시성을 부여할 수 있다.
}

/** Java와 Kotlin을 함께 사용할 때 주의할 점
 * - Internal은 바이트 코드 상 public이 된다.
 * ㄴ 때문에 Java 코드에서는 Kotlin 모듈의 internal 코드를 가져올 수 있다.
 * - Kotlin의 protected와 Java의 protected는 다르다.
 * ㄴ Java는 같은 패키지의 Kotlin protected 멤버에 접근할 수 있다.
 */

/** 접근제어
 *  - public
 *      - Java : 모든 곳에서 접근 가능
 *      - Kotlin : 모든 곳에서 접근 가능
 *  - protected
 *      - Java : 같은 패키지 또는 하위 클래스에서만 접근 가능
 *      - Kotlin : 선언된 클래스 또는 하위 클래스에서만 접근 가능
 *  - private
 *      - Java : 선언된 클래스 내에서만 접근 가능
 *      - Kotlin : : 선언된 클래스 내에서만 접근 가능
 *  - internal
 *      - Kotlin : 같은 모듈에서만 접근 가능 (바이트 코드 상 public)
 *  - default
 *      - Java : 같은 패키지에서만 접근 가능
 */
