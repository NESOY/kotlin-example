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

fun main() {
    val set = setOf("nesoy", "kotlin")
    println(set.joinToString())
}