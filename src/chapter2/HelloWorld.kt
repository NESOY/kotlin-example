fun main(args: Array<String>){
    println("Hello, World!")
}

/**
 * Kotlin에서는 If문이 Statement가 아닌 Expression이다.
 * Language에서 Statement와 Expression은 다르다.
 * Parameter는 value로 변경불가능
 */
fun max(a: Int, b: Int): Int {
    return if(a>b) a else b
}

fun variable() {
    val question = "What is Life?"
    val answer = 42
    val answer2: Int = 42
    val yearsToCompute = 7.5e6
    val answer3: Int
    answer3 = 42
//    val = value immutable
//    var = variable mutable

    val message: String
    fun canPerformOperation() : Boolean { return false }

    if(canPerformOperation()){
        message = "Success"
    } else {
        message = "Failed"
    }

    // reference가 immutable한 상황
    // 값이 바뀌는건 reference 변경과 관련이 없다.
    val language = arrayListOf("Java")
    language.add("Kotlin")

    // compile error
    // type mismatch
//    var something = 42
//    something = "no answer"
}



fun stringTemplate(args: Array<String>) {
    val name = if(args.size > 0) args[0] else "Kotlin"
    // Java ver : "Hello" + name + "!"
    println("Hello, $name!")
}
