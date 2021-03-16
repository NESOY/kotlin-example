package chapter2

// soft keyword
// enum 자체적으로 존재할 수 없음
enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

enum class Color2 (
    val r: Int,
    val g: Int,
    val b: Int,
){
    RED(255, 0, 0),
    ORANGE(255, 165, 0);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getMnemonic(color: Color2) {
    val colorString = when(color) {
        Color2.RED -> "Richard"
        Color2.RED, Color2.ORANGE -> "Of"
    }
}

// 함수 호출할때마다 불필요한 객체 생성하는 코드
fun mix(c1: Color, c2: Color) {
    when(setOf(c1, c2)){
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        else -> throw Exception("Dirty color")
    }
}

interface Expr
class Num(val value: Int) : Expr
class Sum(val lef:Expr, val right:Expr) : Expr
