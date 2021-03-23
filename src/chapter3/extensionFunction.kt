package chapter3
// 수신객체타입                  // 수신 객체 // 수신 객체
// 확장 함수에서는 캡슐화가 깨지지 않는다.
// 즉 수신객체타입에 선언된 private, protected method를 사용할 수 없다.
// 궁금증?
// 확장함수는 scope가 어디까지인가? 다른곳에서 사용할 수 있나? -> 모든 곳에서 사용할 수 없다. 결국엔 임포트를 해야만 한다.
// import chapter3.lastChar as last
fun String.lastChar(): Char = this.get(this.length - 1)

// receiver type
// receiver object

fun extensionFunctionTest () {
    "kotlin".lastChar()
}

// 확장함수를 활용한 유틸리티
// default parameter도 가능하다.
// 확장 함수는 오버라이드할 수 없다.
// 확장 함수는 클래스의 일부가 아니다. -> 확장 함수는 클래스 밖에 선언된다.
// 메소드들이 정적으로 결정된다.
// 그렇기 때문에 Button이 View 상속한 구조임에도 불구하고
// View view = Button()
// view.showOff() -> I'm View 노출 실제로 타입은 Button이지만 Button의 showOff를 호출하는게 아닌 View의 showOff를 호출
fun Collection<String>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for((index, element) in this.withIndex()) {
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

// 확장 함수 예시
public fun <T> List<T>.last(): T {
    if (isEmpty())
        throw NoSuchElementException("List is empty.")
    return this[lastIndex]
}

fun main() {
    val set = setOf("nesoy", "kotlin")
    println(set.joinToString())

    val strings: List<String> = listOf("first", "second", "last")

    strings.last()
}

//fun listOf<T> (vararg values:T): List<T> {
//
//}