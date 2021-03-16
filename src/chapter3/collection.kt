package chapter3

// 결국엔 자바 컬렉션을 활용하는 것
fun collectionTest () {
    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    // 하지만 사용성을 더 높히기 위해 Wrapping한 형태
    val strings = listOf("first", "Second", "forteenth")
    println(strings.last())

    val numbers = setOf(1, 5, 3)
    println(numbers.maxOrNull())
}

fun <T> joinToString (
    collection: Collection<T>,
    separator: String = "; ",
    prefix: String = "(",
    postfix: String = ")"
): String {
    val result = StringBuilder(prefix)
    for((index, element) in collection.withIndex()) {
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun joiningTest() {
    val list = listOf(1,2,3)
    println(joinToString(list, ";","(",")"))
    println(joinToString(list, separator = ";",prefix = "(",postfix = ")"))
    println(joinToString(list, prefix = "(",postfix = ")")) // 디폴트 값으로 name parameter를 통해 쉽게 생성자에게 전달가능
}

// val - getter
val UNIX_LINE = "\n"
// var - getter, setter
var WINDOW_LINE = "\\n"
// const - constant
// java - private static final
const val NESOY_LINE = "nesoy"