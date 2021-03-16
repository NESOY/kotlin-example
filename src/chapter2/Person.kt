package chapter2

// default access - public
// value Object
class Person (
    val name: String
)

class Person2 (
    val name: String,
    val isMarried: Boolean
)

// new keyword가 따로 없음
fun classTest(){
    val person = Person2("Bob", true)
    println(person.name)
    println(person.isMarried)

    val rectangle = Rectangle(43, 43)
    rectangle.isSquare
    rectangle.testFunc()
}

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean = false
    get() {
        println("${field}")
        return height == width
    }

    fun testFunc() = "inner func"
}

