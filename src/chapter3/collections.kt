package chapter3

val list = listOf(2,3,5,7,11)

// vararg 여러개의 파라미터를 받을 수 있다.
fun <T> listOf (vararg values: T) : List<T> {
    return emptyList()
}


//인자가 하나뿐인 일반 메소드나 인자가 하나뿐인 확장 함수에 중위 호출을 사용할 수 있다.
//1.to("one")
val map = mapOf(1 to "one")
val (some, name) = 1 to "one"
infix fun Any.to(other: Any) = Pair(this, other)
